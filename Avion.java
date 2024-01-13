
public class Avion {
    private int idAvion;
    private String modAvion;
    private int capAvion;
    private Piloto piloto;

    public Avion(int idAvion, String modAvion, int capAvion, Piloto piloto) {
        this.idAvion = idAvion;
        this.modAvion = modAvion;
        this.capAvion = capAvion;
        this.piloto = piloto;
    }


    public void mostrarAvion() {
        System.out.println("ID: " + idAvion);
        System.out.println("Modelo: " + modAvion);
        System.out.println("Capacidad: " + capAvion);
        piloto.mostrarPiloto();
    }
}
