package siga;

public class FabricaPainel {
    public Painel criar(String tipoUsuario) {
        if (tipoUsuario.equals("ALUNO")) {
            return new PainelAluno();
        } else if (tipoUsuario.equals("PROFESSOR")) {
            return new PainelProfessor();
        } else if (tipoUsuario.equals("COORDENADOR")) {
            return new PainelCoordenador();
        } else {
            throw new IllegalArgumentException("Perfil desconhecido: " + tipoUsuario);
        }
    }
}