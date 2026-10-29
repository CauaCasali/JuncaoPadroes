package sistemaMensalidadesEscolares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolicitacaoTest {

    private Aprovador criarCadeiaDeAprovadores() {
        Aprovador reitor = new AprovadorReitor(null);
        Aprovador diretor = new AprovadorDiretor(reitor);
        return new AprovadorCoordenador(diretor);
    }

    @Test
    void deveRetornarCoordenadorParaSolicitacaoPequena() {
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setTipoSolicitacao(TipoSolicitacaoPequena.getInstancia());

        assertEquals("Coordenador aprovou a solicitação.", criarCadeiaDeAprovadores().aprovarSolicitacao(solicitacao));
    }

    @Test
    void deveRetornarDiretorParaSolicitacaoMedia() {
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setTipoSolicitacao(TipoSolicitacaoMedia.getInstancia());

        assertEquals("Diretor aprovou a solicitação.", criarCadeiaDeAprovadores().aprovarSolicitacao(solicitacao));
    }

    @Test
    void deveRetornarReitorParaSolicitacaoGrande() {
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setTipoSolicitacao(TipoSolicitacaoGrande.getInstancia());

        assertEquals("Reitor aprovou a solicitação.", criarCadeiaDeAprovadores().aprovarSolicitacao(solicitacao));
    }

    @Test
    void deveRetornarSemAprovadorDisponivelParaSolicitacaoExtraordinaria() {
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setTipoSolicitacao(TipoSolicitacaoExtraordinaria.getInstancia());

        assertEquals("Sem aprovador disponível para esta solicitação.", criarCadeiaDeAprovadores().aprovarSolicitacao(solicitacao));
    }
}
