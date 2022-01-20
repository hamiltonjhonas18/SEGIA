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
import mz.co.centralserver.model.ensino.Sala;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Pessoa;

/**
 *
 * @author 25884
 */
@Entity
@Table(name = "Convocatoria")
public class Convocatoria implements Serializable {

    @Id
    @GeneratedValue
    private int conv_id;

    @Lob
    private String conv_1;

    @Lob
    private String conv_2;

    @Lob
    private String conv_3;

    @Lob
    private String conv_4;

    @Lob
    private String conv_5;

    @Lob
    private String conv_6;

    @Lob
    private String conv_7;

    @Lob
    private String conv_8;

    @Lob
    private String conv_9;

    @Lob
    private String conv_10;

    @Temporal(TemporalType.TIMESTAMP)
    private Date conv_data;

    @Temporal(TemporalType.TIMESTAMP)
    private Date conv_dataReuniao;

    @ManyToOne
    private Sala sala;

    @ManyToOne
    private Pessoa presidente;

    @ManyToOne
    private Pessoa secretario;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Escola escola;
    
    private boolean conv_acta;

    public int getConv_id() {
        return conv_id;
    }

    public void setConv_id(int conv_id) {
        this.conv_id = conv_id;
    }

    public String getConv_1() {
        return conv_1;
    }

    public void setConv_1(String conv_1) {
        this.conv_1 = conv_1;
    }

    public String getConv_2() {
        return conv_2;
    }

    public void setConv_2(String conv_2) {
        this.conv_2 = conv_2;
    }

    public String getConv_3() {
        return conv_3;
    }

    public void setConv_3(String conv_3) {
        this.conv_3 = conv_3;
    }

    public String getConv_4() {
        return conv_4;
    }

    public void setConv_4(String conv_4) {
        this.conv_4 = conv_4;
    }

    public String getConv_5() {
        return conv_5;
    }

    public void setConv_5(String conv_5) {
        this.conv_5 = conv_5;
    }

    public String getConv_6() {
        return conv_6;
    }

    public void setConv_6(String conv_6) {
        this.conv_6 = conv_6;
    }

    public String getConv_7() {
        return conv_7;
    }

    public void setConv_7(String conv_7) {
        this.conv_7 = conv_7;
    }

    public String getConv_8() {
        return conv_8;
    }

    public void setConv_8(String conv_8) {
        this.conv_8 = conv_8;
    }

    public String getConv_9() {
        return conv_9;
    }

    public void setConv_9(String conv_9) {
        this.conv_9 = conv_9;
    }

    public String getConv_10() {
        return conv_10;
    }

    public void setConv_10(String conv_10) {
        this.conv_10 = conv_10;
    }

    public Date getConv_data() {
        return conv_data;
    }

    public void setConv_data(Date conv_data) {
        this.conv_data = conv_data;
    }

    public Date getConv_dataReuniao() {
        return conv_dataReuniao;
    }

    public void setConv_dataReuniao(Date conv_dataReuniao) {
        this.conv_dataReuniao = conv_dataReuniao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Pessoa getPresidente() {
        return presidente;
    }

    public void setPresidente(Pessoa presidente) {
        this.presidente = presidente;
    }

    public Pessoa getSecretario() {
        return secretario;
    }

    public void setSecretario(Pessoa secretario) {
        this.secretario = secretario;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public boolean isConv_acta() {
        return conv_acta;
    }

    public void setConv_acta(boolean conv_acta) {
        this.conv_acta = conv_acta;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
    
    
}
