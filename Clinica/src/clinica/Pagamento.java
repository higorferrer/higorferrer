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
public class Pagamento 
{
    private Clinica modo;
    
    public void pagar(){
        modo.ModoPagamento();
    }
    
    public void setModo(Clinica novoModo){
        modo = novoModo;
    }
    
}