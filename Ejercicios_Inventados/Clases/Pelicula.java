/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_inventados.Clases;

/**
 *
 * @author bombe
 */
public class Pelicula {
    //Atributos /////////////////////
    String titulo;
    String director;
    int duracionMinutos;
    boolean vista;
    
    //Constructores /////////////////////
    public Pelicula(){
    }
    
    public Pelicula(String title, String director, int time){
        this.titulo = title;
        this.director = director;
        this.duracionMinutos = time;
        this.vista = false;
    }

    //Métodos y Funciones ///////////////////// 
    public void marcarComoVista(){
        this.vista = true;
    }
    
    public void mostrar(){
        System.out.println("Título: "+titulo);
        System.out.println("Director: "+director);
        System.out.println("Duración en minutos: "+duracionMinutos);
        System.out.println("Vista: "+vista);
        System.out.println("");
    }
    
}
