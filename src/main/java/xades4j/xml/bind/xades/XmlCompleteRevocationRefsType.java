//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.09 at 09:56:29 PM BST 
//


package xades4j.xml.bind.xades;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CompleteRevocationRefsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteRevocationRefsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRLRefs" type="{http://uri.etsi.org/01903/v1.3.2#}CRLRefsType" minOccurs="0"/&gt;
 *         &lt;element name="OCSPRefs" type="{http://uri.etsi.org/01903/v1.3.2#}OCSPRefsType" minOccurs="0"/&gt;
 *         &lt;element name="OtherRefs" type="{http://uri.etsi.org/01903/v1.3.2#}OtherCertStatusRefsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteRevocationRefsType", propOrder = {
    "crlRefs",
    "ocspRefs",
    "otherRefs"
})
public class XmlCompleteRevocationRefsType {

    @XmlElement(name = "CRLRefs")
    protected XmlCRLRefsType crlRefs;
    @XmlElement(name = "OCSPRefs")
    protected XmlOCSPRefsType ocspRefs;
    @XmlElement(name = "OtherRefs")
    protected XmlOtherCertStatusRefsType otherRefs;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the crlRefs property.
     * 
     * @return
     *     possible object is
     *     {@link XmlCRLRefsType }
     *     
     */
    public XmlCRLRefsType getCRLRefs() {
        return crlRefs;
    }

    /**
     * Sets the value of the crlRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlCRLRefsType }
     *     
     */
    public void setCRLRefs(XmlCRLRefsType value) {
        this.crlRefs = value;
    }

    /**
     * Gets the value of the ocspRefs property.
     * 
     * @return
     *     possible object is
     *     {@link XmlOCSPRefsType }
     *     
     */
    public XmlOCSPRefsType getOCSPRefs() {
        return ocspRefs;
    }

    /**
     * Sets the value of the ocspRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlOCSPRefsType }
     *     
     */
    public void setOCSPRefs(XmlOCSPRefsType value) {
        this.ocspRefs = value;
    }

    /**
     * Gets the value of the otherRefs property.
     * 
     * @return
     *     possible object is
     *     {@link XmlOtherCertStatusRefsType }
     *     
     */
    public XmlOtherCertStatusRefsType getOtherRefs() {
        return otherRefs;
    }

    /**
     * Sets the value of the otherRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlOtherCertStatusRefsType }
     *     
     */
    public void setOtherRefs(XmlOtherCertStatusRefsType value) {
        this.otherRefs = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
