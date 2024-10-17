public class Main {
    public static void main(String[] args) {
        Pagamento pagDinheiro = new PagDinheiro(75.1);
        pagDinheiro.processarPagamento();

        Pagamento pagCartao = new PagCartao(500.5, "9999-8888-7777-5555", "07/06", "147");
        pagCartao.processarPagamento();
    }
}
