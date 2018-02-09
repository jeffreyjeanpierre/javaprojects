/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonalmatrix;

/**
 *
 * @author fulgence
 */
public class Matrix {

    
        public static void main(String[] args) 
    {
      
        double[][] Data = new double[][] {
            {1.0,1999.9,7.0},
            {2.1, 7.0, -9.6}, 
            {7.0, 1.111, 42.3}};
        int k = Data.length;
        
        MyMatrix M = new MyMatrix();
        M.setSize(k);
        M.setData(Data);
        if (M.IsItSquareMatrix())
        {
            Double Secondary = M.Sec();
            System.out.println("Secondary of this matrix (size="+M.getSize()+") is "+Secondary+".");
        }
        else
        {
            System.out.println("This is not a SQUARE matrix.");
        }

    }
}

class MyMatrix
{
    private int Size;
    private double[][] Data;

    public boolean IsItSquareMatrix()
    {
        boolean Ansewer = false;
        int y = Data.length;
        int x = -1;
        if (y >= 1)
        {
            x = Data[0].length;
        }
        if (x == y)
        {
            Ansewer = true;
            for (int i=0;i<x;i++)
            {
                for (int j=0;j<y;j++)
                {
                System.out.print(Data[j][i]+"   ");
                }
            System.out.println("");
            }
        }
        return Ansewer;
    }
    
    public double Sec()
    {
        double Ansewer = 0.0;
        for (int x = 0; x < Size; x++)
        {
            Ansewer += Data[Size-1-x][x];
        }
   
        return Ansewer;
    }
    
    /**
     * @return the Size
     */
    public int getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(int Size) {
        this.Size = Size;
    }

    /**
     * @return the Data
     */
    public double[][] getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(double[][] Data) {
        this.Data = Data;
    }
}
