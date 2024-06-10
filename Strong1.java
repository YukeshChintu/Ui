public class Strong1{
    public static void main(String[] args) {
        for (int n = 1; n <= 1000; n++) {
            int x = n;
            int s = 0;
            while (x > 0) {
                int r = x % 10;
                int f = 1;
                for (int i = 1; i <= r; i++)
		{
                    f=f*i;
                }
                s += f;
                x /= 10;
            }
            if (s == n) {
                System.out.println(n);
            }
        }
    }
}
