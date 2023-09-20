public class ContaBancaria {
    private double saldo;


    public ContaBancaria() {
        this.saldo = 0;
    }

    public void validaVAlorNegatico(double valor) throws Exception {
        if (valor < 0)
            throw new Exception("Valor não pode ser negativo"); 
    }

    public ContaBancaria(double saldo) {

    }

    public ContaBancaria(double saldo, double limiteChequeEspecial) {

    }

    public void depositar(double valor) throws Exception{
        validaVAlorNegatico(valor);
        this.saldo += valor;

    }

    public void sacar(double valor) {
        this.saldo 

    }

    public double getSaldo() {
        return 0;
    }

    public double getLimiteChequeEspecial() {
        return 0;
    }
}
