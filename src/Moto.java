public class Moto extends Vehiculo {
    //creo una subclase de vehiculo
    private int cilindrada;

    public Moto(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio); //llamo al constructor de la superclase
        this.cilindrada = cilindrada;
    }

    public Moto(String marca){
        super(marca);
    }


    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Moto " + super.getMarca() + " " + super.getModelo() + " " + super.getAnio() + " " + cilindrada);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                "} " + super.toString();
    }
}
