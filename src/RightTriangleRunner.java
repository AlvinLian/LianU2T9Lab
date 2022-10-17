public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle rightTriangle1 = new RightTriangle(6,8);
        double hypotenuse1 = rightTriangle1.hypotenuse();
        System.out.println(hypotenuse1);

        RightTriangle rightTriangle2 = new RightTriangle(14.2,21.9);
        double hypotenuse2 = rightTriangle2.hypotenuse();
        System.out.println(hypotenuse2);
    }
}
