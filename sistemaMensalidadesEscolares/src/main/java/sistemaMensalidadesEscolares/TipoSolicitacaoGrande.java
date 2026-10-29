package sistemaMensalidadesEscolares;

public class TipoSolicitacaoGrande implements TipoSolicitacao {

    private static TipoSolicitacaoGrande instancia = new TipoSolicitacaoGrande();

    private TipoSolicitacaoGrande() {}

    public static TipoSolicitacaoGrande getInstancia() {
        return instancia;
    }
}
