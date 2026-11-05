package siga;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIGA - Atividade Factory Method ===\n");

        CriadorPainel criadorAluno = new CriadorPainelAluno();
        criadorAluno.montarPainel();
        System.out.println();

        CriadorPainel criadorProfessor = new CriadorPainelProfessor();
        criadorProfessor.montarPainel();
        System.out.println();

        CriadorPainel criadorCoordenador = new CriadorPainelCoordenador();
        criadorCoordenador.montarPainel();
        System.out.println();
        
        CriadorPainel criadorSecretaria = new CriadorPainelSecretaria();
        criadorSecretaria.montarPainel();
    }
}