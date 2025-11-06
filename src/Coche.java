public class Coche extends Vehiculo {
    //creo una subclase de vehiculo
    private int num_puertas;

    public Coche(String marca, String modelo, int anio, int num_puertas) {
        super(marca, modelo, anio); //llamo al constructor de la superclase
        this.num_puertas = num_puertas;
    }

    public Coche(String marca) {
        super(marca);
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Coche " + super.getMarca() + " " + super.getModelo() + " " + super.getAnio() + " " + num_puertas);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "num_puertas=" + num_puertas +
                "} " + super.toString();
    }
}
