public abstract class Componente {
    protected MediadorCasaInteligente mediador;

    public Componente(MediadorCasaInteligente mediador) {
        this.mediador = mediador;
    }

    public void setMediador(MediadorCasaInteligente mediador) {
        this.mediador = mediador;
    }
}
