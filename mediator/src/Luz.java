public class Luz extends Componente {
    private boolean ligada;

    public Luz(MediadorCasaInteligente mediador) {
        super(mediador);
        this.ligada = false;
    }

    public void ligar() {
        ligada = true;
        System.out.println("Luz: acesa.");
        mediador.notificar(this, "ligar");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Luz: apagada.");
        mediador.notificar(this, "desligar");
    }

    public boolean isLigada() {
        return ligada;
    }
}
