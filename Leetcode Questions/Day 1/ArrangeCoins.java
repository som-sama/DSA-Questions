public class ArrangeCoins {
        //Question: https://leetcode.com/problems/arranging-coins/
        public static void main(String[] args) {
            int n = 8;
            System.out.println(coins(n));
        }
        public static int coins(int n) {
            long start = 0, end = n;
            long k, arr;

            while (start <= end) {
                k = start + (end - start) / 2;
                arr = k * (k + 1) / 2;

                if (n < arr) {
                    end = k - 1;
                } else if (n > arr) {
                    start = k + 1;
                } else {
                    return (int) k;
                }
            }
            return (int) end;
        }
    }
