package ColeccionesII;

import java.util.ArrayList;
import java.util.Collections;

public class Agenda {
    private ArrayList<Persona> listaPersonas;

    public Agenda() {
        this.listaPersonas = new ArrayList<>();
    }

    public void añadirPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    public void borrarPersona(String dni) {
        for (Persona persona : listaPersonas) {
            if (persona.getDni().equals(dni)) {
                listaPersonas.remove(persona);
                System.out.println("Persona con DNI " + dni + " borrada.");
                return;
            }
        }
        System.out.println("No se encontró ninguna persona con DNI " + dni);
    }

    public void buscarPersona(String dni) {
        for (Persona persona : listaPersonas) {
            if (persona.getDni().equals(dni)) {
                System.out.println(persona);
                return;
            }
        }
        System.out.println("No se encontró ninguna persona con DNI " + dni);
    }

    public void mostrarAgenda() {
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }

    public void ordenarAgenda() {
        Collections.sort(listaPersonas, (p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
    }
}
