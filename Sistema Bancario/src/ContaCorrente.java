public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Limite: "+limite);
    }

    @Override
    public double sacar(double valor){
        if(valor <= getSaldo() +limite ){
            setSaldo(getSaldo() - valor);
        }
        return getSaldo();
    }

}
