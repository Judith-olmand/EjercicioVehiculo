public class EjercicioVehiculo {
    public static void main(String[] args) {
        Coche coche = new Coche("Seat", "León", 2017, 5);
        Moto moto = new Moto("Honda", "Hornet", 2007, 600);
        Vehiculo otro = new Moto("Aprilia");

        coche.mostrarInformacion();
        moto.mostrarInformacion();
        otro.mostrarInformacion();

        Coche coche1 = new Coche("Mercedes");
        coche1.mostrarInformacion();
        coche1.setModelo("Viano");
        coche1.setAnio(2005);
        coche1.setNum_puertas(4);
        coche1.mostrarInformacion();

        System.out.println(coche1.toString());

    }
}