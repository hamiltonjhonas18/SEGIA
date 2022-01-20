/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.ip;

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
import mz.co.centralserver.model.ensino.Escola;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author 25884
 */
@Entity
@Table(name = "Acta")
public class Acta implements Serializable {

    @Id
    @GeneratedValue
    private int acta_id;

    @Lob
    private String acta_descricao;

    private String acta_referencia;

    @Temporal(TemporalType.TIMESTAMP)
    private Date acta_data;

    @ManyToOne
    private Convocatoria convocatoria;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Escola escola;

    public int getActa_id() {
        return acta_id;
    }

    public void setActa_id(int acta_id) {
        this.acta_id = acta_id;
    }

    public String getActa_descricao() {
        return acta_descricao;
    }

    public void setActa_descricao(String acta_descricao) {
        this.acta_descricao = acta_descricao;
    }

    public String getActa_referencia() {
        return acta_referencia;
    }

    public void setActa_referencia(String acta_referencia) {
        this.acta_referencia = acta_referencia;
    }

    public Date getActa_data() {
        return acta_data;
    }

    public void setActa_data(Date acta_data) {
        this.acta_data = acta_data;
    }

    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(Convocatoria convocatoria) {
        this.convocatoria = convocatoria;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
    
    
}
