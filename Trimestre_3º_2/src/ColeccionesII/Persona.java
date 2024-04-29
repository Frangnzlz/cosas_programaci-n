package ColeccionesII;
// Clase Persona Ejercicio 126
public class Persona implements Comparable<Persona>{
    private String dni;
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private double peso;

    // Constructor con todos los argumentos
    public Persona(String dni, String nombre, String apellido, char sexo, int edad, double peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    // Constructor con solo DNI
    public Persona(String dni) {
        this(dni, "", "", ' ', 0, 0.0);
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getters y Setters
    // Aquí debes implementar los getters y setters para cada atributo
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }

    // Método equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni.equals(persona.dni);
    }

    
    @Override
    public int compareTo(Persona otraPersona) {
        return this.apellido.compareTo(otraPersona.apellido);
    }
}

