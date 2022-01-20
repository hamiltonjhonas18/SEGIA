/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.runntime;

import java.io.IOException;

/**
 *
 * @author HJC2K8
 */
public class Executar {

    public void iniciar(String executavel) {

         try {
            Runtime.getRuntime().exec(executavel);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void terminar(String executavel) {

        try {
            Runtime.getRuntime().exec("taskkill /f /im "+executavel);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
