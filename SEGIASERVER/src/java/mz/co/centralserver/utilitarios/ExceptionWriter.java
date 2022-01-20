/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.utilitarios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HJC2K8
 */
public class ExceptionWriter {

    public void writeToFile(String datetime,String msg) {

        String nomeFicheiro = "\\\\APPSERVER\\exceptions\\" + datetime+ ".txt";

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(nomeFicheiro));

            bw.write(msg);
            bw.close();
        } catch (IOException ioe) {

        }
    }

}
