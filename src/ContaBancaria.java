public class ContaBancaria {
    String titular;
    int numero;
    double saldo;
    public ContaBancaria(String titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
      public void depositar(double valor){
        saldo = saldo + valor;
      }
      public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente");
        }else {
            saldo = saldo - valor;
        }
        }
        public void exibirExtrato(){
              System.out.println("Titular :" + titular);
              System.out.println("Número :" + numero);
              System.out.println(" Saldo :" + saldo);
          }

    }

