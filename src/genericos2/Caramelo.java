package genericos2;

public class Caramelo extends Golosina{
    double precio;
    String nombre;
    int calorias;
    public Caramelo(double p,String n,int c){
        this.precio=p;
        this.nombre=n;
        this.calorias=c;
    }
    public double getPrecio(){return this.precio;}
    public void setPrecio(double p){this.precio=p;}
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  /*@Override
  public int compareTo(Coche c) {
    return this.kilometros-c.kilometros;
  }*/
}