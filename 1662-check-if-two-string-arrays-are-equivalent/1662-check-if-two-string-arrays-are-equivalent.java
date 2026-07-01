class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        if (word1.length == word2.length) {
            for (int i = 0; i < word1.length; i++) {
                if (i < word1[0].length() && i < word2[0].length() && word1[0].charAt(i) != word2[0].charAt(i)) {
                    return false;
                }
            }
        }

        StringBuilder sbword1 = new StringBuilder();
        StringBuilder sbword2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            sbword1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            sbword2.append(word2[i]);
        }

        if (sbword1.length() != sbword2.length()) {
            return false;
        }

        for (int i = 0; i < sbword1.length(); i++) {
            if (sbword1.charAt(i) != sbword2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

/*
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        if (word1.length == word2.length) {
            for (int i = 0; i < word1[0].length() && i < word2[0].length(); i++) {
                if (word1[0].charAt(i) != word2[0].charAt(i)) {
                    return false;
                }
            }
        }

        StringBuilder sbword1 = new StringBuilder();
        StringBuilder sbword2 = new StringBuilder();

        // Always append
        for (int i = 0; i < word1.length; i++) {
            sbword1.append(word1[i]);
        }

        // Use word2.length here
        for (int i = 0; i < word2.length; i++) {
            sbword2.append(word2[i]);
        }

        // Check lengths before charAt()
        if (sbword1.length() != sbword2.length()) {
            return false;
        }

        for (int i = 0; i < sbword1.length(); i++) {
            if (sbword1.charAt(i) != sbword2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
*/