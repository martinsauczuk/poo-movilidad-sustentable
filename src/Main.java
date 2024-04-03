import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Medios de transporte
        MedioTransporte colectivo = new MedioTransporte();
        MedioTransporte auto = new MedioTransporte();
        MedioTransporte monopatinElectrico = new MedioTransporte();
        MedioTransporte moto = new MedioTransporte();

        // Beneficios
        Beneficio subeX30K = new Beneficio();
        subeX30K.cargarDescripcion("Soy una carga de SUBE por 30000 ARS");
        Beneficio naftaX20K = new Beneficio();
        naftaX20K.cargarDescripcion("Soy un voucher de combustible por 20000ARS");
        Beneficio kitSeguridad = new Beneficio();
        kitSeguridad.cargarDescripcion("Soy un kit de seguridad");
        Beneficio nada = new Beneficio();
        nada.cargarDescripcion("No te vamos a dar nada");

        // Asignar beneficios a medios
        colectivo.setBeneficioAsignado(subeX30K);
        auto.setBeneficioAsignado(nada);
        monopatinElectrico.setBeneficioAsignado(kitSeguridad);
        moto.setBeneficioAsignado(nada);

        // Empleados
        Empleado fede = new Empleado("Martin Pablo", 234, true );
        fede.asignarMedio( colectivo );
        fede.asignarMedio( moto );

        Empleado nuevo = new Empleado("Un nombre", 23, true, new Date());


        System.out.println("Al empleado fede le corresponde " + fede.decimeTuMedio().getBeneficioAsignado());






    }
}