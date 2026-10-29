package sistemaMensalidadesEscolares;

public class AlunoExtensao extends Aluno {

    public String verificarElegibilidadeBolsa() {
        if (this.calcularMediaNotas() >= this.getMediaCorteElegibilidade()) {
            return "Elegível";
        }
        else {
            return "Não Elegível";
        }
    }

    public float getMediaCorteElegibilidade() {
        return 5.0f;
    }

    @Override
    public String getTipoCurso() {
        return "AlunoExtensao";
    }
}
