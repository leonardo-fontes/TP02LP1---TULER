/** 
 * 4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
 * 
 * Leonardo Fontes - CB3020576 
 * Giselle Leandro Souza de Araujo  - CB3020339
 */
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        double[][] matriz = new double[2][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da linha " + (i + 1) + " e coluna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();

        System.out.println("Valores armazenados na matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Linha " + (i + 1) + " e coluna " + (j + 1) + ": " + matriz[i][j]);
            }
        }
    }
}