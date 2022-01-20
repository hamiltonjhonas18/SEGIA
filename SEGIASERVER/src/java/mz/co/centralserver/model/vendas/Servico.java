package mz.co.centralserver.model.vendas;

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
import mz.co.centralserver.model.gestao.Horario;

@Entity
@Table(name = "Servico")
public class Servico implements Serializable {

    @Id
    @GeneratedValue
    private int serv_id;

    private String serv_descricao;

    private String serv_informacoes;

    private double serv_valor;

    @ManyToOne
    private Horario horariohora;
    
    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public void setServ_id(int value) {
        this.serv_id = value;
    }

    public int getServ_id() {
        return serv_id;
    }

    public int getORMID() {
        return getServ_id();
    }

    public void setServ_descricao(String value) {
        this.serv_descricao = value;
    }

    public String getServ_descricao() {
        return serv_descricao;
    }

    public void setServ_informacoes(String value) {
        this.serv_informacoes = value;
    }

    public String getServ_informacoes() {
        return serv_informacoes;
    }

    public void setServ_valor(double value) {
        this.serv_valor = value;
    }

    public double getServ_valor() {
        return serv_valor;
    }

    public void setHorariohora(Horario value) {
        this.horariohora = value;
    }

    public Horario getHorariohora() {
        return horariohora;
    }

    @Override
    public String toString() {
        return toString(false);
    }

    public String toString(boolean idOnly) {
        if (idOnly) {
            return String.valueOf(getServ_id());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Servico[ ");
            sb.append("Serv_id=").append(getServ_id()).append(" ");
            sb.append("Serv_descricao=").append(getServ_descricao()).append(" ");
            sb.append("Serv_informacoes=").append(getServ_informacoes()).append(" ");
            sb.append("Serv_valor=").append(getServ_valor()).append(" ");
            if (getHorariohora() != null) {
                sb.append("Horariohora.Persist_ID=").append(getHorariohora().toString(true)).append(" ");
            } else {
                sb.append("Horariohora=null ");
            }
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
