class Fibonacci {

    /**
     * Iterative method
     * @param n nth term
     * @return  the fibonacci nth term 
     */
    public static int fibIterative(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        int n1 = 0, n2 = 1, next = 0;
        for (int term = 2; term <= n; term++) {
            next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
        return next;
    }

    /**
     * Recursive method
     * @param n nth term
     * @return  the fibonacci nth term 
     */
    public static int fibRecursive(int n) {
        if (n == 0) return 0; // base case
        else if (n == 1) return 1; // base case
        // recursive call
        else return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static void main(String[] args) {

        long start, end;
        long timeIterative, timeRecursive;
        System.out.printf("%2s%25s%25s\n","n","Iterative (ns)","Recursive (ns)");
        System.out.println("====================================================");
        for(int n=1; n<=20; n++){
            start = System.nanoTime();
            fibIterative(n);
            end = System.nanoTime();
            timeIterative = end  - start;

            start = System.nanoTime();
            fibRecursive(n);
            end = System.nanoTime();
            timeRecursive = end  - start;

            System.out.printf("%2d%25d%25d\n",n,timeIterative,timeRecursive);

        }
    }


}