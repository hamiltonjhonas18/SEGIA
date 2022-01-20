
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for funcionario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cargo" type="{http://webservice.centralserver.co.mz/}cargo" minOccurs="0"/>
 *         &lt;element name="departamento" type="{http://webservice.centralserver.co.mz/}departamento" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="firmafirm" type="{http://webservice.centralserver.co.mz/}firma" minOccurs="0"/>
 *         &lt;element name="func_badgnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="func_conta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="func_dataAdmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="func_dataValidade" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="func_dependentes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="func_formaPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="func_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="func_nib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="func_numero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="func_salario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="func_salario_dia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="func_salario_hora" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="func_segurancaSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="func_tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="func_tipoContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="func_turno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="habilitacao" type="{http://webservice.centralserver.co.mz/}habilitacao" minOccurs="0"/>
 *         &lt;element name="pessoapess" type="{http://webservice.centralserver.co.mz/}pessoa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionario", propOrder = {
    "cargo",
    "departamento",
    "encrypted",
    "entidade",
    "firmafirm",
    "funcBadgnumber",
    "funcConta",
    "funcDataAdmissao",
    "funcDataValidade",
    "funcDependentes",
    "funcFormaPagamento",
    "funcId",
    "funcNib",
    "funcNumero",
    "funcSalario",
    "funcSalarioDia",
    "funcSalarioHora",
    "funcSegurancaSocial",
    "funcTipo",
    "funcTipoContrato",
    "funcTurno",
    "habilitacao",
    "pessoapess"
})
public class Funcionario {

    protected Cargo cargo;
    protected Departamento departamento;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Firma firmafirm;
    @XmlElement(name = "func_badgnumber")
    protected String funcBadgnumber;
    @XmlElement(name = "func_conta")
    protected String funcConta;
    @XmlElement(name = "func_dataAdmissao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar funcDataAdmissao;
    @XmlElement(name = "func_dataValidade")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar funcDataValidade;
    @XmlElement(name = "func_dependentes")
    protected int funcDependentes;
    @XmlElement(name = "func_formaPagamento")
    protected String funcFormaPagamento;
    @XmlElement(name = "func_id")
    protected int funcId;
    @XmlElement(name = "func_nib")
    protected String funcNib;
    @XmlElement(name = "func_numero")
    protected Integer funcNumero;
    @XmlElement(name = "func_salario")
    protected double funcSalario;
    @XmlElement(name = "func_salario_dia")
    protected double funcSalarioDia;
    @XmlElement(name = "func_salario_hora")
    protected double funcSalarioHora;
    @XmlElement(name = "func_segurancaSocial")
    protected String funcSegurancaSocial;
    @XmlElement(name = "func_tipo")
    protected String funcTipo;
    @XmlElement(name = "func_tipoContrato")
    protected String funcTipoContrato;
    @XmlElement(name = "func_turno")
    protected int funcTurno;
    protected Habilitacao habilitacao;
    protected Pessoa pessoapess;

    /**
     * Gets the value of the cargo property.
     * 
     * @return
     *     possible object is
     *     {@link Cargo }
     *     
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * Sets the value of the cargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cargo }
     *     
     */
    public void setCargo(Cargo value) {
        this.cargo = value;
    }

    /**
     * Gets the value of the departamento property.
     * 
     * @return
     *     possible object is
     *     {@link Departamento }
     *     
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Sets the value of the departamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Departamento }
     *     
     */
    public void setDepartamento(Departamento value) {
        this.departamento = value;
    }

    /**
     * Gets the value of the encrypted property.
     * 
     */
    public boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     * 
     */
    public void setEncrypted(boolean value) {
        this.encrypted = value;
    }

    /**
     * Gets the value of the entidade property.
     * 
     * @return
     *     possible object is
     *     {@link Entidade }
     *     
     */
    public Entidade getEntidade() {
        return entidade;
    }

    /**
     * Sets the value of the entidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entidade }
     *     
     */
    public void setEntidade(Entidade value) {
        this.entidade = value;
    }

    /**
     * Gets the value of the firmafirm property.
     * 
     * @return
     *     possible object is
     *     {@link Firma }
     *     
     */
    public Firma getFirmafirm() {
        return firmafirm;
    }

    /**
     * Sets the value of the firmafirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Firma }
     *     
     */
    public void setFirmafirm(Firma value) {
        this.firmafirm = value;
    }

    /**
     * Gets the value of the funcBadgnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncBadgnumber() {
        return funcBadgnumber;
    }

    /**
     * Sets the value of the funcBadgnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncBadgnumber(String value) {
        this.funcBadgnumber = value;
    }

    /**
     * Gets the value of the funcConta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncConta() {
        return funcConta;
    }

    /**
     * Sets the value of the funcConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncConta(String value) {
        this.funcConta = value;
    }

    /**
     * Gets the value of the funcDataAdmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFuncDataAdmissao() {
        return funcDataAdmissao;
    }

    /**
     * Sets the value of the funcDataAdmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFuncDataAdmissao(XMLGregorianCalendar value) {
        this.funcDataAdmissao = value;
    }

    /**
     * Gets the value of the funcDataValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFuncDataValidade() {
        return funcDataValidade;
    }

    /**
     * Sets the value of the funcDataValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFuncDataValidade(XMLGregorianCalendar value) {
        this.funcDataValidade = value;
    }

    /**
     * Gets the value of the funcDependentes property.
     * 
     */
    public int getFuncDependentes() {
        return funcDependentes;
    }

    /**
     * Sets the value of the funcDependentes property.
     * 
     */
    public void setFuncDependentes(int value) {
        this.funcDependentes = value;
    }

    /**
     * Gets the value of the funcFormaPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncFormaPagamento() {
        return funcFormaPagamento;
    }

    /**
     * Sets the value of the funcFormaPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncFormaPagamento(String value) {
        this.funcFormaPagamento = value;
    }

    /**
     * Gets the value of the funcId property.
     * 
     */
    public int getFuncId() {
        return funcId;
    }

    /**
     * Sets the value of the funcId property.
     * 
     */
    public void setFuncId(int value) {
        this.funcId = value;
    }

    /**
     * Gets the value of the funcNib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncNib() {
        return funcNib;
    }

    /**
     * Sets the value of the funcNib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncNib(String value) {
        this.funcNib = value;
    }

    /**
     * Gets the value of the funcNumero property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFuncNumero() {
        return funcNumero;
    }

    /**
     * Sets the value of the funcNumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFuncNumero(Integer value) {
        this.funcNumero = value;
    }

    /**
     * Gets the value of the funcSalario property.
     * 
     */
    public double getFuncSalario() {
        return funcSalario;
    }

    /**
     * Sets the value of the funcSalario property.
     * 
     */
    public void setFuncSalario(double value) {
        this.funcSalario = value;
    }

    /**
     * Gets the value of the funcSalarioDia property.
     * 
     */
    public double getFuncSalarioDia() {
        return funcSalarioDia;
    }

    /**
     * Sets the value of the funcSalarioDia property.
     * 
     */
    public void setFuncSalarioDia(double value) {
        this.funcSalarioDia = value;
    }

    /**
     * Gets the value of the funcSalarioHora property.
     * 
     */
    public double getFuncSalarioHora() {
        return funcSalarioHora;
    }

    /**
     * Sets the value of the funcSalarioHora property.
     * 
     */
    public void setFuncSalarioHora(double value) {
        this.funcSalarioHora = value;
    }

    /**
     * Gets the value of the funcSegurancaSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncSegurancaSocial() {
        return funcSegurancaSocial;
    }

    /**
     * Sets the value of the funcSegurancaSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncSegurancaSocial(String value) {
        this.funcSegurancaSocial = value;
    }

    /**
     * Gets the value of the funcTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncTipo() {
        return funcTipo;
    }

    /**
     * Sets the value of the funcTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncTipo(String value) {
        this.funcTipo = value;
    }

    /**
     * Gets the value of the funcTipoContrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncTipoContrato() {
        return funcTipoContrato;
    }

    /**
     * Sets the value of the funcTipoContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncTipoContrato(String value) {
        this.funcTipoContrato = value;
    }

    /**
     * Gets the value of the funcTurno property.
     * 
     */
    public int getFuncTurno() {
        return funcTurno;
    }

    /**
     * Sets the value of the funcTurno property.
     * 
     */
    public void setFuncTurno(int value) {
        this.funcTurno = value;
    }

    /**
     * Gets the value of the habilitacao property.
     * 
     * @return
     *     possible object is
     *     {@link Habilitacao }
     *     
     */
    public Habilitacao getHabilitacao() {
        return habilitacao;
    }

    /**
     * Sets the value of the habilitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Habilitacao }
     *     
     */
    public void setHabilitacao(Habilitacao value) {
        this.habilitacao = value;
    }

    /**
     * Gets the value of the pessoapess property.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getPessoapess() {
        return pessoapess;
    }

    /**
     * Sets the value of the pessoapess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setPessoapess(Pessoa value) {
        this.pessoapess = value;
    }

}
