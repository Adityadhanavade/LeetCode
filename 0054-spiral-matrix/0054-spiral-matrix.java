class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int topRow = 0;
        int bottomRow = matrix.length-1;

        int leftCol = 0;
        int rightCol = matrix[0].length-1;
        
        ArrayList<Integer> arrlst = new ArrayList<>();

        while(topRow <= bottomRow && leftCol <= rightCol)
        {
            //left to right side moving 
            for(int i= leftCol; i <= rightCol; i++)
            {
                arrlst.add(matrix[topRow][i]);
            }
            topRow++;

            //move topRight to Bottom side moving 
            for(int i= topRow; i <= bottomRow; i++)
            {
                arrlst.add(matrix[i][rightCol]);
            }
            rightCol--;

             if (topRow <= bottomRow) 
             {
                //move rightCOl to leftColumn means right to left moving 
                for(int i= rightCol; i>= leftCol; i--)
                {
                    arrlst.add(matrix[bottomRow][i]);
                }
                bottomRow--;
             }

             // Bottom -> Top
            if (leftCol <= rightCol) 
            {
                //move bottom row to leftUpside
                for(int i= bottomRow; i>=topRow; i--)
                {
                    arrlst.add(matrix[i][leftCol]);
                } 
                leftCol++;
            }

        }
        return arrlst;
    }
}