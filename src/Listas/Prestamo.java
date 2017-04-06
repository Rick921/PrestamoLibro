/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author dam111
 */
public class Prestamo implements Comparable<Prestamo>{
    private int ISBN;
    private String titulo;
    private String autor;
    private int paxinas;
    
    public Prestamo (){
        
    }
    public Prestamo(int ISBN, String titulo, String autor, int paxinas){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.autor=autor;
        this.paxinas=paxinas;
    }

    /**
     * @return the ISBN
     */
    public int getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the paxinas
     */
    public int getPaxinas() {
        return paxinas;
    }

    /**
     * @param paxinas the paxinas to set
     */
    public void setPaxinas(int paxinas) {
        this.paxinas = paxinas;
    }
    
      public int compareTo(Prestamo p1) {
        if (this.getPaxinas()<p1.getPaxinas())
    return -1;
        else if (this.getPaxinas()> p1.getPaxinas())
    return 1;
        else
    return 0;
 }
    
}
