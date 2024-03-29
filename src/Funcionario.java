public class Funcionario {
    
    protected String nome;
    protected double salario;

    Funcionario(String _nome, double _salario) {
        this.nome =_nome;
        this.salario =_salario;
    }

    public boolean addAumento(double valor) {

        if (valor >= 0) {
            this.salario += valor;
            return true;
        }
        return false;
    }

    public double ganhoAnual() {
        return this.salario * 13;
    }

    public void exibirDados() {
        System.out.printf("Nome: %s  Salário: %.2f\n", this.nome, this.salario);
    }
}
