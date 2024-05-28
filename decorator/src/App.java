public class App {
    public static void main(String[] args) {
        // Criando um serviço básico de cuidados para pets
        PetService service = new BasicService();
        System.out.println(service.getDescription() + " custa " + service.getCost());

        // Adicionando serviço de grooming
        service = new GroomingDecorator(service);
        System.out.println(service.getDescription() + " custa " + service.getCost());

        // Adicionando serviço de treinamento
        service = new TrainingDecorator(service);
        System.out.println(service.getDescription() + " custa " + service.getCost());
    }
}
