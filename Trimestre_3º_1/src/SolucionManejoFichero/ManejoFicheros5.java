package SolucionManejoFichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManejoFicheros5 {

    public static void main(String[] args) {
        final String nombreArchivo = "datos.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] campos = parsearCSV(linea);
                mostrarCampos(campos);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static String[] parsearCSV(String linea) {
        String[] campos = new String[0];
        String campo = "";
        boolean dentroComillas = false;

        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);

            if (c == '"') {
                dentroComillas = !dentroComillas;
            } else if (c == ',' && !dentroComillas) {
                String[] nuevoArray = new String[campos.length + 1];
                System.arraycopy(campos, 0, nuevoArray, 0, campos.length);
                nuevoArray[campos.length] = campo;
                campos = nuevoArray;
                campo = "";
            } else {
                campo += c;
            }
        }

        String[] nuevoArray = new String[campos.length + 1];
        System.arraycopy(campos, 0, nuevoArray, 0, campos.length);
        nuevoArray[campos.length] = campo;
        campos = nuevoArray;

        return campos;
    }

    private static void mostrarCampos(String[] campos) {
        for (int i = 0; i < campos.length; i++) {
            System.out.print(campos[i] + "\t");
        }
        System.out.println();
    }
}

