package sistemaMensalidadesEscolares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinanceiroTest {

    @Test
    void devePagarComPixSemAlteracao() {
        Financeiro financeiro = new Financeiro();

        financeiro.pagarComPix(100f);

        assertEquals(100f, financeiro.getValorPago(), 0.001f);
    }

    @Test
    void devePagarComBoletoAplicandoDesconto() {
        Financeiro financeiro = new Financeiro();

        financeiro.pagarComBoleto(100f);

        assertEquals(98f, financeiro.getValorPago(), 0.001f);
    }

    @Test
    void devePagarComCartaoSemAcrescimoParaTresParcelasOuMenos() {
        Financeiro financeiro = new Financeiro();

        financeiro.pagarComCartao(100f, 3);

        assertEquals(100f, financeiro.getValorPago(), 0.001f);
    }

    @Test
    void devePagarComCartaoAplicandoAcrescimoParaMaisDeTresParcelas() {
        Financeiro financeiro = new Financeiro();

        financeiro.pagarComCartao(100f, 5);

        assertEquals(104f, financeiro.getValorPago(), 0.001f);
    }
}
