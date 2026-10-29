package sistemaMensalidadesEscolares;

public class AprovadorReitor extends Aprovador {

    public AprovadorReitor(Aprovador aprovadorSuperior) {
        this.listaSolicitacoes.add(TipoSolicitacaoGrande.getInstancia());
        this.setAprovadorSuperior(aprovadorSuperior);
    }

    public String getDescricaoAprovador() {
        return "Reitor";
    }
}
