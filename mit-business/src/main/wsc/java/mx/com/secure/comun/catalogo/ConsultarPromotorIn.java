
package mx.com.secure_gnp.comun.catalogo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarPromotorIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarPromotorIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claveConsar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarPromotorIn", propOrder = {
    "claveConsar"
})
public class ConsultarPromotorIn {

    protected String claveConsar;

    /**
     * Obtiene el valor de la propiedad claveConsar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveConsar() {
        return claveConsar;
    }

    /**
     * Define el valor de la propiedad claveConsar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveConsar(String value) {
        this.claveConsar = value;
    }

}
