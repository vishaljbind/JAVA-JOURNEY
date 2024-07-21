public class LearnAnonymous {
    public static void main(String[] args) {
      Outer obj = new Outer() {
        void walk(){
          System.out.println("walking");
        }

        public void outerMethod(){

        }
  };

  SuperInterace obj2 = new SuperInterace() {

    @Override
    public void sing() {
      System.out.println("singing");
    }
    
  };
    }
}

class Outer {
    public void outerMethod() {
        
    }
}
 
 @FunctionalInterface
 interface SuperInterace {
    public void sing();
    
}
