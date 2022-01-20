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

@Entity

@Table(name = "TipoUsuario")
public class TipoUsuario implements Serializable {

    @Id
    @GeneratedValue
    private int tipu_id;

    private String tipu_descricao;

    @ManyToOne
    private NivelAcesso nivelAcessoniva;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public void setTipu_id(int value) {
        this.tipu_id = value;
    }

    public int getTipu_id() {
        return tipu_id;
    }

    public int getORMID() {
        return getTipu_id();
    }

    public void setTipu_descricao(String value) {
        this.tipu_descricao = value;
    }

    public String getTipu_descricao() {
        return tipu_descricao;
    }

    public void setNivelAcessoniva(NivelAcesso value) {
        this.nivelAcessoniva = value;
    }

    public NivelAcesso getNivelAcessoniva() {
        return nivelAcessoniva;
    }

    @Override
    public String toString() {
        return toString(false);
    }

    public String toString(boolean idOnly) {
        if (idOnly) {
            return String.valueOf(getTipu_id());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("TipoUsuario[ ");
            sb.append("Tipu_id=").append(getTipu_id()).append(" ");
            sb.append("Tipu_descricao=").append(getTipu_descricao()).append(" ");
            if (getNivelAcessoniva() != null) {
                sb.append("NivelAcessoniva.Persist_ID=").append(getNivelAcessoniva().toString(true)).append(" ");
            } else {
                sb.append("NivelAcessoniva=null ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

}
