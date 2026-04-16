    public abstract class Conta {

    private int numero;
    private double saldo;

    public Conta(int numero, double saldoInicial) {
        this.numero = numero;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // Getter
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("Saldo não pode ser negativo");
        }
    }

    // Método depositar
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(this.saldo + valor);
        } else {
            throw new IllegalArgumentException("Valor de depósito inválido");
        }
    }

    // Método abstrato sacar
    public abstract void sacar(double valor);

    // Método abstrato calcular rendimento
    public abstract double calcularRendimento();


}
