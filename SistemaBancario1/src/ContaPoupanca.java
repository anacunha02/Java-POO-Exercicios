public class ContaPoupanca extends Conta {

    private static final double TAXA_RENDIMENTO = 0.005;

    public ContaPoupanca(int numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    @Override
    public double calcularRendimento() {
        return getSaldo() * TAXA_RENDIMENTO;
    }
}
}
