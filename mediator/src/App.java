public class App {
    public static void main(String[] args) throws Exception {
        MediadorCasaInteligenteImpl mediador = new MediadorCasaInteligenteImpl();

        Luz luz = new Luz(mediador);
        Termostato termostato = new Termostato(mediador);
        Cortinas cortinas = new Cortinas(mediador);

        mediador.setLuz(luz);
        mediador.setTermostato(termostato);
        mediador.setCortinas(cortinas);

        luz.ligar();  // Simula acender a luz
        luz.desligar();  // Simula apagar a luz
        termostato.ajustarTemperatura();  // Simula ajustar a temperatura
        cortinas.abrir();  // Simula abrir as cortinas
    }
}
