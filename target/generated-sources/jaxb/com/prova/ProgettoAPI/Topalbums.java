//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.10 at 05:20:57 PM CEST 
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
 *         &lt;element name="album" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="playcount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                   &lt;element name="mbid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="artist">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="mbid" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="artist" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="page" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="perPage" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="totalPages" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "album"
})
@XmlRootElement(name = "topalbums")
public class Topalbums {

    @XmlElement(required = true)
    protected List<Topalbums.Album> album;
    @XmlAttribute(name = "artist", required = true)
    protected String artist;
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
    @XmlSchemaType(name = "unsignedShort")
    protected int total;

    /**
     * Gets the value of the album property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the album property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlbum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Topalbums.Album }
     * 
     * 
     */
    public List<Topalbums.Album> getAlbum() {
        if (album == null) {
            album = new ArrayList<Topalbums.Album>();
        }
        return this.album;
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
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
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
     *         &lt;element name="playcount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *         &lt;element name="mbid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="artist">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="mbid" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "mbid",
        "url",
        "artist",
        "image"
    })
    public static class Album {

        @XmlElement(required = true)
        protected String name;
        @XmlSchemaType(name = "unsignedInt")
        protected long playcount;
        protected String mbid;
        @XmlElement(required = true)
        protected String url;
        @XmlElement(required = true)
        protected Topalbums.Album.Artist artist;
        @XmlElement(required = true)
        protected List<Topalbums.Album.Image> image;

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
         */
        public long getPlaycount() {
            return playcount;
        }

        /**
         * Sets the value of the playcount property.
         * 
         */
        public void setPlaycount(long value) {
            this.playcount = value;
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
         * Gets the value of the artist property.
         * 
         * @return
         *     possible object is
         *     {@link Topalbums.Album.Artist }
         *     
         */
        public Topalbums.Album.Artist getArtist() {
            return artist;
        }

        /**
         * Sets the value of the artist property.
         * 
         * @param value
         *     allowed object is
         *     {@link Topalbums.Album.Artist }
         *     
         */
        public void setArtist(Topalbums.Album.Artist value) {
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
         * {@link Topalbums.Album.Image }
         * 
         * 
         */
        public List<Topalbums.Album.Image> getImage() {
            if (image == null) {
                image = new ArrayList<Topalbums.Album.Image>();
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
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="mbid" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "mbid",
            "url"
        })
        public static class Artist {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String mbid;
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
