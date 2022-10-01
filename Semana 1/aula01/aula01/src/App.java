public class App {
    // assinatura do método
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ContaCorrente conta01 = new ContaCorrente();
        conta01.numeroAgencia = 001;
        conta01.setNumeroConta(123);
        conta01.nomeCliente = "Felipe";

        System.out.println(conta01.getNumeroConta());
    }
}
