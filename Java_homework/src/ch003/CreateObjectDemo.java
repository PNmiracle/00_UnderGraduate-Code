package ch003;

/**
 * @Author mapKey
 * @Date 2022-09-26-10:38 AM1
 */
public class CreateObjectDemo {
    public static void main(String[] args) {
        Point originOne = new Point(23, 94);
        Rectangle rect_one = new Rectangle(100, 200, originOne);
        Rectangle rect_two = new Rectangle(50, 100);

        System.out.println("The width of rect_one is: " + rect_one.getWidth());
        System.out.println("The height of rect_one is: " + rect_one.getHeight());
        System.out.println("The area of rect_one is: " + rect_one.area());
        rect_two.setOrigin(originOne);
        System.out.println("The X of rect_two is :" + rect_two.origin.getX());
        System.out.println("The Y of rect_two is :" + rect_two.origin.getY());

        System.out.println("==========After move========");
        rect_two.move(50, 60);
        System.out.println("The X of rect_two is :" + rect_two.origin.getX());
        System.out.println("The Y of rect_two is :" + rect_two.origin.getY());
    }
}
