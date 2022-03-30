public class CartãoDeCrédito {
    int numero;
    double TFatura;

    public double VerificarFatura(){
        return TFatura;
    }
    
    public String retornarDados(){
        return "{Número cartão: " + numero + "-------------------------------  Valor fatura: " + totalFatura + "}";
    }
