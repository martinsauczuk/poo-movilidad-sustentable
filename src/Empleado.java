import java.util.Date;

public class Empleado {

    private String nombre;
    private int legajo;
    private boolean activo;
    private Date fechaDeInicio;
    private MedioTransporte medio;

    public Empleado(String nombre, int legajo, boolean activo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.activo = activo;
        this.fechaDeInicio = new Date();
    }

    public Empleado(String nombre, int legajo, boolean activo, Date fechaDeInicio) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.activo = activo;
        this.fechaDeInicio = fechaDeInicio;
    }

    public MedioTransporte decimeTuMedio() {
        return this.medio;
    }

    public void asignarMedio(MedioTransporte unMedio){
        this.medio = unMedio;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
