/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abenantelutzenanagrafe;


import java.io.*;
import java.util.*;

public class GestioneFile {

    public GestioneFile() {
    }
  /**
   * metodo che carica il file 
   * @param nomeFile nome del File da carcare
   * @return l'arrayList di studenti
   */
    public ArrayList<Studente> caricaDaFile(String nomeFile) {

        ArrayList<Studente> lista = new ArrayList<>(); 

        try {
            //crea e istanza FileReader e BufferedReader
            FileReader fr = new FileReader(nomeFile);
            BufferedReader br = new BufferedReader(fr);

            String riga;//righe del file

            while ((riga = br.readLine()) != null) { // finchè non è in fondo al file (quindi finchè riga non è null) continua 
                Studente s = Studente.fromFileString(riga); //crea lo studente preso dalla riga e sotto lo aggiunge alla list
                if (s != null) {
                    lista.add(s);
                }
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Errore nella lettura del file.");
        }

        return lista;
    }

    
    /**
     * metodo che salva il file 
     * @param nomeFile nome del file 
     * @param studenti collection di studenti 
     */
    public void salvaSuFile(String nomeFile, Collection<Studente> studenti) {

        try {
            FileWriter fw = new FileWriter(nomeFile);
            PrintWriter pw = new PrintWriter(fw);

            for (Studente s : studenti) {
                pw.println(s.toString());
            }

            pw.close();

        } catch (IOException e) {
            System.out.println("Errore nella scrittura del file.");
        }
    }
}
    

    

