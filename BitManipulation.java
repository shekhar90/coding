class BitManipulation {

    public boolean isPowerOfTwo (int x) {
        // 1) How to check if a given number is a power of 2 ?
        // x will check if x == 0 and !(x & (x - 1)) will check if x is a power of 2 or not
        // return (x && !(x & (x - 1))) > 0 ? true : false;
        return (x & (x - 1)) == 0 ? true : false;
    }

    public int countOne (int n) {
        // 2) Count the number of ones in the binary representation of the given number.
        // Complexity: O(K), where K is the number of ones present in the binary form of the given number.
        int count = 0;
        while (n != 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public boolean check (int N, int i) {
        // 3) Check if the ith bit is set in the binary form of the given number.
        // Let’s say we have a number N, and to check whether it’s ith bit is set or not, we can AND it with the number 2i .
        //  The binary form of 2i contains only ith 
        // bit as set (or 1), else every bit is 0 there. When we will AND it with N, and if the ith bit of N is set, 
        // then it will return a non zero number (2i to be // specific), else 0 will be returned.
        if (N & (1 << i)) return true;
        else return false;
    }

    public void possibleSubsets (char A[], int N) {
        // 4) How to generate all the possible subsets of a set ?
        for (int i = 0; i < (1 << N); i++) {
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(A[j] + " ");
                }
            }
            System.out.println();
        }
    }
// 5) Find the largest power of 2 (most significant bit in binary form), which is less than or equal to the given number N.
    
    public static void main(String args[]) {

    }
}