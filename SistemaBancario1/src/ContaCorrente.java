 {public class ContaCorrente extends Conta {

    private static final double TAXA_SAQUE = 2.0;

    public ContaCorrente(int numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + TAXA_SAQUE;

        if (valorTotal <= getSaldo()) {
            setSaldo(getSaldo() - valorTotal);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para saque com taxa");
        }
    }

    @Override
    public double calcularRendimento() {
        return 0;
    }
}
}
