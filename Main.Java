public class Main {
    public static void main(String[] args) {
        Cliente Cliente = new Cliente();
        for(int i=0;i<12;i++){
            for(int j=0;j<31;j++){
                cliente.conta.extrato[j][i] ="";
            }
        }    
        
        Cliente.conta.depositar(500);
        Cliente.Conta.sacar(200);
        Cliente.Nome = "TrezentosENovetaEUmBerto";
        Cliente.CPF = "255,255,255.25";

        System.out.println(Cliente.Conta.retornarDados());
        System.out.println(Cliente.Conta.gerarExtrato(20));
       

    }
}