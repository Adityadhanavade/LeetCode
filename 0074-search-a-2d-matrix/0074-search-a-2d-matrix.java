// my code complexity is O(m + log n) and it is little greater > mentioned in que.
// chatgpt code is in O(log(m * n)) complexity and it is optimal.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int j=0;
        for(int i=0; i<matrix.length; i++)
        {   
            int endj = matrix[i].length-1;
            if(matrix[i][j] == target)
            {
                return true;
            }
            else if( target == matrix[i][endj])
            {
                return true;
            }
            //binary serch on row to find element in range of row
            if(matrix[i][j] <= target && target <= matrix[i][endj])
            {
                //binary search in row 
                int left = 0;
                int right = endj;
                
                while(left <= right)
                {
                    int mid = left + (right-left) / 2;
                    if(matrix[i][mid]==target)
                    {
                        return true;
                    }
                    else if(target < matrix[i][mid])
                    {
                        right = mid-1;
                    }
                    else
                    {
                        left = mid+1;
                    }
                    // return false;
                }
            }
        }
        return false;
    }
}


/*
//chatgpt optimal with complixity of O(log(m * n)) my code complexity is O(m + log n) little >
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // complete matrix la 1D array samjun
        // binary search

        int left = 0;
        int right = rows * cols - 1;

        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            // 1D index -> 2D index

            int row = mid / cols;
            int col = mid % cols;

            if(matrix[row][col] == target)
            {
                return true;
            }
            else if(target < matrix[row][col])
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return false;
    }
}

*/