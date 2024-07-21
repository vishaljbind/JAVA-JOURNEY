public class FunctionInterface {
    public static void main(String[] args) {
        SuperInterace obj = new SuperInterace() {

            @Override
            public void sing() {
                
            }
            
        };

        SuperInterace obj2 = () -> {

        };

        Walkable obj3 = (int steps) -> {
             System.out.println("Walked"+steps+" steps");
             return steps;
        };

        obj3.walks(4);

        Walkable wb = (int steps) -> 2*steps;
        System.out.println(wb.walks(5));
    }
}

@FunctionalInterface
 interface SuperInterace {
    public void sing();
    
}

interface Walkable {

    int walks(int steps);
}