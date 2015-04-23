//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.21 at 01:36:03 PM PDT 
//


package me.bhattsachin.fiveoneone.traffic.model.destination;

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
 *       &lt;attribute name="originNode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&gt;
 *       &lt;attribute name="timestamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
@XmlRootElement(name = "destinations")
public class Destinations {

    @XmlElement(required = true)
    protected List<Destinations.Destination> destination;
    @XmlAttribute(name = "originNode", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int originNode;
    @XmlAttribute(name = "timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

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
     * {@link Destinations.Destination }
     * 
     * 
     */
    public List<Destinations.Destination> getDestination() {
        if (destination == null) {
            destination = new ArrayList<Destinations.Destination>();
        }
        return this.destination;
    }

    /**
     * Gets the value of the originNode property.
     * 
     */
    public int getOriginNode() {
        return originNode;
    }

    /**
     * Sets the value of the originNode property.
     * 
     */
    public void setOriginNode(int value) {
        this.originNode = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
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
    @XmlType(name = "destination", propOrder = {
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

		@Override
		public String toString() {
			return "Destination [city=" + city + ", mainRoad=" + mainRoad
					+ ", crossRoad=" + crossRoad + ", node=" + node + "]";
		}
        
        

    }

}
