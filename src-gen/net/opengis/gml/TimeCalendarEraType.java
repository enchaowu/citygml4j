//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.10 um 09:13:50 PM CEST 
//


package net.opengis.gml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * In every calendar, years are numbered relative to the date of a 
 *       reference event that defines a calendar era. 
 *       In this implementation, we omit the back-pointer "datingSystem".
 * 
 * <p>Java-Klasse für TimeCalendarEraType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeCalendarEraType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}DefinitionType">
 *       &lt;sequence>
 *         &lt;element name="referenceEvent" type="{http://www.opengis.net/gml}StringOrRefType"/>
 *         &lt;element name="referenceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="julianReference" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="epochOfUse" type="{http://www.opengis.net/gml}TimePeriodPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCalendarEraType", propOrder = {
    "referenceEvent",
    "referenceDate",
    "julianReference",
    "epochOfUse"
})
public class TimeCalendarEraType
    extends DefinitionType
{

    @XmlElement(required = true)
    protected StringOrRefType referenceEvent;
    @XmlElement(defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar referenceDate;
    @XmlElement(required = true)
    protected BigDecimal julianReference;
    @XmlElement(required = true)
    protected TimePeriodPropertyType epochOfUse;

    /**
     * Ruft den Wert der referenceEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getReferenceEvent() {
        return referenceEvent;
    }

    /**
     * Legt den Wert der referenceEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setReferenceEvent(StringOrRefType value) {
        this.referenceEvent = value;
    }

    public boolean isSetReferenceEvent() {
        return (this.referenceEvent!= null);
    }

    /**
     * Ruft den Wert der referenceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferenceDate() {
        return referenceDate;
    }

    /**
     * Legt den Wert der referenceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferenceDate(XMLGregorianCalendar value) {
        this.referenceDate = value;
    }

    public boolean isSetReferenceDate() {
        return (this.referenceDate!= null);
    }

    /**
     * Ruft den Wert der julianReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJulianReference() {
        return julianReference;
    }

    /**
     * Legt den Wert der julianReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJulianReference(BigDecimal value) {
        this.julianReference = value;
    }

    public boolean isSetJulianReference() {
        return (this.julianReference!= null);
    }

    /**
     * Ruft den Wert der epochOfUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getEpochOfUse() {
        return epochOfUse;
    }

    /**
     * Legt den Wert der epochOfUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setEpochOfUse(TimePeriodPropertyType value) {
        this.epochOfUse = value;
    }

    public boolean isSetEpochOfUse() {
        return (this.epochOfUse!= null);
    }

}
