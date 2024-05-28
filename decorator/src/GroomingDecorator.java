public class GroomingDecorator extends PetServiceDecorator{
    public GroomingDecorator(PetService service) {
        super(service);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Grooming";
    }

    @Override
    public double getCost() {
        return super.getCost() + 15.0;
    }
}
