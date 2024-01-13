
public class Entrenamiento extends Avion {
    private boolean tieneDobleMando;

    public Entrenamiento(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
        super(idAvion, modAvion, capAvion, piloto);
        this.setTieneDobleMando(tieneDobleMando);
    }

	public boolean isTieneDobleMando() {
		return tieneDobleMando;
	}

	public void setTieneDobleMando(boolean tieneDobleMando) {
		this.tieneDobleMando = tieneDobleMando;
	}

}
