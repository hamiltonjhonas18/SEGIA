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
import mz.co.centralserver.model.gestao.Pessoa;

@Entity
@Table(name = "Funcionario")
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue
    private int func_id;

    private Integer func_numero;

    private int func_dependentes;

    private double func_salario;

    private double func_salario_hora;

    private double func_salario_dia;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date func_dataValidade;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date func_dataAdmissao;

    private String func_tipoContrato;

    private String func_formaPagamento;

    private String func_conta;

    private String func_nib;

    private String func_segurancaSocial;
    
    

    @OneToOne
    private Pessoa pessoapess;

    @ManyToOne
    private Firma firmafirm;

    @ManyToOne
    private Cargo cargo;

    @ManyToOne
    private Habilitacao habilitacao;

    @ManyToOne
    private Departamento departamento;

    private String func_tipo;

    private String func_badgnumber;

    private int func_turno;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public void setFunc_id(int value) {
        this.func_id = value;
    }

    public int getFunc_id() {
        return func_id;
    }

    public void setFunc_numero(int value) {
        setFunc_numero(new Integer(value));
    }

    public void setFunc_numero(Integer value) {
        this.func_numero = value;
    }

    public Integer getFunc_numero() {
        return func_numero;
    }

    public void setPessoapess(Pessoa value) {
        this.pessoapess = value;
    }

    public Pessoa getPessoapess() {
        return pessoapess;
    }

    public void setFirmafirm(Firma value) {
        this.firmafirm = value;
    }

    public Firma getFirmafirm() {
        return firmafirm;
    }

    @ManyToOne
    private Entidade Entidade;

    public Entidade getEntidade() {
        return Entidade;
    }

    public void setEntidade(Entidade Entidade) {
        this.Entidade = Entidade;
    }

    @Override
    public String toString() {
        return toString(false);
    }

    public String toString(boolean idOnly) {
        if (idOnly) {
            return String.valueOf(getFunc_id());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Funcionario[ ");
            sb.append("Func_id=").append(getFunc_id()).append(" ");
            sb.append("Func_numero=").append(getFunc_numero()).append(" ");
            if (getPessoapess() != null) {
                sb.append("Pessoapess.Persist_ID=").append(getPessoapess().toString(true)).append(" ");
            } else {
                sb.append("Pessoapess=null ");
            }
            if (getFirmafirm() != null) {
                sb.append("Firmafirm.Persist_ID=").append(getFirmafirm().toString(true)).append(" ");
            } else {
                sb.append("Firmafirm=null ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getFunc_tipo() {
        return func_tipo;
    }

    public void setFunc_tipo(String func_tipo) {
        this.func_tipo = func_tipo;
    }

    public String getFunc_badgnumber() {
        return func_badgnumber;
    }

    public void setFunc_badgnumber(String func_badgnumber) {
        this.func_badgnumber = func_badgnumber;
    }

    public int getFunc_turno() {
        return func_turno;
    }

    public void setFunc_turno(int func_turno) {
        this.func_turno = func_turno;
    }

    public Habilitacao getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(Habilitacao habilitacao) {
        this.habilitacao = habilitacao;
    }

    public double getFunc_salario() {
        return func_salario;
    }

    public void setFunc_salario(double func_salario) {
        this.func_salario = func_salario;
    }

    public double getFunc_salario_hora() {
        return func_salario_hora;
    }

    public void setFunc_salario_hora(double func_salario_hora) {
        this.func_salario_hora = func_salario_hora;
    }

    public double getFunc_salario_dia() {
        return func_salario_dia;
    }

    public void setFunc_salario_dia(double func_salario_dia) {
        this.func_salario_dia = func_salario_dia;
    }

    public String getFunc_tipoContrato() {
        return func_tipoContrato;
    }

    public void setFunc_tipoContrato(String func_tipoContrato) {
        this.func_tipoContrato = func_tipoContrato;
    }

    public String getFunc_formaPagamento() {
        return func_formaPagamento;
    }

    public void setFunc_formaPagamento(String func_formaPagamento) {
        this.func_formaPagamento = func_formaPagamento;
    }

    public String getFunc_conta() {
        return func_conta;
    }

    public void setFunc_conta(String func_conta) {
        this.func_conta = func_conta;
    }

    public String getFunc_nib() {
        return func_nib;
    }

    public void setFunc_nib(String func_nib) {
        this.func_nib = func_nib;
    }

    public String getFunc_segurancaSocial() {
        return func_segurancaSocial;
    }

    public void setFunc_segurancaSocial(String func_segurancaSocial) {
        this.func_segurancaSocial = func_segurancaSocial;
    }

    public int getFunc_dependentes() {
        return func_dependentes;
    }

    public void setFunc_dependentes(int func_dependentes) {
        this.func_dependentes = func_dependentes;
    }

    public java.util.Date getFunc_dataValidade() {
        return func_dataValidade;
    }

    public void setFunc_dataValidade(java.util.Date func_dataValidade) {
        this.func_dataValidade = func_dataValidade;
    }

    public java.util.Date getFunc_dataAdmissao() {
        return func_dataAdmissao;
    }

    public void setFunc_dataAdmissao(java.util.Date func_dataAdmissao) {
        this.func_dataAdmissao = func_dataAdmissao;
    }

}
