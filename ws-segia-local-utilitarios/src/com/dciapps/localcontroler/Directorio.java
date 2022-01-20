/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.localcontroler;

import java.io.File;

/**
 *
 * @author HJC2K8
 */
public class Directorio {

    // Cria o diretório. Todos os diretórios e subdiretórios devem existir
    public void criarSubExistentes(String nomeDir) {

        boolean success = (new File(nomeDir)).mkdir();
        if (!success) {

            System.out.println("Falha no momento de criar o diretório");
        } else {
            System.out.println("Diretório cridado com sucesso");
        }
    }

    // Cria o diretorio. Todos os diretórios e subdiretórios são          
    // criados automaticamente
    public void criarComSubs(String nomeDir) {

        boolean success = (new File(nomeDir)).mkdirs();

        if (!success) {

            System.out.println("Falha no momento de criar o diretório");
        } else {
            System.out.println("Diretório cridado com sucesso");
        }
    }

}
