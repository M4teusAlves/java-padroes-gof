
public class MediadorCasaInteligenteImpl implements MediadorCasaInteligente {
    private Luz luz;
    private Termostato termostato;
    private Cortinas cortinas;

    public void setLuz(Luz luz) {
        this.luz = luz;
    }

    public void setTermostato(Termostato termostato) {
        this.termostato = termostato;
    }

    public void setCortinas(Cortinas cortinas) {
        this.cortinas = cortinas;
    }

    @Override
    public void notificar(Componente remetente, String evento) {
        if (remetente instanceof Luz && evento.equals("ligar")) {
            System.out.println("MediadorCasaInteligente: Luz acesa, ajustando termostato e cortinas.");
            termostato.ajustarTemperatura();
            cortinas.abrir();
        } else if (remetente instanceof Luz && evento.equals("desligar")) {
            System.out.println("MediadorCasaInteligente: Luz apagada, ajustando termostato e cortinas.");
            termostato.economizarEnergia();
            cortinas.fechar();
        } else if (remetente instanceof Termostato && evento.equals("ajustar")) {
            System.out.println("MediadorCasaInteligente: Termostato ajustado, verificando luzes.");
            if (luz.isLigada()) {
                cortinas.abrir();
            } else {
                cortinas.fechar();
            }
        } else if (remetente instanceof Cortinas && evento.equals("abrir")) {
            System.out.println("MediadorCasaInteligente: Cortinas abertas, verificando luzes e termostato.");
            if (!luz.isLigada()) {
                termostato.ajustarTemperatura();
            }
        }
    }
}

