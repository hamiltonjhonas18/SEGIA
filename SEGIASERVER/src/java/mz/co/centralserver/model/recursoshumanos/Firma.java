package mz.co.centralserver.model.recursoshumanos;

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
@Table(name = "Firma")
public class Firma implements Serializable {

    @Id
    @GeneratedValue
    private int firm_id;

    private String firm_descricao;

    private String firm_endereco;

    private String firm_contacto;
    
    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public void setFirm_id(int value) {
        this.firm_id = value;
    }

    public int getFirm_id() {
        return firm_id;
    }

    public int getORMID() {
        return getFirm_id();
    }

    public void setFirm_descricao(String value) {
        this.firm_descricao = value;
    }

    public String getFirm_descricao() {
        return firm_descricao;
    }

    public void setFirm_endereco(String value) {
        this.firm_endereco = value;
    }

    public String getFirm_endereco() {
        return firm_endereco;
    }

    public void setFirm_contacto(String value) {
        this.firm_contacto = value;
    }

    public String getFirm_contacto() {
        return firm_contacto;
    }

    @Override
    public String toString() {
        return toString(false);
    }

    public String toString(boolean idOnly) {
        if (idOnly) {
            return String.valueOf(getFirm_id());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Firma[ ");
            sb.append("Firm_id=").append(getFirm_id()).append(" ");
            sb.append("Firm_descricao=").append(getFirm_descricao()).append(" ");
            sb.append("Firm_endereco=").append(getFirm_endereco()).append(" ");
            sb.append("Firm_contacto=").append(getFirm_contacto()).append(" ");
            sb.append("]");
            return sb.toString();
        }
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

}
