package src.peliculas;
public class Peliculas {
    int id,anio;
    String nombre,categoria;
    boolean disponible;
    public Peliculas(int id, int anio, String nombre, String categoria,boolean disponible) {
        this.id = id;
        this.anio = anio;
        this.nombre = nombre;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public boolean getDisponible() {
        return disponible;
    }
    public String getDatos(){
        return "id: "+id+" Nombre: "+nombre+ " Categoria: "+categoria+" Disponible: "+disponible;
    }
}
