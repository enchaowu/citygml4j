//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.10 um 09:13:50 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The intended use of TopoPoint is to appear within a point feature to express the structural and possibly geometric relationships of this point to other features via shared node definitions. Note the orientation assigned to the directedNode has no meaning in this context. It is preserved for symmetry with the types and elements which follow.
 * 
 * <p>Java-Klasse für TopoPointType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TopoPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTopologyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}directedNode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoPointType", propOrder = {
    "directedNode"
})
public class TopoPointType
    extends AbstractTopologyType
{

    @XmlElement(required = true)
    protected DirectedNodePropertyType directedNode;

    /**
     * Ruft den Wert der directedNode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectedNodePropertyType }
     *     
     */
    public DirectedNodePropertyType getDirectedNode() {
        return directedNode;
    }

    /**
     * Legt den Wert der directedNode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectedNodePropertyType }
     *     
     */
    public void setDirectedNode(DirectedNodePropertyType value) {
        this.directedNode = value;
    }

    public boolean isSetDirectedNode() {
        return (this.directedNode!= null);
    }

}
