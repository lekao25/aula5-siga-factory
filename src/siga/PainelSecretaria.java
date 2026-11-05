package siga;

public class PainelSecretaria implements Painel {
    @Override
    public void montar() {
        System.out.println("=== Painel da Secretaria ===");
        System.out.println("- Matrículas e transferências");
        System.out.println("- Emissão de atestados");
    }
}