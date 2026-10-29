package sistemaMensalidadesEscolares;

public class FormaPagamentoBoleto implements FormaPagamento {

    private static final float DESCONTO_BOLETO = 0.02f;

    public float calcularValorFinal(float valor, int parcelas) {
        return valor - (valor * DESCONTO_BOLETO);
    }
}
