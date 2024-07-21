public class Continue_Break {
    public static void main(String[] args) {
        // break statement

        String destination = "vasai station";

        for (int platform = 0; platform <= 5; platform++) {
            System.out.println("virar station : "+platform);
            if (platform == 3){
                break;
            } 
        }
        System.out.println("Final destination is: "+destination);

        // Continue Statement
        for (int platform = 0; platform <= 5; platform++) {
            
            if (platform == 3) continue;
               System.out.println("virar station : "+platform);
        }
        System.out.println("Don't stop at Nallasopara station");
    }

}
