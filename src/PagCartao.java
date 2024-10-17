public class PagCartao extends Pagamento {
    private String numeroCartao;
    private String validade;
    private String cvv;

    public PagCartao(double valor, String numeroCartao, String validade, String cvv) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.cvv = cvv;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com cartão de crédito de R$ " + valor);
        System.out.println("Número do Cartão: " + numeroCartao);
        System.out.println("Validade: " + validade);
        System.out.println("CVV: " + cvv);
    }
}
