public class LogicalOperator {
    public static void main(String[] args) {
        int time = 18;
        if (time >= 10 && time <= 20) {
            System.out.println("Office is open!");
            if (time == 12 || time == 18) {
                System.out.println("SnackS Time");
            }
            else {
                System.out.println("Working Hours");
            }
        }
        else {
            System.out.println("Office is closed!");
        }
    }
}
