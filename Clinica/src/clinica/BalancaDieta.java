
package clinica;


class BalancaDieta implements Observer {
       public void update(double novoPeso) {
           int peso = 0;
        if (peso >= 100) {
            System.out.println("Você ultrapassou o peso limite no sistema!");
        }
       }

    @Override
    public void update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}


