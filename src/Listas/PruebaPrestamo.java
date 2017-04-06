/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dam111
 */
public class PruebaPrestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int menu=0;
        int ISBN=0;
        String titulo="";
        String autor="";
        int paxinas=0;
        
        
        List<Prestamo>libros=new ArrayList<Prestamo>();
        while(menu!=6){
            System.out.println("Para dar de alta un libro pulse 1");
            System.out.println("Para dar de baixa un libro pulse 2");
            System.out.println("Para modificar un libro pulse 3");
            System.out.println("Para listar los libros orden pulse 4");
            System.out.println("Para listar libros segun autor pulse 5");
            System.out.println("Para finalizar la operacion pulse 6");
            menu=sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Introduzca ISBN");
                    ISBN=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduzca Titulo");
                    titulo=sc.nextLine();
                    System.out.println("Introduzca Autor");
                    autor=sc.nextLine();
                    System.out.println("Introduzca Paxinas");
                    paxinas=sc.nextInt();
                    sc.nextLine();
                    Prestamo aux=new Prestamo(ISBN,titulo,autor,paxinas);
                    libros.add(aux);
                        break;
                case 2:
                    System.out.println("Introduzca el ISBN del libro que desea eliminar");
                    ISBN=sc.nextInt();
                    for(int i=0;i<libros.size();i++){
                        if(ISBN==(libros.get(i).getISBN())){
                            libros.remove(i);
                        }
                    }
                        break;
                case 3:
                    System.out.println("Introduzca el ISBN del libro que desea eliminar");
                    ISBN=sc.nextInt();
                    sc.nextLine();
                    for(int i=0;i<libros.size();i++){
                        if(ISBN==(libros.get(i).getISBN())){
                          Prestamo mod=new Prestamo();
                          System.out.println("Introduzca el nuevo titulo");
                          mod.setTitulo(titulo=sc.nextLine());
                          System.out.println("Introduzca el nuevo autor");
                          mod.setAutor(autor=sc.nextLine());
                          System.out.println("Introduzca el nuevo numero de palabras");
                          mod.setPaxinas(paxinas=sc.nextInt());
                          sc.nextLine();
                        }
                    }
                        break;
                case 4:
                    int n=0;
                    System.out.println("Por qué patrón quiere ordenar?");
                    System.out.println("Por nº paginas selecione 1");
                    System.out.println("Por titulo seleccione 2");
                    System.out.println("Por autor seleccione 3");
                    Prestamo ordena=new Prestamo(ISBN,titulo,autor,paxinas);
                    ordena.setOrden(n=sc.nextInt());
                    sc.nextLine();
                    Collections.sort(libros);
                    for(int i=0;i<libros.size();i++){
                        System.out.println(libros.get(i).getTitulo());
                    }
                        break;
                case 5:
                    System.out.println("Introduzca el nombre del autor");
                    sc.nextLine();
                    autor=sc.nextLine();
                    for(int i=0;i<libros.size();i++){
                        if(autor.equals(libros.get(i).getAutor())){
                            System.out.println(libros.get(i).getTitulo()+" ");
                        }
                    }
                        break;
                        
        }
        }
    }
    
}
