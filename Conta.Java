import java.util.GregorianCalendar;

public class Conta {
    int numero;
    int dia;
    double saldo;
    double  limite;
    String EF = "";
    String[][] E = new String[31][12];  
    GregorianCalendar c = new GregorianCalendar();

    
    public void sacar(double valor){

        if(valor > saldo){
            System.out.println("Saldo insuficiente!");
        } else{
            saldo = saldo - valor;
            extrato[c.get(c.DAY_OF_MONTH)][((c.get(c.MONTH))+1)] += c.get(c.DAY_OF_MONTH) + "----------" + ((c.get(c.MONTH))+1) + " -> Saque: -R$:" + valor + "\n";
        }    
    }

    public void depositar(double valor){
        saldo = saldo + valor;
        extrato[c.get(gc.DAY_OF_MONTH)] [((c.get(c.MONTH))+1)] += c.get(c.DAY_OF_MONTH) + "----------" + ((c.get(c.MONTH))+1) + " -> Depósito: +R$:" + valor + "\n";
    }

    public double VerificarFatura(){
        return saldo;
    }

    public String retornarDados(){
        return "{Numero conta: " + numero + " | Saldo: " + saldo + " | Limite: " + limite + "}";
    }

    public String gerarExtrato(){  
     int mes = (c.get(c.MONTH)+1);
     int diaextrato = c.get(c.DAY_OF_MONTH);
        for (int i=0;i<7;i++ ){
            if (E[diaextrato - i][mes] != null){
                EF += E[diaextrato - i][mes];
            }  
            if((diaextrato - i) == 1){
                mes = (c.get(c.MONTH));
                diaextrato = 31;
           } 
           if (mes <= 0){
                mes = 12;
           }
        }
        return "Extrado recente é de :" + EF + "Saldo atual  R$:" + S;
    }

    public String gerarExtrato(int dia){
    int mes = (c.get(c.MONTH)+1);
    int diaextrato = c.get(c.DAY_OF_MONTH);
        for (int i=0;i<dia;i++ ){
            if ((extrato[diaextrato - i][mes]) != (null)){
                extratofinal += extrato[diaextrato - i][mes];
            }  
            if((diaextrato - i) == 1){
                mes = (c.get(c.MONTH));
                diaextrato = 32;
            } 
            if (mes < 0){
               mes = 12;
            }
        }
        return "Extrado recente é de  " + dia + " Dias:" + extratofinal + "Saldo atual -> R$:" + saldo;
    }

    public void transferir(Conta destino, double valor){
        this.saldo -= valor;
        destino.saldo += valor;
    }