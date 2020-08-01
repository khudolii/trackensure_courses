package logic;

public class Test1 {

    public int test(int n) {
        System.out.println("n = " + n);
        if (n <= 0)
            return 0;
        int k = 1;
        int fullRows = 0;
        while (n > 0) {
            for (int j = 1; j <= k; j++) {
                n--;
                System.out.print("*");
                if (n <= 0) {
                    if (j < k)
                        fullRows = --k;
                    else
                        fullRows = k;
                    break;
                }
            }
            System.out.print("\n");
            k++;
        }
        System.out.println("Number of full rows: " + fullRows);
        return fullRows;
    }
}
