public class Cortinas extends Componente {

    public Cortinas(MediadorCasaInteligente mediador) {
        super(mediador);
    }

    public void abrir() {
        System.out.println("Cortinas: abertas.");
        mediador.notificar(this, "abrir");
    }

    public void fechar() {
        System.out.println("Cortinas: fechadas.");
    }
}