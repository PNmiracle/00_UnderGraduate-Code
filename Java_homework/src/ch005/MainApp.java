package ch005;

/**
 * @Author mapKey
 * @Date 2022-10-17-3:42 PM
 */
public class MainApp {
    public static void main(String[] args) {
        MagicHouse magicHouse = new MagicHouse();
        Person xiaoMing = new Person("小明", 140);
        System.out.println("=========");
        //吃面包
        System.out.println("小明吃面包长高");
        Bread b1 = new Bread(xiaoMing);
        b1.eaten();
        Bread b2 = new Bread(xiaoMing);
        b2.eaten();
        //魔法机器
        System.out.println("=========");
        System.out.println("太慢了, 小明尝试魔法机器");
        MagicMachine magicMachine = new MagicMachine(xiaoMing);
        magicMachine.tryUse();
        magicMachine.tryUse();

    }
}
