
package mx.com.secure_gnp.comun.catalogo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarSubcuentaIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarSubcuentaIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFamiliaSubcuenta" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idGrupoSubcuenta" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarSubcuentaIn", propOrder = {
    "idFamiliaSubcuenta",
    "idGrupoSubcuenta"
})
public class ConsultarSubcuentaIn {

    protected Long idFamiliaSubcuenta;
    protected Long idGrupoSubcuenta;

    /**
     * Obtiene el valor de la propiedad idFamiliaSubcuenta.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdFamiliaSubcuenta() {
        return idFamiliaSubcuenta;
    }

    /**
     * Define el valor de la propiedad idFamiliaSubcuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdFamiliaSubcuenta(Long value) {
        this.idFamiliaSubcuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad idGrupoSubcuenta.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdGrupoSubcuenta() {
        return idGrupoSubcuenta;
    }

    /**
     * Define el valor de la propiedad idGrupoSubcuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdGrupoSubcuenta(Long value) {
        this.idGrupoSubcuenta = value;
    }

}
