/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class Libros {
    //Atributos /////////////////////
    String titulo;
    String autor;
    int paginas;
    
    //Constructores /////////////////////
    public Libros(){
    }
    
    public Libros(String title, String author, int pages){
        this.titulo = title;
        this.autor = author;
        this.paginas = pages;
    }
    
    //Métodos y Funciones /////////////////////
    public void mostrarInformacion(){
        System.out.println("Información sobre el libro:");
        System.out.println("===========================");
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Páginas: "+paginas);
        System.out.println("");
    }
    
    
}
