package mz.co.centralserver.model.gestao;

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
@Table(name = "Nacionalidade")
public class Nacionalidade implements Serializable {

    public Nacionalidade() {
    }

    @Id
    @GeneratedValue
    private int naci_id;

    private String naci_descricao;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public void setNaci_id(int value) {
        this.naci_id = value;
    }

    public int getNaci_id() {
        return naci_id;
    }

    public int getORMID() {
        return getNaci_id();
    }

    public void setNaci_descricao(String value) {
        this.naci_descricao = value;
    }

    public String getNaci_descricao() {
        return naci_descricao;
    }

    @Override
    public String toString() {
        return toString(false);
    }

    public String toString(boolean idOnly) {
        if (idOnly) {
            return String.valueOf(getNaci_id());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Nacionalidade[ ");
            sb.append("Naci_id=").append(getNaci_id()).append(" ");
            sb.append("Naci_descricao=").append(getNaci_descricao()).append(" ");
            sb.append("]");
            return sb.toString();
        }
    }

}
