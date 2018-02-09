/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonalmatrix;

import java.util.ArrayList;

/**
 *
 * @author Jeffrey
 */
public class DiagonalMatrix {

    final static int numberOfRows = 3;
    final static int numberOfColumns = 3;
    static int secondaryDiagonalTotal = 0;
    static int[][] demoMatrix1 = {
        {10,12,11},
        {9,8,31},
        {2,16,24}
    };
    static int[][] demoMatrix2 = {
        {1,0},
        {0,1}
    };
    /**
     * @param args the command line arguments
     */
/*    public static void main(String[] args) {
        // TODO code application logic here
        
        calculateMatrix(demoMatrix1,3, 3);
        
    }*/
    
    public static void calculateMatrix(int[][] inputMatrix, int numberOfRows, int numberOfColumns){
        if (inputMatrix.length < numberOfRows) { System.out.println("Size of matrix and input does not match!");}
        else
        {
            if (numberOfRows == numberOfColumns){
                //build matrix
                int matrixPosition = 0;
                int matrixLength = inputMatrix.length;
                int[][] matrix = null;
                if (numberOfRows > matrixLength){
                    matrix = new int[matrixLength][matrixLength];
                    for (matrixPosition = 0; matrixPosition < matrixLength; matrixPosition++){
                        matrix[matrixPosition] = inputMatrix[matrixPosition];
                        matrixPosition++;
                    }
                }
                if (numberOfRows <= inputMatrix.length)
                {
                    matrix = new int[numberOfRows][numberOfColumns];
                    while ((matrixPosition < numberOfRows)){
                        matrix[matrixPosition] = inputMatrix[matrixPosition];
                        matrixPosition++;
                    }
                }
                // calc array
                // else if less or equal
                // calc  numberOfRows

                int matrixOfOrderNArrayLength = numberOfColumns-1;
                // to calculate the primary diagonal or secondary diagonal
                // you have to iterate the length of the array
                // each element in the array is it's own array
                // therefore to traverse the Matrix, you are traversing
                // the length of the array if the matrix is Symmetrical
                // if the array is not symmetrical, the results will still
                // yield a diagonal however
                for(int i = 0; i < numberOfRows; i++){
                    secondaryDiagonalTotal+= matrix[i][matrixOfOrderNArrayLength-i];
                }
                System.out.println("Secondary diagonal sum  is: " + secondaryDiagonalTotal);
            }
            else
            {
                System.out.println("This is not a square matrix.");
            }
        }
        
    }
    
}
