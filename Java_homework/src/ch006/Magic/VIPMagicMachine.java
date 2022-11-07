package ch006.Magic;

/**
 * @Author mapKey
 * @Date 2022-11-07-15:21
 */
public class VIPMagicMachine  extends MagicMachine{
    private String boy = "男生";
    private String girl = "女生";
    private int inc;

    public int incHeight(int height, String gender) {
        System.out.println("**********************************");
        System.out.println("魔法机器: 尊贵的VIP, 感谢您体验魔法机器");
        if (gender.equals(boy)) {
            inc = 40;
            System.out.println("魔法机器: 机器识别您是: 男生");
            System.out.println("魔法机器: 机器将使您增高: 40厘米");
        } else {
            inc = 30;
            System.out.println("魔法机器: 机器识别您是: 女生");
            System.out.println("魔法机器: 机器将使您增高: 30厘米");
        }
        System.out.println("**********************************");
        return height + inc;
    }
}
