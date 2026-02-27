/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abenantelutzenanagrafe;

import java.util.Objects;

/**
 *
 * @author lutzen.jacopo
 */
public class Studente {
    private String matricola,nome,cognome,anno;
/**
 * costruttorre
 * @param matricola matricola dello studente
 * @param nome nome dello studente
 * @param cognome cognome dello studente
 * @param anno anno dello studente
 */
    public Studente(String matricola, String nome, String cognome, String anno) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.anno = anno;
    }
        //Get & Set
    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

  

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.matricola);
        return hash;
    }
/**
 * metodo equals
 * @param obj oggettto da controllare
 * @return return true se sono uguali 
 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Studente other = (Studente) obj;
        return Objects.equals(this.matricola, other.matricola);
    }
/**
 * Override del metodo String
 * @return la stringa con matricola, nome, cognome e anno dello studente 
 */
    @Override
    public String toString() {
        return  matricola + "-" + nome + "-" + cognome + "-" + anno;
    }
    
    public static Studente fromFileString(String riga) {
        String[] parti = riga.split("-");
        if (parti.length == 4) {
            return new Studente(parti[0], parti[1], parti[2],parti[3]);
        }
        return null;
    }
}
