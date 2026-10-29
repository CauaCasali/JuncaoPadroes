package sistemaMensalidadesEscolares;

public class AprovadorDiretor extends Aprovador {

    public AprovadorDiretor(Aprovador aprovadorSuperior) {
        this.listaSolicitacoes.add(TipoSolicitacaoMedia.getInstancia());
        this.setAprovadorSuperior(aprovadorSuperior);
    }

    public String getDescricaoAprovador() {
        return "Diretor";
    }
}
