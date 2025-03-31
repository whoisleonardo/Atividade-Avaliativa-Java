public class Principal {
    public static void main(String[] args) {

        FolhaPagamento folha = new FolhaPagamento();
        Console console = new Console();

        System.out.println("Informe o nome do funcionário:");
        folha.setNome(console.lerString());

        System.out.println("Informe o número de horas trabalhadas:");
        folha.setHorasTrabalhadas(console.lerFloat());

        System.out.println("Informe o valor da hora: ");
        folha.setValorHora(console.lerFloat());

        System.out.println(folha.toString());
    }
}
