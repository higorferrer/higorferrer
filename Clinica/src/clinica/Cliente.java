
package clinica;


public class Cliente {
    private Estado estado;
    public Cliente() {
        this.estado = new Normal() {
            @Override
            public void perder() {
            }

            @Override
            public void ganhar() {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        };
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    

    void perder() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void ganhar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
