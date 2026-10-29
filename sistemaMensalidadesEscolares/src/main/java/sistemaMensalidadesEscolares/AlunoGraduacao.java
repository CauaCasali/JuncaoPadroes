package sistemaMensalidadesEscolares;

public class AlunoGraduacao extends Aluno {

    public String verificarElegibilidadeBolsa() {
        if (this.calcularMediaNotas() >= this.getMediaCorteElegibilidade()) {
            return "Elegível";
        }
        else {
            return "Não Elegível";
        }
    }

    public float getMediaCorteElegibilidade() {
        return 7.0f;
    }

}
