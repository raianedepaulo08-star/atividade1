public class Main {

    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria("Raiane",100,900);
        ContaBancaria conta2 = new ContaBancaria("Raquelle",900,100);

        conta1.depositar(500);
        conta1.depositar(100);
        conta2.depositar(500);
        conta2.depositar(200);
        System.out.println("Saldo da Raiane: " + conta1.saldo);
        System.out.println("Saldo da Raquelle: " + conta2.saldo);

        conta1.sacar(20);
        conta2.sacar(40);
        System.out.println("Saldo da Raiane: " + conta1.saldo);
        System.out.println("Saldo da Raquelle: " + conta2.saldo);

        conta1.exibirExtrato();
        conta2.exibirExtrato();
    }
}
