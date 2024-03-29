public class Assistente extends Funcionario {

    private int matricula;

    Assistente(String _nome, double _salario, int _matricula) {
        super(_nome, _salario);
        this.matricula = _matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Nome: %s  Salário: %.2f  Matricula: %d\n", this.nome, this.salario, this.matricula);
    }
}