package sistemaMensalidadesEscolares;

public class Financeiro {

    private float valorPago;

    public float getValorPago() {
        return valorPago;
    }

    public void pagarComPix(float valor) {
        Mensalidade mensalidade = new Mensalidade(valor);
        this.valorPago = mensalidade.calcularValorFinal(new FormaPagamentoPix());
    }

    public void pagarComBoleto(float valor) {
        Mensalidade mensalidade = new Mensalidade(valor);
        this.valorPago = mensalidade.calcularValorFinal(new FormaPagamentoBoleto());
    }

    public void pagarComCartao(float valor, int parcelas) {
        Mensalidade mensalidade = new Mensalidade(valor);
        mensalidade.setParcelas(parcelas);
        this.valorPago = mensalidade.calcularValorFinal(new FormaPagamentoCartao());
    }
}
