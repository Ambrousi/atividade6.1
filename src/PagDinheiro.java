public class PagDinheiro extends Pagamento {

    public PagDinheiro(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento em dinheiro de R$ " + valor);
    }
}
