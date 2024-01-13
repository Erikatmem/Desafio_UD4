
public class Piloto {
    private int idPiloto;
    private String nomPiloto;
    private int horasVueloPiloto;
    private String rangoPiloto;

    public Piloto(int idPiloto, String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
        this.idPiloto = idPiloto;
        this.nomPiloto = nomPiloto;
        this.horasVueloPiloto = horasVueloPiloto;
        this.rangoPiloto = rangoPiloto;
    }


    public void mostrarPiloto() {
        System.out.println("ID: " + idPiloto);
        System.out.println("Nombre: " + nomPiloto);
        System.out.println("Horas de vuelo: " + horasVueloPiloto);
        System.out.println("Rango: " + rangoPiloto);
    }
}



