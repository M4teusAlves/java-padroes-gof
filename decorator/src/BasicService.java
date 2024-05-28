public class BasicService implements PetService {
    
    @Override
    public String getDescription() {
        return "Basic pet care";
    }

    @Override
    public double getCost() {
        return 20.0;
    }
}
