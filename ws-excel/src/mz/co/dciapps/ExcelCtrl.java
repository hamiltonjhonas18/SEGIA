/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.dciapps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author hamil
 */
public class ExcelCtrl {

    public List<String> readExel(String file) {
        List<String> lines = new ArrayList();

        @SuppressWarnings("UnusedAssignment")
        FileInputStream fis = null;
        try {

            File wamp = new File("C:\\wamp64");

            String url = "C:\\wamp64\\www\\suc\\excel\\" + file;

            if (!wamp.exists()) {
                url = "C:\\wamp\\www\\suc\\excel\\" + file;
            }

            File excelFile = new File(url);
            fis = new FileInputStream(excelFile);
            // we get first sheet
            try ( // we create an XSSF Workbook object for our XLSX Excel File
                    XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
                // we get first sheet
                XSSFSheet sheet = workbook.getSheetAt(0);
                // we iterate on rows
                Iterator<Row> rowIt = sheet.iterator();

                int i = 0;

                while (rowIt.hasNext()) {
                    Row row = rowIt.next();

                    if (i > 0) {
                        // iterate on cells for the current row
                        Iterator<Cell> cellIterator = row.cellIterator();

                        String linha = "";
                        while (cellIterator.hasNext()) {
                            Cell cell = cellIterator.next();

                            String str = "N/D";

                            if (cell != null) {
                                if (!cell.toString().isEmpty()) {
                                    str = cell.toString();
                                }
                            }

                            linha += str + ";";
                        }

                        if (!linha.isEmpty()) {
                            linha = linha.substring(0, linha.length() - 1);
                        }

                        lines.add(linha);
                    }
                    i++;
                }
            }
            fis.close();

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

        return lines;
    }
}
