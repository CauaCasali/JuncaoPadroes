package sistemaMensalidadesEscolares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlunoExtensaoTest {

    @Test
    void deveRetornarElegivel() {
        AlunoExtensao aluno = new AlunoExtensao();
        aluno.setNotaProva(5.0f);
        aluno.setNotaTrabalho(5.0f);
        assertEquals("Elegível", aluno.verificarElegibilidadeBolsa());
    }

    @Test
    void deveRetornarNaoElegivel() {
        AlunoExtensao aluno = new AlunoExtensao();
        aluno.setNotaProva(5.0f);
        aluno.setNotaTrabalho(4.9f);
        assertEquals("Não Elegível", aluno.verificarElegibilidadeBolsa());
    }

    @Test
    void deveRetornarInformacoes() {
        AlunoExtensao aluno = new AlunoExtensao();
        aluno.setNotaProva(5.0f);
        aluno.setNotaTrabalho(4.9f);
        aluno.setNome("Marcelo");
        aluno.setMatricula(2);
        assertEquals("AlunoExtensao{matricula=2, nome='Marcelo', resultado=Não Elegível}", aluno.getInfo());
    }
}
