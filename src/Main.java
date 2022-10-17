public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(25.5);
        System.out.println(circle1.getInfo());
        circle1.setRadius(14);
        System.out.println(circle1.getInfo());
    }
}
