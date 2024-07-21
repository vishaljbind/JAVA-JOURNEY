public class SumofArrays {
    public static void main(String[] args) {

        //sum of arrays
        int number[] = {23,45,2,67,21,88,26};
        int sum = 0;
        for(int num: number){
            sum += num;
        }
        System.out.println("Sum of arrays is: "+sum);

        // minima of arrays

        int min = Integer.MAX_VALUE;
        for (int num : number) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("minimum is: "+min);

        // maxima of arrays
        int max = Integer.MIN_VALUE;
        for (int num : number) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("maximum of arrays : "+max);
    }
}
