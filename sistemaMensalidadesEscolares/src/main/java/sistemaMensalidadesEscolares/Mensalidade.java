package sistemaMensalidadesEscolares;

public class Mensalidade {

    private float valor;
    private int parcelas;

    public Mensalidade(float valor) {
        this.valor = valor;
        this.parcelas = 1;
    }

    public float getValor() {
        return valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public float calcularValorFinal(FormaPagamento formaPagamento) {
        return formaPagamento.calcularValorFinal(valor, parcelas);
    }
}
