public class Conta {
    private String titular;
    private double saldo;

    public Conta(){}

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirInfo(){
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
    }

    public double depositar(double valor){
        saldo+=valor;
        return saldo;
    }

    public double sacar(double valor){
        saldo-=valor;
        return saldo;
    }
}
