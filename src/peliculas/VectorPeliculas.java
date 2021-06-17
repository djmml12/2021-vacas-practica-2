package src.peliculas;
import src.tienda.*;

public class VectorPeliculas {
    private Peliculas[] peliculas=new Peliculas[50];
    private int siguienteCodigo;
    public VectorPeliculas(){
        this.siguienteCodigo=1;
    }
    //sobrecarga de metodos
    public void agregarPelicula(int year, String name,  String category){  
        if(siguienteCodigo>=50){
            System.out.println( "No se pueden agregar mas peliculas");
        }else{
            peliculas[siguienteCodigo-1]=new Peliculas(siguienteCodigo, year,name,  category, true); //id, año, nombre, categoria, disponible

        }
        siguienteCodigo++;
    }

    public void  agregarPelicula(){
        String nombre = IngresoDatos.getTexto("Ingresa el nombre de la pelicula: ");
        int anio = IngresoDatos.getEntero("Ingresa el año de la pelicula: ",false);
        String categoria = mostrarCategorias();
        agregarPelicula(anio, nombre, categoria);
    }

    //fin sobrecarga metodos
    public String mostrarCategorias(){
        String[]categorias={"Accion", "Comedia","Romance","Aventuras","Suspenso"};
        for(int i=0;i<categorias.length;i++){
            System.out.println((i+1)+ ". "+ categorias[i]);
        }
        int opcion = IngresoDatos.getEntero("Opcion #: ",false);
        return categorias[opcion-1];
    }

    public void mostrarPeliculas(){
        System.out.println("Listado de peliculas");
        for(int i=0;i<(siguienteCodigo-1);i++){
            System.out.println(peliculas[i].getDatos());

        }System.out.println("\n ");
    }
        //Insercion
    public void ordenarPorNombre(int n){

        Peliculas seleccion;
        int posicion;
        //System.out.println("Si entre");
        for(int i= 0;i<siguienteCodigo-1;i++){
            //System.out.println("Dentro de i");
            seleccion = peliculas[i];
            posicion = i;
            for(int j=1;j<siguienteCodigo-1;j++){
                //System.out.println("Dentro de j");

                if(n==0){
                    if(seleccion.getNombre().compareTo(peliculas[j].getNombre())>0){
                        seleccion = peliculas[j];
                        posicion = j;
                    }
                }if(n==1){
                    if(seleccion.getNombre().compareTo(peliculas[j].getNombre())<0){
                        seleccion = peliculas[j];
                        posicion = j;
                    }
                }

            }

            peliculas[posicion] = peliculas[i];
            peliculas[i]=seleccion;  
        }
        //System.out.println("Sali");

        mostrarPeliculas();

    }

}
