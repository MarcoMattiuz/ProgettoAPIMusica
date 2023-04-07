//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.07 at 04:21:56 PM CEST 
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
 *         &lt;element name="track" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="playcount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="listeners" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="streamable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="artist">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *                 &lt;attribute name="rank" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="artist" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="page" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="perPage" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="totalPages" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "track"
})
@XmlRootElement(name = "toptracks")
public class Toptracks {

    @XmlElement(required = true)
    protected List<Toptracks.Track> track;
    @XmlAttribute(name = "artist", required = true)
    protected String artist;
    @XmlAttribute(name = "page", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short page;
    @XmlAttribute(name = "perPage", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short perPage;
    @XmlAttribute(name = "totalPages", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short totalPages;
    @XmlAttribute(name = "total", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short total;

    /**
     * Gets the value of the track property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the track property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Toptracks.Track }
     * 
     * 
     */
    public List<Toptracks.Track> getTrack() {
        if (track == null) {
            track = new ArrayList<Toptracks.Track>();
        }
        return this.track;
    }

    /**
     * Gets the value of the artist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the value of the artist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtist(String value) {
        this.artist = value;
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
    public short getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     */
    public void setTotalPages(short value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public short getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(short value) {
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
     *         &lt;element name="playcount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="listeners" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="streamable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="artist">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
     *       &lt;attribute name="rank" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
        "playcount",
        "listeners",
        "url",
        "streamable",
        "artist",
        "image"
    })
    public static class Track {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String playcount;
        @XmlElement(required = true)
        protected String listeners;
        @XmlElement(required = true)
        protected String url;
        @XmlElement(required = true)
        protected String streamable;
        @XmlElement(required = true)
        protected Toptracks.Track.Artist artist;
        @XmlElement(required = true)
        protected List<Toptracks.Track.Image> image;
        @XmlAttribute(name = "rank", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short rank;

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
         * Gets the value of the playcount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaycount() {
            return playcount;
        }

        /**
         * Sets the value of the playcount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaycount(String value) {
            this.playcount = value;
        }

        /**
         * Gets the value of the listeners property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListeners() {
            return listeners;
        }

        /**
         * Sets the value of the listeners property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListeners(String value) {
            this.listeners = value;
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
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreamable() {
            return streamable;
        }

        /**
         * Sets the value of the streamable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreamable(String value) {
            this.streamable = value;
        }

        /**
         * Gets the value of the artist property.
         * 
         * @return
         *     possible object is
         *     {@link Toptracks.Track.Artist }
         *     
         */
        public Toptracks.Track.Artist getArtist() {
            return artist;
        }

        /**
         * Sets the value of the artist property.
         * 
         * @param value
         *     allowed object is
         *     {@link Toptracks.Track.Artist }
         *     
         */
        public void setArtist(Toptracks.Track.Artist value) {
            this.artist = value;
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
         * {@link Toptracks.Track.Image }
         * 
         * 
         */
        public List<Toptracks.Track.Image> getImage() {
            if (image == null) {
                image = new ArrayList<Toptracks.Track.Image>();
            }
            return this.image;
        }

        /**
         * Gets the value of the rank property.
         * 
         */
        public short getRank() {
            return rank;
        }

        /**
         * Sets the value of the rank property.
         * 
         */
        public void setRank(short value) {
            this.rank = value;
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
         *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "url"
        })
        public static class Artist {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String url;

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
