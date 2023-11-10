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
import com.modelos.InformeRegistros;
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
    
    private static final Font boldFont = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD);
    private static final Font regularFont = new Font(Font.FontFamily.HELVETICA, 9);
    private static final Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
    private static final Font footerFont = new Font(Font.FontFamily.HELVETICA, 8, Font.ITALIC, BaseColor.GRAY);
    
    public static void generarInformePrestamos(ArrayList<InformePrestamos> filas, String detalles) {
        if (filas.isEmpty()) {
            throw new InformeVacioException();
        }

        Document documento = new Document();
        String fechaActual = convertirFechaString(Calendar.getInstance(), true);
        try {
            String ruta = System.getProperty("user.home");
            String tipo = filas.get(0).getTipoInforme();
            String nombreArchivo = tipo + " - " + fechaActual.replace(':', ' ');
            
            validarCarpeta(ruta);
            
            ruta += "/Informes Biblioteca/" + nombreArchivo + ".pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(ruta));

            documento.open();

            String encabezadoFecha = null;
            switch (tipo) {
                case InformePrestamos.PRESTAMOS -> encabezadoFecha = "Fecha prestamo:";
                case InformePrestamos.DEVOLUCIONES -> encabezadoFecha = "Fecha retorno:";
                case InformePrestamos.PENDIENTES -> encabezadoFecha = "Fecha vencimiento:";
            }
            
            String[] encabezados = {"Usuario:", "Cédula:", "Libro:", "Categoria:", encabezadoFecha};
            PdfPTable tabla = new PdfPTable(encabezados.length);
            tabla.setWidthPercentage(90);

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
            documento.add(new Paragraph("\n" + detalles + "\n\n", regularFont));
            documento.add(tabla);
            documento.add(footer);
            documento.close();

            abrirDocumento(ruta);

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void generarInformeRegistros(ArrayList<InformeRegistros> filas, String detalles, String tipo) {
        if (filas.isEmpty()) {
            throw new InformeVacioException();
        }

        Document documento = new Document();
        String fechaActual = convertirFechaString(Calendar.getInstance(), true);
        try {
            String ruta = System.getProperty("user.home");
            String nombreArchivo = tipo + " - " + fechaActual.replace(':', ' ');
            
            validarCarpeta(ruta);
            
            ruta += "/Informes Biblioteca/" + nombreArchivo + ".pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(ruta));

            documento.open();
            
            String[] encabezados = {"Usuario:", "Cédula:", "Detalles:", "Fecha:"};
            int[] relativeWidths = {1, 1, 2, 1};
            PdfPTable tabla = new PdfPTable(encabezados.length);
            tabla.setWidthPercentage(90);
            tabla.setWidths(relativeWidths);

            for (String encabezado : encabezados) {
                tabla.addCell(new Phrase(encabezado, boldFont));
            }

            for (InformeRegistros fila : filas) {
                tabla.addCell(new Phrase(fila.getNombreUsuario(), regularFont));
                tabla.addCell(new Phrase(fila.getCedulaUsuario(), regularFont));
                tabla.addCell(new Phrase(fila.getDetalles(), regularFont));
                tabla.addCell(new Phrase(fila.getFechaRealizacion(), regularFont));
            }

            String title = "Subreporte General:";
            String footerText = "\nCreado el: " + fechaActual;
            Paragraph footer = new Paragraph(footerText, footerFont);
            footer.setAlignment(Paragraph.ALIGN_RIGHT);
            documento.add(new Phrase(title, titleFont));
            documento.add(new Paragraph("\n" + detalles + "\n\n", regularFont));
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

    private static void validarCarpeta(String ruta) {
        File folder = new File(ruta + "/Informes Biblioteca");
        if (!folder.exists()) {
            folder.mkdir();
        }
    }
}
