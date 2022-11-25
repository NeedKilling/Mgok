
package Homevork8;


public class StaticMatrix {
    
    public static void main(String[] args) {
         int[][] MatrixStatic = new int[3][3];
    for(int i = 0; i < MatrixStatic.length; i++){
        for(int j = 0 ;j < MatrixStatic[i].length; j++ ){
            MatrixStatic[i][j]= i+j;
            System.out.print(MatrixStatic[i][j]+"\t");
        }
            System.out.println();
        }
    }
    
}
