public class Animal {
    private String nome;
    private String raca;

    Animal(String _nome, String _raca) {
        this.nome = _nome;
        this.raca = _raca;
    }

    Animal(String _nome) {
        this.nome = _nome;
    }

    public void caminhar() {
        System.err.println("Caminhando....");
    }
}