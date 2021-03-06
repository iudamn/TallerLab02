import java.util.Scanner;

public class metodos {

    public static void menu(){
        System.out.println("1.Mostrar pares adyacentes");
        System.out.println("2.Mostrar el mayor valor de producto");
        System.out.println("3.Salir");
        elegirOpcion();
    }

    public static void elegirOpcion(){
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();

        switch(opcion) {
            case 1:
                elegirNumero();
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    public static int elegirNumero(){
        int numero = (int) (Math.random() * 10) + 2;
        generarArreglo(numero);
        return numero;
    }

    public static int[] generarArreglo(int numero){
        int index=0;
        int[] valor = new int[numero];
        while(index<numero){
            int aleatorio = (int)(Math.random() * 100)+0;
        }
        visualizarArreglo(valor);
        return valor;
    }

    public static void visualizarArreglo(int[] valor) {
        int result=0;
        for(int i=0;i< valor.length;i++){
            System.out.println("["+valor[i]+"]");
        }

        for (int i = 0; i <valor.length-1; i ++) {
            for (int t = i + 1; t < valor.length; t++) {
                if (Math.abs(valor[i] - valor[t]) == 1)
                    result++;
            }
        }
        System.out.println(result);
    }

}
