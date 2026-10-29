package sistemaMensalidadesEscolares;

public class TipoSolicitacaoMedia implements TipoSolicitacao {

    private static TipoSolicitacaoMedia instancia = new TipoSolicitacaoMedia();

    private TipoSolicitacaoMedia() {}

    public static TipoSolicitacaoMedia getInstancia() {
        return instancia;
    }
}
