/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 *
 * @author HIGOR
 */
public class Clinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Cliente p = new Cliente();
//        p.setEstado(new Normal());
        p.perder();
        p.ganhar();
        
        p.perder();
        p.ganhar();
        
                Pagamento a = new Pagamento();
        
        a.setModo(new UsarDinheiroImpl());
        a.pagar();
        //alteração do modo de pagamento em tempo de execução
        a.setModo(new UsarCartao());
        a.pagar();
        
         BalancaDieta balanca = new BalancaDieta();
        Dieta dieta = new Dieta();
        personalLoan.registerObserver(balanca);
        dieta.setPeso(150);
    }

    void ModoPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class UsarDinheiroImpl extends UsarDinheiro {

        public UsarDinheiroImpl() {
        }

        private UsarDinheiroImpl() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    }
    

