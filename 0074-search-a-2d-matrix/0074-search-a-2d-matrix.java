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
                }
            }
        }
        return false;
    }
}