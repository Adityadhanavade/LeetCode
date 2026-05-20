class Solution {

    public int integerBreak(int n) {

        // base cases
        if (n == 2) return 1;
        if (n == 3) return 2;

        int product = 1;

        // keep taking 3
        while (n > 4) {
            product *= 3;
            n -= 3;
        }

        // multiply remaining part
        product *= n;

        return product;
    }
}