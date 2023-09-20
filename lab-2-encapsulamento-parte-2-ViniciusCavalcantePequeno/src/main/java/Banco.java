package ;

public class Banco {
    public ContaBancaria conta1;
    public ContaBancaria conta2;
    public double deposito;

    public Banco(ContaBancaria conta1, ContaBancaria conta2) {
        this.conta1 = conta1;
        this.conta2 = conta2;
    }

    public ContaBancaria getConta1() {
        return conta1;
    }

    public void setConta1(ContaBancaria conta1) {
        this.conta1 = conta1;
    }

    public void depositar(int numeroConta, double valor) throw Exception {
        if (numeroConta == 1){
            this.conta1.depositar(valor);
        } else if (numeroConta == 2){
            this.conta2.depositar(valor);
        } else{
            throw new Exception("Conta não existe");
        }
    }

    public void saque() {

    }

    public void transferencia() {

    }
}
// http://10.12.128.248:8080
