import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("\n------------------------------EXERCICIO 1--------------------------------\n");

        criarFuncionarioGenerico();

        System.out.println("\n-------------------------------------------------------------------------\n");

        criarFuncionarioAssistente();

        System.out.println("\n-------------------------------------------------------------------------\n");

        criarFuncionarioAssistenteTecnico();

        System.out.println("\n\n------------------------------EXERCICIO 2--------------------------------\n");

        criarAnimalGenerico();

        System.out.println("\n-------------------------------------------------------------------------\n");

        criarCachorro();

        System.out.println("\n-------------------------------------------------------------------------\n");

        criarGato();

        scanner.close();
    }

    public static void criarFuncionarioGenerico() {
        System.out.println("Criando funcionário genérico...");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        Funcionario funcionarioEx = new Funcionario(nome, salario);
        mostrarFuncoesGenericasFuncionarios(funcionarioEx);
    }

    public static void mostrarFuncoesGenericasFuncionarios(Funcionario funcionario) {
        double ganhoAnual = funcionario.ganhoAnual();
        funcionario.exibirDados();
        System.out.printf("Ganho anual %.2f\n", ganhoAnual);

        System.out.println("Procesando aumento...");
        System.out.print("Valor aumento: ");
        double aumento = scanner.nextDouble();
        funcionario.addAumento(aumento);

        ganhoAnual = funcionario.ganhoAnual();
        funcionario.exibirDados();
        System.out.printf("Ganho anual %.2f\n", ganhoAnual);
    }

    public static void criarFuncionarioAssistente() {
        System.out.println("Criando funcionário assistente...");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Matricula: ");
        int matricula = scanner.nextInt();

        Assistente assistenteEx = new Assistente(nome, salario, matricula);
        mostrarFuncoesGenericasFuncionarios(assistenteEx);
    }

    public static void criarFuncionarioAssistenteTecnico() {
        System.out.println("Criando funcionário assistente técnico...");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Bônus salarial: ");
        double bonusSalarial = scanner.nextDouble();

        System.out.print("Matricula: ");
        int matricula = scanner.nextInt();

        AssistenteTecnico assistenteTecnicoEx = new AssistenteTecnico(nome, salario, matricula, bonusSalarial);
        mostrarFuncoesGenericasFuncionarios(assistenteTecnicoEx);
    }

    public static void criarFuncionarioAssistenteAdministrativo() {
        System.out.println("Criando funcionário assistente administrativo...");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Turno (1 para DIURNO , 2 para NOTURNO): ");
        Turno turno;
        double adicionalNoturno = 0;
        if (scanner.nextInt() == 1) {
            turno = Turno.DIURNO;
        } else if (scanner.nextInt() == 2) {
            turno = Turno.NOTURNO;

            System.out.print("Adicional noturmo: ");
            adicionalNoturno = scanner.nextDouble();
        } else {
            System.err.println("Turno inválido");
            return;
        }

        System.out.print("Matricula: ");
        int matricula = scanner.nextInt();

        AssistenteAdministrativo assistenteAdministrativoEx = new AssistenteAdministrativo(nome, salario, matricula,
                turno, adicionalNoturno);
        mostrarFuncoesGenericasFuncionarios(assistenteAdministrativoEx);
    }

    public static void criarAnimalGenerico() {
        System.out.println("Criando animal genérico...");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Raça: ");
        String raca = scanner.next();

        Animal animalEx = new Animal(nome, raca);
        animalEx.caminhar();
    }

    public static void criarCachorro() {
        System.out.println("Criando Cachorro...");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Raça: ");
        String raca = scanner.next();

        Cachorro cachorroEx = new Cachorro(nome, raca);
        cachorroEx.caminhar();
        System.out.println("Som: " + cachorroEx.latir());
    }
    
    public static void criarGato() {
        System.out.println("Criando Gato...");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Raça: ");
        String raca = scanner.next();

        Gato gatoEx = new Gato(nome, raca);
        gatoEx.caminhar();
        System.out.println("Som: " + gatoEx.miar());
    }
}
