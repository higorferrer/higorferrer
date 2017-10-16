package clinica;

public abstract class Normal implements Estado{

    public void GanharPeso() {
        System.out.println("Ganhar Peso");
    }

    public void PerderPeso() {
        System.out.println("Perder Peso");
    }
    
}
