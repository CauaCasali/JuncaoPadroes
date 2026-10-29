package sistemaMensalidadesEscolares;

public class AprovadorCoordenador extends Aprovador {

    public AprovadorCoordenador(Aprovador aprovadorSuperior) {
        this.listaSolicitacoes.add(TipoSolicitacaoPequena.getInstancia());
        this.setAprovadorSuperior(aprovadorSuperior);
    }

    public String getDescricaoAprovador() {
        return "Coordenador";
    }
}
