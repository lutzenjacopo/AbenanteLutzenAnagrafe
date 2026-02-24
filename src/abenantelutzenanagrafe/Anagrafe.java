/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abenantelutzenanagrafe;

import java.util.*;

/**
 *
 * @author lutzen.jacopo
 */
public class Anagrafe {
    private ArrayList<Studente> listaStudenti= new ArrayList<>();
    private HashSet<String> insiemeMatricole;
    private HashMap<String, Studente> mappaStudenti;

    public Anagrafe() {
    }

    @Override
    public String toString() {
        return "Anagrafe{" + "listaStudenti=" + listaStudenti + '}';
    }
    
    
    
    public boolean aggiungiStudente(Studente s){
    return false;
    }
    public boolean eliminaStudente(String matricola){
    return false;
    }
    public Studente cercaStudente(String matricola){
    return null;
    }
    public Collection<Studente> getTuttiStudenti(){
    return null;
    }
    public int numeroStudenti(){
        return 0;
    }

}
