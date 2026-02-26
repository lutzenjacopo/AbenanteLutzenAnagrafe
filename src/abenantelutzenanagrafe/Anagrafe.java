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
        listaStudenti = new ArrayList<>();
        insiemeMatricole = new HashSet<>();
        mappaStudenti = new HashMap<>();
    }

    @Override
    public String toString() {
        return "listaStudenti=" + listaStudenti ;
    }
    
    
    
    public boolean aggiungiStudente(Studente s){
        if(!insiemeMatricole.contains(s.getMatricola())){
            listaStudenti.add(s);
            insiemeMatricole.add(s.getMatricola());
            mappaStudenti.put(s.getMatricola(), s);
            return true;
        }
    return false;
    }
    public boolean eliminaStudente(String matricola){
        if(cercaStudente(matricola)!=null){
            listaStudenti.remove(mappaStudenti.get(matricola));
            mappaStudenti.remove(matricola);
            insiemeMatricole.remove(matricola);
            
            return true;
        }
    return false;
    }
    public Studente cercaStudente(String matricola){
        if(mappaStudenti.containsKey(matricola)){
            return mappaStudenti.get(matricola);
        }
    return null;
    }
    public Collection<Studente> getTuttiStudenti(){
            return mappaStudenti.values();
    }
    public int numeroStudenti(){
        return listaStudenti.size();
    }

}
