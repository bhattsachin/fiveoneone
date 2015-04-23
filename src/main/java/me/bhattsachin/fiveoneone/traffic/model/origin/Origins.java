//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.21 at 01:35:39 PM PDT 
//


package me.bhattsachin.fiveoneone.traffic.model.origin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="destination" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="mainRoad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="crossRoad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="node" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="cachestamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "destination"
})
@XmlRootElement(name = "origins")
public class Origins {

    @XmlElement(required = true)
    protected List<Origins.Destination> destination;
    @XmlAttribute(name = "cachestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cachestamp;

    /**
     * Gets the value of the destination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Origins.Destination }
     * 
     * 
     */
    public List<Origins.Destination> getDestination() {
        if (destination == null) {
            destination = new ArrayList<Origins.Destination>();
        }
        return this.destination;
    }

    /**
     * Gets the value of the cachestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCachestamp() {
        return cachestamp;
    }

    /**
     * Sets the value of the cachestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCachestamp(XMLGregorianCalendar value) {
        this.cachestamp = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="mainRoad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="crossRoad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="node" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "city",
        "mainRoad",
        "crossRoad",
        "node"
    })
    public static class Destination {

        @XmlElement(required = true)
        protected String city;
        @XmlElement(required = true)
        protected String mainRoad;
        @XmlElement(required = true)
        protected String crossRoad;
        @XmlSchemaType(name = "unsignedShort")
        protected int node;

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the mainRoad property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMainRoad() {
            return mainRoad;
        }

        /**
         * Sets the value of the mainRoad property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMainRoad(String value) {
            this.mainRoad = value;
        }

        /**
         * Gets the value of the crossRoad property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrossRoad() {
            return crossRoad;
        }

        /**
         * Sets the value of the crossRoad property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrossRoad(String value) {
            this.crossRoad = value;
        }

        /**
         * Gets the value of the node property.
         * 
         */
        public int getNode() {
            return node;
        }

        /**
         * Sets the value of the node property.
         * 
         */
        public void setNode(int value) {
            this.node = value;
        }

    }

}
