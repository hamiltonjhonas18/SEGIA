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

/**
 *
 * @author hamil
 */
import java.io.FileOutputStream;
import com.itextpdf.text.Chunk;

import com.itextpdf.text.Document;

import com.itextpdf.text.Image;

import com.itextpdf.text.PageSize;

import com.itextpdf.text.Paragraph;

import com.itextpdf.text.Phrase;

import com.itextpdf.text.pdf.BarcodeEAN;

import com.itextpdf.text.pdf.PdfContentByte;

import com.itextpdf.text.pdf.PdfWriter;

public class BarcodeGen {

    @SuppressWarnings("static-access")

    public static void main(String args[]) {

        System.out.println("Barcode Linha de Código ");

// criando um objeto da classe Document
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);

        try {

            //Aqui começamos a utilizar as classes do iText: o documento
            //criado acima será
//direcionado para um arquivo PDF.
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("E://Codigo_Barra_Java_Linha_Codigo_2.pdf"));

//abrindo o documento.
            document.open();

//adicionando um novo paragrafo.
            document.add(new Paragraph("CÓDIGOS DE BARRA"));

            document.add(new Paragraph(" "));

            document.add(new Paragraph(" "));

            //Comecando a configurar o cod de barras
            PdfContentByte cb = writer.getDirectContent();

            BarcodeEAN codeEAN = new BarcodeEAN();

            //O iText suporta os principais tipos de código de barra, como Barcode39,
//  Barcode128 (128, 128_UCC, 128_RAW),  BarcodeEAN (EAN13, EAN8, UPCA, UPCE), EANSUP, etc
            codeEAN.setCodeType(codeEAN.EAN13);

            String cod = "DCI-GO002";

            String value = "";
            for (int i = 0; i < cod.length(); i++) {

                char c = cod.charAt(i);

                if (c == '-') {
                    c = '0';
                }

                value += Character.getNumericValue(c);

            }

            if (value.length() > 13) {
                value = value.substring(0, 13);
            }

            System.err.println(value);

            codeEAN.setCode(value);

            Image imageEAN = codeEAN.createImageWithBarcode(cb, null, null);

            document.add(new Phrase(new Chunk(imageEAN, 0, 0)));

        } catch (Exception de) {
            de.printStackTrace();

        }
        document.close();

    }
}
