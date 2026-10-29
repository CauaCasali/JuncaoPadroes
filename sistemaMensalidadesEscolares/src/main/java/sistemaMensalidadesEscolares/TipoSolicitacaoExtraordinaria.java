package sistemaMensalidadesEscolares;

public class TipoSolicitacaoExtraordinaria implements TipoSolicitacao {

    private static TipoSolicitacaoExtraordinaria instancia = new TipoSolicitacaoExtraordinaria();

    private TipoSolicitacaoExtraordinaria() {}

    public static TipoSolicitacaoExtraordinaria getInstancia() {
        return instancia;
    }
}
