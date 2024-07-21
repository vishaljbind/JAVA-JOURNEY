public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print( " * ");
            }
        System.out.println();
        }

        for (int i = 0; i < 8; i++) {
            int j = 0;
            while (j <= 5) {
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }
    }
}
