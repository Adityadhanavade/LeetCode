class Solution {
    public String[] createGrid(int m, int n) {
    
        //create arrya to store path
        String resultStr[] = new String[m];
        //2d Matrix
        String [][]arr = new String[m][n];
        
        if(m == 1 || n == 1)
        {
            for(int i=0; i<m; i++)
            {
                for(int j=0; j<n; j++)
                {
                    arr[i][j] = new String(".");
                }
            }
        }
        else
        {
            for(int i=0; i<m; i++)
            {
                for(int j=0; j<n; j++)
                {
                    if(i == 0 || j == n-1)
                    {
                        arr[i][j] = new String(".");
                    }
                    else
                    {
                        arr[i][j] = new String("#");
                    }
                }
            }
        }

        //use StringBuilder to create String path
        StringBuilder strPath = new StringBuilder();

        //treverse the 2d array
        for(int i=0; i<m; i++)
        {   
            strPath.setLength(0);
            for(int j=0; j<n; j++)
            {
                strPath.append(arr[i][j]);
            }

            resultStr[i] = strPath.toString();
        }

        return resultStr;
    }
}