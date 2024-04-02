package backEnd;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utilidades {

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
}