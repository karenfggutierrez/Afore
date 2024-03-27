
package mx.com.secure_gnp.comun.catalogo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para motivoRechazoSolMDOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="motivoRechazoSolMDOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accionSeguir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idMotivoRechazo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motivoRechazoSolMDOut", propOrder = {
    "accionSeguir",
    "descripcion",
    "idMotivoRechazo"
})
public class MotivoRechazoSolMDOut {

    protected String accionSeguir;
    protected String descripcion;
    protected Long idMotivoRechazo;

    /**
     * Obtiene el valor de la propiedad accionSeguir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccionSeguir() {
        return accionSeguir;
    }

    /**
     * Define el valor de la propiedad accionSeguir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccionSeguir(String value) {
        this.accionSeguir = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idMotivoRechazo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdMotivoRechazo() {
        return idMotivoRechazo;
    }

    /**
     * Define el valor de la propiedad idMotivoRechazo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdMotivoRechazo(Long value) {
        this.idMotivoRechazo = value;
    }

}
