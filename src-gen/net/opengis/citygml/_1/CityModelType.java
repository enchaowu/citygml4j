//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.10 um 09:13:50 PM CEST 
//


package net.opengis.citygml._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureCollectionType;


/**
 * Type describing the "root" element of any city model file. It is a collection whose members are restricted
 * 				to be features of a city model. All features are included as cityObjectMember. 
 * 
 * <p>Java-Klasse für CityModelType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CityModelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureCollectionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/citygml/1.0}_GenericApplicationPropertyOfCityModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityModelType", propOrder = {
    "_GenericApplicationPropertyOfCityModel"
})
public class CityModelType
    extends AbstractFeatureCollectionType
{

    @XmlElementRef(name = "_GenericApplicationPropertyOfCityModel", namespace = "http://www.opengis.net/citygml/1.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _GenericApplicationPropertyOfCityModel;

    /**
     * Gets the value of the genericApplicationPropertyOfCityModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfCityModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfCityModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> get_GenericApplicationPropertyOfCityModel() {
        if (_GenericApplicationPropertyOfCityModel == null) {
            _GenericApplicationPropertyOfCityModel = new ArrayList<JAXBElement<Object>>();
        }
        return this._GenericApplicationPropertyOfCityModel;
    }

    public boolean isSet_GenericApplicationPropertyOfCityModel() {
        return ((this._GenericApplicationPropertyOfCityModel!= null)&&(!this._GenericApplicationPropertyOfCityModel.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfCityModel() {
        this._GenericApplicationPropertyOfCityModel = null;
    }

    public void set_GenericApplicationPropertyOfCityModel(List<JAXBElement<Object>> value) {
        this._GenericApplicationPropertyOfCityModel = value;
    }

}
