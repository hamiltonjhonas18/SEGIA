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
@Table(name = "NivelAcesso")
public class NivelAcesso implements Serializable {

    public NivelAcesso() {
    }

    @Id
    @GeneratedValue
    private int niva_id;

    private String niva_descricao;

    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public void setNiva_id(int value) {
        this.niva_id = value;
    }

    public int getNiva_id() {
        return niva_id;
    }

    public void setNiva_descricao(String value) {
        this.niva_descricao = value;
    }

    public String getNiva_descricao() {
        return niva_descricao;
    }

    public String toString() {
        return toString(false);
    }

    public String toString(boolean idOnly) {
        if (idOnly) {
            return String.valueOf(getNiva_id());
        } else {
            StringBuffer sb = new StringBuffer();
            sb.append("NivelAcesso[ ");
            sb.append("Niva_id=").append(getNiva_id()).append(" ");
            sb.append("Niva_descricao=").append(getNiva_descricao()).append(" ");
            sb.append("]");
            return sb.toString();
        }
    }

}
