public class AssistenteTecnico extends Assistente {

    private double bonusSalarial;

    AssistenteTecnico(String _nome, double _salario, int _matricula, double _bonusSalarial) {
        super(_nome, _salario, _matricula);
        this.bonusSalarial = _bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return (this.salario + bonusSalarial) * 13;
    }
}