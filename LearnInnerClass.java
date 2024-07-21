public class LearnInnerClass {
    class Toy {
        int price;
    }

    static class PlayStation {
           int price;
    }
    public static void main(String[] args) {
        Toy ty = new LearnInnerClass(). new Toy();
        ty.price = 45;

        PlayStation plt = new LearnInnerClass.PlayStation();
    }
}
