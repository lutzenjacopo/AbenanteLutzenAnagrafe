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
    // questo sul bottone carica ( come se non fosse ovvio :p) pero cmq qua basta che gli dai Studenti come parametro è ti da tutti gli studenti in una collection.
    // per caricarli prova o scorrendo o boh non saprei che dirti come mo
    public ArrayList<Studente> caricaDaFile(String nomeFile) {

        ArrayList<Studente> lista = new ArrayList<>();

        try {
            FileReader fr = new FileReader(nomeFile);
            BufferedReader br = new BufferedReader(fr);

            String riga;

            while ((riga = br.readLine()) != null) {
                Studente s = Studente.fromFileString(riga);
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
// Non so se ti funzia ( dimmi ) ma cmq questo dovrebbe andare sul bottone salva. il nome file è Studenti e i studenti semmai vedi come si fa con la jTable 
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
    

    

