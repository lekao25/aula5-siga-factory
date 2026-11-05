package siga;

public abstract class CriadorPainel {
    protected abstract Painel criarPainel();

    public Painel montarPainel() {
        Painel painel = criarPainel();
        painel.montar();
        return painel;
    }
}