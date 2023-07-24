package genericos2;

public class Chicle extends Golosina{
    double precio;
    String nombre;
    int duracion;
    public Chicle(double p,String n,int d){
        this.precio=p;
        this.nombre=n;
        this.duracion=d;
    }
    public void setPrecio(double p){
        this.precio=p;
    }
    @Override
    public double getPrecio(){
        return this.precio;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}