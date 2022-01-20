/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.documento;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Cliente;

/**
 *
 * @author Hamilton Jhonas
 */
@Entity
@Table(name = "documento")
public class Ficheiro implements Serializable {

    @Id
    @GeneratedValue
    private int fich_id;

    @Lob
    private String fich_descricao;

    @Lob
    private String fich_detalhes;

    private String fich_periodo;

    @Lob
    private String fich_link;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fich_datacricao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fich_dataupload;

    private long fich_tamanho;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Cliente cliente;

    private boolean encrypted;

    public int getFich_id() {
        return fich_id;
    }

    public void setFich_id(int fich_id) {
        this.fich_id = fich_id;
    }

    public String getFich_descricao() {
        return fich_descricao;
    }

    public void setFich_descricao(String fich_descricao) {
        this.fich_descricao = fich_descricao;
    }

    public String getFich_detalhes() {
        return fich_detalhes;
    }

    public void setFich_detalhes(String fich_detalhes) {
        this.fich_detalhes = fich_detalhes;
    }

    public String getFich_periodo() {
        return fich_periodo;
    }

    public void setFich_periodo(String fich_periodo) {
        this.fich_periodo = fich_periodo;
    }

    public String getFich_link() {
        return fich_link;
    }

    public void setFich_link(String fich_link) {
        this.fich_link = fich_link;
    }

    public Date getFich_datacricao() {
        return fich_datacricao;
    }

    public void setFich_datacricao(Date fich_datacricao) {
        this.fich_datacricao = fich_datacricao;
    }

    public Date getFich_dataupload() {
        return fich_dataupload;
    }

    public void setFich_dataupload(Date fich_dataupload) {
        this.fich_dataupload = fich_dataupload;
    }

    public long getFich_tamanho() {
        return fich_tamanho;
    }

    public void setFich_tamanho(long fich_tamanho) {
        this.fich_tamanho = fich_tamanho;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    
}
