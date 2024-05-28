public class PetServiceDecorator implements PetService{
    protected PetService decoratedService;

    public PetServiceDecorator(PetService service) {
        this.decoratedService = service;
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedService.getCost();
    }
}
