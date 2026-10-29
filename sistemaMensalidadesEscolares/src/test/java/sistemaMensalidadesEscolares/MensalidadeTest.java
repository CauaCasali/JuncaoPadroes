package sistemaMensalidadesEscolares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MensalidadeTest {

    @Test
    void deveManterValorIntegralParaPix() {
        Mensalidade mensalidade = new Mensalidade(100f);

        float valorFinal = mensalidade.calcularValorFinal(new FormaPagamentoPix());

        assertEquals(100f, valorFinal, 0.001f);
    }

    @Test
    void deveAplicarDescontoDeDoisPorCentoParaBoleto() {
        Mensalidade mensalidade = new Mensalidade(100f);

        float valorFinal = mensalidade.calcularValorFinal(new FormaPagamentoBoleto());

        assertEquals(98f, valorFinal, 0.001f);
    }

    @Test
    void deveManterValorIntegralParaCartaoComTresParcelasOuMenos() {
        Mensalidade mensalidade = new Mensalidade(100f);
        mensalidade.setParcelas(3);

        float valorFinal = mensalidade.calcularValorFinal(new FormaPagamentoCartao());

        assertEquals(100f, valorFinal, 0.001f);
    }

    @Test
    void deveAplicarAcrescimoParaCartaoComMaisDeTresParcelas() {
        Mensalidade mensalidade = new Mensalidade(100f);
        mensalidade.setParcelas(5);

        float valorFinal = mensalidade.calcularValorFinal(new FormaPagamentoCartao());

        // 2 parcelas excedentes (5 - 3), 2% de acréscimo por parcela: 100 + (100 * 0.02 * 2) = 104
        assertEquals(104f, valorFinal, 0.001f);
    }

    @Test
    void deveTratarParcelasInvalidasComoUmaParcelaNoCartao() {
        Mensalidade mensalidade = new Mensalidade(100f);
        mensalidade.setParcelas(0);

        float valorFinal = mensalidade.calcularValorFinal(new FormaPagamentoCartao());

        assertEquals(100f, valorFinal, 0.001f);
    }
}
