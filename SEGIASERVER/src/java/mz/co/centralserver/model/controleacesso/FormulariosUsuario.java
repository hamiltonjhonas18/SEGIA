package mz.co.centralserver.model.controleacesso;

/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 *
 * This is an automatic generated file. It will be regenerated every time you
 * generate persistence class.
 *
 * Modifying its content may cause the program not work, or your work may lost.
 */
/**
 * Licensee: License Type: Evaluation
 */
import java.io.Serializable;
import javax.persistence.*;
import mz.co.centralserver.model.gestao.Entidade;

@Entity
@Table(name = "FormulariosUsuario")
public class FormulariosUsuario implements Serializable {

    @Id
    @GeneratedValue
    private int formu_id;

    private boolean formu_i;
    private boolean formu_d;
    private boolean formu_u;
    private boolean formu_v;

    @ManyToOne
    private Formulario formulario;

    @ManyToOne
    private ModuloUsuario moduloUsuario;

    public int getFormu_id() {
        return formu_id;
    }

    public void setFormu_id(int formu_id) {
        this.formu_id = formu_id;
    }

    public boolean isFormu_i() {
        return formu_i;
    }

    public void setFormu_i(boolean formu_i) {
        this.formu_i = formu_i;
    }

    public boolean isFormu_d() {
        return formu_d;
    }

    public void setFormu_d(boolean formu_d) {
        this.formu_d = formu_d;
    }

    public boolean isFormu_u() {
        return formu_u;
    }

    public void setFormu_u(boolean formu_u) {
        this.formu_u = formu_u;
    }

    public boolean isFormu_v() {
        return formu_v;
    }

    public void setFormu_v(boolean formu_v) {
        this.formu_v = formu_v;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public ModuloUsuario getModuloUsuario() {
        return moduloUsuario;
    }

    public void setModuloUsuario(ModuloUsuario moduloUsuario) {
        this.moduloUsuario = moduloUsuario;
    }

   
}
