public class Termostato extends Componente {

    public Termostato(MediadorCasaInteligente mediador) {
        super(mediador);
    }

    public void ajustarTemperatura() {
        System.out.println("Termostato: ajustando temperatura.");
        mediador.notificar(this, "ajustar");
    }

    public void economizarEnergia() {
        System.out.println("Termostato: economizando energia.");
    }
}
