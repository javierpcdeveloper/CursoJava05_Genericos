package test;

import genericos1.*;
import genericos2.*;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        //si no se especifica el tipo genérico de un objeto de Collection, se supone que es de Object
        //Por lo que haría falta hacer un casting a String si queremos imprimir un valor
        //Si especificamos un tipo, por ejemplo Map<String,Integer> mimapa=new HashMap<>();
        //entonces ya no será un mapa de Object sino de String, por lo que se puede imprimir directamente.
        
        ///////////////////////////////////
        //ejemplos con clases genéricas 1//
        ///////////////////////////////////
        Integer[] numeros={0,1,2,3,4,5,6,7,8,9};
        ClaseGenerica<Integer> cg= new ClaseGenerica<Integer>(15);//creamos un objeto de la clase genérica especificando el tipo deseado
        System.out.println(Arrays.toString(numeros));
        cg.obtenerTipo();
        cg.invertir(numeros);//llamamos al método de nuestra clase genérica
        System.out.println(Arrays.toString(numeros));
        System.out.println("");
        
        //uso de método genérico
        Integer []a={0,1,2,3,4};
        Integer []b={0,1,2,3,4,5,6};
        int numero=ClaseConMetodoGenerico.<Integer>compararTamanio(a, b);
        System.out.println("numero:"+numero);
        System.out.println("");
        
        ///////////////////////////////////
        //ejemplos con clases genéricas 2//
        ///////////////////////////////////
        Chicle c1=new Chicle(0.2,"trident",3);
        Chicle c2=new Chicle(0.3,"orbit",5);
        Bolsa<Chicle> bolsaDeChicles=new Bolsa<>();//¿hay que especificar el tipo tanto en la definicion como en la creación?
        bolsaDeChicles.meter(c1);
        bolsaDeChicles.meter(c2);
        System.out.println("precio bolsa llena: "+bolsaDeChicles.saberPrecio());
        bolsaDeChicles.vaciar();
        System.out.println("precio bolsa vacia: "+bolsaDeChicles.saberPrecio());
        System.out.println("diferencia:"+bolsaDeChicles.compararPrecio(c1,c2));
        Caramelo ca1=new Caramelo(0.8,"mentol",1);
        Caramelo ca2=new Caramelo(1,"superbola",5);
        Bolsa<Caramelo> bolsaDeCaramelos=new Bolsa<>();
        bolsaDeCaramelos.meter(ca1);
        bolsaDeCaramelos.meter(ca2);
        System.out.println("precio antes:"+bolsaDeCaramelos.saberPrecio());
        System.out.println("cantidad:"+bolsaDeCaramelos.getCantidad());
        bolsaDeCaramelos.imprimir_for();
        System.out.println("---");
        bolsaDeCaramelos.imprimir_lambda();
        //bolsaDeCaramelos.vaciar();
        bolsaDeCaramelos.cerrar();
        bolsaDeCaramelos.vaciar();
        System.out.println("precio despues:"+bolsaDeCaramelos.saberPrecio());
        System.out.println("diferencia:"+bolsaDeCaramelos.compararPrecio(ca1,ca2));
    }
}
