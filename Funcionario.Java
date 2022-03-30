public class Funcionario {
    String CPF;
    String Nome;
    double salario;
    double valeRefeicao = 550.00;

    public String retornarDados(){
        return "{Nome: " + Nome + " ---------- CPF: " + CPF + " ---------- Salario: " + salario + "}";
    }

    public void aumentarSalario(double porcentagem){
        porcentagem = 1 + (porcentagem/100);
        salario = salario * porcentagem;    
    }

    public void ajustarValeRefeicao(double porcentagem){
        porcentagem = 1 + (porcentagem/100);
        valeRefeicao = valeRefeicao * porcentagem;
    }
}