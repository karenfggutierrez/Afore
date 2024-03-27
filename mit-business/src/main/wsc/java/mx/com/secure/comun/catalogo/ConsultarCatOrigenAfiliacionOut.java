
package mx.com.secure_gnp.comun.catalogo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarCatOrigenAfiliacionOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarCatOrigenAfiliacionOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catOrigenAfiliacion" type="{http://www.secure-gnp.com.mx/comun/Catalogo}catalogoOrigenAfiliacionOut" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarCatOrigenAfiliacionOut", propOrder = {
    "catOrigenAfiliacion"
})
public class ConsultarCatOrigenAfiliacionOut {

    @XmlElement(nillable = true)
    protected List<CatalogoOrigenAfiliacionOut> catOrigenAfiliacion;

    /**
     * Gets the value of the catOrigenAfiliacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catOrigenAfiliacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatOrigenAfiliacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogoOrigenAfiliacionOut }
     * 
     * 
     */
    public List<CatalogoOrigenAfiliacionOut> getCatOrigenAfiliacion() {
        if (catOrigenAfiliacion == null) {
            catOrigenAfiliacion = new ArrayList<CatalogoOrigenAfiliacionOut>();
        }
        return this.catOrigenAfiliacion;
    }

}
