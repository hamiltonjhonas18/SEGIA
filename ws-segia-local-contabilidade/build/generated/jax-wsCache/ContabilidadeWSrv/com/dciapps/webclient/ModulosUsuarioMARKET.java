
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modulosUsuarioMARKET complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modulosUsuarioMARKET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="mui_activos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_bancos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_clientes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_depositos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_despesas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_empresas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_estatisticas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_facturas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_formasPagamento" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_fornecedores" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_guiasRemessa" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mui_lancamentos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_moedas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_petyCash" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_planosDeConta" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_produtos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_recursosHumanos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_requisicoes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_requisicoes_add" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_requisicoes_aprove" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_requisicoes_list" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_requisicoes_status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_resultados" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_usuarios" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_vendas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="usuario" type="{http://webservice.centralserver.co.mz/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modulosUsuarioMARKET", propOrder = {
    "encrypted",
    "entidade",
    "muiActivos",
    "muiBancos",
    "muiClientes",
    "muiDepositos",
    "muiDespesas",
    "muiEmpresas",
    "muiEstatisticas",
    "muiFacturas",
    "muiFormasPagamento",
    "muiFornecedores",
    "muiGuiasRemessa",
    "muiId",
    "muiLancamentos",
    "muiMoedas",
    "muiPetyCash",
    "muiPlanosDeConta",
    "muiProdutos",
    "muiRecursosHumanos",
    "muiRequisicoes",
    "muiRequisicoesAdd",
    "muiRequisicoesAprove",
    "muiRequisicoesList",
    "muiRequisicoesStatus",
    "muiResultados",
    "muiUsuarios",
    "muiVendas",
    "usuario"
})
public class ModulosUsuarioMARKET {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "mui_activos")
    protected boolean muiActivos;
    @XmlElement(name = "mui_bancos")
    protected boolean muiBancos;
    @XmlElement(name = "mui_clientes")
    protected boolean muiClientes;
    @XmlElement(name = "mui_depositos")
    protected boolean muiDepositos;
    @XmlElement(name = "mui_despesas")
    protected boolean muiDespesas;
    @XmlElement(name = "mui_empresas")
    protected boolean muiEmpresas;
    @XmlElement(name = "mui_estatisticas")
    protected boolean muiEstatisticas;
    @XmlElement(name = "mui_facturas")
    protected boolean muiFacturas;
    @XmlElement(name = "mui_formasPagamento")
    protected boolean muiFormasPagamento;
    @XmlElement(name = "mui_fornecedores")
    protected boolean muiFornecedores;
    @XmlElement(name = "mui_guiasRemessa")
    protected boolean muiGuiasRemessa;
    @XmlElement(name = "mui_id")
    protected int muiId;
    @XmlElement(name = "mui_lancamentos")
    protected boolean muiLancamentos;
    @XmlElement(name = "mui_moedas")
    protected boolean muiMoedas;
    @XmlElement(name = "mui_petyCash")
    protected boolean muiPetyCash;
    @XmlElement(name = "mui_planosDeConta")
    protected boolean muiPlanosDeConta;
    @XmlElement(name = "mui_produtos")
    protected boolean muiProdutos;
    @XmlElement(name = "mui_recursosHumanos")
    protected boolean muiRecursosHumanos;
    @XmlElement(name = "mui_requisicoes")
    protected boolean muiRequisicoes;
    @XmlElement(name = "mui_requisicoes_add")
    protected boolean muiRequisicoesAdd;
    @XmlElement(name = "mui_requisicoes_aprove")
    protected boolean muiRequisicoesAprove;
    @XmlElement(name = "mui_requisicoes_list")
    protected boolean muiRequisicoesList;
    @XmlElement(name = "mui_requisicoes_status")
    protected boolean muiRequisicoesStatus;
    @XmlElement(name = "mui_resultados")
    protected boolean muiResultados;
    @XmlElement(name = "mui_usuarios")
    protected boolean muiUsuarios;
    @XmlElement(name = "mui_vendas")
    protected boolean muiVendas;
    protected Usuario usuario;

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
     * Gets the value of the muiActivos property.
     * 
     */
    public boolean isMuiActivos() {
        return muiActivos;
    }

    /**
     * Sets the value of the muiActivos property.
     * 
     */
    public void setMuiActivos(boolean value) {
        this.muiActivos = value;
    }

    /**
     * Gets the value of the muiBancos property.
     * 
     */
    public boolean isMuiBancos() {
        return muiBancos;
    }

    /**
     * Sets the value of the muiBancos property.
     * 
     */
    public void setMuiBancos(boolean value) {
        this.muiBancos = value;
    }

    /**
     * Gets the value of the muiClientes property.
     * 
     */
    public boolean isMuiClientes() {
        return muiClientes;
    }

    /**
     * Sets the value of the muiClientes property.
     * 
     */
    public void setMuiClientes(boolean value) {
        this.muiClientes = value;
    }

    /**
     * Gets the value of the muiDepositos property.
     * 
     */
    public boolean isMuiDepositos() {
        return muiDepositos;
    }

    /**
     * Sets the value of the muiDepositos property.
     * 
     */
    public void setMuiDepositos(boolean value) {
        this.muiDepositos = value;
    }

    /**
     * Gets the value of the muiDespesas property.
     * 
     */
    public boolean isMuiDespesas() {
        return muiDespesas;
    }

    /**
     * Sets the value of the muiDespesas property.
     * 
     */
    public void setMuiDespesas(boolean value) {
        this.muiDespesas = value;
    }

    /**
     * Gets the value of the muiEmpresas property.
     * 
     */
    public boolean isMuiEmpresas() {
        return muiEmpresas;
    }

    /**
     * Sets the value of the muiEmpresas property.
     * 
     */
    public void setMuiEmpresas(boolean value) {
        this.muiEmpresas = value;
    }

    /**
     * Gets the value of the muiEstatisticas property.
     * 
     */
    public boolean isMuiEstatisticas() {
        return muiEstatisticas;
    }

    /**
     * Sets the value of the muiEstatisticas property.
     * 
     */
    public void setMuiEstatisticas(boolean value) {
        this.muiEstatisticas = value;
    }

    /**
     * Gets the value of the muiFacturas property.
     * 
     */
    public boolean isMuiFacturas() {
        return muiFacturas;
    }

    /**
     * Sets the value of the muiFacturas property.
     * 
     */
    public void setMuiFacturas(boolean value) {
        this.muiFacturas = value;
    }

    /**
     * Gets the value of the muiFormasPagamento property.
     * 
     */
    public boolean isMuiFormasPagamento() {
        return muiFormasPagamento;
    }

    /**
     * Sets the value of the muiFormasPagamento property.
     * 
     */
    public void setMuiFormasPagamento(boolean value) {
        this.muiFormasPagamento = value;
    }

    /**
     * Gets the value of the muiFornecedores property.
     * 
     */
    public boolean isMuiFornecedores() {
        return muiFornecedores;
    }

    /**
     * Sets the value of the muiFornecedores property.
     * 
     */
    public void setMuiFornecedores(boolean value) {
        this.muiFornecedores = value;
    }

    /**
     * Gets the value of the muiGuiasRemessa property.
     * 
     */
    public boolean isMuiGuiasRemessa() {
        return muiGuiasRemessa;
    }

    /**
     * Sets the value of the muiGuiasRemessa property.
     * 
     */
    public void setMuiGuiasRemessa(boolean value) {
        this.muiGuiasRemessa = value;
    }

    /**
     * Gets the value of the muiId property.
     * 
     */
    public int getMuiId() {
        return muiId;
    }

    /**
     * Sets the value of the muiId property.
     * 
     */
    public void setMuiId(int value) {
        this.muiId = value;
    }

    /**
     * Gets the value of the muiLancamentos property.
     * 
     */
    public boolean isMuiLancamentos() {
        return muiLancamentos;
    }

    /**
     * Sets the value of the muiLancamentos property.
     * 
     */
    public void setMuiLancamentos(boolean value) {
        this.muiLancamentos = value;
    }

    /**
     * Gets the value of the muiMoedas property.
     * 
     */
    public boolean isMuiMoedas() {
        return muiMoedas;
    }

    /**
     * Sets the value of the muiMoedas property.
     * 
     */
    public void setMuiMoedas(boolean value) {
        this.muiMoedas = value;
    }

    /**
     * Gets the value of the muiPetyCash property.
     * 
     */
    public boolean isMuiPetyCash() {
        return muiPetyCash;
    }

    /**
     * Sets the value of the muiPetyCash property.
     * 
     */
    public void setMuiPetyCash(boolean value) {
        this.muiPetyCash = value;
    }

    /**
     * Gets the value of the muiPlanosDeConta property.
     * 
     */
    public boolean isMuiPlanosDeConta() {
        return muiPlanosDeConta;
    }

    /**
     * Sets the value of the muiPlanosDeConta property.
     * 
     */
    public void setMuiPlanosDeConta(boolean value) {
        this.muiPlanosDeConta = value;
    }

    /**
     * Gets the value of the muiProdutos property.
     * 
     */
    public boolean isMuiProdutos() {
        return muiProdutos;
    }

    /**
     * Sets the value of the muiProdutos property.
     * 
     */
    public void setMuiProdutos(boolean value) {
        this.muiProdutos = value;
    }

    /**
     * Gets the value of the muiRecursosHumanos property.
     * 
     */
    public boolean isMuiRecursosHumanos() {
        return muiRecursosHumanos;
    }

    /**
     * Sets the value of the muiRecursosHumanos property.
     * 
     */
    public void setMuiRecursosHumanos(boolean value) {
        this.muiRecursosHumanos = value;
    }

    /**
     * Gets the value of the muiRequisicoes property.
     * 
     */
    public boolean isMuiRequisicoes() {
        return muiRequisicoes;
    }

    /**
     * Sets the value of the muiRequisicoes property.
     * 
     */
    public void setMuiRequisicoes(boolean value) {
        this.muiRequisicoes = value;
    }

    /**
     * Gets the value of the muiRequisicoesAdd property.
     * 
     */
    public boolean isMuiRequisicoesAdd() {
        return muiRequisicoesAdd;
    }

    /**
     * Sets the value of the muiRequisicoesAdd property.
     * 
     */
    public void setMuiRequisicoesAdd(boolean value) {
        this.muiRequisicoesAdd = value;
    }

    /**
     * Gets the value of the muiRequisicoesAprove property.
     * 
     */
    public boolean isMuiRequisicoesAprove() {
        return muiRequisicoesAprove;
    }

    /**
     * Sets the value of the muiRequisicoesAprove property.
     * 
     */
    public void setMuiRequisicoesAprove(boolean value) {
        this.muiRequisicoesAprove = value;
    }

    /**
     * Gets the value of the muiRequisicoesList property.
     * 
     */
    public boolean isMuiRequisicoesList() {
        return muiRequisicoesList;
    }

    /**
     * Sets the value of the muiRequisicoesList property.
     * 
     */
    public void setMuiRequisicoesList(boolean value) {
        this.muiRequisicoesList = value;
    }

    /**
     * Gets the value of the muiRequisicoesStatus property.
     * 
     */
    public boolean isMuiRequisicoesStatus() {
        return muiRequisicoesStatus;
    }

    /**
     * Sets the value of the muiRequisicoesStatus property.
     * 
     */
    public void setMuiRequisicoesStatus(boolean value) {
        this.muiRequisicoesStatus = value;
    }

    /**
     * Gets the value of the muiResultados property.
     * 
     */
    public boolean isMuiResultados() {
        return muiResultados;
    }

    /**
     * Sets the value of the muiResultados property.
     * 
     */
    public void setMuiResultados(boolean value) {
        this.muiResultados = value;
    }

    /**
     * Gets the value of the muiUsuarios property.
     * 
     */
    public boolean isMuiUsuarios() {
        return muiUsuarios;
    }

    /**
     * Sets the value of the muiUsuarios property.
     * 
     */
    public void setMuiUsuarios(boolean value) {
        this.muiUsuarios = value;
    }

    /**
     * Gets the value of the muiVendas property.
     * 
     */
    public boolean isMuiVendas() {
        return muiVendas;
    }

    /**
     * Sets the value of the muiVendas property.
     * 
     */
    public void setMuiVendas(boolean value) {
        this.muiVendas = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

}
