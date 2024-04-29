package ColeccionesII;

import java.util.HashMap;

public class ARAS {
    private HashMap<String, String> diccionario;

    public ARAS() {
        diccionario = new HashMap<>();
    }

    public void borrar(String clave) {
        if (diccionario.containsKey(clave)) {
            diccionario.remove(clave);
            System.out.println("Se ha eliminado la entrada con clave '" + clave + "'.");
        } else {
            System.out.println("No existe ninguna entrada con la clave '" + clave + "'.");
        }
    }

    public void meter(String clave, String valor) {
        if (!diccionario.containsKey(clave)) {
            diccionario.put(clave, valor);
            System.out.println("Se ha añadido la entrada con clave '" + clave + "' y valor '" + valor + "'.");
        } else {
            System.out.println("Ya existe una entrada con la clave '" + clave + "'. No se ha añadido nada.");
        }
    }

    public void actualizar(String clave, String valor) {
        if (diccionario.containsKey(clave)) {
            diccionario.put(clave, valor);
            System.out.println("Se ha actualizado la entrada con clave '" + clave + "' y valor '" + valor + "'.");
        } else {
            System.out.println("No existe ninguna entrada con la clave '" + clave + "'. No se ha actualizado nada.");
        }
    }

    public boolean existeClave(String clave) {
        return diccionario.containsKey(clave);
    }

    public boolean existeValor(String valor) {
        return diccionario.containsValue(valor);
    }

    public String primerValor(String valor) {
        for (String clave : diccionario.keySet()) {
            if (diccionario.get(clave).equals(valor)) {
                return clave;
            }
        }
        /*. return "undefined"; se ejecuta cuando no se encuentra ninguna clave asociada al valor proporcionado como argumento. 
            En lugar de devolver null o lanzar una excepción, devuelve la cadena de texto "undefined" para indicar que no se encontró 
        ninguna  clave para el valor dado*/
        return "undefined";
    }

    public void mostrar() {
        System.out.println("Contenido del diccionario:");
        for (String clave : diccionario.keySet()) {
            System.out.println("Clave: " + clave + "  Valor: " + diccionario.get(clave));
        }
    }
}

