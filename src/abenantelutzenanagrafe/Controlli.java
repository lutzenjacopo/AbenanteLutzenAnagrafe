/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abenantelutzenanagrafe;

/**
 *
 * @author lutzen.jacopo
 */
public class Controlli {

    public Controlli() {
    }
    
    public boolean controlloInt(String n){
        try {
    // Codice che potrebbe generare errori (es. conversione, divisione)
    int numero = Integer.parseInt(n); 
} catch (NumberFormatException e) {
    // Gestione specifica dell'errore
    System.out.println("Errore: Il dato inserito non è un numero valido!");
    return false;
}
       return true; 
    }
    public boolean controlloString(String n){
        try {
    // Codice che potrebbe generare errori (es. conversione, divisione)
    int numero = Integer.parseInt(n); 
} catch (NumberFormatException e) {
    return true;
}
       System.out.println("Errore: Il dato inserito è un numero !");
       return false; 
    }
    public boolean controlloNull(String n){
        if(!n.isEmpty()){
            return true;
        }
        return false;
    }
}
