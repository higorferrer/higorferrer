
package clinica;

import java.util.ArrayList;
import java.util.List;


public class Dieta implements Observable {
       private List observers = new ArrayList();
       private double peso;
 
       public Dieta(double peso) {
            this.peso = peso;
       }

    Dieta() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
 
public void setPeso(double peso) {
        this.peso = peso;

        this.notifyObservers();
    }
 
       @Override
       public void registerObserver(Observer observer) {
            observers.add(observer);
       }
 
       @Override
       public void removeObserver(Observer observer) {
            observers.remove(observer);
       }
 
       @Override
       public void notifyObservers() {
   
            for (Object ob : observers) {
            System.out.println("Notificando observers!");
              
            }
       }

    void setPeso(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}


