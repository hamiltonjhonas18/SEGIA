
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for produto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="produto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoriaProduto" type="{http://webservice.centralserver.co.mz/}categoriaProduto" minOccurs="0"/>
 *         &lt;element name="cor" type="{http://webservice.centralserver.co.mz/}cor" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="fornecedor" type="{http://webservice.centralserver.co.mz/}fornecedor" minOccurs="0"/>
 *         &lt;element name="pro_codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pro_codigo_barras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pro_dataFabrico" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pro_dataValidade" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pro_descriminacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pro_detalhes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pro_estoque" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pro_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pro_imagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pro_marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pro_margemAlarme" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pro_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pro_preco" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pro_preco2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pro_precoCompra" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pro_segmento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tamanho" type="{http://webservice.centralserver.co.mz/}tamanho" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produto", propOrder = {
    "categoriaProduto",
    "cor",
    "encrypted",
    "entidade",
    "fornecedor",
    "proCodigo",
    "proCodigoBarras",
    "proDataFabrico",
    "proDataValidade",
    "proDescriminacao",
    "proDetalhes",
    "proEstoque",
    "proId",
    "proImagem",
    "proMarca",
    "proMargemAlarme",
    "proNome",
    "proPreco",
    "proPreco2",
    "proPrecoCompra",
    "proSegmento",
    "tamanho"
})
public class Produto {

    protected CategoriaProduto categoriaProduto;
    protected Cor cor;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Fornecedor fornecedor;
    @XmlElement(name = "pro_codigo")
    protected String proCodigo;
    @XmlElement(name = "pro_codigo_barras")
    protected String proCodigoBarras;
    @XmlElement(name = "pro_dataFabrico")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proDataFabrico;
    @XmlElement(name = "pro_dataValidade")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proDataValidade;
    @XmlElement(name = "pro_descriminacao")
    protected String proDescriminacao;
    @XmlElement(name = "pro_detalhes")
    protected String proDetalhes;
    @XmlElement(name = "pro_estoque")
    protected int proEstoque;
    @XmlElement(name = "pro_id")
    protected int proId;
    @XmlElement(name = "pro_imagem")
    protected String proImagem;
    @XmlElement(name = "pro_marca")
    protected String proMarca;
    @XmlElement(name = "pro_margemAlarme")
    protected int proMargemAlarme;
    @XmlElement(name = "pro_nome")
    protected String proNome;
    @XmlElement(name = "pro_preco")
    protected double proPreco;
    @XmlElement(name = "pro_preco2")
    protected double proPreco2;
    @XmlElement(name = "pro_precoCompra")
    protected double proPrecoCompra;
    @XmlElement(name = "pro_segmento")
    protected String proSegmento;
    protected Tamanho tamanho;

    /**
     * Gets the value of the categoriaProduto property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaProduto }
     *     
     */
    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    /**
     * Sets the value of the categoriaProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaProduto }
     *     
     */
    public void setCategoriaProduto(CategoriaProduto value) {
        this.categoriaProduto = value;
    }

    /**
     * Gets the value of the cor property.
     * 
     * @return
     *     possible object is
     *     {@link Cor }
     *     
     */
    public Cor getCor() {
        return cor;
    }

    /**
     * Sets the value of the cor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cor }
     *     
     */
    public void setCor(Cor value) {
        this.cor = value;
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
     * Gets the value of the fornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link Fornecedor }
     *     
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * Sets the value of the fornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fornecedor }
     *     
     */
    public void setFornecedor(Fornecedor value) {
        this.fornecedor = value;
    }

    /**
     * Gets the value of the proCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProCodigo() {
        return proCodigo;
    }

    /**
     * Sets the value of the proCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProCodigo(String value) {
        this.proCodigo = value;
    }

    /**
     * Gets the value of the proCodigoBarras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProCodigoBarras() {
        return proCodigoBarras;
    }

    /**
     * Sets the value of the proCodigoBarras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProCodigoBarras(String value) {
        this.proCodigoBarras = value;
    }

    /**
     * Gets the value of the proDataFabrico property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProDataFabrico() {
        return proDataFabrico;
    }

    /**
     * Sets the value of the proDataFabrico property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProDataFabrico(XMLGregorianCalendar value) {
        this.proDataFabrico = value;
    }

    /**
     * Gets the value of the proDataValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProDataValidade() {
        return proDataValidade;
    }

    /**
     * Sets the value of the proDataValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProDataValidade(XMLGregorianCalendar value) {
        this.proDataValidade = value;
    }

    /**
     * Gets the value of the proDescriminacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProDescriminacao() {
        return proDescriminacao;
    }

    /**
     * Sets the value of the proDescriminacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProDescriminacao(String value) {
        this.proDescriminacao = value;
    }

    /**
     * Gets the value of the proDetalhes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProDetalhes() {
        return proDetalhes;
    }

    /**
     * Sets the value of the proDetalhes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProDetalhes(String value) {
        this.proDetalhes = value;
    }

    /**
     * Gets the value of the proEstoque property.
     * 
     */
    public int getProEstoque() {
        return proEstoque;
    }

    /**
     * Sets the value of the proEstoque property.
     * 
     */
    public void setProEstoque(int value) {
        this.proEstoque = value;
    }

    /**
     * Gets the value of the proId property.
     * 
     */
    public int getProId() {
        return proId;
    }

    /**
     * Sets the value of the proId property.
     * 
     */
    public void setProId(int value) {
        this.proId = value;
    }

    /**
     * Gets the value of the proImagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProImagem() {
        return proImagem;
    }

    /**
     * Sets the value of the proImagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProImagem(String value) {
        this.proImagem = value;
    }

    /**
     * Gets the value of the proMarca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProMarca() {
        return proMarca;
    }

    /**
     * Sets the value of the proMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProMarca(String value) {
        this.proMarca = value;
    }

    /**
     * Gets the value of the proMargemAlarme property.
     * 
     */
    public int getProMargemAlarme() {
        return proMargemAlarme;
    }

    /**
     * Sets the value of the proMargemAlarme property.
     * 
     */
    public void setProMargemAlarme(int value) {
        this.proMargemAlarme = value;
    }

    /**
     * Gets the value of the proNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProNome() {
        return proNome;
    }

    /**
     * Sets the value of the proNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProNome(String value) {
        this.proNome = value;
    }

    /**
     * Gets the value of the proPreco property.
     * 
     */
    public double getProPreco() {
        return proPreco;
    }

    /**
     * Sets the value of the proPreco property.
     * 
     */
    public void setProPreco(double value) {
        this.proPreco = value;
    }

    /**
     * Gets the value of the proPreco2 property.
     * 
     */
    public double getProPreco2() {
        return proPreco2;
    }

    /**
     * Sets the value of the proPreco2 property.
     * 
     */
    public void setProPreco2(double value) {
        this.proPreco2 = value;
    }

    /**
     * Gets the value of the proPrecoCompra property.
     * 
     */
    public double getProPrecoCompra() {
        return proPrecoCompra;
    }

    /**
     * Sets the value of the proPrecoCompra property.
     * 
     */
    public void setProPrecoCompra(double value) {
        this.proPrecoCompra = value;
    }

    /**
     * Gets the value of the proSegmento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProSegmento() {
        return proSegmento;
    }

    /**
     * Sets the value of the proSegmento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProSegmento(String value) {
        this.proSegmento = value;
    }

    /**
     * Gets the value of the tamanho property.
     * 
     * @return
     *     possible object is
     *     {@link Tamanho }
     *     
     */
    public Tamanho getTamanho() {
        return tamanho;
    }

    /**
     * Sets the value of the tamanho property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tamanho }
     *     
     */
    public void setTamanho(Tamanho value) {
        this.tamanho = value;
    }

}
