
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.konczak.tries.ihe.pharm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SubjectOf1_QNAME = new QName("urn:ihe:pharm", "subjectOf1");
    private final static QName _SubjectOf2_QNAME = new QName("urn:ihe:pharm", "subjectOf2");
    private final static QName _SubjectOf3_QNAME = new QName("urn:ihe:pharm", "subjectOf3");
    private final static QName _SubjectOf4_QNAME = new QName("urn:ihe:pharm", "subjectOf4");
    private final static QName _SubjectOf5_QNAME = new QName("urn:ihe:pharm", "subjectOf5");
    private final static QName _Desc_QNAME = new QName("urn:ihe:pharm", "desc");
    private final static QName _RiskCode_QNAME = new QName("urn:ihe:pharm", "riskCode");
    private final static QName _HandlingCode_QNAME = new QName("urn:ihe:pharm", "handlingCode");
    private final static QName _FormCode_QNAME = new QName("urn:ihe:pharm", "formCode");
    private final static QName _ExpirationTime_QNAME = new QName("urn:ihe:pharm", "expirationTime");
    private final static QName _StabilityTime_QNAME = new QName("urn:ihe:pharm", "stabilityTime");
    private final static QName _AsDistributedProduct_QNAME = new QName("urn:ihe:pharm", "asDistributedProduct");
    private final static QName _AsMedicineManufacturer_QNAME = new QName("urn:ihe:pharm", "asMedicineManufacturer");
    private final static QName _AsContent_QNAME = new QName("urn:ihe:pharm", "asContent");
    private final static QName _AsSpecializedKind_QNAME = new QName("urn:ihe:pharm", "asSpecializedKind");
    private final static QName _Part_QNAME = new QName("urn:ihe:pharm", "part");
    private final static QName _Ingredient_QNAME = new QName("urn:ihe:pharm", "ingredient");
    private final static QName _COCTMT230100UVTerritorialAuthorityTerritory_QNAME = new QName("urn:ihe:pharm", "territory");
    private final static QName _COCTMT230100UVTerritorialAuthorityGoverningCountry_QNAME = new QName("urn:ihe:pharm", "governingCountry");
    private final static QName _COCTMT230100UVSubContentContainedPackagedMedicine_QNAME = new QName("urn:ihe:pharm", "containedPackagedMedicine");
    private final static QName _COCTMT230100UVRelatedManufacturerRepresentedManufacturer_QNAME = new QName("urn:ihe:pharm", "representedManufacturer");
    private final static QName _COCTMT230100UVPackagedMedicineAsSuperContent_QNAME = new QName("urn:ihe:pharm", "asSuperContent");
    private final static QName _COCTMT230100UVPackagedMedicineSubContent_QNAME = new QName("urn:ihe:pharm", "subContent");
    private final static QName _COCTMT230100UVApprovalHolder_QNAME = new QName("urn:ihe:pharm", "holder");
    private final static QName _ENDelimiter_QNAME = new QName("urn:ihe:pharm", "delimiter");
    private final static QName _ENFamily_QNAME = new QName("urn:ihe:pharm", "family");
    private final static QName _ENGiven_QNAME = new QName("urn:ihe:pharm", "given");
    private final static QName _ENPrefix_QNAME = new QName("urn:ihe:pharm", "prefix");
    private final static QName _ENSuffix_QNAME = new QName("urn:ihe:pharm", "suffix");
    private final static QName _ENValidTime_QNAME = new QName("urn:ihe:pharm", "validTime");
    private final static QName _EDReference_QNAME = new QName("urn:ihe:pharm", "reference");
    private final static QName _EDThumbnail_QNAME = new QName("urn:ihe:pharm", "thumbnail");
    private final static QName _ADCountry_QNAME = new QName("urn:ihe:pharm", "country");
    private final static QName _ADState_QNAME = new QName("urn:ihe:pharm", "state");
    private final static QName _ADCounty_QNAME = new QName("urn:ihe:pharm", "county");
    private final static QName _ADCity_QNAME = new QName("urn:ihe:pharm", "city");
    private final static QName _ADPostalCode_QNAME = new QName("urn:ihe:pharm", "postalCode");
    private final static QName _ADStreetAddressLine_QNAME = new QName("urn:ihe:pharm", "streetAddressLine");
    private final static QName _ADHouseNumber_QNAME = new QName("urn:ihe:pharm", "houseNumber");
    private final static QName _ADHouseNumberNumeric_QNAME = new QName("urn:ihe:pharm", "houseNumberNumeric");
    private final static QName _ADDirection_QNAME = new QName("urn:ihe:pharm", "direction");
    private final static QName _ADStreetName_QNAME = new QName("urn:ihe:pharm", "streetName");
    private final static QName _ADStreetNameBase_QNAME = new QName("urn:ihe:pharm", "streetNameBase");
    private final static QName _ADStreetNameType_QNAME = new QName("urn:ihe:pharm", "streetNameType");
    private final static QName _ADAdditionalLocator_QNAME = new QName("urn:ihe:pharm", "additionalLocator");
    private final static QName _ADUnitID_QNAME = new QName("urn:ihe:pharm", "unitID");
    private final static QName _ADUnitType_QNAME = new QName("urn:ihe:pharm", "unitType");
    private final static QName _ADCareOf_QNAME = new QName("urn:ihe:pharm", "careOf");
    private final static QName _ADCensusTract_QNAME = new QName("urn:ihe:pharm", "censusTract");
    private final static QName _ADDeliveryAddressLine_QNAME = new QName("urn:ihe:pharm", "deliveryAddressLine");
    private final static QName _ADDeliveryInstallationType_QNAME = new QName("urn:ihe:pharm", "deliveryInstallationType");
    private final static QName _ADDeliveryInstallationArea_QNAME = new QName("urn:ihe:pharm", "deliveryInstallationArea");
    private final static QName _ADDeliveryInstallationQualifier_QNAME = new QName("urn:ihe:pharm", "deliveryInstallationQualifier");
    private final static QName _ADDeliveryMode_QNAME = new QName("urn:ihe:pharm", "deliveryMode");
    private final static QName _ADDeliveryModeIdentifier_QNAME = new QName("urn:ihe:pharm", "deliveryModeIdentifier");
    private final static QName _ADBuildingNumberSuffix_QNAME = new QName("urn:ihe:pharm", "buildingNumberSuffix");
    private final static QName _ADPostBox_QNAME = new QName("urn:ihe:pharm", "postBox");
    private final static QName _ADPrecinct_QNAME = new QName("urn:ihe:pharm", "precinct");
    private final static QName _ADUseablePeriod_QNAME = new QName("urn:ihe:pharm", "useablePeriod");
    private final static QName _COCTMT230100UVSpecializedKindGeneralizedMedicineClass_QNAME = new QName("urn:ihe:pharm", "generalizedMedicineClass");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.konczak.tries.ihe.pharm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject2 }
     * 
     */
    public COCTMT230100UVSubject2 createCOCTMT230100UVSubject2() {
        return new COCTMT230100UVSubject2();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject1 }
     * 
     */
    public COCTMT230100UVSubject1 createCOCTMT230100UVSubject1() {
        return new COCTMT230100UVSubject1();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject22 }
     * 
     */
    public COCTMT230100UVSubject22 createCOCTMT230100UVSubject22() {
        return new COCTMT230100UVSubject22();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject3 }
     * 
     */
    public COCTMT230100UVSubject3 createCOCTMT230100UVSubject3() {
        return new COCTMT230100UVSubject3();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject7 }
     * 
     */
    public COCTMT230100UVSubject7 createCOCTMT230100UVSubject7() {
        return new COCTMT230100UVSubject7();
    }

    /**
     * Create an instance of {@link Id }
     * 
     */
    public Id createId() {
        return new Id();
    }

    /**
     * Create an instance of {@link ED }
     * 
     */
    public ED createED() {
        return new ED();
    }

    /**
     * Create an instance of {@link CE }
     * 
     */
    public CE createCE() {
        return new CE();
    }

    /**
     * Create an instance of {@link IVLTS }
     * 
     */
    public IVLTS createIVLTS() {
        return new IVLTS();
    }

    /**
     * Create an instance of {@link COCTMT230100UVDistributedProduct }
     * 
     */
    public COCTMT230100UVDistributedProduct createCOCTMT230100UVDistributedProduct() {
        return new COCTMT230100UVDistributedProduct();
    }

    /**
     * Create an instance of {@link COCTMT230100UVMedicineManufacturer }
     * 
     */
    public COCTMT230100UVMedicineManufacturer createCOCTMT230100UVMedicineManufacturer() {
        return new COCTMT230100UVMedicineManufacturer();
    }

    /**
     * Create an instance of {@link COCTMT230100UVContent }
     * 
     */
    public COCTMT230100UVContent createCOCTMT230100UVContent() {
        return new COCTMT230100UVContent();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSpecializedKind }
     * 
     */
    public COCTMT230100UVSpecializedKind createCOCTMT230100UVSpecializedKind() {
        return new COCTMT230100UVSpecializedKind();
    }

    /**
     * Create an instance of {@link COCTMT230100UVPart }
     * 
     */
    public COCTMT230100UVPart createCOCTMT230100UVPart() {
        return new COCTMT230100UVPart();
    }

    /**
     * Create an instance of {@link COCTMT230100UVIngredient }
     * 
     */
    public COCTMT230100UVIngredient createCOCTMT230100UVIngredient() {
        return new COCTMT230100UVIngredient();
    }

    /**
     * Create an instance of {@link Medication }
     * 
     */
    public Medication createMedication() {
        return new Medication();
    }

    /**
     * Create an instance of {@link COCTMT230100UVMedicine }
     * 
     */
    public COCTMT230100UVMedicine createCOCTMT230100UVMedicine() {
        return new COCTMT230100UVMedicine();
    }

    /**
     * Create an instance of {@link BL }
     * 
     */
    public BL createBL() {
        return new BL();
    }

    /**
     * Create an instance of {@link ANYNonNull }
     * 
     */
    public ANYNonNull createANYNonNull() {
        return new ANYNonNull();
    }

    /**
     * Create an instance of {@link BN }
     * 
     */
    public BN createBN() {
        return new BN();
    }

    /**
     * Create an instance of {@link Thumbnail }
     * 
     */
    public Thumbnail createThumbnail() {
        return new Thumbnail();
    }

    /**
     * Create an instance of {@link ST }
     * 
     */
    public ST createST() {
        return new ST();
    }

    /**
     * Create an instance of {@link CD }
     * 
     */
    public CD createCD() {
        return new CD();
    }

    /**
     * Create an instance of {@link CV }
     * 
     */
    public CV createCV() {
        return new CV();
    }

    /**
     * Create an instance of {@link CS }
     * 
     */
    public CS createCS() {
        return new CS();
    }

    /**
     * Create an instance of {@link CO }
     * 
     */
    public CO createCO() {
        return new CO();
    }

    /**
     * Create an instance of {@link CR }
     * 
     */
    public CR createCR() {
        return new CR();
    }

    /**
     * Create an instance of {@link SC }
     * 
     */
    public SC createSC() {
        return new SC();
    }

    /**
     * Create an instance of {@link TS }
     * 
     */
    public TS createTS() {
        return new TS();
    }

    /**
     * Create an instance of {@link TEL }
     * 
     */
    public TEL createTEL() {
        return new TEL();
    }

    /**
     * Create an instance of {@link ADXP }
     * 
     */
    public ADXP createADXP() {
        return new ADXP();
    }

    /**
     * Create an instance of {@link AdxpDelimiter }
     * 
     */
    public AdxpDelimiter createAdxpDelimiter() {
        return new AdxpDelimiter();
    }

    /**
     * Create an instance of {@link AdxpCountry }
     * 
     */
    public AdxpCountry createAdxpCountry() {
        return new AdxpCountry();
    }

    /**
     * Create an instance of {@link AdxpState }
     * 
     */
    public AdxpState createAdxpState() {
        return new AdxpState();
    }

    /**
     * Create an instance of {@link AdxpCounty }
     * 
     */
    public AdxpCounty createAdxpCounty() {
        return new AdxpCounty();
    }

    /**
     * Create an instance of {@link AdxpCity }
     * 
     */
    public AdxpCity createAdxpCity() {
        return new AdxpCity();
    }

    /**
     * Create an instance of {@link AdxpPostalCode }
     * 
     */
    public AdxpPostalCode createAdxpPostalCode() {
        return new AdxpPostalCode();
    }

    /**
     * Create an instance of {@link AdxpStreetAddressLine }
     * 
     */
    public AdxpStreetAddressLine createAdxpStreetAddressLine() {
        return new AdxpStreetAddressLine();
    }

    /**
     * Create an instance of {@link AdxpHouseNumber }
     * 
     */
    public AdxpHouseNumber createAdxpHouseNumber() {
        return new AdxpHouseNumber();
    }

    /**
     * Create an instance of {@link AdxpHouseNumberNumeric }
     * 
     */
    public AdxpHouseNumberNumeric createAdxpHouseNumberNumeric() {
        return new AdxpHouseNumberNumeric();
    }

    /**
     * Create an instance of {@link AdxpDirection }
     * 
     */
    public AdxpDirection createAdxpDirection() {
        return new AdxpDirection();
    }

    /**
     * Create an instance of {@link AdxpStreetName }
     * 
     */
    public AdxpStreetName createAdxpStreetName() {
        return new AdxpStreetName();
    }

    /**
     * Create an instance of {@link AdxpStreetNameBase }
     * 
     */
    public AdxpStreetNameBase createAdxpStreetNameBase() {
        return new AdxpStreetNameBase();
    }

    /**
     * Create an instance of {@link AdxpStreetNameType }
     * 
     */
    public AdxpStreetNameType createAdxpStreetNameType() {
        return new AdxpStreetNameType();
    }

    /**
     * Create an instance of {@link AdxpAdditionalLocator }
     * 
     */
    public AdxpAdditionalLocator createAdxpAdditionalLocator() {
        return new AdxpAdditionalLocator();
    }

    /**
     * Create an instance of {@link AdxpUnitID }
     * 
     */
    public AdxpUnitID createAdxpUnitID() {
        return new AdxpUnitID();
    }

    /**
     * Create an instance of {@link AdxpUnitType }
     * 
     */
    public AdxpUnitType createAdxpUnitType() {
        return new AdxpUnitType();
    }

    /**
     * Create an instance of {@link AdxpCareOf }
     * 
     */
    public AdxpCareOf createAdxpCareOf() {
        return new AdxpCareOf();
    }

    /**
     * Create an instance of {@link AdxpCensusTract }
     * 
     */
    public AdxpCensusTract createAdxpCensusTract() {
        return new AdxpCensusTract();
    }

    /**
     * Create an instance of {@link AdxpDeliveryAddressLine }
     * 
     */
    public AdxpDeliveryAddressLine createAdxpDeliveryAddressLine() {
        return new AdxpDeliveryAddressLine();
    }

    /**
     * Create an instance of {@link AdxpDeliveryInstallationType }
     * 
     */
    public AdxpDeliveryInstallationType createAdxpDeliveryInstallationType() {
        return new AdxpDeliveryInstallationType();
    }

    /**
     * Create an instance of {@link AdxpDeliveryInstallationArea }
     * 
     */
    public AdxpDeliveryInstallationArea createAdxpDeliveryInstallationArea() {
        return new AdxpDeliveryInstallationArea();
    }

    /**
     * Create an instance of {@link AdxpDeliveryInstallationQualifier }
     * 
     */
    public AdxpDeliveryInstallationQualifier createAdxpDeliveryInstallationQualifier() {
        return new AdxpDeliveryInstallationQualifier();
    }

    /**
     * Create an instance of {@link AdxpDeliveryMode }
     * 
     */
    public AdxpDeliveryMode createAdxpDeliveryMode() {
        return new AdxpDeliveryMode();
    }

    /**
     * Create an instance of {@link AdxpDeliveryModeIdentifier }
     * 
     */
    public AdxpDeliveryModeIdentifier createAdxpDeliveryModeIdentifier() {
        return new AdxpDeliveryModeIdentifier();
    }

    /**
     * Create an instance of {@link AdxpBuildingNumberSuffix }
     * 
     */
    public AdxpBuildingNumberSuffix createAdxpBuildingNumberSuffix() {
        return new AdxpBuildingNumberSuffix();
    }

    /**
     * Create an instance of {@link AdxpPostBox }
     * 
     */
    public AdxpPostBox createAdxpPostBox() {
        return new AdxpPostBox();
    }

    /**
     * Create an instance of {@link AdxpPrecinct }
     * 
     */
    public AdxpPrecinct createAdxpPrecinct() {
        return new AdxpPrecinct();
    }

    /**
     * Create an instance of {@link AD }
     * 
     */
    public AD createAD() {
        return new AD();
    }

    /**
     * Create an instance of {@link ENXP }
     * 
     */
    public ENXP createENXP() {
        return new ENXP();
    }

    /**
     * Create an instance of {@link EnDelimiter }
     * 
     */
    public EnDelimiter createEnDelimiter() {
        return new EnDelimiter();
    }

    /**
     * Create an instance of {@link EnFamily }
     * 
     */
    public EnFamily createEnFamily() {
        return new EnFamily();
    }

    /**
     * Create an instance of {@link EnGiven }
     * 
     */
    public EnGiven createEnGiven() {
        return new EnGiven();
    }

    /**
     * Create an instance of {@link EnPrefix }
     * 
     */
    public EnPrefix createEnPrefix() {
        return new EnPrefix();
    }

    /**
     * Create an instance of {@link EnSuffix }
     * 
     */
    public EnSuffix createEnSuffix() {
        return new EnSuffix();
    }

    /**
     * Create an instance of {@link EN }
     * 
     */
    public EN createEN() {
        return new EN();
    }

    /**
     * Create an instance of {@link PN }
     * 
     */
    public PN createPN() {
        return new PN();
    }

    /**
     * Create an instance of {@link ON }
     * 
     */
    public ON createON() {
        return new ON();
    }

    /**
     * Create an instance of {@link TN }
     * 
     */
    public TN createTN() {
        return new TN();
    }

    /**
     * Create an instance of {@link INT }
     * 
     */
    public INT createINT() {
        return new INT();
    }

    /**
     * Create an instance of {@link REAL }
     * 
     */
    public REAL createREAL() {
        return new REAL();
    }

    /**
     * Create an instance of {@link PQR }
     * 
     */
    public PQR createPQR() {
        return new PQR();
    }

    /**
     * Create an instance of {@link PQ }
     * 
     */
    public PQ createPQ() {
        return new PQ();
    }

    /**
     * Create an instance of {@link MO }
     * 
     */
    public MO createMO() {
        return new MO();
    }

    /**
     * Create an instance of {@link RTO }
     * 
     */
    public RTO createRTO() {
        return new RTO();
    }

    /**
     * Create an instance of {@link EIVLEvent }
     * 
     */
    public EIVLEvent createEIVLEvent() {
        return new EIVLEvent();
    }

    /**
     * Create an instance of {@link SXCMTS }
     * 
     */
    public SXCMTS createSXCMTS() {
        return new SXCMTS();
    }

    /**
     * Create an instance of {@link IVXBTS }
     * 
     */
    public IVXBTS createIVXBTS() {
        return new IVXBTS();
    }

    /**
     * Create an instance of {@link RTOQTYQTY }
     * 
     */
    public RTOQTYQTY createRTOQTYQTY() {
        return new RTOQTYQTY();
    }

    /**
     * Create an instance of {@link PIVLTS }
     * 
     */
    public PIVLTS createPIVLTS() {
        return new PIVLTS();
    }

    /**
     * Create an instance of {@link EIVLTS }
     * 
     */
    public EIVLTS createEIVLTS() {
        return new EIVLTS();
    }

    /**
     * Create an instance of {@link IVLPQ }
     * 
     */
    public IVLPQ createIVLPQ() {
        return new IVLPQ();
    }

    /**
     * Create an instance of {@link SXCMPQ }
     * 
     */
    public SXCMPQ createSXCMPQ() {
        return new SXCMPQ();
    }

    /**
     * Create an instance of {@link IVXBPQ }
     * 
     */
    public IVXBPQ createIVXBPQ() {
        return new IVXBPQ();
    }

    /**
     * Create an instance of {@link PPDTS }
     * 
     */
    public PPDTS createPPDTS() {
        return new PPDTS();
    }

    /**
     * Create an instance of {@link PPDPQ }
     * 
     */
    public PPDPQ createPPDPQ() {
        return new PPDPQ();
    }

    /**
     * Create an instance of {@link PIVLPPDTS }
     * 
     */
    public PIVLPPDTS createPIVLPPDTS() {
        return new PIVLPPDTS();
    }

    /**
     * Create an instance of {@link SXCMPPDTS }
     * 
     */
    public SXCMPPDTS createSXCMPPDTS() {
        return new SXCMPPDTS();
    }

    /**
     * Create an instance of {@link IVLPPDTS }
     * 
     */
    public IVLPPDTS createIVLPPDTS() {
        return new IVLPPDTS();
    }

    /**
     * Create an instance of {@link IVXBPPDTS }
     * 
     */
    public IVXBPPDTS createIVXBPPDTS() {
        return new IVXBPPDTS();
    }

    /**
     * Create an instance of {@link EIVLPPDTS }
     * 
     */
    public EIVLPPDTS createEIVLPPDTS() {
        return new EIVLPPDTS();
    }

    /**
     * Create an instance of {@link IVLPPDPQ }
     * 
     */
    public IVLPPDPQ createIVLPPDPQ() {
        return new IVLPPDPQ();
    }

    /**
     * Create an instance of {@link SXCMPPDPQ }
     * 
     */
    public SXCMPPDPQ createSXCMPPDPQ() {
        return new SXCMPPDPQ();
    }

    /**
     * Create an instance of {@link IVXBPPDPQ }
     * 
     */
    public IVXBPPDPQ createIVXBPPDPQ() {
        return new IVXBPPDPQ();
    }

    /**
     * Create an instance of {@link SXPRTS }
     * 
     */
    public SXPRTS createSXPRTS() {
        return new SXPRTS();
    }

    /**
     * Create an instance of {@link SXCMCD }
     * 
     */
    public SXCMCD createSXCMCD() {
        return new SXCMCD();
    }

    /**
     * Create an instance of {@link SXCMMO }
     * 
     */
    public SXCMMO createSXCMMO() {
        return new SXCMMO();
    }

    /**
     * Create an instance of {@link SXCMINT }
     * 
     */
    public SXCMINT createSXCMINT() {
        return new SXCMINT();
    }

    /**
     * Create an instance of {@link SXCMREAL }
     * 
     */
    public SXCMREAL createSXCMREAL() {
        return new SXCMREAL();
    }

    /**
     * Create an instance of {@link IVLINT }
     * 
     */
    public IVLINT createIVLINT() {
        return new IVLINT();
    }

    /**
     * Create an instance of {@link IVXBINT }
     * 
     */
    public IVXBINT createIVXBINT() {
        return new IVXBINT();
    }

    /**
     * Create an instance of {@link IVLREAL }
     * 
     */
    public IVLREAL createIVLREAL() {
        return new IVLREAL();
    }

    /**
     * Create an instance of {@link IVXBREAL }
     * 
     */
    public IVXBREAL createIVXBREAL() {
        return new IVXBREAL();
    }

    /**
     * Create an instance of {@link IVLMO }
     * 
     */
    public IVLMO createIVLMO() {
        return new IVLMO();
    }

    /**
     * Create an instance of {@link IVXBMO }
     * 
     */
    public IVXBMO createIVXBMO() {
        return new IVXBMO();
    }

    /**
     * Create an instance of {@link HXITPQ }
     * 
     */
    public HXITPQ createHXITPQ() {
        return new HXITPQ();
    }

    /**
     * Create an instance of {@link HXITCE }
     * 
     */
    public HXITCE createHXITCE() {
        return new HXITCE();
    }

    /**
     * Create an instance of {@link BXITCD }
     * 
     */
    public BXITCD createBXITCD() {
        return new BXITCD();
    }

    /**
     * Create an instance of {@link BXITIVLPQ }
     * 
     */
    public BXITIVLPQ createBXITIVLPQ() {
        return new BXITIVLPQ();
    }

    /**
     * Create an instance of {@link SLISTPQ }
     * 
     */
    public SLISTPQ createSLISTPQ() {
        return new SLISTPQ();
    }

    /**
     * Create an instance of {@link SLISTTS }
     * 
     */
    public SLISTTS createSLISTTS() {
        return new SLISTTS();
    }

    /**
     * Create an instance of {@link GLISTTS }
     * 
     */
    public GLISTTS createGLISTTS() {
        return new GLISTTS();
    }

    /**
     * Create an instance of {@link GLISTPQ }
     * 
     */
    public GLISTPQ createGLISTPQ() {
        return new GLISTPQ();
    }

    /**
     * Create an instance of {@link RTOPQPQ }
     * 
     */
    public RTOPQPQ createRTOPQPQ() {
        return new RTOPQPQ();
    }

    /**
     * Create an instance of {@link RTOMOPQ }
     * 
     */
    public RTOMOPQ createRTOMOPQ() {
        return new RTOMOPQ();
    }

    /**
     * Create an instance of {@link UVPTS }
     * 
     */
    public UVPTS createUVPTS() {
        return new UVPTS();
    }

    /**
     * Create an instance of {@link COCTMT440001UVValuedItem }
     * 
     */
    public COCTMT440001UVValuedItem createCOCTMT440001UVValuedItem() {
        return new COCTMT440001UVValuedItem();
    }

    /**
     * Create an instance of {@link COCTMT230100UVAgency }
     * 
     */
    public COCTMT230100UVAgency createCOCTMT230100UVAgency() {
        return new COCTMT230100UVAgency();
    }

    /**
     * Create an instance of {@link COCTMT230100UVApproval }
     * 
     */
    public COCTMT230100UVApproval createCOCTMT230100UVApproval() {
        return new COCTMT230100UVApproval();
    }

    /**
     * Create an instance of {@link COCTMT230100UVAuthor }
     * 
     */
    public COCTMT230100UVAuthor createCOCTMT230100UVAuthor() {
        return new COCTMT230100UVAuthor();
    }

    /**
     * Create an instance of {@link COCTMT230100UVCharacteristic }
     * 
     */
    public COCTMT230100UVCharacteristic createCOCTMT230100UVCharacteristic() {
        return new COCTMT230100UVCharacteristic();
    }

    /**
     * Create an instance of {@link COCTMT230100UVCountry }
     * 
     */
    public COCTMT230100UVCountry createCOCTMT230100UVCountry() {
        return new COCTMT230100UVCountry();
    }

    /**
     * Create an instance of {@link COCTMT230100UVHolder }
     * 
     */
    public COCTMT230100UVHolder createCOCTMT230100UVHolder() {
        return new COCTMT230100UVHolder();
    }

    /**
     * Create an instance of {@link COCTMT230100UVManufacturedProduct }
     * 
     */
    public COCTMT230100UVManufacturedProduct createCOCTMT230100UVManufacturedProduct() {
        return new COCTMT230100UVManufacturedProduct();
    }

    /**
     * Create an instance of {@link COCTMT230100UVManufacturer }
     * 
     */
    public COCTMT230100UVManufacturer createCOCTMT230100UVManufacturer() {
        return new COCTMT230100UVManufacturer();
    }

    /**
     * Create an instance of {@link COCTMT230100UVMedicineClass }
     * 
     */
    public COCTMT230100UVMedicineClass createCOCTMT230100UVMedicineClass() {
        return new COCTMT230100UVMedicineClass();
    }

    /**
     * Create an instance of {@link COCTMT230100UVObservationGoal }
     * 
     */
    public COCTMT230100UVObservationGoal createCOCTMT230100UVObservationGoal() {
        return new COCTMT230100UVObservationGoal();
    }

    /**
     * Create an instance of {@link COCTMT230100UVPackagedMedicine }
     * 
     */
    public COCTMT230100UVPackagedMedicine createCOCTMT230100UVPackagedMedicine() {
        return new COCTMT230100UVPackagedMedicine();
    }

    /**
     * Create an instance of {@link COCTMT230100UVPolicy }
     * 
     */
    public COCTMT230100UVPolicy createCOCTMT230100UVPolicy() {
        return new COCTMT230100UVPolicy();
    }

    /**
     * Create an instance of {@link COCTMT230100UVRelatedManufacturer }
     * 
     */
    public COCTMT230100UVRelatedManufacturer createCOCTMT230100UVRelatedManufacturer() {
        return new COCTMT230100UVRelatedManufacturer();
    }

    /**
     * Create an instance of {@link COCTMT230100UVRole }
     * 
     */
    public COCTMT230100UVRole createCOCTMT230100UVRole() {
        return new COCTMT230100UVRole();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubContent }
     * 
     */
    public COCTMT230100UVSubContent createCOCTMT230100UVSubContent() {
        return new COCTMT230100UVSubContent();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubIngredient }
     * 
     */
    public COCTMT230100UVSubIngredient createCOCTMT230100UVSubIngredient() {
        return new COCTMT230100UVSubIngredient();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject11 }
     * 
     */
    public COCTMT230100UVSubject11 createCOCTMT230100UVSubject11() {
        return new COCTMT230100UVSubject11();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject14 }
     * 
     */
    public COCTMT230100UVSubject14 createCOCTMT230100UVSubject14() {
        return new COCTMT230100UVSubject14();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject15 }
     * 
     */
    public COCTMT230100UVSubject15 createCOCTMT230100UVSubject15() {
        return new COCTMT230100UVSubject15();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject16 }
     * 
     */
    public COCTMT230100UVSubject16 createCOCTMT230100UVSubject16() {
        return new COCTMT230100UVSubject16();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject25 }
     * 
     */
    public COCTMT230100UVSubject25 createCOCTMT230100UVSubject25() {
        return new COCTMT230100UVSubject25();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject4 }
     * 
     */
    public COCTMT230100UVSubject4 createCOCTMT230100UVSubject4() {
        return new COCTMT230100UVSubject4();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubstance }
     * 
     */
    public COCTMT230100UVSubstance createCOCTMT230100UVSubstance() {
        return new COCTMT230100UVSubstance();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubstanceManufacturer }
     * 
     */
    public COCTMT230100UVSubstanceManufacturer createCOCTMT230100UVSubstanceManufacturer() {
        return new COCTMT230100UVSubstanceManufacturer();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSuperContent }
     * 
     */
    public COCTMT230100UVSuperContent createCOCTMT230100UVSuperContent() {
        return new COCTMT230100UVSuperContent();
    }

    /**
     * Create an instance of {@link COCTMT230100UVTerritorialAuthority }
     * 
     */
    public COCTMT230100UVTerritorialAuthority createCOCTMT230100UVTerritorialAuthority() {
        return new COCTMT230100UVTerritorialAuthority();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject2 }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "subjectOf1")
    public JAXBElement<COCTMT230100UVSubject2> createSubjectOf1(COCTMT230100UVSubject2 value) {
        return new JAXBElement<COCTMT230100UVSubject2>(_SubjectOf1_QNAME, COCTMT230100UVSubject2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject1 }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "subjectOf2")
    public JAXBElement<COCTMT230100UVSubject1> createSubjectOf2(COCTMT230100UVSubject1 value) {
        return new JAXBElement<COCTMT230100UVSubject1>(_SubjectOf2_QNAME, COCTMT230100UVSubject1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject22 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject22 }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "subjectOf3")
    public JAXBElement<COCTMT230100UVSubject22> createSubjectOf3(COCTMT230100UVSubject22 value) {
        return new JAXBElement<COCTMT230100UVSubject22>(_SubjectOf3_QNAME, COCTMT230100UVSubject22 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject3 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject3 }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "subjectOf4")
    public JAXBElement<COCTMT230100UVSubject3> createSubjectOf4(COCTMT230100UVSubject3 value) {
        return new JAXBElement<COCTMT230100UVSubject3>(_SubjectOf4_QNAME, COCTMT230100UVSubject3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject7 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject7 }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "subjectOf5")
    public JAXBElement<COCTMT230100UVSubject7> createSubjectOf5(COCTMT230100UVSubject7 value) {
        return new JAXBElement<COCTMT230100UVSubject7>(_SubjectOf5_QNAME, COCTMT230100UVSubject7 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ED }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ED }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "desc")
    public JAXBElement<ED> createDesc(ED value) {
        return new JAXBElement<ED>(_Desc_QNAME, ED.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CE }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "riskCode")
    public JAXBElement<CE> createRiskCode(CE value) {
        return new JAXBElement<CE>(_RiskCode_QNAME, CE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CE }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "handlingCode")
    public JAXBElement<CE> createHandlingCode(CE value) {
        return new JAXBElement<CE>(_HandlingCode_QNAME, CE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CE }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "formCode")
    public JAXBElement<CE> createFormCode(CE value) {
        return new JAXBElement<CE>(_FormCode_QNAME, CE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVLTS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IVLTS }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "expirationTime")
    public JAXBElement<IVLTS> createExpirationTime(IVLTS value) {
        return new JAXBElement<IVLTS>(_ExpirationTime_QNAME, IVLTS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVLTS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IVLTS }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "stabilityTime")
    public JAXBElement<IVLTS> createStabilityTime(IVLTS value) {
        return new JAXBElement<IVLTS>(_StabilityTime_QNAME, IVLTS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVDistributedProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVDistributedProduct }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "asDistributedProduct")
    public JAXBElement<COCTMT230100UVDistributedProduct> createAsDistributedProduct(COCTMT230100UVDistributedProduct value) {
        return new JAXBElement<COCTMT230100UVDistributedProduct>(_AsDistributedProduct_QNAME, COCTMT230100UVDistributedProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVMedicineManufacturer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVMedicineManufacturer }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "asMedicineManufacturer")
    public JAXBElement<COCTMT230100UVMedicineManufacturer> createAsMedicineManufacturer(COCTMT230100UVMedicineManufacturer value) {
        return new JAXBElement<COCTMT230100UVMedicineManufacturer>(_AsMedicineManufacturer_QNAME, COCTMT230100UVMedicineManufacturer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVContent }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "asContent")
    public JAXBElement<COCTMT230100UVContent> createAsContent(COCTMT230100UVContent value) {
        return new JAXBElement<COCTMT230100UVContent>(_AsContent_QNAME, COCTMT230100UVContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSpecializedKind }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSpecializedKind }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "asSpecializedKind")
    public JAXBElement<COCTMT230100UVSpecializedKind> createAsSpecializedKind(COCTMT230100UVSpecializedKind value) {
        return new JAXBElement<COCTMT230100UVSpecializedKind>(_AsSpecializedKind_QNAME, COCTMT230100UVSpecializedKind.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVPart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVPart }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "part")
    public JAXBElement<COCTMT230100UVPart> createPart(COCTMT230100UVPart value) {
        return new JAXBElement<COCTMT230100UVPart>(_Part_QNAME, COCTMT230100UVPart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVIngredient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVIngredient }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "ingredient")
    public JAXBElement<COCTMT230100UVIngredient> createIngredient(COCTMT230100UVIngredient value) {
        return new JAXBElement<COCTMT230100UVIngredient>(_Ingredient_QNAME, COCTMT230100UVIngredient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject7 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject7 }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "subjectOf5", scope = Medication.class)
    public JAXBElement<COCTMT230100UVSubject7> createMedicationSubjectOf5(COCTMT230100UVSubject7 value) {
        return new JAXBElement<COCTMT230100UVSubject7>(_SubjectOf5_QNAME, COCTMT230100UVSubject7 .class, Medication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVAgency }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVAgency }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "territory", scope = COCTMT230100UVTerritorialAuthority.class)
    public JAXBElement<COCTMT230100UVAgency> createCOCTMT230100UVTerritorialAuthorityTerritory(COCTMT230100UVAgency value) {
        return new JAXBElement<COCTMT230100UVAgency>(_COCTMT230100UVTerritorialAuthorityTerritory_QNAME, COCTMT230100UVAgency.class, COCTMT230100UVTerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVCountry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVCountry }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "governingCountry", scope = COCTMT230100UVTerritorialAuthority.class)
    public JAXBElement<COCTMT230100UVCountry> createCOCTMT230100UVTerritorialAuthorityGoverningCountry(COCTMT230100UVCountry value) {
        return new JAXBElement<COCTMT230100UVCountry>(_COCTMT230100UVTerritorialAuthorityGoverningCountry_QNAME, COCTMT230100UVCountry.class, COCTMT230100UVTerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubstance }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubstance }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "ingredient", scope = COCTMT230100UVSubIngredient.class)
    public JAXBElement<COCTMT230100UVSubstance> createCOCTMT230100UVSubIngredientIngredient(COCTMT230100UVSubstance value) {
        return new JAXBElement<COCTMT230100UVSubstance>(_Ingredient_QNAME, COCTMT230100UVSubstance.class, COCTMT230100UVSubIngredient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVPackagedMedicine }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVPackagedMedicine }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "containedPackagedMedicine", scope = COCTMT230100UVSubContent.class)
    public JAXBElement<COCTMT230100UVPackagedMedicine> createCOCTMT230100UVSubContentContainedPackagedMedicine(COCTMT230100UVPackagedMedicine value) {
        return new JAXBElement<COCTMT230100UVPackagedMedicine>(_COCTMT230100UVSubContentContainedPackagedMedicine_QNAME, COCTMT230100UVPackagedMedicine.class, COCTMT230100UVSubContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVManufacturer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVManufacturer }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "representedManufacturer", scope = COCTMT230100UVRelatedManufacturer.class)
    public JAXBElement<COCTMT230100UVManufacturer> createCOCTMT230100UVRelatedManufacturerRepresentedManufacturer(COCTMT230100UVManufacturer value) {
        return new JAXBElement<COCTMT230100UVManufacturer>(_COCTMT230100UVRelatedManufacturerRepresentedManufacturer_QNAME, COCTMT230100UVManufacturer.class, COCTMT230100UVRelatedManufacturer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSuperContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSuperContent }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "asSuperContent", scope = COCTMT230100UVPackagedMedicine.class)
    public JAXBElement<COCTMT230100UVSuperContent> createCOCTMT230100UVPackagedMedicineAsSuperContent(COCTMT230100UVSuperContent value) {
        return new JAXBElement<COCTMT230100UVSuperContent>(_COCTMT230100UVPackagedMedicineAsSuperContent_QNAME, COCTMT230100UVSuperContent.class, COCTMT230100UVPackagedMedicine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubContent }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "subContent", scope = COCTMT230100UVPackagedMedicine.class)
    public JAXBElement<COCTMT230100UVSubContent> createCOCTMT230100UVPackagedMedicineSubContent(COCTMT230100UVSubContent value) {
        return new JAXBElement<COCTMT230100UVSubContent>(_COCTMT230100UVPackagedMedicineSubContent_QNAME, COCTMT230100UVSubContent.class, COCTMT230100UVPackagedMedicine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVHolder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVHolder }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "holder", scope = COCTMT230100UVApproval.class)
    public JAXBElement<COCTMT230100UVHolder> createCOCTMT230100UVApprovalHolder(COCTMT230100UVHolder value) {
        return new JAXBElement<COCTMT230100UVHolder>(_COCTMT230100UVApprovalHolder_QNAME, COCTMT230100UVHolder.class, COCTMT230100UVApproval.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnDelimiter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnDelimiter }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "delimiter", scope = EN.class)
    public JAXBElement<EnDelimiter> createENDelimiter(EnDelimiter value) {
        return new JAXBElement<EnDelimiter>(_ENDelimiter_QNAME, EnDelimiter.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnFamily }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnFamily }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "family", scope = EN.class)
    public JAXBElement<EnFamily> createENFamily(EnFamily value) {
        return new JAXBElement<EnFamily>(_ENFamily_QNAME, EnFamily.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnGiven }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnGiven }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "given", scope = EN.class)
    public JAXBElement<EnGiven> createENGiven(EnGiven value) {
        return new JAXBElement<EnGiven>(_ENGiven_QNAME, EnGiven.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnPrefix }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnPrefix }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "prefix", scope = EN.class)
    public JAXBElement<EnPrefix> createENPrefix(EnPrefix value) {
        return new JAXBElement<EnPrefix>(_ENPrefix_QNAME, EnPrefix.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnSuffix }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnSuffix }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "suffix", scope = EN.class)
    public JAXBElement<EnSuffix> createENSuffix(EnSuffix value) {
        return new JAXBElement<EnSuffix>(_ENSuffix_QNAME, EnSuffix.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVLTS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IVLTS }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "validTime", scope = EN.class)
    public JAXBElement<IVLTS> createENValidTime(IVLTS value) {
        return new JAXBElement<IVLTS>(_ENValidTime_QNAME, IVLTS.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEL }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TEL }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "reference", scope = ED.class)
    public JAXBElement<TEL> createEDReference(TEL value) {
        return new JAXBElement<TEL>(_EDReference_QNAME, TEL.class, ED.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Thumbnail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Thumbnail }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "thumbnail", scope = ED.class)
    public JAXBElement<Thumbnail> createEDThumbnail(Thumbnail value) {
        return new JAXBElement<Thumbnail>(_EDThumbnail_QNAME, Thumbnail.class, ED.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDelimiter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpDelimiter }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "delimiter", scope = AD.class)
    public JAXBElement<AdxpDelimiter> createADDelimiter(AdxpDelimiter value) {
        return new JAXBElement<AdxpDelimiter>(_ENDelimiter_QNAME, AdxpDelimiter.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCountry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpCountry }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "country", scope = AD.class)
    public JAXBElement<AdxpCountry> createADCountry(AdxpCountry value) {
        return new JAXBElement<AdxpCountry>(_ADCountry_QNAME, AdxpCountry.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpState }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "state", scope = AD.class)
    public JAXBElement<AdxpState> createADState(AdxpState value) {
        return new JAXBElement<AdxpState>(_ADState_QNAME, AdxpState.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCounty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpCounty }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "county", scope = AD.class)
    public JAXBElement<AdxpCounty> createADCounty(AdxpCounty value) {
        return new JAXBElement<AdxpCounty>(_ADCounty_QNAME, AdxpCounty.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpCity }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "city", scope = AD.class)
    public JAXBElement<AdxpCity> createADCity(AdxpCity value) {
        return new JAXBElement<AdxpCity>(_ADCity_QNAME, AdxpCity.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpPostalCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpPostalCode }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "postalCode", scope = AD.class)
    public JAXBElement<AdxpPostalCode> createADPostalCode(AdxpPostalCode value) {
        return new JAXBElement<AdxpPostalCode>(_ADPostalCode_QNAME, AdxpPostalCode.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpStreetAddressLine }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpStreetAddressLine }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "streetAddressLine", scope = AD.class)
    public JAXBElement<AdxpStreetAddressLine> createADStreetAddressLine(AdxpStreetAddressLine value) {
        return new JAXBElement<AdxpStreetAddressLine>(_ADStreetAddressLine_QNAME, AdxpStreetAddressLine.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpHouseNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpHouseNumber }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "houseNumber", scope = AD.class)
    public JAXBElement<AdxpHouseNumber> createADHouseNumber(AdxpHouseNumber value) {
        return new JAXBElement<AdxpHouseNumber>(_ADHouseNumber_QNAME, AdxpHouseNumber.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpHouseNumberNumeric }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpHouseNumberNumeric }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "houseNumberNumeric", scope = AD.class)
    public JAXBElement<AdxpHouseNumberNumeric> createADHouseNumberNumeric(AdxpHouseNumberNumeric value) {
        return new JAXBElement<AdxpHouseNumberNumeric>(_ADHouseNumberNumeric_QNAME, AdxpHouseNumberNumeric.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDirection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpDirection }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "direction", scope = AD.class)
    public JAXBElement<AdxpDirection> createADDirection(AdxpDirection value) {
        return new JAXBElement<AdxpDirection>(_ADDirection_QNAME, AdxpDirection.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpStreetName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpStreetName }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "streetName", scope = AD.class)
    public JAXBElement<AdxpStreetName> createADStreetName(AdxpStreetName value) {
        return new JAXBElement<AdxpStreetName>(_ADStreetName_QNAME, AdxpStreetName.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpStreetNameBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpStreetNameBase }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "streetNameBase", scope = AD.class)
    public JAXBElement<AdxpStreetNameBase> createADStreetNameBase(AdxpStreetNameBase value) {
        return new JAXBElement<AdxpStreetNameBase>(_ADStreetNameBase_QNAME, AdxpStreetNameBase.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpStreetNameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpStreetNameType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "streetNameType", scope = AD.class)
    public JAXBElement<AdxpStreetNameType> createADStreetNameType(AdxpStreetNameType value) {
        return new JAXBElement<AdxpStreetNameType>(_ADStreetNameType_QNAME, AdxpStreetNameType.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpAdditionalLocator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpAdditionalLocator }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "additionalLocator", scope = AD.class)
    public JAXBElement<AdxpAdditionalLocator> createADAdditionalLocator(AdxpAdditionalLocator value) {
        return new JAXBElement<AdxpAdditionalLocator>(_ADAdditionalLocator_QNAME, AdxpAdditionalLocator.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpUnitID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpUnitID }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "unitID", scope = AD.class)
    public JAXBElement<AdxpUnitID> createADUnitID(AdxpUnitID value) {
        return new JAXBElement<AdxpUnitID>(_ADUnitID_QNAME, AdxpUnitID.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpUnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpUnitType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "unitType", scope = AD.class)
    public JAXBElement<AdxpUnitType> createADUnitType(AdxpUnitType value) {
        return new JAXBElement<AdxpUnitType>(_ADUnitType_QNAME, AdxpUnitType.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCareOf }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpCareOf }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "careOf", scope = AD.class)
    public JAXBElement<AdxpCareOf> createADCareOf(AdxpCareOf value) {
        return new JAXBElement<AdxpCareOf>(_ADCareOf_QNAME, AdxpCareOf.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCensusTract }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpCensusTract }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "censusTract", scope = AD.class)
    public JAXBElement<AdxpCensusTract> createADCensusTract(AdxpCensusTract value) {
        return new JAXBElement<AdxpCensusTract>(_ADCensusTract_QNAME, AdxpCensusTract.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryAddressLine }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryAddressLine }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "deliveryAddressLine", scope = AD.class)
    public JAXBElement<AdxpDeliveryAddressLine> createADDeliveryAddressLine(AdxpDeliveryAddressLine value) {
        return new JAXBElement<AdxpDeliveryAddressLine>(_ADDeliveryAddressLine_QNAME, AdxpDeliveryAddressLine.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "deliveryInstallationType", scope = AD.class)
    public JAXBElement<AdxpDeliveryInstallationType> createADDeliveryInstallationType(AdxpDeliveryInstallationType value) {
        return new JAXBElement<AdxpDeliveryInstallationType>(_ADDeliveryInstallationType_QNAME, AdxpDeliveryInstallationType.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationArea }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationArea }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "deliveryInstallationArea", scope = AD.class)
    public JAXBElement<AdxpDeliveryInstallationArea> createADDeliveryInstallationArea(AdxpDeliveryInstallationArea value) {
        return new JAXBElement<AdxpDeliveryInstallationArea>(_ADDeliveryInstallationArea_QNAME, AdxpDeliveryInstallationArea.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationQualifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationQualifier }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "deliveryInstallationQualifier", scope = AD.class)
    public JAXBElement<AdxpDeliveryInstallationQualifier> createADDeliveryInstallationQualifier(AdxpDeliveryInstallationQualifier value) {
        return new JAXBElement<AdxpDeliveryInstallationQualifier>(_ADDeliveryInstallationQualifier_QNAME, AdxpDeliveryInstallationQualifier.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryMode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryMode }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "deliveryMode", scope = AD.class)
    public JAXBElement<AdxpDeliveryMode> createADDeliveryMode(AdxpDeliveryMode value) {
        return new JAXBElement<AdxpDeliveryMode>(_ADDeliveryMode_QNAME, AdxpDeliveryMode.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryModeIdentifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryModeIdentifier }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "deliveryModeIdentifier", scope = AD.class)
    public JAXBElement<AdxpDeliveryModeIdentifier> createADDeliveryModeIdentifier(AdxpDeliveryModeIdentifier value) {
        return new JAXBElement<AdxpDeliveryModeIdentifier>(_ADDeliveryModeIdentifier_QNAME, AdxpDeliveryModeIdentifier.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpBuildingNumberSuffix }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpBuildingNumberSuffix }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "buildingNumberSuffix", scope = AD.class)
    public JAXBElement<AdxpBuildingNumberSuffix> createADBuildingNumberSuffix(AdxpBuildingNumberSuffix value) {
        return new JAXBElement<AdxpBuildingNumberSuffix>(_ADBuildingNumberSuffix_QNAME, AdxpBuildingNumberSuffix.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpPostBox }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpPostBox }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "postBox", scope = AD.class)
    public JAXBElement<AdxpPostBox> createADPostBox(AdxpPostBox value) {
        return new JAXBElement<AdxpPostBox>(_ADPostBox_QNAME, AdxpPostBox.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpPrecinct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdxpPrecinct }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "precinct", scope = AD.class)
    public JAXBElement<AdxpPrecinct> createADPrecinct(AdxpPrecinct value) {
        return new JAXBElement<AdxpPrecinct>(_ADPrecinct_QNAME, AdxpPrecinct.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SXCMTS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SXCMTS }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "useablePeriod", scope = AD.class)
    public JAXBElement<SXCMTS> createADUseablePeriod(SXCMTS value) {
        return new JAXBElement<SXCMTS>(_ADUseablePeriod_QNAME, SXCMTS.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVContent }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "asContent", scope = COCTMT230100UVMedicine.class)
    public JAXBElement<COCTMT230100UVContent> createCOCTMT230100UVMedicineAsContent(COCTMT230100UVContent value) {
        return new JAXBElement<COCTMT230100UVContent>(_AsContent_QNAME, COCTMT230100UVContent.class, COCTMT230100UVMedicine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubstance }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubstance }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "ingredient", scope = COCTMT230100UVIngredient.class)
    public JAXBElement<COCTMT230100UVSubstance> createCOCTMT230100UVIngredientIngredient(COCTMT230100UVSubstance value) {
        return new JAXBElement<COCTMT230100UVSubstance>(_Ingredient_QNAME, COCTMT230100UVSubstance.class, COCTMT230100UVIngredient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVMedicineClass }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVMedicineClass }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ihe:pharm", name = "generalizedMedicineClass", scope = COCTMT230100UVSpecializedKind.class)
    public JAXBElement<COCTMT230100UVMedicineClass> createCOCTMT230100UVSpecializedKindGeneralizedMedicineClass(COCTMT230100UVMedicineClass value) {
        return new JAXBElement<COCTMT230100UVMedicineClass>(_COCTMT230100UVSpecializedKindGeneralizedMedicineClass_QNAME, COCTMT230100UVMedicineClass.class, COCTMT230100UVSpecializedKind.class, value);
    }

}
