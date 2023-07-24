package genericos1;

public class ClaseGenerica<T> {
    T t1;//declaramos una variable del tipo genérico
    public ClaseGenerica(){ }
    public ClaseGenerica(T t1){
        this.t1=t1;
    }
    public void invertir(T[] array) {//un método al que se le pasa un array de tipo genérico
        for (int i = 0; i < array.length / 2; i++) {
            t1 = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t1;
        }
    }
    public void obtenerTipo(){
        System.out.println("El tipo genérico es: "+t1.getClass().getSimpleName());
    }
}
