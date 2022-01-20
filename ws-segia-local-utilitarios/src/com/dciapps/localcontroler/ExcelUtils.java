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
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;

/**
 *
 * @author HJC2K8
 */
public class ExcelUtils {

    private Workbook planilha; // objeto que receberá um instancia da planilha estudada
    private Sheet aba; // objeto que será a aba
    private File arquivo; // arquivo .xls que será lido
    private WorkbookSettings workbookSettings;

    public ExcelUtils() {

        try {

            arquivo = new File("C:\\SD\\C2.xls");
            workbookSettings = new WorkbookSettings();
            workbookSettings.setEncoding("ISO-8859-1");
            planilha = Workbook.getWorkbook(arquivo, workbookSettings);
            aba = planilha.getSheet(0); // Pega a segunda linha

        } catch (IOException | BiffException e) {
        }
    }

    public void readContent() {
        /* try {
            Cell[] cel;

           DAOGenerico obj;
            ListaTelefonica lt;
            for (int i = 3; i <= aba.getRows(); i++) {
                cel = aba.getRow(i);

                String cls = "";

                if (!cel[0].getContents().equals("")) {
                    System.out.print("CLIENTE: " + cel[0].getContents());
                    System.out.print("    ");
                    System.out.print("CONTACTO: " + cel[1].getContents());
                    System.out.println();

                    lt = new ListaTelefonica();
                    lt.setLst_categoria("Vestuário");
                    lt.setLst_nome(cel[0].getContents());
                    lt.setLst_telefone(cel[1].getContents());

                    obj = new DAOGenerico(lt);
                    obj.inserir_actualizar();

                    
                    
                     A data funciona também
                     Date date = new Date(cel[1].getContents());
                     System.out.println("Data da data: "+date.toString());
                    
                     
                }
            }

        } catch (IndexOutOfBoundsException e) {

        }*/
    }

}
