package backEnd;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;

public class Utilidades {
    public static final Color VERDE = new Color(33, 99, 00);
    
    public static void cargarLogo(JFrame frame, String nombreImagen) {
        // Obtener la URL de la imagen
        String rutaAbsoluta = "file:///C:/Imagenes/" + nombreImagen;
        URL url;
        try {
            url = new URL(rutaAbsoluta);
            
            // Verificar si la URL no es nula
            if (url != null) {
                // Crear un ImageIcon con la URL
                ImageIcon icono = new ImageIcon(url);

                // Convertir el ImageIcon en Image
                Image image = icono.getImage();

                // Establecer la imagen del ícono de la ventana
                frame.setIconImage(image);
            } else {
                System.err.println("No se pudo cargar la imagen.");
            }
            
        } catch (MalformedURLException ex) {
            System.err.println("No se pudo cargar la imagen.");
        }

    }
    
    public static String fechaHoy() {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        
        // Definir el formato deseado
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        
        // Convertir la fecha en un string con el formato especificado
        String fechaFormateada = fechaActual.format(formato);
        
        return fechaFormateada;
    }
    
    public static void limitarCaracteres(JTextField textField, int limite, String tipo) {
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (validarCadena(fb.getDocument().getText(0, fb.getDocument().getLength()) + string, tipo, limite)) {
                    super.insertString(fb, offset, string, attr);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (validarCadena(fb.getDocument().getText(0, fb.getDocument().getLength()) + text, tipo, limite)) {
                    super.replace(fb, offset, length, text, attrs);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
    }

    private static boolean validarCadena(String cadena, String tipo, int limite) {
        if (tipo.equals("letras")) {
            return cadena.matches("[a-zA-Z ]*") && cadena.length() <= limite;
        } else if (tipo.equals("numeros")) {
            return cadena.matches("\\d*") && cadena.length() <= limite;
        } else if (tipo.equals("fecha")) {
            // Permitir entrada de texto mientras se ingresa una fecha válida parcialmente
            if (cadena.length() > 10) {
                return false;
            }

            try {
                if (cadena.length() >= 5) { // Año completo ingresado
                    Integer.parseInt(cadena.substring(0, 4));
                }
                if (cadena.length() >= 8) { // Mes completo ingresado
                    Integer.parseInt(cadena.substring(5, 7));
                }
                if (cadena.length() == 10) { // Día completo ingresado
                    LocalDate.parse(cadena);
                }
                return true;
            } catch (DateTimeParseException | NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }
    
}