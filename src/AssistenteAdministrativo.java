public class AssistenteAdministrativo extends Assistente {

    private Turno turno;
    private double adicionalNoturno;

    AssistenteAdministrativo(String _nome, double _salario, int _matricula, Turno _turno, double _adicionalNoturno) {
        super(_nome, _salario, _matricula);
        this.turno = _turno;
        this.adicionalNoturno = _adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        if (this.turno == Turno.NOTURNO) {
            return (this.salario + adicionalNoturno) * 13;
        }
        return super.ganhoAnual();
    }
}