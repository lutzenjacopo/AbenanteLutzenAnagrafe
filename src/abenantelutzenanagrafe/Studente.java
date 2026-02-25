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

    public Studente(String matricola, String nome, String cognome, String anno) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.anno = anno;
    }

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

    @Override
    public String toString() {
        return  matricola + "-" + nome + "-" + cognome + "-" + anno;
    }
    
}
