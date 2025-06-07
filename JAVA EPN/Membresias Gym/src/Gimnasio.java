//Este es el Gimnasio

public class Gimnasio {
    public static void main(String[] args) {
        // 1. membresía normal anual
        Membresia miembroNormal = new MembresiaNormal("Ana Torres", "anual", 12);

        System.out.println("===========================================");
        miembroNormal.mostrarInformacion();
        miembroNormal.mostrarOfertasEspeciales();
        System.out.println("===========================================\n");

        //  membresía premium mensual con todos los servicios
        Membresia miembroPremium = new MembresiaPremium("Carlos Vera", "mensual", 10, true, false);

        System.out.println("===========================================");
        miembroPremium.mostrarInformacion();
        miembroPremium.mostrarOfertasEspeciales();
        System.out.println("===========================================");
    }
}