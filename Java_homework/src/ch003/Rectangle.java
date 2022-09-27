package ch003;

/**
 * @Author mapKey
 * @Date 2022-09-26-10:35 AM
 */
public class Rectangle {
    public int width;
    public int height;
    public Point origin;

    public Rectangle() {
        origin = new Point(0, 0);
    }

    public Rectangle(Point origin) {
        this.origin = origin;
    }

    public Rectangle(int width, int height) {
        this( width, height,new Point(0, 0));
    }

    public Rectangle(int width, int height, Point origin) {
        this.width = width;
        this.height = height;
        this.origin = origin;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }
    //移动rectangle的方法
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    //计算rectangle的面积
    public int area() {
        return width * height;
    }
}
