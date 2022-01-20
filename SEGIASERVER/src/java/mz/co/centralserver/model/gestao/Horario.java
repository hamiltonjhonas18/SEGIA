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
@Table(name = "Horario")
public class Horario implements Serializable {

    @Id
    @GeneratedValue
    private int hora_id;

    private String hora_inicio;

    private String hora_fim;
    
    private boolean  hora_usado;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public void setHora_id(int value) {
        this.hora_id = value;
    }

    public int getHora_id() {
        return hora_id;
    }

    public int getORMID() {
        return getHora_id();
    }

    public void setHora_inicio(String value) {
        this.hora_inicio = value;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_fim(String value) {
        this.hora_fim = value;
    }

    public String getHora_fim() {
        return hora_fim;
    }

    @Override
    public String toString() {
        return toString(false);
    }

    public String toString(boolean idOnly) {
        if (idOnly) {
            return String.valueOf(getHora_id());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Horario[ ");
            sb.append("Hora_id=").append(getHora_id()).append(" ");
            sb.append("Hora_inicio=").append(getHora_inicio()).append(" ");
            sb.append("Hora_fim=").append(getHora_fim()).append(" ");
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

    public boolean isHora_usado() {
        return hora_usado;
    }

    public void setHora_usado(boolean hora_usado) {
        this.hora_usado = hora_usado;
    }

}
