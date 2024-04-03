public class Beneficio {

    private String descripcion;

    public String devolverDescripcion() {
        return this.descripcion;
    }

    public void cargarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Soy un beneficio " + descripcion;
    }
}
