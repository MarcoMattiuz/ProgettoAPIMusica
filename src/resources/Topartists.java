//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.07 at 04:17:45 PM CEST 
//


package com.prova.ProgettoAPI;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="artist" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="listeners" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                   &lt;element name="mbid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="streamable" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                   &lt;element name="image" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="country" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="page" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="perPage" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="totalPages" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "artist"
})
@XmlRootElement(name = "topartists")
public class Topartists {

    @XmlElement(required = true)
    protected List<Topartists.Artist> artist;
    @XmlAttribute(name = "country", required = true)
    protected String country;
    @XmlAttribute(name = "page", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short page;
    @XmlAttribute(name = "perPage", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short perPage;
    @XmlAttribute(name = "totalPages", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int totalPages;
    @XmlAttribute(name = "total", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long total;

    /**
     * Gets the value of the artist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Topartists.Artist }
     * 
     * 
     */
    public List<Topartists.Artist> getArtist() {
        if (artist == null) {
            artist = new ArrayList<Topartists.Artist>();
        }
        return this.artist;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the page property.
     * 
     */
    public short getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(short value) {
        this.page = value;
    }

    /**
     * Gets the value of the perPage property.
     * 
     */
    public short getPerPage() {
        return perPage;
    }

    /**
     * Sets the value of the perPage property.
     * 
     */
    public void setPerPage(short value) {
        this.perPage = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public long getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(long value) {
        this.total = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="listeners" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *         &lt;element name="mbid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="streamable" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *         &lt;element name="image" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "listeners",
        "mbid",
        "url",
        "streamable",
        "image"
    })
    public static class Artist {

        @XmlElement(required = true)
        protected String name;
        @XmlSchemaType(name = "unsignedInt")
        protected long listeners;
        @XmlElement(required = true)
        protected String mbid;
        @XmlElement(required = true)
        protected String url;
        @XmlSchemaType(name = "unsignedByte")
        protected short streamable;
        @XmlElement(required = true)
        protected List<Topartists.Artist.Image> image;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the listeners property.
         * 
         */
        public long getListeners() {
            return listeners;
        }

        /**
         * Sets the value of the listeners property.
         * 
         */
        public void setListeners(long value) {
            this.listeners = value;
        }

        /**
         * Gets the value of the mbid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMbid() {
            return mbid;
        }

        /**
         * Sets the value of the mbid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMbid(String value) {
            this.mbid = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the streamable property.
         * 
         */
        public short getStreamable() {
            return streamable;
        }

        /**
         * Sets the value of the streamable property.
         * 
         */
        public void setStreamable(short value) {
            this.streamable = value;
        }

        /**
         * Gets the value of the image property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the image property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Topartists.Artist.Image }
         * 
         * 
         */
        public List<Topartists.Artist.Image> getImage() {
            if (image == null) {
                image = new ArrayList<Topartists.Artist.Image>();
            }
            return this.image;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Image {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "size", required = true)
            protected String size;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the size property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSize(String value) {
                this.size = value;
            }

        }

    }

}