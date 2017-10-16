package clinica;

public class Relatorio {
    public void gerarRelatorio(){
        buscar();
        gerar();
        explortar();
    }
    private void buscar(){
        System.out.println("Buscar...");
    }
    private void gerar(){
        System.err.println("Gerar...");
    }
    protected void explortar(){
        System.out.println("Exportei...");
    }
}
