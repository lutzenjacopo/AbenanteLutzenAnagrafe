/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abenantelutzenanagrafe;


import java.io.*;
import java.util.*;
/**
 *
 * @author lutzen.jacopo
 */
public class GestioneFile {
    
        FileWriter fw = null;
        PrintWriter pw = null;
    public GestioneFile() {
        try {
         fw = new FileWriter("Studenti.txt", true);
         pw = new PrintWriter(fw);
        }catch (IOException ioe) {
            System.out.println("Problemi nella scrittura del file di testo");
        } 
        
    }
    public ArrayList<Studente> caricaDaFile(String nomeFile){
        return null;
    }

    public void salvaSuFile(String nomeFile, Collection<Studente> studenti){
        
    }
    
    
    
}
    

