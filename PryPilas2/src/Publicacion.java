public class Publicacion {
    private int codigo;
    private String titulo;
    private String mensaje;

    public Publicacion(int codigo, String titulo, String mensaje) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.mensaje = mensaje;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Publicacion" +
                "\n\tCodigo: " + codigo +
                "\n\tTitulo='" + titulo +
                "\n\tMensaje='" + mensaje;
    }
}
