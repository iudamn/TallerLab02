public class metodos {

    public static void menu(){
        System.out.println("1.Mostrar pares adyacentes");
        System.out.println("2.Mostrar el mayor valor de producto");
        System.out.println("3.Salir");
        elegirOpcion();
    }

    public static int elegirOpcion(){

    }

    public static int elegirNumero(int a){
        int numero = (int) (Math.random() * 10) + 2;
        generarArreglo(numero);
        return numero;
    }


    public static int[] generarArreglo(int numero){
        for(int i=0; i<numero; i++){
            System.out.print("["+numero()[i]+"]");

        }
    }
}
