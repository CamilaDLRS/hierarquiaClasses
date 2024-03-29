public class Cachorro extends Animal {
    
    Cachorro(String _nome, String _raca) {
        super(_nome, _raca);
    }

    public String latir() {
        return "AU AU AU";
    }
}