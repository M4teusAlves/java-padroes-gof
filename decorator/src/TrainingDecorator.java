public class TrainingDecorator extends PetServiceDecorator{
    public TrainingDecorator(PetService service) {
        super(service);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Training";
    }

    @Override
    public double getCost() {
        return super.getCost() + 30.0;
    }
}
