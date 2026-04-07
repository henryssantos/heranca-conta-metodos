public class Main {
    public static void main(String[] args){

        ContaCorrente cc1 = new ContaCorrente("Henry Santos Reimão",2000,5000);
        ContaCorrente cc2 = new ContaCorrente("Pedro Canuto", 50,100);
        ContaCorrente cc3 = new ContaCorrente("Jesiane Silva",20,200);

        ContaPoupanca cp1 = new ContaPoupanca("Jhonatan",2000,0.05);
        ContaPoupanca cp2 = new ContaPoupanca("Luan",800,0.04);

        System.out.println("=== Conta Corrente 1 ===");
        cc1.exibirInfo();
        System.out.println("Saldo após depósito: "+cc1.depositar(200));
        System.out.println("Saldo após saque: "+cc1.sacar(600));

        System.out.println("\n=== Conta Corrente 2 ===");
        cc2.exibirInfo();
        System.out.println("Saldo após saque: "+cc2.sacar(1200));

        cc3.exibirInfo();
        System.out.println("Saldo após saque:"+cc3.sacar(10));

        System.out.println("\n=== Conta Poupança 1 ===");
        cp1.exibirInfo();
        System.out.println("Saldo após depósito: "+cp1.depositar(100));
        System.out.println("Saldo após saque: "+cp1.sacar(300));

        System.out.println("\n=== Conta Poupança 2 ===");
        cp2.exibirInfo();
        System.out.println("Saldo após saque: "+cp2.sacar(900));
    }
}
