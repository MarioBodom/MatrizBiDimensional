import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // String letra = sc.next();
        // cuadrado(size, letra);
        // System.out.println("Dame un caracter para iniciar");
        // char caracter = sc.nextLine().toUpperCase().charAt(0);
        // matriz(caracter);
        System.out.println("Dame un número de columnas");
        int rows = sc.nextInt();
        piramide(rows);
    }

    public static void cuadrado(int size, String letra) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(letra);
            }
            System.out.println();
        }
    }

    public static void matriz(char caracter) {
        // char IJ = '7';
        char matriz[][] = new char[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                // if (caracter == 'J') {
                //     caracter++;
                // }
                
                if (caracter > 'Z') {
                    caracter = 'A';
                    matriz[i][j] = caracter;
                    caracter++;
                } else {
                    if (caracter == 'I') {
                        matriz[i][j] = 'Ñ';
                        caracter++;
                    }else{
                        matriz[i][j] = caracter;
                        caracter++;
                    }
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

    public static void piramide(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows+i; j++) {
                if (j < rows - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

