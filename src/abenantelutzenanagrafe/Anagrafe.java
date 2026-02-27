/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abenantelutzenanagrafe;

import java.util.*;

/**
 *
 * @author lutzen.jacopo <3
 */
public class Anagrafe {
    private ArrayList<Studente> listaStudenti= new ArrayList<>();
    private HashSet<String> insiemeMatricole;
    private HashMap<String, Studente> mappaStudenti;

  /**
   * listaStudenti array list di tutti gli studenti 
   * insiemeMatricole  Hashset di tutte le matricole 
   * mappaStudenti insime di matricola e studente, la chiabve è la matricola e lo studente èil valore collegato
   * 
   */
    public Anagrafe() {
        listaStudenti = new ArrayList<>();
        insiemeMatricole = new HashSet<>();
        mappaStudenti = new HashMap<>();
    }
/**
 * Override del metodo To string 
 * @return la lista degli studenti 
 */
    @Override
    public String toString() {
        return "listaStudenti=" + listaStudenti ;
    }
    
    
    /**
     * metodo per aggiungere lo studete, lo aggiunge sia a listaStudenti, insiemeMatricole e a mappaStudenti
     * @param s studente da aggiungere
     * @return se è stato aggiuto fa il return true, altrimenti false
     */
    public boolean aggiungiStudente(Studente s){
        if(!insiemeMatricole.contains(s.getMatricola())){
            listaStudenti.add(s);
            insiemeMatricole.add(s.getMatricola());
            mappaStudenti.put(s.getMatricola(), s);
            return true;
        }
    return false;
    }
    
    /**
     * metodo per elminare uno studente, elimina sia a listaStudenti, insiemeMatricole e a mappaStudenti 
     * @param matricola la matricola dello studente da eliminare  
     * @return se lo studente è stato eliminato fa il return true, altrimenti false
     */
    public boolean eliminaStudente(String matricola){
        if(cercaStudente(matricola)!=null){
            listaStudenti.remove(mappaStudenti.get(matricola));
            mappaStudenti.remove(matricola);
            insiemeMatricole.remove(matricola);
            
            return true;
        }
    return false;
    }
    
    /**
     * metodo che cerca lo studente attraverso la matricola 
     * @param matricola matricola dello studente da cercare
     * @return se lo trova fa il returm dello Studente altrimenti è Null
     */
    public Studente cercaStudente(String matricola){
        if(mappaStudenti.containsKey(matricola)){
            return mappaStudenti.get(matricola);
        }
    return null;
    }
    
    /**
     * metodo get delle Collection studneti
     * @return ritornano tutti gli studenti 
     */
    public Collection<Studente> getTuttiStudenti(){
            return mappaStudenti.values();
    }
    /**
     * metodo che prende il numero di studenti (ovvero la grandezza del'array)
     * @return numero di studenti
     */
    public int numeroStudenti(){
        return listaStudenti.size();
    }

   

}
