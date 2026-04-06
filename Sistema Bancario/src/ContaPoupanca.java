public class ContaPoupanca extends Conta{
    private double rendimento;

    public ContaPoupanca(String titular, double saldo, double rendimento) {
        super(titular, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
            System.out.println("Rendimento: "+rendimento);
    }

    @Override
    public double sacar(double valor){
        if(valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
        }
        return getSaldo();
    }

}
