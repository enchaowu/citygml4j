//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.10 um 09:13:50 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AesheticCriteriaType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AesheticCriteriaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MIN_CROSSINGS"/>
 *     &lt;enumeration value="MIN_AREA"/>
 *     &lt;enumeration value="MIN_BENDS"/>
 *     &lt;enumeration value="MAX_BENDS"/>
 *     &lt;enumeration value="UNIFORM_BENDS"/>
 *     &lt;enumeration value="MIN_SLOPES"/>
 *     &lt;enumeration value="MIN_EDGE_LENGTH"/>
 *     &lt;enumeration value="MAX_EDGE_LENGTH"/>
 *     &lt;enumeration value="UNIFORM_EDGE_LENGTH"/>
 *     &lt;enumeration value="MAX_ANGULAR_RESOLUTION"/>
 *     &lt;enumeration value="MIN_ASPECT_RATIO"/>
 *     &lt;enumeration value="MAX_SYMMETRIES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AesheticCriteriaType")
@XmlEnum
public enum AesheticCriteriaType {

    @XmlEnumValue("MIN_CROSSINGS")
    MIN___CROSSINGS("MIN_CROSSINGS"),
    @XmlEnumValue("MIN_AREA")
    MIN___AREA("MIN_AREA"),
    @XmlEnumValue("MIN_BENDS")
    MIN___BENDS("MIN_BENDS"),
    @XmlEnumValue("MAX_BENDS")
    MAX___BENDS("MAX_BENDS"),
    @XmlEnumValue("UNIFORM_BENDS")
    UNIFORM___BENDS("UNIFORM_BENDS"),
    @XmlEnumValue("MIN_SLOPES")
    MIN___SLOPES("MIN_SLOPES"),
    @XmlEnumValue("MIN_EDGE_LENGTH")
    MIN___EDGE___LENGTH("MIN_EDGE_LENGTH"),
    @XmlEnumValue("MAX_EDGE_LENGTH")
    MAX___EDGE___LENGTH("MAX_EDGE_LENGTH"),
    @XmlEnumValue("UNIFORM_EDGE_LENGTH")
    UNIFORM___EDGE___LENGTH("UNIFORM_EDGE_LENGTH"),
    @XmlEnumValue("MAX_ANGULAR_RESOLUTION")
    MAX___ANGULAR___RESOLUTION("MAX_ANGULAR_RESOLUTION"),
    @XmlEnumValue("MIN_ASPECT_RATIO")
    MIN___ASPECT___RATIO("MIN_ASPECT_RATIO"),
    @XmlEnumValue("MAX_SYMMETRIES")
    MAX___SYMMETRIES("MAX_SYMMETRIES");
    private final String value;

    AesheticCriteriaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AesheticCriteriaType fromValue(String v) {
        for (AesheticCriteriaType c: AesheticCriteriaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
