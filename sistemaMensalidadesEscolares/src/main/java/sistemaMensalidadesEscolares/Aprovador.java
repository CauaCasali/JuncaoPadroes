package sistemaMensalidadesEscolares;

import java.util.ArrayList;
import java.util.List;

public abstract class Aprovador {

    protected List<TipoSolicitacao> listaSolicitacoes = new ArrayList<>();
    private Aprovador aprovadorSuperior;

    public Aprovador getAprovadorSuperior() {
        return aprovadorSuperior;
    }

    public void setAprovadorSuperior(Aprovador aprovadorSuperior) {
        this.aprovadorSuperior = aprovadorSuperior;
    }

    public abstract String getDescricaoAprovador();

    public String aprovarSolicitacao(Solicitacao solicitacao) {
        if (listaSolicitacoes.contains(solicitacao.getTipoSolicitacao())) {
            return getDescricaoAprovador() + " aprovou a solicitação.";
        }
        else if (aprovadorSuperior != null) {
            return aprovadorSuperior.aprovarSolicitacao(solicitacao);
        }
        else {
            return "Sem aprovador disponível para esta solicitação.";
        }
    }
}
