
package Homevork8;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
                System.out.print("Введите длину массива: ");
        int numb = scanner.nextInt();
        int[] massiv = new int[numb];
        
        for(int i = 0; i < numb;i++){
            massiv[i]= i;
            System.out.print(massiv[i]);
        } 
        System.out.println();
    }
}
