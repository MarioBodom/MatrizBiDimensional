import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // String letra = sc.next();
        // cuadrado(size, letra);
        matriz();
    }

    public static void cuadrado(int size, String letra) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(letra);
            }
            System.out.println();
        }
    }

    public static void matriz() {
        String matriz[][] = new String[5][5];
        char caracter = 'L';
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (caracter == 'J') {
                    caracter++;
                }
                if (caracter > 'Z') {
                    caracter = 'A';
                    matriz[i][j] = Character.toString(caracter);
                    caracter++;
                } else {
                    matriz[i][j] = Character.toString(caracter);
                    caracter++;
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

