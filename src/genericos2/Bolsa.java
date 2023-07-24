package genericos2;

import java.util.ArrayList;

public class Bolsa<T extends Golosina>{
  ArrayList<T> contenido;
  int cantidad;
  boolean cerrado;
  
  public Bolsa(){
    this.cantidad=0;
    contenido=new ArrayList<>();
    cerrado=false;
  }
  public void meter(T t1){
    if(!this.cerrado){
      this.contenido.add(t1);
      this.cantidad++;
    }else{
        System.out.println("La bolsa ya está cerrada.");
    }
    if(this.cantidad>9){this.cerrado=true;}
  }
  public void vaciar(){
      if(!this.cerrado){
          this.cantidad=0;
          this.contenido.clear();
      }else{
          System.out.println("La bolsa ya está cerrada.");
      }
  }
  public void cerrar(){
      this.cerrado=true;
  }
  public void meterMuchos(T[] varios){
    for(int i=0;i<varios.length;i++){
      this.meter(varios[i]);
    }
  }
  public double saberPrecio(){
    double p=0;
    for(int i=0;i<this.contenido.size();i++){
      T t1=this.contenido.get(i);
      double precio=t1.getPrecio();
      //p=p+this.contenido.get(i).getPrecio();
      p=p+precio;
    }
    return p;
  }
    public int getCantidad() {
        return cantidad;
    }
  public double compararPrecio(T t1,T t2){
    return t1.getPrecio()-t2.getPrecio();
  }
  public void imprimir_lambda(){
      this.contenido.forEach(elemento->{
          System.out.println("elemento: "+elemento.getNombre());
      });
  }
  public void imprimir_for(){
      for(T elemento:this.contenido){
          System.out.println("elemento: "+elemento.getNombre());
      }
  }
}