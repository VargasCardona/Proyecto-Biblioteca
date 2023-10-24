package com.utils;

import com.excepciones.InformeVacioException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.modelos.InformePrestamos;
import static com.utils.GeneralUtils.convertirFechaString;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class FormUtils {
    
    public static void generarInformePrestamos(ArrayList<InformePrestamos> filas) {
        if (filas.isEmpty()) {
            throw new InformeVacioException();
        }
        
        Font boldFont = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
        Font regularFont = new Font(Font.FontFamily.HELVETICA, 9);
        Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
        Font footerFont = new Font(Font.FontFamily.HELVETICA, 8, Font.ITALIC, BaseColor.GRAY);
        Document documento = new Document();
        String fechaActual = convertirFechaString(Calendar.getInstance(), true);
        try {
            String ruta = System.getProperty("user.home");
            String tipo = filas.get(0).getTipoInforme();
            String nombreArchivo = tipo + " - " + fechaActual.replace(':', ' ');
            File folder = new File(ruta + "/Informes Biblioteca");
            if (!folder.exists()) {
                folder.mkdir();
            }
            ruta += "/Informes Biblioteca/"+nombreArchivo+".pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(ruta));

            documento.open();

            int endIndex = tipo.equals(InformePrestamos.PRESTAMOS) ? tipo.length()-1 : tipo.length()-2;
            String[] encabezados = {"Usuario:", "Cédula:", "Libro:", "Categoria", "Fecha "+tipo.substring(0, endIndex).replace("io", "ió")+":"};
            PdfPTable tabla = new PdfPTable(encabezados.length);
          
            for (String encabezado : encabezados) {
                tabla.addCell(new Phrase(encabezado, boldFont));
            }
            
            for (InformePrestamos fila : filas) {
                tabla.addCell(new Phrase(fila.getNombreUsuario(), regularFont));
                tabla.addCell(new Phrase(fila.getCedulaUsuario(), regularFont));
                tabla.addCell(new Phrase(fila.getTituloLibro(), regularFont));
                tabla.addCell(new Phrase(fila.getCategoriaLibro(), regularFont));
                tabla.addCell(new Phrase(fila.getFecha(), regularFont));
            }
            
            String title = tipo + ":";
            String footerText = "\nCreado el: " + fechaActual;
            Paragraph footer = new Paragraph(footerText, footerFont);
            footer.setAlignment(Paragraph.ALIGN_RIGHT);
            documento.add(new Phrase(title, titleFont));
            documento.add(tabla);
            documento.add(footer);
            documento.close();
            
            abrirDocumento(ruta);

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            e.printStackTrace();
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
