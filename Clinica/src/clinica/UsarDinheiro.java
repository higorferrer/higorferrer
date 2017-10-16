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
public abstract class UsarDinheiro implements ModoPagamento {

    
    public void ModoPagamento() {
        System.out.println("Pagando com Dinheiro");
    }
}
