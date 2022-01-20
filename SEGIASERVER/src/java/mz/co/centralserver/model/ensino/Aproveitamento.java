/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.ensino;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 25884
 */
@Entity
@Table(name="aproveitamento")
public class Aproveitamento implements Serializable {
 
    @Id
    @GeneratedValue
    private int apro_id;
    
    private String apro_categoria;
    
    private String apro_ano;
    
    private int apro_admitidos;
    private int apro_excluidos;
    private int apro_exames;
    private int apro_dispensados;
    private int apro_reprovados;

    private String cod_escola;

    public int getApro_id() {
        return apro_id;
    }

    public void setApro_id(int apro_id) {
        this.apro_id = apro_id;
    }

    public String getApro_categoria() {
        return apro_categoria;
    }

    public void setApro_categoria(String apro_categoria) {
        this.apro_categoria = apro_categoria;
    }

    public String getApro_ano() {
        return apro_ano;
    }

    public void setApro_ano(String apro_ano) {
        this.apro_ano = apro_ano;
    }

    public int getApro_admitidos() {
        return apro_admitidos;
    }

    public void setApro_admitidos(int apro_admitidos) {
        this.apro_admitidos = apro_admitidos;
    }

    public int getApro_excluidos() {
        return apro_excluidos;
    }

    public void setApro_excluidos(int apro_excluidos) {
        this.apro_excluidos = apro_excluidos;
    }

    public int getApro_exames() {
        return apro_exames;
    }

    public void setApro_exames(int apro_exames) {
        this.apro_exames = apro_exames;
    }

    public int getApro_dispensados() {
        return apro_dispensados;
    }

    public void setApro_dispensados(int apro_dispensados) {
        this.apro_dispensados = apro_dispensados;
    }

    public int getApro_reprovados() {
        return apro_reprovados;
    }

    public void setApro_reprovados(int apro_reprovados) {
        this.apro_reprovados = apro_reprovados;
    }

    public String getCod_escola() {
        return cod_escola;
    }

    public void setCod_escola(String cod_escola) {
        this.cod_escola = cod_escola;
    }
   
}
