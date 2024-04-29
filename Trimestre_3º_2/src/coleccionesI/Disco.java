package coleccionesI;

// Definición de la clase Disco Ejercicio05
class Disco {
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    // Constructor de la clase Disco
    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Método para representar un objeto Disco como una cadena de texto
    @Override
    public String toString() {
        return "Código: " + codigo + ", Autor: " + autor + ", Título: " + titulo +
                ", Género: " + genero + ", Duración: " + duracion + " minutos";
    }
}