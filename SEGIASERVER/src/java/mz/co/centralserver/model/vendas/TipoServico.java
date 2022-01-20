/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.vendas;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="TipoServico")
public class TipoServico implements Serializable {
    
    @Id
    @GeneratedValue
    private int tps_id;
    
    private String tps_descricao;
    
    private boolean tps_igonoraTonelagem;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getTps_id() {
        return tps_id;
    }

    public void setTps_id(int tps_id) {
        this.tps_id = tps_id;
    }

    public String getTps_descricao() {
        return tps_descricao;
    }

    public void setTps_descricao(String tps_descricao) {
        this.tps_descricao = tps_descricao;
    }

    public boolean isTps_igonoraTonelagem() {
        return tps_igonoraTonelagem;
    }

    public void setTps_igonoraTonelagem(boolean tps_igonoraTonelagem) {
        this.tps_igonoraTonelagem = tps_igonoraTonelagem;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

}
