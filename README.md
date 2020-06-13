# Playground project for development of JAXB + Polish implementation of HL7 (ex. e-recepta)

## General info
Used Apache CXF xjc plugin to generate Java classes from XSD files.
Provided .xjb to adjust what will be generated.

- `generateMixedExtensions="true"` provides `List<Serializable>` fields which allows correctly handle Strings, address section, personal details section, narrative block sections. In few places it is important because allows using `JAXBElement<>` as wrapper to adjust namespaces.
-  `<xjc:simple/>` extension replaced in few places `List<JAXBElement<>>` into flat list of fields instead of mixing types in singe field.
- `jaxb:package name=` just specifies to what package generated classes should be put rather then default one decoded from namespace - important when in project uses different generated code with different XSD representing analogous models, in my case it was `http://www.w3.org/2000/09/xmldsig#` one from CSIOZ and other from eWUŚ.
-  `<jaxb:property name="id2"/>` fixed generated fields conflict as those classes already have field called "ID" with different content.
- `<annox:annotate target="field">@javax.xml.bind.annotation.XmlElement(namespace = "urn:ihe:pharm", nillable = false)</annox:annotate>` because default annotation had `nillable = true`. During marshalling objects to XML in such config it always produces element as `nil` and CSIOZ rejects document with that construct.

## Made tries:

- `Try01` reads file with XML content and unmarshall it to ClinicalDocument. In same time correctly decodes Polish implementation types like pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.AdxpPostalCode
- `Try02` takes ClinicalDocument and marshals it to String with XML content (possible to control pretty/non-pretty print)
- `Try03` reads file with XML content and transforms it to String with XML presenting document narrative sections - required to ensure its consistency since 01.06.2020
- `Try04` takes ClinicalDocument and transforms it to String with XML presenting document narrative sections (analogous to `Try03` just different input)
- `Try05` IT DOES NOT WORK; should take ClinicalDocument and transforms it to ClinicalDocument with only narrative sections, but couldn't adjust unmarshalling transformed document StreamSource to JAXBResult with ClinicalDocument
- `Try06` reads file with XML content and unmarshall it to ClinicalDocument - similar to `Try01` however uses XMLStreamReader to skip indents, only-whitespaces and next lines in mixed content
- `Try07` takes ClinicalDocument and transform it into other ClinicalDocument instance with narrative sections ONLY (it does not apply it to original ClinicalDocument). As auto-magic transformation from `Try05` did not work it transforms ClinicalDocument into String with XML, adjust String to be parsable, unmarshal String to ClinicalDocument.
- `Try08` applies ClinicalDocument with narrative sections only elements into ClinicalDocument without narrative sections
- `Try09` takes ClinicalDocument and transforms it to String with HTML for visual presentation to m.d. the one provided by CSIOZ

Each try has tests proving that it still works - however `pl.konczak.jaxbplhl7tries.util.Constants` have hardcoded paths rather than to resource files. 

## Helpful resources:

- https://javaee.github.io/jaxb-v2/doc/user-guide/release-documentation.html
- https://timjansen.github.io/jarfiller/guide/jaxb/jaxboverview.xhtml#jaxboverview
- loved StackOverflow :)
