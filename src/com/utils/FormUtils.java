package com.utils;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Mateo
 */
public class FormUtils {
    public static void generarInformeObjects(ArrayList<Object> pedidos) {
        Font boldFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        Font regularFont = new Font(Font.FontFamily.HELVETICA, 12);
        Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            ruta += "/OneDrive/.Universidad/4 Semestre/Diseño de Software/Parcial_2/Parcial_2/informes/pedidos.pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(ruta));

            documento.open();

            PdfPTable tabla = new PdfPTable(4);

            tabla.addCell(new Phrase("Id:", boldFont));
            tabla.addCell(new Phrase("Fecha Object:", boldFont));
            tabla.addCell(new Phrase("Total:", boldFont));
            tabla.addCell(new Phrase("Cliente:", boldFont));
            
            for (Object pedido : pedidos) {
//                tabla.addCell(new Phrase(pedido.getId(), regularFont));
//                tabla.addCell(new Phrase(pedido.getFecha(), regularFont));
//                tabla.addCell(new Phrase(pedido.getTotal()+"", regularFont));
//                tabla.addCell(new Phrase(pedido.getCedulaCliente(), regularFont));
            }
            
            documento.add(new Phrase("Objects:", titleFont));
            documento.add(tabla);
            documento.close();
            
            abrirDocumento(ruta);

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            //Manejar Excepciones
        }
    }
    
    private static void abrirDocumento(String ruta) {
        Desktop desktop = Desktop.getDesktop();
        File file = new File(ruta);
        if (file.exists()) try {
            desktop.open(file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
