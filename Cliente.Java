public class Cliente {
    String nome;
    String CPF;
    Conta Conta = new Conta();
    CartãoDeCrédito  CartãoDeCrédito = new  CartãoDeCrédito();

    public String retornarDados(){
        return "{Nome:" + nome + "--------------- CPF: " + CPF + 
               "}--------------- Cartão de Crédito  " +  CartãoDeCrédito.retornarDados() + 
               "--------------- Conta  " + Conta.retornarDados() ;
    }
}