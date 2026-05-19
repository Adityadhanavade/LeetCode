class Solution {
    public void rotate(int[][] matrix) {
        
        //first we need to transpose the matrix in place 
        //so we point diagonal boundary upper trinagle and swap it lower triangle 
        //simply ij = ji but point diagonally upper trinagle of ij
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=i+1; j<matrix[i].length; j++)
            {
                // CURRENT POSITION
                // a[i][j]

                // MIRROR POSITION
                // a[j][i]

                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //now we need to just row reverse then we get solution image.
        for(int i=0; i<matrix.length; i++)
        {
            //reverse Row using TwoPointer approach.
            int start = 0;
            int end = matrix[i].length-1;

            while(start < end)
            {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }     
    }
}



/*

public class Main {

    public static void main(String[] args) {

        int[][] a = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13,14,15,16}
        };

        int n = 4;

        // TRANSPOSE LOGIC
        // We traverse only upper triangle
        // and swap with lower triangle

        for(int i = 0; i < n; i++) {

            // j=i+1 means:
            // diagonal nantar start kar
            // duplicate swaps avoid hotat

            for(int j = i + 1; j < n; j++) {

                // CURRENT POSITION
                // a[i][j]

                // MIRROR POSITION
                // a[j][i]

                // swap
                int temp = a[i][j];

                a[i][j] = a[j][i];

                a[j][i] = temp;
            }
        }

        // PRINT MATRIX

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}

*/