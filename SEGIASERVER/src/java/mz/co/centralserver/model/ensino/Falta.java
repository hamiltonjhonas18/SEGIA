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
@Table(name = "falta")
public class Falta implements Serializable {

    @Id
    @GeneratedValue
    private int falt_id;

    private String falt_ano;

    private int falt_01;
    private int falt_02;
    private int falt_03;
    private int falt_04;
    private int falt_05;
    private int falt_06;
    private int falt_07;
    private int falt_08;
    private int falt_09;
    private int falt_10;
    private int falt_11;
    private int falt_12;

    private int falt_j_01;
    private int falt_j_02;
    private int falt_j_03;
    private int falt_j_04;
    private int falt_j_05;
    private int falt_j_06;
    private int falt_j_07;
    private int falt_j_08;
    private int falt_j_09;
    private int falt_j_10;
    private int falt_j_11;
    private int falt_j_12;

    private String cod_escola;

    public int getFalt_id() {
        return falt_id;
    }

    public void setFalt_id(int falt_id) {
        this.falt_id = falt_id;
    }

    public String getFalt_ano() {
        return falt_ano;
    }

    public void setFalt_ano(String falt_ano) {
        this.falt_ano = falt_ano;
    }

    public int getFalt_01() {
        return falt_01;
    }

    public void setFalt_01(int falt_01) {
        this.falt_01 = falt_01;
    }

    public int getFalt_02() {
        return falt_02;
    }

    public void setFalt_02(int falt_02) {
        this.falt_02 = falt_02;
    }

    public int getFalt_03() {
        return falt_03;
    }

    public void setFalt_03(int falt_03) {
        this.falt_03 = falt_03;
    }

    public int getFalt_04() {
        return falt_04;
    }

    public void setFalt_04(int falt_04) {
        this.falt_04 = falt_04;
    }

    public int getFalt_05() {
        return falt_05;
    }

    public void setFalt_05(int falt_05) {
        this.falt_05 = falt_05;
    }

    public int getFalt_06() {
        return falt_06;
    }

    public void setFalt_06(int falt_06) {
        this.falt_06 = falt_06;
    }

    public int getFalt_07() {
        return falt_07;
    }

    public void setFalt_07(int falt_07) {
        this.falt_07 = falt_07;
    }

    public int getFalt_08() {
        return falt_08;
    }

    public void setFalt_08(int falt_08) {
        this.falt_08 = falt_08;
    }

    public int getFalt_09() {
        return falt_09;
    }

    public void setFalt_09(int falt_09) {
        this.falt_09 = falt_09;
    }

    public int getFalt_10() {
        return falt_10;
    }

    public void setFalt_10(int falt_10) {
        this.falt_10 = falt_10;
    }

    public int getFalt_11() {
        return falt_11;
    }

    public void setFalt_11(int falt_11) {
        this.falt_11 = falt_11;
    }

    public int getFalt_12() {
        return falt_12;
    }

    public void setFalt_12(int falt_12) {
        this.falt_12 = falt_12;
    }

    public int getFalt_j_01() {
        return falt_j_01;
    }

    public void setFalt_j_01(int falt_j_01) {
        this.falt_j_01 = falt_j_01;
    }

    public int getFalt_j_02() {
        return falt_j_02;
    }

    public void setFalt_j_02(int falt_j_02) {
        this.falt_j_02 = falt_j_02;
    }

    public int getFalt_j_03() {
        return falt_j_03;
    }

    public void setFalt_j_03(int falt_j_03) {
        this.falt_j_03 = falt_j_03;
    }

    public int getFalt_j_04() {
        return falt_j_04;
    }

    public void setFalt_j_04(int falt_j_04) {
        this.falt_j_04 = falt_j_04;
    }

    public int getFalt_j_05() {
        return falt_j_05;
    }

    public void setFalt_j_05(int falt_j_05) {
        this.falt_j_05 = falt_j_05;
    }

    public int getFalt_j_06() {
        return falt_j_06;
    }

    public void setFalt_j_06(int falt_j_06) {
        this.falt_j_06 = falt_j_06;
    }

    public int getFalt_j_07() {
        return falt_j_07;
    }

    public void setFalt_j_07(int falt_j_07) {
        this.falt_j_07 = falt_j_07;
    }

    public int getFalt_j_08() {
        return falt_j_08;
    }

    public void setFalt_j_08(int falt_j_08) {
        this.falt_j_08 = falt_j_08;
    }

    public int getFalt_j_09() {
        return falt_j_09;
    }

    public void setFalt_j_09(int falt_j_09) {
        this.falt_j_09 = falt_j_09;
    }

    public int getFalt_j_10() {
        return falt_j_10;
    }

    public void setFalt_j_10(int falt_j_10) {
        this.falt_j_10 = falt_j_10;
    }

    public int getFalt_j_11() {
        return falt_j_11;
    }

    public void setFalt_j_11(int falt_j_11) {
        this.falt_j_11 = falt_j_11;
    }

    public int getFalt_j_12() {
        return falt_j_12;
    }

    public void setFalt_j_12(int falt_j_12) {
        this.falt_j_12 = falt_j_12;
    }

    public String getCod_escola() {
        return cod_escola;
    }

    public void setCod_escola(String cod_escola) {
        this.cod_escola = cod_escola;
    }
}
