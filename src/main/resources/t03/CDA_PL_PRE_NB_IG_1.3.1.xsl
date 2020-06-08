<?xml version="1.0" encoding="UTF-8"?>
<!-- 
	Transformata ilustrująca sposób zapisania bloku narracyjnego recepty na podstawie danych strukturalnych.
	Celem jej stosowania jest poprawienie czytelności bloku narracyjnego recepty. Potencjalnie transformata 
	może zostać wykorzystana do obowiązkowego generowania treści celem zachowania spójności z entry,
	automatycznej walidacji tej spójności, walidacji kompletności danych i ich poprawności względem Rejestru Leków
	(lub innych rejestrów). Transformata zapewnia możliwość odręcznego dopisywania treści przez wystawcę w polach
	z identyfikatorami zawierającymi słowo "edytuj". 
	Transformata z założenia nie jest 'zgodną z HL7 CDA transformatą generującą warstwę prezentacyjną dokumentu',
	gdyż mając charakter pomocniczy wykorzystuje dane entry.
	
	Wersja CDA_PL_IG_1.3.1:1.0
	
	Historia wersji:
	- CDA_PL_IG_1.3.1:1.0 20191111, 1276 linii kodu, autor Marcin Pusz, Pentacomp Systemy Informatyczne S.A.: wersja inicjalna
-->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:hl7="urn:hl7-org:v3" xmlns:pharm="urn:ihe:pharm" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:extPL="http://www.csioz.gov.pl/xsd/extPL/r2" version="1.0">

	<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes" media-type="text/x-hl7-text+xml"/>
	
	<xsl:template match="/">
		<xsl:apply-templates select="hl7:ClinicalDocument"/>
	</xsl:template>
	
	<xsl:template match="hl7:ClinicalDocument">
		<ClinicalDocument>
			<component>
		        <structuredBody>
					<xsl:if test="hl7:component/hl7:structuredBody/hl7:component/hl7:section[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.3.4']/hl7:entry">
						
						<!-- sekcja zalecenia leku, 1..1 -->
						<xsl:apply-templates select="hl7:component/hl7:structuredBody/hl7:component/hl7:section[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.3.4']/hl7:entry/hl7:substanceAdministration"/>
						
						<!-- sekcja wydania wyrobu, 1..1 -->
						<xsl:apply-templates select="hl7:component/hl7:structuredBody/hl7:component/hl7:section[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.3.4']/hl7:entry/hl7:supply"/>
						
						<!-- sekcje danych ubezpieczeniowych, 0..*, z których każda może zawierać 0..* entry/act, każdy act z referencją do części narrative block sekcji -->
						<xsl:for-each select="hl7:component/hl7:structuredBody/hl7:component/hl7:section[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.3.69']">
							<component>
								<section>
									<title>Dane o ubezpieczeniu i uprawnieniach</title>
									<text>
										<!--  instancje szablonu Dane o uprawnieniach i płatnikach 1..* -->
										<xsl:apply-templates select="./hl7:entry/hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.51']"/>
										<!-- opcjonalne instancje szablonu Pozycja komentarza 0..* na poziomie sekcji -->
										<xsl:apply-templates select="./hl7:entry/hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.68']"/>
									</text>
								</section>
							</component>
						</xsl:for-each>
					</xsl:if>
				</structuredBody>
			</component>
		</ClinicalDocument>
	</xsl:template>
	
	
	<!-- LEK GOTOWY -->
	
	<!-- dla celów zweryfikowania czy unit jest to samo w quantity, itp. XSLT nie oferuje lepszego wsparcia. Zapis *[local-name()='denominator'] omija błąd PIK 1.3.1 z przestrzenią nazw pharm:nominator, powinno być hl7:nominator, więc docelowo do zmiany na hl7:... -->
	<xsl:key name="ingrDenUniqueValues" match="/hl7:ClinicalDocument/hl7:component/hl7:structuredBody/hl7:component/hl7:section[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.3.4']/hl7:entry/hl7:substanceAdministration/hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/pharm:ingredient/pharm:quantity/*[local-name()='denominator']" use="@value"/>
	<xsl:key name="ingrDenUniqueUnits" match="/hl7:ClinicalDocument/hl7:component/hl7:structuredBody/hl7:component/hl7:section[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.3.4']/hl7:entry/hl7:substanceAdministration/hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/pharm:ingredient/pharm:quantity/*[local-name()='denominator']" use="@unit"/>
	
	<!-- szablon Sekcji zalecenia leku lub ŚSSPŻ 2.16.840.1.113883.3.4424.13.10.4.3 -->
	<xsl:template match="hl7:component/hl7:structuredBody/hl7:component/hl7:section[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.3.4']/hl7:entry/hl7:substanceAdministration[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.3']">
		<component>
			<section>
				<title>
					<xsl:value-of select="/hl7:ClinicalDocument/hl7:code[@code = '57833-6']/hl7:translation/hl7:qualifier[hl7:name/@code = 'KDLEK']/hl7:value/@code"/>
					
					<xsl:if test="hl7:entryRelationship/hl7:supply/hl7:priorityCode[@code = 'UR']">
						<xsl:text> (Cito)</xsl:text>
					</xsl:if>
				</title>
				<text>
					<!-- informacje o leku, jeden z trzech szablonów Pozycji recepty -->
					
					<!-- moc leku w postaci ułamkowej, podobnie jak w przykładach na lek recepturowy, przy czym może istnieć więcej niż jeden składnik czynny -->
					<xsl:variable name="strenghtOfActiveIngredients" select="hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/pharm:ingredient[@classCode = 'ACTI']"/>
					
					<paragraph>
						<!-- identyfikator wyłącznie do pierwszego paragrafu, gdyż nie istnieje żaden element, który mógłby spinać kilka paragrafów substanceAdministration -->
						<xsl:apply-templates select="hl7:text/hl7:reference/@value"/>
						<xsl:choose>
							<!-- IHE PRE przewiduje przypadki, w których nazwy leku nie można podać i wykorzystuje się nullFlavor, poza tym przypadkiem jest to 1..1 -->
							<xsl:when test="hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/hl7:name/@nullFlavor">
								<xsl:text>Nazwa leku: </xsl:text>
								<xsl:call-template name="translateNullFlavor">
									<xsl:with-param name="nullableElement" select="hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/hl7:name"/>
								</xsl:call-template>
							</xsl:when>
							<xsl:otherwise>
								<content ID="p1_nazwaLeku" styleCode="xPLbig">
									<xsl:value-of select="hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/hl7:name"/>
								</content>
							</xsl:otherwise>
						</xsl:choose>
						
						<xsl:variable name="uniqueDenominatorValue" select="$strenghtOfActiveIngredients/pharm:quantity/*[local-name()='denominator'][generate-id() = generate-id(key('ingrDenUniqueValues', @value)[1])]/@value"/>
		                <xsl:variable name="uniqueDenominatorUnit" select="$strenghtOfActiveIngredients/pharm:quantity/*[local-name()='denominator'][generate-id() = generate-id(key('ingrDenUniqueUnits', @unit)[1])]/@unit"/>
						
						<xsl:choose>
							<xsl:when test="count($strenghtOfActiveIngredients) &gt; 1 and count($uniqueDenominatorUnit) = 1 and (count($uniqueDenominatorValue) = 1 or count($uniqueDenominatorValue) = 0)">
								<!-- wspólna jednostka wszystkich mocy :) (100 mcg  + 6 mcg)/dawkę -->
								<content ID="p1_mocSkladnikowLeku">
									<xsl:text>(</xsl:text>
									<xsl:for-each select="$strenghtOfActiveIngredients">
										<xsl:value-of select="./pharm:quantity/*[local-name()='numerator']/@value"/>
										<xsl:if test="./pharm:quantity/*[local-name()='numerator']/@unit">
											<xsl:text> </xsl:text>
											<xsl:value-of select="./pharm:quantity/*[local-name()='numerator']/@unit"/>
										</xsl:if>
										<xsl:if test="position() != last()">
											<xsl:text> + </xsl:text>
										</xsl:if>
									</xsl:for-each>
									
									<xsl:text>) / </xsl:text>
									
									<xsl:if test="count($uniqueDenominatorValue) = 1 and not($uniqueDenominatorValue = '1')">
										<xsl:value-of select="$uniqueDenominatorValue"/>
										<xsl:text> </xsl:text>
									</xsl:if>
									<xsl:value-of select="$uniqueDenominatorUnit"/>
								</content>
							</xsl:when>
							<xsl:when test="count($strenghtOfActiveIngredients) &gt; 1">
								<content ID="p1_mocSkladnikowLeku">
									<xsl:for-each select="$strenghtOfActiveIngredients">
										<!-- czy możliwe jest quantity bez wartości licznika? DECOR dopuszcza brak, jednak to nie ma sensu -->
										<xsl:if test="./pharm:quantity/*[local-name()='numerator']/@value">
											<xsl:call-template name="ingredientStrength">
												<xsl:with-param name="ingr" select="."/>
											</xsl:call-template>
											<xsl:if test="position() != last()">
												<xsl:text> + </xsl:text>
											</xsl:if>
										</xsl:if>
									</xsl:for-each>
								</content>
							</xsl:when>
							<xsl:when test="count($strenghtOfActiveIngredients) = 1">
								<xsl:if test="$strenghtOfActiveIngredients/pharm:quantity/*[local-name()='numerator']/@value">
									<content ID="p1_mocSkladnikowLeku">
										<xsl:text>(</xsl:text>
										<xsl:call-template name="ingredientStrength">
											<xsl:with-param name="ingr" select="$strenghtOfActiveIngredients"/>
										</xsl:call-template>
										<xsl:text>)</xsl:text>
									</content>
								</xsl:if>
							</xsl:when>
						</xsl:choose>
						
						<content ID="p1_edytuj_mocLeku"></content>
						
						<!-- postać leku, w IG 1.3.1 słownik nie został przetłumaczony na j. polski, więc aktualnie zwykle transformata ogranicza się do udostępnienia miejsca w narrative block na tę tekstową informację,
						jeżeli jednak podano manufacturedMaterial/pharm:formCode (0..*), displayName powinno być w przyszłości wyświetlane przed polem edytowalnym -->
						<xsl:if test="string-length(hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/pharm:formCode/@displayName) &gt;= 1">
							<content ID="p1_postacLeku"><xsl:value-of select="hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/pharm:formCode/@displayName"/></content>
						</xsl:if>
						<content ID="p1_edytuj_postacLeku"></content>
						
						<!-- nie zamieniać -->
						<xsl:apply-templates select="hl7:entryRelationship/hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.56']"/>
					
					</paragraph>
					
					<xsl:variable name="container" select="hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/pharm:asContent/pharm:containerPackagedMedicine"/>
					<xsl:variable name="supply" select="hl7:entryRelationship/hl7:supply"/>
					
					<!-- obowiązkowa informacja o ilości leku do wydania na receptę, zapisywana w quantity elementu supply, dotyczy (patrz IHE PRE, rozdz.: 6.3.4.7.3.4 Amount of units of the consumable Quantity)
							- ilości opakowań "pierwszego poziomu" wskazanego elementem pharm:asContent, (jeżeli podano inne poziomy typu subContent lub asSuperContent nie są brane pod uwagę)
							- ilości 'konsumowalnych' sztuk leku wskazanych elementem code, jeżeli nie podano pharm:asContent
						 element supply/product/manufacturedProduct/manufacturedLabeledDrug z kodem GS1, jeżeli podano, nie jest brany pod uwagę w generowaniu treści bloku narracyjnego, może służyć systemowi aptecznemu do szybszego znalezienia opakowania -->
					<!-- jeden z przykładów, za Instrukcją stosowania PIK:
							<manufacturedMaterial>
								<templateId root="1.3.6.1.4.1.19376.1.9.1.3.1"/>
								<templateId root="2.16.840.1.113883.3.4424.13.10.4.54"/>
								<code code="100723434" codeSystem="2.16.840.1.113883.3.4424.6.1" displayName="Rilutek 50mg tabl. powl."/>
								<name>Rilutek 50mg tabl. powl.</name>
								<pharm:asContent classCode="CONT">
									<pharm:containerPackagedMedicine classCode="CONT" determinerCode="INSTANCE">
										<pharm:code code="5909990760619" codeSystem="1.3.160" codeSystemName="GS1"/> - kod opakowania, choć PIK wymusza podanie również kodu GS1 samego wyrobu
										<pharm:name>Rilutek 50mg tabl. powl. (56 tabl.)</pharm:name> - nazwa opakowania
										<pharm:formCode code="30007000" codeSystem="2.16.840.1.113883.3.4424.13.11.82" displayName="Blister"/> - postać opakowania, musi być podana gdy podano pharm:asSuperContent, czyli nadopakowanie, jednak w PIK 1.3.1 nie jest tłumaczona na j. polski
										<pharm:capacityQuantity value="56"/> - pojemność opakowania
									</pharm:containerPackagedMedicine>
								</pharm:asContent>
							</manufacturedMaterial> -->
					<paragraph>
						<xsl:choose>
							<!-- gdy dotyczy opakowań pharm:asContent -->
							<xsl:when test="$container">
								<content ID="p1_iloscLeku">
									<!-- quantity na poziomie supply dot. ilości opakowań (w tym np. ampułek, stąd "x" zamiast "op."), unit w supply jest w tym przypadku zabronione w IHE PRE -->
									<xsl:value-of select="$supply/hl7:quantity/@value"/>
								</content>
								
								<!-- zrezygnowano z wyświetlania nazwy opakowania -->
								<!-- dalszy ciąg informacji celem zapisania ilości leku w opakowaniu -->
								<content ID="p1_krotnosc_opis">
									<xsl:choose>
										<xsl:when test="$container/pharm:formCode/@displayName">
											<xsl:text>x </xsl:text>
											<xsl:value-of select="$container/pharm:formCode/@displayName"/>
											<xsl:text> po</xsl:text>
										</xsl:when>
										<xsl:otherwise>
											<xsl:text>op. po</xsl:text>
										</xsl:otherwise>
									</xsl:choose>
								</content>
								
								<content ID="p1_wielkoscOpakowania">
									<!-- wielkość opakowania (niezależnie od tego czy wynika z nazwy opakowania), zawsze musi być podana dla opakowania (w Rejestrze Leków to element 'jednostka wielkości') 
										 + jednostka jako @unit gdy podano lub proste 'szt.'-->
									<xsl:call-template name="quantityUnitOrSzt">
										<xsl:with-param name="quantity" select="$container/pharm:capacityQuantity"/>
									</xsl:call-template>
								</content>
							</xsl:when>
							<xsl:otherwise>
								<!-- quantity na poziomie supply, gdy nie podano informacji o opakowaniu, dotyczy samego leku.
								Zapis przyjmie postać "Ilość: 50 szt." gdyż nie ma możliwości odróżnić dawek, tabletek czy wagi.
								Jeżeli lek jest dostępny w postaci niepoliczalnej (np. na wagę), należy stosować jednostkę w elemencie unit,
								w takiej sytuacji zapis przyjmie postać "Ilość: 50 ml" -->
								<content>Ilość:</content>
								<content ID="p1_iloscLeku">
									<xsl:call-template name="quantityUnitOrSzt">
										<xsl:with-param name="quantity" select="$supply/hl7:quantity"/>
									</xsl:call-template>
								</content>
							</xsl:otherwise>
						</xsl:choose>
					</paragraph>
					
					<!-- stosowanie -->
					<xsl:apply-templates select="hl7:entryRelationship/hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.74']"/>
					
					<!-- odpłatność 0..1 -->
					<xsl:apply-templates select="hl7:entryRelationship/hl7:supply/hl7:entryRelationship/hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.57']"/>
					
					<!-- Data wydania leku od dnia, jeżeli podano późniejszą niż data wystawienia recepty 1..1 -->
					<xsl:apply-templates select="hl7:entryRelationship/hl7:supply/hl7:effectiveTime/@value"/>
					
					<!-- potwierdzenie ilości substancji czynnej (wymagane tylko dla Rpw) 0..1 (retired, do usunięcia w kolejnej wersji PIK) -->
					<xsl:apply-templates select="hl7:entryRelationship/hl7:supply/hl7:entryRelationship/hl7:observation[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.80']"/>
					
					<!-- potwierdzenie ilości substancji czynnej (wymagane tylko dla Rpw) 0..* -->
					<xsl:apply-templates select="hl7:entryRelationship/hl7:supply/hl7:entryRelationship/hl7:supply[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.80']"/>
					
					<!-- informacja dla osoby wydającej lek -->
					<xsl:apply-templates select="hl7:entryRelationship/hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.75']"/>
					
					<!-- identyfikatorów: leku z RL, GS1, ATC, identyfikatora opakowania GS1, identyfikatora produktu GS1 - nie wyświetla się -->
					<!-- manufacturedMaterial/lotNumberText - numeru serii nie wyświetla się -->
					<!-- manufacturedMaterial/expirationTime - dat przeterminowania nie wyświetla się -->
					<!-- manufacturedMaterial/asSuperContent w całości się nie wyświetla, apteka wydaje wyłącznie asContent, nawet jeżeli w ramach opakowania asSuperContent -->
					<!-- manufacturedMaterial/asSpecializedKind w całości się nie wyświetla -->
					
					<!-- Referencji do listy zaleconych leków 2.16.840.1.113883.3.4424.13.10.4.75 nie wyświetla się -->
				</text>
			</section>
		</component>
	</xsl:template>
	
	
	<!-- LEK RECEPTUROWY -->
	
	<!-- Informacje o leku - Szablon Pozycja recepty na lek recepturowy, druga z trzech alternatyw w Sekcji zalecenia leku -->
	<xsl:template match="hl7:component/hl7:structuredBody/hl7:component/hl7:section[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.3.4']/hl7:entry/hl7:substanceAdministration[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.48']">
		<component>
			<section>
				<title>
					<xsl:value-of select="/hl7:ClinicalDocument/hl7:code[@code = '57833-6']/hl7:translation/hl7:qualifier[hl7:name/@code = 'KDLEK']/hl7:value/@code"/>
					
					<xsl:if test="hl7:entryRelationship/hl7:supply/hl7:priorityCode[@code = 'UR']">
						<xsl:text> (Cito)</xsl:text>
					</xsl:if>
				</title>
				<text>
					<xsl:variable name="container" select="hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/pharm:asContent/pharm:containerPackagedMedicine"/>
					<xsl:variable name="supply" select="hl7:entryRelationship/hl7:supply"/>
					
					<!-- standardowo ilość leku recepturowego quantity nie dotyczy opakowania pharm:asContent, tj. nie podaje się informacji o opakowaniu, jednak należy taki przypadek obsłużyć -->
					<xsl:choose>
						<!-- gdy ilość dotyczy jednej definicji opakowania w pharm:asContent -->
						<xsl:when test="count($container) = 1">
							
							<!-- opcjonalna nazwa leku, jeszcze przed informacją o opakowaniu i ilości opakowań -->
							<xsl:if test="string-length(hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/hl7:name) &gt;= 1">
								<paragraph>
									<content ID="p1_nazwaLeku">
										<xsl:value-of select="hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/hl7:name"/>
									</content>
								</paragraph>
							</xsl:if>
							
							<paragraph>
								<!-- quantity na poziomie supply z pharm:asContent dot. ilości opakowań leku recepturowego, unit jest w tym przypadku zabronione w IHE PRE -->
								<content ID="p1_iloscLeku">
									<xsl:value-of select="$supply/hl7:quantity/@value"/>
								</content>
								<!-- nazwa opakowania, 0..*, zwykle 1 (wyświetla się "x <nazwa>") bądź 0 (wyświetla się "op.") -->
								<xsl:choose>
									<xsl:when test="count($container/pharm:name) &gt;= 1">
										<!-- 5 x <nazwa> (inne nazwy, ...) -->
										<content>x</content>
										<content>
											<xsl:for-each select="$container/pharm:name">
												<xsl:if test="position() != 1">
													<xsl:text> (</xsl:text>
												</xsl:if>
												<xsl:value-of select="."/>
												<xsl:if test="position() != 1">
													<xsl:text> )</xsl:text>
												</xsl:if>
												<xsl:if test="position() != last()">
													<xsl:text>, </xsl:text>
												</xsl:if>
											</xsl:for-each>
										</content>
									</xsl:when>
									<xsl:otherwise>
										<content>op.</content>
									</xsl:otherwise>
								</xsl:choose>
								
								<!-- dalszy ciąg informacji celem zapisania ilości leku w opakowaniu, 5 opakowań zawierających po 50ml -->
								<content>zaw. po</content>
								
								<!-- wielkość opakowania (niezależnie od tego czy wynika z nazwy opakowania), zawsze musi być podana dla opakowania, tu zwykle zawiera unit -->
								<content ID="p1_wielkoscOpakowania">
									<!-- ilość, jednostka @unit lub szt. -->
									<xsl:call-template name="quantityUnitOrSzt">
										<xsl:with-param name="quantity" select="$container/pharm:capacityQuantity"/>
									</xsl:call-template>
								</content>
							</paragraph>
						</xsl:when>
						<xsl:when test="not($container)">
							<!-- opcjonalnie nazwa i opcjonalnie ilość leku, niekiedy lekarz zamieszcza np. ilość maści w ramach składnika aqua, brak standardowej obsługi nullFlavor gdyż lista składników zastępuje nazwę -->
							<xsl:choose>
								<xsl:when test="string-length(hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/hl7:name) &gt;= 1">
									<paragraph>
										<content ID="p1_nazwaLeku">
											<xsl:value-of select="hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/hl7:name"/>
										</content>
										<xsl:if test="not($supply/hl7:quantity/@nullFlavor)">
											<content ID="p1_iloscLeku">	
												<xsl:value-of select="$supply/hl7:quantity/@value"/>
												<xsl:text> </xsl:text>
												<xsl:value-of select="$supply/hl7:quantity/@unit"/>
											</content>
										</xsl:if>
									</paragraph>
								</xsl:when>
								<xsl:when test="not($supply/hl7:quantity/@nullFlavor)">
									<paragraph>
										<content>Ilość leku:</content>
										<content ID="p1_iloscLeku">
											<xsl:value-of select="hl7:entryRelationship/hl7:supply/hl7:quantity/@value"/>
											<xsl:text> </xsl:text>
											<xsl:value-of select="hl7:entryRelationship/hl7:supply/hl7:quantity/@unit"/>
										</content>
									</paragraph>
								</xsl:when>
							</xsl:choose>
						</xsl:when>
						<xsl:otherwise>
							<!-- przypadek, w którym umieszczono > 1 definicji opakowań i nie wiadomo czego dotyczy ilość, nie powinno to mieć miejsca -->
							<xsl:if test="not($supply/hl7:quantity/@nullFlavor)">
								<paragraph>
									<content>Ilość dot. opakowań:</content>
									<content ID="p1_iloscLeku">
										<xsl:value-of select="hl7:entryRelationship/hl7:supply/hl7:quantity/@value"/>
										<xsl:text> </xsl:text>
										<xsl:value-of select="hl7:entryRelationship/hl7:supply/hl7:quantity/@unit"/>
									</content>
								</paragraph>
							</xsl:if>
						</xsl:otherwise>
					</xsl:choose>
					
					<!-- prosta lista składników ze wskazaniem ich ilości nie jest pełną recepturą, jednak może ułatwiać edycję receptury -->
					<xsl:element name="list">
						<xsl:attribute name="styleCode">Disc</xsl:attribute>
						<xsl:attribute name="listType">unordered</xsl:attribute>
						<xsl:apply-templates select="hl7:text/hl7:reference/@value"/>

						<xsl:for-each select="hl7:consumable/hl7:manufacturedProduct/hl7:manufacturedMaterial/pharm:ingredient[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.71']">
							<xsl:element name="item">
								<content ID="p1_skladnikReceptury_{position()}">
									<xsl:value-of select="./pharm:ingredient/pharm:name"/>
								</content>
								<xsl:if test="./pharm:quantity/*[local-name()='numerator']/@value">
									<content ID="p1_iloscSkladnikaReceptury_{position()}">
										<xsl:text> </xsl:text>
										<xsl:value-of select="./pharm:quantity/*[local-name()='numerator']/@value"/>
										<xsl:if test="./pharm:quantity/*[local-name()='numerator']/@unit">
											<xsl:text> </xsl:text>
											<xsl:value-of select="./pharm:quantity/*[local-name()='numerator']/@unit"/>
										</xsl:if>
										<xsl:if test="./pharm:quantity/*[local-name()='denominator']/@value and (./pharm:quantity/*[local-name()='denominator']/@value != 1 or ./pharm:quantity/*[local-name()='denominator']/@unit != 1)">
											<xsl:text> / </xsl:text>
											<xsl:value-of select="./pharm:quantity/*[local-name()='denominator']/@value"/>
											<xsl:if test="./pharm:quantity/*[local-name()='denominator']/@unit">
												<xsl:text> </xsl:text>
												<xsl:value-of select="./pharm:quantity/*[local-name()='denominator']/@unit"/>
											</xsl:if>
										</xsl:if>
									</content>
								</xsl:if>
								<!-- miejsce na dopisek przy składniku -->
								<content ID="p1_edytuj_skladnik_{position()}"></content>
							</xsl:element>
						</xsl:for-each>
					</xsl:element>
					
					<paragraph>
						<!-- zwykle zamieszcza się informację co zrobić ze składnikami, typu zamieszaj aż uzyskasz maść -->
						<content ID="p1_edytuj_podsumujRecepture"></content>
					</paragraph>
					
					<!-- nie zamieniać -->
					<xsl:variable name="nz">
						<xsl:apply-templates select="hl7:entryRelationship/hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.56']"/>
					</xsl:variable>
					<xsl:if test="$nz">
						<paragraph>
							<content ID="p1_nieZamieniac" styleCode="xPLbig"><xsl:value-of select="$nz"/></content>
						</paragraph>
					</xsl:if>
					
					<!-- stosowanie (pojawi się kod obsługujący szczegółowe zapisy w entry) -->
					<xsl:apply-templates select="hl7:entryRelationship/hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.74']"/>
					
					<!-- odpłatność 0..1 -->
					<xsl:apply-templates select="$supply/hl7:entryRelationship/hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.57']"/>
					
					<!-- Data wydania leku od dnia, jeżeli podano późniejszą niż data wystawienia recepty 1..1 -->
					<xsl:apply-templates select="$supply/hl7:effectiveTime/@value"/>
					
					<!-- potwierdzenie ilości substancji czynnej (wymagane tylko dla Rpw) 0..1 (retired) -->
					<xsl:apply-templates select="$supply/hl7:entryRelationship/hl7:observation[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.80']"/>
					
					<!-- potwierdzenie ilości substancji czynnej (wymagane tylko dla Rpw) 0..* -->
					<xsl:apply-templates select="hl7:entryRelationship/hl7:supply/hl7:entryRelationship/hl7:supply[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.80']"/>
					
					<!-- informacja dla osoby wydającej lek -->
					<xsl:apply-templates select="hl7:entryRelationship/hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.75']"/>
					
					<!-- element supply/product/manufacturedProduct/manufacturedLabeledDrug z kodem GS1 nie ma sensu w przypadku recept na lek robiony, 0..1 - jest pomijany -->
					
					<!-- referencji do listy zaleconych leków 2.16.840.1.113883.3.4424.13.10.4.75 nie wyświetla się -->
				</text>
			</section>
		</component>
	</xsl:template>
	
	
	<!-- WYRÓB MEDYCZNY -->
	
	<xsl:template match="hl7:component/hl7:structuredBody/hl7:component/hl7:section[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.3.4']/hl7:entry/hl7:supply">
		<component>
			<section>
				<title>
					<xsl:value-of select="/hl7:ClinicalDocument/hl7:code[@code = '57833-6']/hl7:translation/hl7:qualifier[hl7:name/@code = 'KDLEK']/hl7:value/@code"/>
					<!-- wartość UR jest wymagana, dla recept bez priorytetu nie podaje się kodu -->
					<xsl:if test="hl7:priorityCode[@code = 'UR']">
						<xsl:text> (Cito)</xsl:text>
					</xsl:if>
				</title>
				<text>
					<!-- informacje o wyrobie medycznym, jeden z trzech szablonów Pozycji recepty -->
					
					<paragraph>
						<!-- PIK nie wspomina o elemencie text z referencją do niniejszego paragrafu, jednak mechanizm ten powinien być stosowany -->
						<xsl:apply-templates select="./hl7:text/hl7:reference/@value"/>
						<xsl:choose>
							<!-- IHE PRE przewiduje przypadki, w których nazwy można nie podać, stosując nullFlavor, poza tym 1..1 -->
							<xsl:when test="hl7:product/hl7:manufacturedProduct/hl7:manufacturedMaterial/hl7:name/@nullFlavor">
								<xsl:text>Nazwa wyrobu: </xsl:text>
								<xsl:call-template name="translateNullFlavor">
									<xsl:with-param name="nullableElement" select="hl7:product/hl7:manufacturedProduct/hl7:manufacturedMaterial/hl7:name"/>
								</xsl:call-template>
							</xsl:when>
							<xsl:otherwise>
								<content ID="p1_nazwaWyrobu" styleCode="xPLbig">
									<xsl:value-of select="hl7:product/hl7:manufacturedProduct/hl7:manufacturedMaterial/hl7:name"/>
								</content>
							</xsl:otherwise>
						</xsl:choose>
						<!-- postać wyrobu, w IG 1.3.1 słownik nie został przetłumaczony na j. polski, więc aktualnie zwykle transformata ogranicza się do udostępnienia miejsca w narrative block na tę tekstową informację,
						jeżeli jednak podano manufacturedMaterial/pharm:formCode (0..*), displayName powinno być w przyszłości wyświetlane przed polem edytowalnym -->
						<xsl:if test="string-length(hl7:product/hl7:manufacturedProduct/hl7:manufacturedMaterial/pharm:formCode/@displayName) &gt;= 1">
							<content ID="p1_postacWyrobu"><xsl:value-of select="hl7:product/hl7:manufacturedProduct/hl7:manufacturedMaterial/pharm:formCode/@displayName"/></content>
						</xsl:if>
						<content ID="p1_edytuj_postacWyrobu"></content>
					</paragraph>
					
					<!-- poprzez hl7:quantity/@value podaje się:
						- jeżeli nie podano elementu pharm:asContent - ilość wyrobów wskazanych kodem GS1 na poziomie manufacturedMaterial
						- jeżeli tylko podano pharm:asContent - ilość opakowań wskazanych elementem pharm:asContent (o nazwie opakowania pharm:name tamże)
						jeżeli podano również pharm:asSuperContent, tj. nadopakowanie, ilość dotyczy wyłącznie opakowań, nie nadopakowań, a informacji o nadopakowaniu nie wyświetla się -->
						
					<!-- informacja o opakowaniu - przykład z IHE PRE
						<pharm:asContent classCode="CONT">
							<pharm:containerPackagedMedicine classCode="CONT" determinerCode="INSTANCE">
								<pharm:code code=" " displayName=" " codeSystem=" " codeSystemName=" " /> - wg PIK jest to kod GS1 opakowania, mimo że na poziomie wyrobu podano kod GS1 wyrobu
								<pharm:name>...</pharm:name> - nazwa opakowania wyrobu
								<pharm:formCode code=" " displayName=" " codeSystem=" " codeSystemName=" " /> - opcjonalne ze zbioru wartości Postać opakowania leku
								<pharm:capacityQuantity value=" " unit=" " /> - ilość wyrobów w opakowaniu
								<pharm:asSuperContent> - opcjonalne nadopakowanie, jeżeli dotyczy, przy czym dla wyrobów medycznych nie wyświetla się tych informacji niniejszą transformatą*
									<pharm:containerPackagedMedicine classCode='CONT' determinerCode='INSTANCE'>
										<pharm:capacityQuantity value=' ' unit=' ' />
									</pharm:containerPackagedMedicine>
								</pharm:asSuperContent>
							</pharm:containerPackagedMedicine>
						</pharm:asContent>
						*wyrób medyczny identyfikowany jest kodem GS1 i liczony wyłącznie w sztukach, stąd założenie, że opakowanie w asContent będzie jedynym używanym poziomem. 
						Poziom asSuperContent wykorzystuje się zwykle gdy płynne lub sypkie produkty zamykane są np. w ampułki (asContent), a te w większe opakowania, co nie powinno dotyczyć
						wyrobów medycznych na sztuki, identyfikowanych GS1. W razie zidentyfikowania potrzeby stosowania asSuperContent i wyświetlenia tej wartości w narrative block prosi się o kontakt z CSOIZ. 
						 -->
					
					<xsl:variable name="container" select="hl7:product/hl7:manufacturedProduct/hl7:manufacturedMaterial/pharm:asContent/pharm:containerPackagedMedicine"/>
					
					<paragraph>
						<xsl:choose>
							<xsl:when test="$container">
								<!-- quantity na poziomie supply dot. ilości opakowań, unit jest w tym miejscu zabronione w PIK -->
								<content ID="p1_iloscWyrobu">
									<xsl:value-of select="hl7:quantity/@value"/>
								</content>
								<!-- 50 op. <nazwa> (nazwę opakowania wstępnie usunięto jako duplikującą nazwę wyrobu) -->
								<content ID="p1_krotnosc_opis">op. po</content>
								<!-- wielkość opakowania (niezależnie od tego czy wynika z nazwy opakowania), zawsze musi być podana dla opakowania -->
								<content ID="p1_wielkoscOpakowania">
									<xsl:call-template name="quantityUnitOrSzt">
										<xsl:with-param name="quantity" select="$container/pharm:capacityQuantity"/>
									</xsl:call-template>
								</content>
							</xsl:when>
							<xsl:otherwise>
								<!-- quantity na poziomie supply, gdy nie podano informacji o opakowaniu, dotyczy samego wyrobu med. i są to zawsze sztuki, unit jest zabronione ze względu na id wyrobu, tj. GS1 -->
								<content>Ilość:</content>
								<content ID="p1_iloscWyrobu">
									<xsl:call-template name="quantityUnitOrSzt">
										<xsl:with-param name="quantity" select="hl7:quantity"/>
									</xsl:call-template>
								</content>
							</xsl:otherwise>
						</xsl:choose>
					</paragraph>
				
					<!-- manufacturedMaterial/code i pharm:asContent/pharm:code - GS1 nie wyświetla się w obu przypadkach -->
					<!-- lotNumberText, tj. treść numeru serii, nie jest wykorzystywana do wyświetlenia -->
					<!-- pharm:formCode i pharm:asContent/formCode, tj. postaci dawki leku (szczególnie dla wyrobów), nie jest wykorzystywana do wyświetlenia, w PIK 1.3.1 słownik nie został spolszczony, dodatkowo postać powinna pojawić się w nazwie produktu -->
					<!-- pharm:expirationDate, tj. data ważności, nie jest wykorzystywana do wyświetlenia -->
					<!-- pharm:asSpecializedKind, tj. informacje o generycznym odpowiedniku, nie są wykorzystywane do wyświetlenia -->
					<!-- pharm:ingredient, tj. definicji składników nie wyświetla się w przypadku wyrobu medycznego -->
					<!-- pharm:asSuperContent - danych nadopakowania nie wyświetla się -->
					
					<!-- stosowanie, do opcjonalnego wprowadzenia słownie, gdyż nie jest przewidziane w szablonie Pozycja recepty na wyrób medyczny -->
					<paragraph>
						<content ID="p1_edytuj_stosowanie_wartosc"></content>
					</paragraph>
					
					<!-- poziom odpłatności 0..1 -->
					<xsl:apply-templates select="hl7:entryRelationship/hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.57']"/>
					
					<!-- data wydania leku od dnia, jeżeli podano późniejszą niż data wystawienia recepty, 1..1 -->
					<xsl:apply-templates select="hl7:effectiveTime/@value"/>
				</text>
			</section>
		</component>
	</xsl:template>
	
	
	<!-- INNE -->
	
	<!-- NZ - nie zamieniać, sama obecność treści oznacza istnienie takiej deklaracji -->
	<xsl:template match="hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.56']">
		 <content ID="p1_nieZamieniac" styleCode="xPLbig">NZ</content>
	</xsl:template>
	
	<!-- potwierdzenie ilości substancji czynnej (wymagane tylko dla Rpw dla leku gotowego i robionego) -->
	<!-- obsługa pierwszej z wykluczających się wersji, tj. 0..1 observation (retired) i 0..* supply (active). W kolejnym PIK wersja ta zostanie usunięta -->
	<xsl:template match="hl7:observation[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.80']">
		<xsl:element name="paragraph">
			<xsl:apply-templates select="hl7:text/hl7:reference/@value"/>
			<content ID="p1_potwIlosciSubstCzynnej_opis">
				<xsl:text>Potwierdzono ilość substancji czynnej</xsl:text>
			</content>
			<xsl:choose>
				<xsl:when test="hl7:value/@nullFlavor">
					<xsl:call-template name="translateNullFlavor">
						<xsl:with-param name="nullableElement" select="hl7:value"/>
					</xsl:call-template>
				</xsl:when>
				<xsl:otherwise>
					<content ID="p1_potwIlosciSubstCzynnej_wartosc">
						<xsl:value-of select="hl7:value/@value"/>
						<xsl:if test="hl7:value/@unit and string-length(hl7:value/@unit) &gt;= 1">
							<xsl:text> </xsl:text>
							<xsl:value-of select="hl7:value/@unit"/>
						</xsl:if>
					</content>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:element>
	</xsl:template>
	
	<!-- potwierdzenie ilości substancji czynnej (wymagane tylko dla Rpw dla leku gotowego i robionego) -->
	<!-- obsługa drugiej z wykluczających się wersji, tj. 0..1 observation (retired) i 0..* supply (active). W kolejnym PIK wersja ta pozostanie jako jedyna dopuszczalna -->
	<xsl:template match="hl7:supply[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.80']">
		
		<xsl:variable name="ingr" select="hl7:product/hl7:manufacturedProduct/hl7:manufacturedMaterial/pharm:ingredient"/>
		
		<xsl:element name="paragraph">
			<xsl:apply-templates select="hl7:text/hl7:reference/@value"/>
			<content ID="p1_potwIlosciSubstCzynnej_opis_{position()}">
				<xsl:text>Potwierdzono ilość substancji czynnej</xsl:text>
			</content>
			<xsl:if test="string-length($ingr/pharm:ingredient/pharm:code/@displayName) &gt;= 1">
				<content styleCode="Bold">
					<xsl:value-of select="$ingr/pharm:ingredient/pharm:code/@displayName"/>
				</content>
			</xsl:if>
			<content ID="p1_potwIlosciSubstCzynnej_wartosc_{position()}" styleCode="Bold">
				<xsl:call-template name="ingredientStrength">
					<xsl:with-param name="ingr" select="$ingr"/>
				</xsl:call-template>
			</content>
		</xsl:element>
	</xsl:template>
	
	<!-- formatowanie mocy składnika aktywnego -->
	<xsl:template name="ingredientStrength">
		<xsl:param name="ingr"/>
		
		<xsl:value-of select="$ingr/pharm:quantity/*[local-name()='numerator']/@value"/>
		<xsl:if test="$ingr/pharm:quantity/*[local-name()='numerator']/@unit">
			<xsl:text> </xsl:text>
			<xsl:value-of select="$ingr/pharm:quantity/*[local-name()='numerator']/@unit"/>
		</xsl:if>
		<xsl:if test="$ingr/pharm:quantity/*[local-name()='denominator']/@value and ($ingr/pharm:quantity/*[local-name()='denominator']/@value != 1 or $ingr/pharm:quantity/*[local-name()='denominator']/@unit != 1)">
			<xsl:text> / </xsl:text>
			<xsl:value-of select="$ingr/pharm:quantity/*[local-name()='denominator']/@value"/>
			<xsl:if test="$ingr/pharm:quantity/*[local-name()='denominator']/@unit">
				<xsl:text> </xsl:text>
				<xsl:value-of select="$ingr/pharm:quantity/*[local-name()='denominator']/@unit"/>
			</xsl:if>
		</xsl:if>
	</xsl:template>
	
	<!-- data wydania leku od dnia -->
	<xsl:template match="hl7:supply/hl7:effectiveTime/@value">
		
		<xsl:variable name="documentDateValue" select="/hl7:ClinicalDocument/hl7:effectiveTime/@value"/>
		<!-- przemnażanie na wypadek gdyby nie było np. dni w dacie, co jest dopuszczalne czysto teoretycznie -->
		<xsl:variable name="supplyDate" select="10000 * substring(., 1, 4) + 100 * substring(., 5, 2) + substring(., 7, 2)"/>
    	<xsl:variable name="documentDate" select="10000 * substring($documentDateValue, 1, 4) + 100 * substring($documentDateValue, 5, 2) + substring($documentDateValue, 7, 2)"/>
		
		<xsl:if test="$supplyDate &gt; $documentDate">
			<xsl:element name="paragraph">
				<content ID="p1_dataRealizacjiOd_opis">Data realizacji od</content>
				<xsl:element name="content">
					<xsl:attribute name="ID">p1_dataRealizacjiOd_wartosc</xsl:attribute>
					<xsl:attribute name="styleCode">xPLred Bold</xsl:attribute>
					<xsl:call-template name="formatDateTime">
						<xsl:with-param name="date" select="."/>
					</xsl:call-template>
				</xsl:element>
			</xsl:element>
		</xsl:if>
	</xsl:template>
	
	<!-- poziom odpłatności leku 2.16.840.1.113883.3.4424.13.10.4.57 (i wyrobu medycznego) 0..1 -->
	<xsl:template match="hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.57']">
		<xsl:variable name="poziom" select="hl7:entryRelationship/hl7:act/hl7:code[@code = 'PUBLICPOL']/hl7:qualifier/hl7:value"/>
		
		<xsl:element name="paragraph">
			<xsl:apply-templates select="hl7:text/hl7:reference/@value"/>
			<content ID="p1_odplatnosc_opis">Odpłatność</content>
			
			<xsl:choose>
				<xsl:when test="not($poziom) or $poziom/@nullFlavor">
					<xsl:call-template name="translateNullFlavor">
						<xsl:with-param name="nullableElement" select="$poziom"/>
					</xsl:call-template>
				</xsl:when>
				<xsl:otherwise>
					<xsl:element name="content">
						<xsl:attribute name="ID">p1_odplatnosc_wartosc</xsl:attribute>
						<xsl:attribute name="styleCode">Bold</xsl:attribute>
						<!-- dopuszczalne wartości ze słownika to B, R, 30%, 50%, 100%, wyjątkowo nie wyświetla się displayName, tylko powszechnie rozumiany code -->
						<xsl:value-of select="$poziom/@code"/>
					</xsl:element>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:element>
	</xsl:template>
	
	<!-- Informacje o przyjmowaniu leku dla pacjenta 2.16.840.1.113883.3.4424.13.10.4.74, 0..* - aktualnie w PIK tylko dla leków gotowych i recepturowych -->
	<xsl:template match="hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.74']">
		<xsl:element name="paragraph">
			<xsl:apply-templates select="hl7:text/hl7:reference/@value"/>
			<content ID="p1_stosowanie_opis_{position()}">D.S.</content>
			
			<xsl:variable name="sa" select="../.."/>
			
			<xsl:variable name="substAdmDate" select="$sa/hl7:effectiveTime[not(@operator = 'A') and hl7:low and hl7:high]"/>
			<xsl:variable name="supplyDate" select="$sa/hl7:entryRelationship/hl7:supply/hl7:effectiveTime"/>
			<xsl:variable name="freq" select="$sa/hl7:effectiveTime[@operator = 'A' and (@xsi:type='PIVL_TS' or @xsi:type='TS')]"/>
			<xsl:variable name="dose" select="$sa/hl7:doseQuantity[not(@nullFlavor) and @value]"/>
			
			<!-- W standardzie źródłowym: https://www.ihe.net/uploadedFiles/Documents/PCC/IHE_PCC_TF_Vol2.pdf -->
			<!-- templateId o wartości 1.3.6.1.4.1.19376.1.9.1.3.6, wymagane przez PIK dla substanceAdministration recepty, oznacza, że element ten może zawierać dane dot. stosowania leku dla pacjenta -->
			<!-- wymaga się również podania dodatkowego templateId wskazującego specyfikę stosowania, dla której obowiązują podane elementy typu effectiveTime czy doseQuantity,
			  	 jeżeli zapis dotyczy "normalnego dawkowania", albo gdy dawkowanie podano wyłącznie tekstowo, bez elementów entry, należy użyć 
			  	 >>> templateId 1.3.6.1.4.1.19376.1.5.3.1.4.7.1, w bieżącej wersji transformaty obsługiwany jest wyłącznie ten wariant <<< , inne szablony z listy dopuszczalnych do wyboru przez PIK
			  	 wymagają zastosowania zagnieżdżonych elementów substanceAdministration by zdefiniować specyficzny rodzaj dawkowania, np. warunkowe lub zmniejszające się w czasie -->
			<!-- wymaga się dodatkowo użycia szablonu definiującego akt zanotowania informacji o przyjmowaniu leku dla pacjenta, OID 2.16.840.1.113883.3.4424.13.10.4.74 -->
			<!-- nie stosuje się wymienionego w https://www.ihe.net/uploadedFiles/Documents/PCC/IHE_PCC_TF_Vol2.pdf szablonu 1.3.6.1.4.1.19376.1.5.3.1.4.21 dot. dawkowania opóźnionego o czas nieokreślony,
				 np. "przed podróżą", w związku z czym effectiveTime o typie IVL_TS przyjmuje wyłącznie wartości low i high -->
			
			<!-- informacja o dawkowaniu obejmuje elementy zdefiniowane w IHE PRE na podstawie IHE PCC:
				 - effectiveTime w substanceAdministration - wymagane gdy stosowanie zapisano w entry, zabronione gdy stosowanie zapisano wyłącznie tekstowo w bloku narracyjnym, format xsi:type='IVL_TS'
				 	znaczenie: od kiedy (low, często zgodne z datą wystawienia recepty lub datą wydania leku effectiveTime w supply) do kiedy (high, niekiedy nullFlavor = NA) podawać lek 
				 - *effectiveTime w substanceAdministration z @operator = 'A' - wymagane i nie nullFlavor gdy stosowanie zapisano w entry, zabronione gdy stosowanie zapisano wyłącznie tekstowo w bloku narracyjnym,
				 	częstotliwość podawania (medication frequency), różnorodne formy zapisu xsi:type='TS|PIVL_TS|EIVL_TS|PIVL_PPD_TS|SXPR_TS' w zależności od potrzeb, do wyświetlenia dwa pierwsze
				 - routeCode - opcjonalnie, droga podania leku (route of administration), element nie jest wymieniony w PIK i nie będzie wyświetlany w bloku narracyjnym
				 - approachSiteCode - opcjonalnie, część ciała, przez którą należy podać lek, ze słownika 2.16.840.1.113883.5.1052, który nie został przetłumaczony na j. polski (wartości typu 'left foot'), nie jest wyświetlana
				 - *doseQuantity - wymagane i nie nullFlavor gdy stosowanie zapisano w entry, zabronione gdy stosowanie zapisano wyłącznie tekstowo w bloku narracyjnym, format jak standardowe quantity (value + unit)
				 	zawiera informacje o dawce, przy czym obsługuje się wyłącznie proste zapisy typu 1 tabletka lub 15 ml. W przypadku konieczności podania zakresu (1-2 tabletek) należy to zapisać słownie w elemencie o ID="p1_edytuj_stosowanie_wartosc_{position()}"
				 - rateQuantity - wg IHE PRE wymagane i nie nullFlavor gdy stosowanie zapisano w entry, zabronione gdy stosowanie zapisano wyłącznie tekstowo w bloku narracyjnym, format jak standardowe quantity (value + unit)
				 	zawiera informację o szybkości podawania dawki w czasie, stosowane przede wszystkim na potrzeby injekcji, nie jest wykorzystywane przez niniejszą transformatę (!)
				 - maxDoseQuantity - opcjonalne, zdefiniowane wyłącznie w HL7 CDA, zastrzeżenie określające maksymalną dawkę dopuszczalną dla pacjenta w określonym czasie
				 - related components typu zagnieżdżone substanceAdministration przy innym templateId niż *.1.4.7.1, zapisy typu pre-condition i condition, przy czym warunków/założeń tego typu nie obsługuje się tą transformatą -->
			
			<!-- obsługa częstotliwości podawania leku ogranicza się do typów:
				 - TS - jednorazowe podanie
				 - PIVL_TS - okresowe podawanie, np. 2 razy dziennie, przy czym zapisuje się to value='12' unit='h', co można wyświetlić jako 'co 12 h'. Czasu trwania podania hl7:phase nie wyświetla się.
				 	obsługuje się jednostki czasu: h (godzina) i min (minuta), raz dziennie należy zapisać jako co 24 h.
				 - pozostałe typy notacji czasu nie są obsługiwane, dotyczą okresów zmiennych (SXPR_TS), okresów z wartościami granicznymi (PIVL_PPD_TS) i okresów zależnych od zdarzenia, np. przed śniadaniem (EIVL_TS) -->
			
			<xsl:if test="$freq and $dose"> 
				<!-- format D.S. 2 x 1, (np. 2 razy dziennie - 1 tabletka) gdzie 2 z effectiveTime z operator = 'A', 1 z dose quantity -->
				<content ID="p1_stosowanie_wartosc_{position()}" styleCode="Bold">
					
					<xsl:choose>
						<xsl:when test="$freq/@xsi:type='TS'">
							<xsl:text>Podać raz: </xsl:text>
							<xsl:call-template name="formatDateTime">
								<xsl:with-param name="date" select="$freq/@value"/>
							</xsl:call-template>
						</xsl:when>
						<!-- PIVL_TS ograniczone do minimum np. <effectiveTime xsi:type='PIVL_TS' operator='A'><period value='12' unit='h'/> -->
						<xsl:when test="$freq/@xsi:type='PIVL_TS' and $freq/hl7:period/@value='24' and hl7:period/@unit='h'">
							<xsl:text>Raz dziennie</xsl:text>
						</xsl:when>
						<xsl:when test="$freq/@xsi:type='PIVL_TS' and $freq/hl7:period/@value='12' and $freq/hl7:period/@unit='h'">
							<xsl:text>2 x dziennie</xsl:text>
						</xsl:when>
						<xsl:when test="$freq/@xsi:type='PIVL_TS' and $freq/hl7:period/@value='8' and $freq/hl7:period/@unit='h'">
							<xsl:text>3 x dziennie</xsl:text>
						</xsl:when>
						<xsl:when test="$freq/@xsi:type='PIVL_TS' and $freq/hl7:period/@value='6' and $freq/hl7:period/@unit='h'">
							<xsl:text>4 x dziennie</xsl:text>
						</xsl:when>
						<xsl:when test="$freq/@xsi:type='PIVL_TS' and $freq/hl7:period/@value and $freq/hl7:period/@unit">
							<xsl:text>Co </xsl:text>
							<xsl:value-of select="$freq/hl7:period/@value"/>
							<xsl:text> </xsl:text>
							<xsl:value-of select="$freq/hl7:period/@unit"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:text>Dawkowanie</xsl:text>
							<xsl:value-of select="$freq/@xsi:type"/>
							<xsl:value-of select="$freq/hl7:period/@value"/>
							<xsl:value-of select="$freq/hl7:period/@unit"/>
						</xsl:otherwise>
					</xsl:choose>
					
					<xsl:text> po </xsl:text>
					
					<!-- w doseQuantity ograniczamy się wyłącznie do obsługi @value i @unit (weź 2 tabletki albo weź 15 ml syropu), bez obsługi zakresów (weź 1-2 tabletek) -->
					<!-- dla unit należy opracować słownik, w szczególności tłumaczenie słowników wykorzystywanych przez epSOS (jeden dla miar, drugi dla bytów policzalnych typu tabletka (1.3.6.1.4.1.12559.11.10.1.3.1.42.2) -->
					<xsl:call-template name="quantityUnitOrSzt">
						<xsl:with-param name="quantity" select="$sa/hl7:doseQuantity"/>
					</xsl:call-template>
					
					<!-- przemnażanie dat na wypadek gdyby nie podano np. dni w dacie, co jest dopuszczalne czysto teoretycznie -->
			    	<xsl:variable name="substAdmDate2c" select="10000 * substring($substAdmDate/hl7:low/@value, 1, 4) + 100 * substring($substAdmDate/hl7:low/@value, 5, 2) + substring($substAdmDate/hl7:low/@value, 7, 2)"/>
					<xsl:variable name="supplyDate2c" select="10000 * substring($supplyDate/@value, 1, 4) + 100 * substring($supplyDate/@value, 5, 2) + substring($supplyDate/@value, 7, 2)"/>
					
					<xsl:if test="$substAdmDate2c &gt; $supplyDate2c">
						<xsl:text>, rozpocząć </xsl:text>
						<xsl:call-template name="formatDateTime">
							<xsl:with-param name="date" select="$substAdmDate/hl7:low/@value"/>
						</xsl:call-template>
					</xsl:if>
					
					<xsl:if test="$substAdmDate/hl7:high[not(@nullFlavor)] and string-length($substAdmDate/hl7:high/@value) &gt;= 6">
						<xsl:text>, zakończyć do </xsl:text>
						<xsl:call-template name="formatDateTime">
							<xsl:with-param name="date" select="$substAdmDate/hl7:high/@value"/>
						</xsl:call-template>
					</xsl:if>
					
					<!-- wg IHE PRE repeatNumber oznacza ilość powtórzeń wykonanego substance administration, przy braku powtórzeń należy stosować wartość 0 -->
					<xsl:if test="$sa/hl7:repeatNumber/@value &gt;= 1">
						<xsl:text>, powtórzyć cykl </xsl:text>
						<xsl:value-of select="$sa/hl7:repeatNumber/@value"/>
						<xsl:choose>
							<xsl:when test="$sa/hl7:repeatNumber/@value = 1">
								<xsl:text> raz</xsl:text>
							</xsl:when>
							<xsl:otherwise>
								<xsl:text> razy</xsl:text>
							</xsl:otherwise>
						</xsl:choose>
					</xsl:if>
				</content>
			</xsl:if>
			<content ID="p1_edytuj_stosowanie_wartosc_{position()}" styleCode="Bold"></content>
		</xsl:element>
	</xsl:template>
	
	<!-- Informacja dla osoby wydającej lek 2.16.840.1.113883.3.4424.13.10.4.75 0..* -->
	<xsl:template match="hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.75']">
		<xsl:element name="paragraph">
			<xsl:apply-templates select="hl7:text/hl7:reference/@value"/>
			<content ID="p1_infoDlaWydajacego_opis_{position()}">Informacja dla osoby wydającej lek:</content>
			<content ID="p1_edytuj_infoDlaWydajacego_wartosc_{position()}"></content>
		</xsl:element>
	</xsl:template>
	
	<!-- szablon Wydanie leku 2.16.840.1.113883.3.4424.13.10.4.55 obsłużony jest wewnątrz szablonów wykorzystujących go -->
	
	<!-- SEKCJA DANYCH UBEZPIECZENIOWYCH -->
	
	<!-- szablon Dane o uprawnieniach i płatnikach 2.16.840.1.113883.3.4424.13.10.4.51 (z LOINC code = Payment source) -->
	<xsl:template match="hl7:act[hl7:templateId/@root = '2.16.840.1.113883.3.4424.13.10.4.51']">
		<!-- szablon generyczny 4.52 obsłużony w postawowym zakresie, raczej nie stosowany, stosuje się kolejne dwa szablony 4.60 i 4.61 specjalizujące 4.52 -->
		<!-- nie wykorzystuje się identyfikatora referencji wskazywanego na poziomie aktu Payment source, zamiast tego poniższych szablonach wykorzystuje się
			 identyfikatory referencji z aktu zagnieżdżonego PUBLICPOL, zwykle oba identyfikatory są takie same (nie ma sensu stosowanie dwóch różnych) -->
		<xsl:apply-templates select="hl7:entryRelationship/hl7:act[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.52']"/>
		<xsl:apply-templates select="hl7:entryRelationship/hl7:act[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.60']"/>
		<xsl:apply-templates select="hl7:entryRelationship/hl7:act[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.61']"/>
		<!-- opcjonalne instancje szablonu Pozycja komentarza 0..* -->
		<xsl:apply-templates select="hl7:entryRelationship/hl7:act[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.68']"/>
	</xsl:template>
	
	<!-- szablon Publiczne ubezpieczenie zdrowotne 2.16.840.1.113883.3.4424.13.10.4.60 -->
	<xsl:template match="hl7:entryRelationship/hl7:act[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.60']">
		<!-- performer 1..1 z dopuszczalnymi wieloma identyfikatorami tego samego płatnika, w tym miejscu pobiera się także id referencji do bloku narracyjnego -->
		<xsl:call-template name="payerIDs">
			<xsl:with-param name="performer" select="hl7:performer"/>
		</xsl:call-template>
		
		<!-- pomija się szereg mniej istotnych wartości z entry, np. priorityCode, effectiveTime, subject, informant - recepty powinny zawierać podstawowe informacje dot. źródła refundacji -->
		
		<!-- Dokument uprawnień: Nr leg.: 238/2015 (zwykle nie występuje w tym szablonie) -->
		<xsl:variable name="docsNo" select="count(hl7:reference/hl7:externalDocument[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.59'])"/>
		
		<xsl:choose>
			<xsl:when test="$docsNo = 1">
				<paragraph>
					<content ID="p1_dokumentyUprawnien_opis_{position()}">Dokument uprawnień:</content>
					<xsl:call-template name="dokumentUprawnien">
						<xsl:with-param name="doc" select="hl7:reference/hl7:externalDocument[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.59']"/>
					</xsl:call-template>
				</paragraph>
			</xsl:when>
			<xsl:when test="$docsNo &gt; 1">
				<list styleCode="Disc" listType="unordered">
					<caption ID="p1_dokumentyUprawnien_opis_{position()}">Dokumenty uprawnień:</caption>
					<xsl:for-each select="hl7:reference/hl7:externalDocument[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.59']">
						<xsl:element name="item">
							<xsl:call-template name="dokumentUprawnien">
								<xsl:with-param name="doc" select="."/>
							</xsl:call-template>
						</xsl:element>
					</xsl:for-each>
				</list>
			</xsl:when>
		</xsl:choose>
		
		<!-- szablony:
			- Dane autoryzacyjne związane z ubezpieczeniem 2.16.840.1.113883.3.4424.13.10.4.53 i jego poniższa specjalizacja stosowana w receptach 
			- Dane autoryzacyjne związane z refundacją leków 2.16.840.1.113883.3.4424.13.10.4.69 
				nie są przetwarzane na postać tekstową, mają charakter techniczny -->
		
		<!-- Szablon Potwierdzenie ubezpieczenia w NFZ 2.16.840.1.113883.3.4424.13.10.4.58, tj. "kod eWUś" -->
		<xsl:apply-templates select="hl7:reference/hl7:externalAct[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.58']"/>
			
		<!-- brak pozycji komentarza, w przeciwieństwie do ogólnego szablonu 4.52 -->
	</xsl:template>
	
	<!-- szablon Uprawnienia dodatkowe publicznego ubezpieczenia zdrowotnego, zawierający kod uprawnienia dot. refundacji leków (to jego jedyny wyróżnik w stosunku do 4.60) -->
	<xsl:template match="hl7:entryRelationship/hl7:act[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.61']">
		<!-- performer 1..1 z dopuszczalnymi wieloma identyfikatorami tego samego płatnika, w tym miejscu pobiera się także id referencji do bloku narracyjnego -->
		<xsl:call-template name="payerIDs">
			<xsl:with-param name="performer" select="hl7:performer"/>
		</xsl:call-template>
		
		<!-- Uprawnienia dodatkowe: IB, Nr leg.: 238/2015 -->
		<xsl:variable name="docsNo" select="count(hl7:reference/hl7:externalDocument[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.59'])"/>
		
		<paragraph>
			<content ID="p1_uprawnieniaDodatkowe_opis_{position()}">Uprawnienia dodatkowe</content>
			
			<!-- wartość displayName jest taka sama jak code, wykorzystuję obowiązkowe code -->
			<content ID="p1_uprawnieniaDodatkowe_wartosc_{position()}" styleCode="Bold">
				<xsl:value-of select="hl7:code/hl7:qualifier/hl7:value/@code"/>
			</content>
		
			<xsl:if test="$docsNo = 1">
				<xsl:text> (</xsl:text>
				<xsl:call-template name="dokumentUprawnien">
					<xsl:with-param name="doc" select="hl7:reference/hl7:externalDocument[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.59']"/>
				</xsl:call-template>
				<xsl:text>)</xsl:text>
			</xsl:if>
		</paragraph>
		
		<xsl:if test="$docsNo &gt; 1">
			<list styleCode="Disc" listType="unordered">
				<xsl:for-each select="hl7:reference/hl7:externalDocument[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.59']">
					<xsl:element name="item">
						<xsl:call-template name="dokumentUprawnien">
							<xsl:with-param name="doc" select="."/>
						</xsl:call-template>
					</xsl:element>
				</xsl:for-each>
			</list>
		</xsl:if>
		
		<!-- szablon Potwierdzenie ubezpieczenia w NFZ 2.16.840.1.113883.3.4424.13.10.4.58, tj. "kod eWUś" -->
		<xsl:apply-templates select="hl7:reference/hl7:externalAct[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.58']"/>
		
		<!-- brak pozycji komentarza, w przeciwieństwie do ogólnego szablonu 4.52 -->
	</xsl:template>
	
	<!-- szablon generyczny Pozycja danych o uprawnieniach i płatnikach 2.16.840.1.113883.3.4424.13.10.4.52, podstawowa obsługa
		 nie powinien być stosowany choć jest dopuszczony, w receptach standardowo stosuje się powyższe dwa szablony specjalizujące 4.60 i 4.61 -->
	<xsl:template match="hl7:entryRelationship/hl7:act[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.52']">
		<!-- performer 1..1 z dopuszczalnymi wieloma identyfikatorami tego samego płatnika, w tym miejscu pobiera się także id referencji do bloku narracyjnego -->
		<xsl:call-template name="payerIDs">
			<xsl:with-param name="performer" select="hl7:performer"/>
		</xsl:call-template>

		<!-- opcjonalne instancje szablonu Pozycja komentarza 0..*, pozostałe elementy szablonu pomija się, w tym także wymagany participant -->
		<xsl:apply-templates select="hl7:entryRelationship/hl7:act[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.68']"/>
	</xsl:template>
	
	<!-- szablon Dokument uprawnień 2.16.840.1.113883.3.4424.13.10.4.59 przyjmuje informacje o jednym dokumencie, albo w postaci id, albo w postaci tekstowej:
		- opcjonalny identyfkator (id) root/extension jednego z trzech dokumentów uprawnień
		- opcjonalny kod (code) z nazwą powyższego dokumentu, nie wymusza się podana kodu przy podaniu id, więc na potrzeby wyświetlenia nazwy dokumentu wykorzystane zostanie root identyfikatora, nie code
		- opcjonalny tekst, nie istnieją zasady uzupełniania tekstu, przyjmuje się, że tekst stosowany jest do zapisania nazwy i numeru dokumentu spoza puli obsługiwanej przez id/code -->
	<xsl:template name="dokumentUprawnien">
		<xsl:param name="doc"/>
		<!-- jeżeli text istnieje, to zakłada się brak skomplikowanego formatowania, wyłącznie prosty tekst do wyświetlenia -->
		<content ID="p1_dokumentUprawnien_wartosc_{position()}">
			<xsl:choose>
				<xsl:when test="$doc/hl7:id">
					<xsl:call-template name="translateTypDokumentuUprawnien">
						<xsl:with-param name="root" select="$doc/hl7:id/@root"/>
					</xsl:call-template>
					<xsl:text>: </xsl:text>
					<xsl:value-of select="$doc/hl7:id/@extension"/>
					<xsl:if test="$doc/hl7:text">
						<xsl:text> (</xsl:text>
						<xsl:value-of select="$doc/hl7:text"/>
						<xsl:text>)</xsl:text>
					</xsl:if>
				</xsl:when>
				<xsl:when test="$doc/hl7:text">
					<xsl:value-of select="$doc/hl7:text"/>
				</xsl:when>
			</xsl:choose>
		</content>
	</xsl:template>
	
	<!-- potwierdzenie ubezpieczenia w NFZ 2.16.840.1.113883.3.4424.13.10.4.58, tj. kod eWUŚ -->
	<xsl:template match="hl7:reference/hl7:externalAct[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.58']">
		<paragraph>
			<content ID="p1_eWUS_opis_{position()}">
				<!-- OID 2.16.840.1.113883.3.4424.8.4 to pula potwierdzeń eWUŚ, sam fakt istnienia zapisu oznacza istnienie potwierdzenia -->
				<xsl:text>Potwierdzenie eWUŚ:</xsl:text>
			</content>
			<content ID="p1_eWUS_wartosc_{position()}">
				<xsl:value-of select="hl7:id/@extension"/>
			</content>
		</paragraph>
	</xsl:template>
	
	<!-- szablon Pozycja komentarza 2.16.840.1.113883.3.4424.13.10.4.68
		 szablon ten zawiera wyłącznie referencję do fragmentu narrative block, 
		 a więc rolą niniejszej transformaty jest wygenerowania w narrative block 
		 fragmentu paragraph z identyfikatorem z referencji oraz blokiem content wskazującym edytowalny fragment.
		 Scenariusz zastosowania -	użytkownik systemu wystawcy klika "dodaj adnotację", pojawia się entry 4.68 z id referencji, 
		 							transformata generuje fragment edytowalny w narrative block, system wystawcy zamieszcza kursor we fragmencie edytowalnym.
		 							Usunięcie pozycji komentarza i wywołanie transformaty spowoduje usunięcie całego paragrafu z narrative block. -->
	<xsl:template match="hl7:act[hl7:templateId/@root='2.16.840.1.113883.3.4424.13.10.4.68']">
		<paragraph>
			<xsl:apply-templates select="hl7:text/hl7:reference/@value"/>
			<!-- komentarze mogą powtarzać się na poziomie sekcji, szablonu 4.51 i głębiej szablony 4.52, stąd dodatkowy generowany ID unikalny dla identyfikatora -->
			<content ID="p1_edytuj_PozycjaKomentarza_{position()}_{generate-id(.)}"></content>
		</paragraph>
	</xsl:template>
	
	
	<!-- WSPÓLNE -->
	
	<!-- kopiowanie referencji do bloku tekstowego -->
	<xsl:template match="hl7:text/hl7:reference/@value">
		<xsl:if test="string-length(.) &gt;= 2">
			<xsl:attribute name="ID">
				<xsl:value-of select="substring-after(., '#')"/>
			</xsl:attribute>
		</xsl:if>
	</xsl:template>
	
	<!-- formatowanie daty i czasu -->
	<xsl:template name="formatDateTime">
		<xsl:param name="date"/>
		
		<xsl:param name="year" select="number(substring($date, 1, 4))"/>
		<xsl:param name="monthIndex" select="number(substring($date, 5, 2))"/>
		<xsl:param name="day" select="number(substring($date, 7, 2))"/>
		<xsl:param name="hour" select="substring($date, 9, 2)"/>
		<xsl:param name="minute" select="substring($date, 11, 2)"/>
		<xsl:param name="second" select="substring($date, 13, 2)"/>
		
		<xsl:value-of select="$day"/>
		
		<xsl:text> </xsl:text>
		<xsl:call-template name="translateFullDateMonth">
			<xsl:with-param name="month" select="$monthIndex"/>
		</xsl:call-template>

		<xsl:text> </xsl:text>
		<xsl:value-of select="$year"/>
		<xsl:text> r.</xsl:text>
		
		<xsl:if test="$hour and $minute and ($hour != 00 or $minute != 00)">
			<xsl:variable name="displayHour">
				<xsl:choose>
					<xsl:when test="$hour = 00">
						<xsl:value-of select="$hour"/>
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="number($hour)"/>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:variable> 

			<xsl:text> </xsl:text>
			<xsl:value-of select="$displayHour"/>
			<xsl:text>:</xsl:text>
			<xsl:value-of select="$minute"/>
		</xsl:if>
	</xsl:template>
	
	<!-- nazwa miesiąca w pełnej dacie -->
	<xsl:template name="translateFullDateMonth">
		<xsl:param name="month"/>
		
		<xsl:choose>
			<xsl:when test="$month='01'"><xsl:text>stycznia</xsl:text></xsl:when>
			<xsl:when test="$month='02'"><xsl:text>lutego</xsl:text></xsl:when>
			<xsl:when test="$month='03'"><xsl:text>marca</xsl:text></xsl:when>
			<xsl:when test="$month='04'"><xsl:text>kwietnia</xsl:text></xsl:when>
			<xsl:when test="$month='05'"><xsl:text>maja</xsl:text></xsl:when>
			<xsl:when test="$month='06'"><xsl:text>czerwca</xsl:text></xsl:when>
			<xsl:when test="$month='07'"><xsl:text>lipca</xsl:text></xsl:when>
			<xsl:when test="$month='08'"><xsl:text>sierpnia</xsl:text></xsl:when>
			<xsl:when test="$month='09'"><xsl:text>września</xsl:text></xsl:when>
			<xsl:when test="$month='10'"><xsl:text>października</xsl:text></xsl:when>
			<xsl:when test="$month='11'"><xsl:text>listopada</xsl:text></xsl:when>
			<xsl:when test="$month='12'"><xsl:text>grudnia</xsl:text></xsl:when>
			<xsl:otherwise><xsl:value-of select="$month"/></xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!-- nazwa miesiąca w pełnej dacie -->
	<xsl:template name="translateTypDokumentuUprawnien">
		<xsl:param name="root"/>
		
		<xsl:choose>
			<xsl:when test="$root='2.16.840.1.113883.3.4424.8.2'"><xsl:text>Poświadczenie NFZ</xsl:text></xsl:when>
			<xsl:when test="$root='2.16.840.1.113883.3.4424.8.3'"><xsl:text>Karta EKUZ</xsl:text></xsl:when>
			<!-- certyfikat nie jest obsługiwany w szablone Dokument uprawneń, dodano w tym miejscu by pokryć wszystkie OID z puli -->
			<xsl:when test="$root='2.16.840.1.113883.3.4424.8.4'"><xsl:text>Certyfikat zastępujący kartę EKUZ</xsl:text></xsl:when>
			<xsl:when test="$root='2.16.840.1.113883.3.4424.8.5'"><xsl:text>Karta Polaka</xsl:text></xsl:when>
			<xsl:otherwise><xsl:value-of select="$root"/></xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!-- identyfikatory płatnika -->
	<xsl:template name="payerIDs">
		<xsl:param name="performer"/>
		
		<xsl:variable name="payersNo" select="count($performer/hl7:assignedEntity/hl7:id[not(@displayable = 'false')])"/>
		<xsl:choose>
			<xsl:when test="$payersNo = 0">
			</xsl:when>
			<xsl:when test="$payersNo = 1">
				<paragraph>
					<xsl:apply-templates select="hl7:text/hl7:reference/@value"/>
					<xsl:call-template name="translatePayerID">
						<xsl:with-param name="id" select="$performer/hl7:assignedEntity/hl7:id[not(@displayable = 'false')]"/>
					</xsl:call-template>
				</paragraph>
			</xsl:when>
			<xsl:otherwise>
				<xsl:element name="list">
					<xsl:attribute name="styleCode">Disc</xsl:attribute>
					<xsl:attribute name="listType">unordered</xsl:attribute>
					<xsl:apply-templates select="hl7:text/hl7:reference/@value"/>
					<caption ID="p1_platnik_opis_{position()}">Płatnik posiadający identyfikatory:</caption>
					<xsl:for-each select="$performer/hl7:assignedEntity/hl7:id[not(@displayable = 'false')]">
						<xsl:element name="item">
							<xsl:call-template name="translatePayerIDs">
								<xsl:with-param name="id" select="."/>
							</xsl:call-template>
						</xsl:element>
					</xsl:for-each>
				</xsl:element>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!-- identyfikator płatnika -->
	<xsl:template name="translatePayerID">
		<xsl:param name="id"/>
		<xsl:choose>
			<xsl:when test="not($id) or $id/@nullFlavor">
				<content ID="p1_platnik_opis_{position()}">Płatnik: </content>
				<xsl:call-template name="translateNullFlavor">
					<xsl:with-param name="nullableElement" select="$id"/>
				</xsl:call-template>
			</xsl:when>
			<xsl:when test="$id/@root='2.16.840.1.113883.3.4424.3.1' and ($id/@extension='01' or $id/@extension='02' or $id/@extension='03' or $id/@extension='04' or $id/@extension='05' or $id/@extension='06' or $id/@extension='07' or $id/@extension='08' or $id/@extension='09' or $id/@extension='10' or $id/@extension='11' or $id/@extension='12' or $id/@extension='13' or $id/@extension='14' or $id/@extension='15' or $id/@extension='16')">
				<content ID="p1_platnik_opis_{position()}">Oddział NFZ</content>
				<content ID="p1_platnik_wartosc_{position()}" styleCode="Bold"><xsl:value-of select="$id/@extension"/></content>
			</xsl:when>
			<xsl:when test="$id/@root='2.16.840.1.113883.3.4424.3.1' and $id/@extension='95'">
				<content ID="p1_platnik_opis_{position()}">Płatnik</content>
				<content ID="p1_platnik_wartosc_{position()}" styleCode="Bold">Minister Pracy i Polityki Społecznej</content>
			</xsl:when>
			<xsl:when test="$id/@root='2.16.840.1.113883.3.4424.3.1' and $id/@extension='96'">
				<content ID="p1_platnik_opis_{position()}">Płatnik</content>
				<content ID="p1_platnik_wartosc_{position()}" styleCode="Bold">Minister Edukacji Narodowej</content>
			</xsl:when>
			<xsl:when test="$id/@root='2.16.840.1.113883.3.4424.3.1' and $id/@extension='97'">
				<content ID="p1_platnik_opis_{position()}">Płatnik</content>
				<content ID="p1_platnik_wartosc_{position()}" styleCode="Bold">Minister Obrony Narodowej</content>
			</xsl:when>
			<xsl:when test="$id/@root='2.16.840.1.113883.3.4424.3.1' and $id/@extension='98'">
				<content ID="p1_platnik_opis_{position()}">Płatnik</content>
				<content ID="p1_platnik_wartosc_{position()}" styleCode="Bold">Minister Zdrowia</content>
			</xsl:when>
			<xsl:otherwise>
				<content ID="p1_platnik_opis_{position()}">Płatnik</content>
				<content ID="p1_platnik_wartosc_{position()}" styleCode="Bold">
					<xsl:value-of select="$id/@root"/>
					<xsl:if test="$id/@extension">
						<xsl:text> </xsl:text>
						<xsl:value-of select="$id/@extension"/>
					</xsl:if>
				</content>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!-- identyfikatory płatników dla listy, funkcjonalność dopuszczona przez PIK, w praktyce raczej nie będzie wykorzystywana -->
	<xsl:template name="translatePayerIDs">
		<xsl:param name="id"/>
		<xsl:choose>
			<xsl:when test="not($id) or $id/@nullFlavor">
				<xsl:call-template name="translateNullFlavor">
					<xsl:with-param name="nullableElement" select="$id"/>
				</xsl:call-template>
			</xsl:when>
			<xsl:when test="$id/@root='2.16.840.1.113883.3.4424.3.1' and ($id/@extension='01' or $id/@extension='02' or $id/@extension='03' or $id/@extension='04' or $id/@extension='05' or $id/@extension='06' or $id/@extension='07' or $id/@extension='08' or $id/@extension='09' or $id/@extension='10' or $id/@extension='11' or $id/@extension='12' or $id/@extension='13' or $id/@extension='14' or $id/@extension='15' or $id/@extension='16')">
				<content ID="p1_platnik_wartosc_{position()}">Oddział NFZ <xsl:value-of select="$id/@extension"/></content>
			</xsl:when>
			<xsl:when test="$id/@root='2.16.840.1.113883.3.4424.3.1' and $id/@extension='95'">
				<content ID="p1_platnik_wartosc_{position()}">Minister Pracy i Polityki Społecznej</content>
			</xsl:when>
			<xsl:when test="$id/@root='2.16.840.1.113883.3.4424.3.1' and $id/@extension='96'">
				<content ID="p1_platnik_wartosc_{position()}">Minister Edukacji Narodowej</content>
			</xsl:when>
			<xsl:when test="$id/@root='2.16.840.1.113883.3.4424.3.1' and $id/@extension='97'">
				<content ID="p1_platnik_wartosc_{position()}">Minister Obrony Narodowej</content>
			</xsl:when>
			<xsl:when test="$id/@root='2.16.840.1.113883.3.4424.3.1' and $id/@extension='98'">
				<content ID="p1_platnik_wartosc_{position()}">Minister Zdrowia</content>
			</xsl:when>
			<xsl:otherwise>
				<content ID="p1_platnik_wartosc_{position()}">
					<xsl:value-of select="$id/@root"/>
					<xsl:if test="$id/@extension">
						<xsl:text> </xsl:text>
						<xsl:value-of select="$id/@extension"/>
					</xsl:if>
				</content>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!-- dopisanie jednostki lub "szt." w przypadku braku jednostki -->
	<xsl:template name="quantityUnitOrSzt">
		<xsl:param name="quantity"/>
		<xsl:value-of select="$quantity/@value"/>
		<xsl:choose>
			<xsl:when test="$quantity/@unit and string-length($quantity/@unit) &gt;= 1">
				<xsl:text> </xsl:text>
				<xsl:value-of select="$quantity/@unit"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:text> szt.</xsl:text>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!-- nullFlavor-->
	<xsl:template name="translateNullFlavor">
		<xsl:param name="nullableElement"/>
		<!-- HL7 CDA dopuszcza podanie nullFlavor dla każdego kwantu danych i każdego elementu
			 obsłużono wyłącznie najważniejsze przypadki i najpopularniejsze kody, pozostałe kody tłumaczone są na 'nie podano':
			 NI = No Information. This is the most general and default null flavor.
			 NA = Not Applicable. Known to have no proper value (e.g., last menstrual period for a male).
			 UNK = Unknown. A proper value is applicable, but is not known.
			 ASKU = asked, but not known. Information was sought, but not found (e.g., the patient was asked but did not know).
			 NAV = temporarily unavailable. The information is not available, but is expected to be available later.
			 NASK = Not Asked. The patient was not asked. -->
		<xsl:if test="not($nullableElement) or $nullableElement/@nullFlavor">
			<content>
				<xsl:choose>
					<xsl:when test="not($nullableElement)">
						<xsl:text>nie podano</xsl:text>
					</xsl:when>
					<xsl:when test="$nullableElement/@nullFlavor='NI'">
						<xsl:text>brak informacji</xsl:text>
					</xsl:when>
					<xsl:when test="$nullableElement/@nullFlavor='NA'">
						<xsl:text>nie dotyczy</xsl:text>
					</xsl:when>
					<xsl:when test="$nullableElement/@nullFlavor='UNK'">
						<xsl:text>nieznane</xsl:text>
					</xsl:when>
					<xsl:when test="$nullableElement/@nullFlavor='ASKU'">
						<xsl:text>nie uzyskano informacji</xsl:text>
					</xsl:when>
					<xsl:when test="$nullableElement/@nullFlavor='NAV'">
						<xsl:text>czasowo niedostępne</xsl:text>
					</xsl:when>
					<xsl:when test="$nullableElement/@nullFlavor='NASK'">
						<xsl:text>nie pytano</xsl:text>
					</xsl:when>
					<xsl:otherwise>
						<xsl:text>nie podano</xsl:text>
					</xsl:otherwise>
				</xsl:choose>
			</content>
		</xsl:if>
	</xsl:template>
</xsl:stylesheet>
