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
import mz.co.centralserver.model.gestao.Pessoa;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue
    private int clie_id;

    private String clie_funcao;
    
    private String clie_categoria;
    
    private String clie_contaGeral;
    
    private double clie_saldoDebito;
    
    private double clie_saldoCredito;
    
    private int clie_nid;

    @OneToOne
    private Pessoa pessoapess;
    
    @ManyToOne
    private Entidade Entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Entidade getEntidade() {
        return Entidade;
    }

    public void setEntidade(Entidade Entidade) {
        this.Entidade = Entidade;
    }

    public void setClie_id(int value) {
        this.clie_id = value;
    }

    public int getClie_id() {
        return clie_id;
    }

    public int getORMID() {
        return getClie_id();
    }

    public void setClie_funcao(String value) {
        this.clie_funcao = value;
    }

    public String getClie_funcao() {
        return clie_funcao;
    }

    public void setPessoapess(Pessoa value) {
        this.pessoapess = value;
    }

    public Pessoa getPessoapess() {
        return pessoapess;
    }

    @Override
    public String toString() {
        return toString(false);
    }

    public String toString(boolean idOnly) {
        if (idOnly) {
            return String.valueOf(getClie_id());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cliente[ ");
            sb.append("Clie_id=").append(getClie_id()).append(" ");
            sb.append("Clie_funcao=").append(getClie_funcao()).append(" ");
            if (getPessoapess() != null) {
                sb.append("Pessoapess.Persist_ID=").append(getPessoapess().toString(true)).append(" ");
            } else {
                sb.append("Pessoapess=null ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public double getClie_saldoDebito() {
        return clie_saldoDebito;
    }

    public void setClie_saldoDebito(double clie_saldoDebito) {
        this.clie_saldoDebito = clie_saldoDebito;
    }

    public double getClie_saldoCredito() {
        return clie_saldoCredito;
    }

    public void setClie_saldoCredito(double clie_saldoCredito) {
        this.clie_saldoCredito = clie_saldoCredito;
    }

    public String getClie_contaGeral() {
        return clie_contaGeral;
    }

    public void setClie_contaGeral(String clie_contaGeral) {
        this.clie_contaGeral = clie_contaGeral;
    }

    public int getClie_nid() {
        return clie_nid;
    }

    public void setClie_nid(int clie_nid) {
        this.clie_nid = clie_nid;
    }

    public String getClie_categoria() {
        return clie_categoria;
    }

    public void setClie_categoria(String clie_categoria) {
        this.clie_categoria = clie_categoria;
    }

}
