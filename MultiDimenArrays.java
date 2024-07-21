public class MultiDimenArrays {
    public static void main(String[] args) {
        // 2D array
        int marks[][] = new int[4][3];
        
        marks[0][0] = 12;
        marks[0][1] = 45;
        marks[0][2] = 46;
        
        System.out.println(marks[0][2]);

        int scores[][] = {
            {24,78,80,4},
            {23,7,9,67},
            {4,3,90,78},
            {12,40,45,6}
        };

        System.out.println(scores[2][3]);
        System.out.println(scores[3][1]);
    }
}
