
package mx.com.secure_gnp.comun.catalogo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaInformacionEntidadFederativaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaInformacionEntidadFederativaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultarInformacionEntidadFederativaOut" type="{http://www.secure-gnp.com.mx/comun/Catalogo}consultarInformacionEntidadFederativaOut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaInformacionEntidadFederativaResponse", propOrder = {
    "consultarInformacionEntidadFederativaOut"
})
public class ConsultaInformacionEntidadFederativaResponse {

    protected ConsultarInformacionEntidadFederativaOut consultarInformacionEntidadFederativaOut;

    /**
     * Obtiene el valor de la propiedad consultarInformacionEntidadFederativaOut.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarInformacionEntidadFederativaOut }
     *     
     */
    public ConsultarInformacionEntidadFederativaOut getConsultarInformacionEntidadFederativaOut() {
        return consultarInformacionEntidadFederativaOut;
    }

    /**
     * Define el valor de la propiedad consultarInformacionEntidadFederativaOut.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarInformacionEntidadFederativaOut }
     *     
     */
    public void setConsultarInformacionEntidadFederativaOut(ConsultarInformacionEntidadFederativaOut value) {
        this.consultarInformacionEntidadFederativaOut = value;
    }

}
