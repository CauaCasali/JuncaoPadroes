package sistemaMensalidadesEscolares;

public class TipoSolicitacaoPequena implements TipoSolicitacao {

    private static TipoSolicitacaoPequena instancia = new TipoSolicitacaoPequena();

    private TipoSolicitacaoPequena() {}

    public static TipoSolicitacaoPequena getInstancia() {
        return instancia;
    }
}
