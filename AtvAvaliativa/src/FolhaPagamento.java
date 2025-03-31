public class FolhaPagamento {
    private String nome;
    private float HorasTrabalhadas;
    private float ValorHora;

    public FolhaPagamento(){
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }
    public void setHorasTrabalhadas(float HorasTrabalhadas) {
        this.HorasTrabalhadas = HorasTrabalhadas;
    }
    public float getValorHora() {
        return ValorHora;
    }
    public void setValorHora(float ValorHora) {
        this.ValorHora = ValorHora;
    }

    float salarioBruto(){
        return HorasTrabalhadas * ValorHora;
    }

    float ir(){
        float salarioBruto = salarioBruto();
        if (salarioBruto <= 1372.81) {
            return 0;
        } else if (salarioBruto <= 2743.25) {
            return salarioBruto * 0.15f;
        } else {
            return salarioBruto * 0.275f;
        }
    }

    float inss(){
        float salarioBruto = salarioBruto();
        if (salarioBruto <= 868.29) {
            return salarioBruto * 0.08f; 
        } else if (salarioBruto <= 1447.14) {
            return salarioBruto * 0.09f; 
        } else if (salarioBruto <= 2894.27) {
            return salarioBruto * 0.11f; 
        } else {
            return 318.37f;         
        }
    }

    float fgts(){
        float salarioBruto = salarioBruto();
        return salarioBruto * 0.08f;
    }

    float salarioLiquido(){
        return salarioBruto() - ir() - inss();
    }

    @Override
    public String toString() {
        String dados =  "Nome: " + nome + "\n" +
                        "Horas Trabalhadas: " + HorasTrabalhadas + "\n" +
                        "Valot Hora: " + ValorHora + "\n" +
                        "Salário Bruto: " + salarioBruto() + "\n" +
                        "IR: " + ir() + "\n" +
                        "INSS: " + inss() + "\n" +
                        "FGTS: " + fgts() + "\n" +
                        "Salário Líquido: " + salarioLiquido() + "\n";
        return dados;

    }
}
