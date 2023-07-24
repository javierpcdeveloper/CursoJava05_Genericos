package genericos1;

public class ClaseConMetodoGenerico {
    public static <T> int compararTamanio (T[] a, T[] b) {
        System.out.println("El tipo genérico a comparar es: "+a[0].getClass().getSimpleName());
        return a.length-b.length;
    }
}
