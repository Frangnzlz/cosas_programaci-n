package ColeccionesII;
//Ejercicio 132
import java.util.HashMap;

public class Instituto {
    private HashMap<String, String> alumnosCiudad;

    public Instituto() {
        alumnosCiudad = new HashMap<>();
    }

    public void aniadirAlumno(String nombre, String ciudad) {
        if (!alumnosCiudad.containsKey(nombre)) {
            alumnosCiudad.put(nombre, ciudad);
            System.out.println("Se ha añadido al alumno '" + nombre + "' nacido en '" + ciudad + "'.");
        } else {
            System.out.println("Ya existe un alumno con el nombre '" + nombre + "'. No se ha añadido nada.");
        }
    }

    public void mostrarCiudad(String ciudad) {
        int cantidad = 0;
        for (String nombre : alumnosCiudad.keySet()) {
            if (alumnosCiudad.get(nombre).equals(ciudad)) {
                cantidad++;
            }
        }
        System.out.println("Ciudad: " + ciudad + " - Número de alumnos nacidos: " + cantidad);
    }

    public int cantidadCiudades() {
        return alumnosCiudad.values().size();
    }

    public String mostrarDatos() {
        StringBuilder sb = new StringBuilder();
        for (String nombre : alumnosCiudad.keySet()) {
            sb.append("Nombre: ").append(nombre).append(", Ciudad de nacimiento: ").append(alumnosCiudad.get(nombre)).append("\n");
        }
        return sb.toString();
    }

    public void borrar(String nombre) {
        if (alumnosCiudad.containsKey(nombre)) {
            alumnosCiudad.remove(nombre);
            System.out.println("Se ha eliminado al alumno '" + nombre + "'.");
        } else {
            System.out.println("No existe ningún alumno con el nombre '" + nombre + "'.");
        }
    }

    public void borrar() {
        alumnosCiudad.clear();
        System.out.println("Se han eliminado todos los alumnos del instituto.");
    }

    public String resumen() {
        HashMap<String, Integer> ciudadAlumnos = new HashMap<>();
        for (String ciudad : alumnosCiudad.values()) {
            ciudadAlumnos.put(ciudad, ciudadAlumnos.getOrDefault(ciudad, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (String ciudad : ciudadAlumnos.keySet()) {
            sb.append(ciudad).append(": ").append(ciudadAlumnos.get(ciudad)).append(" alumnos.\n");
        }
        return sb.toString();
    }
}
