package ch006;

import ch006.Magic.Bread;
import ch006.Magic.MagicMachine;
import ch006.Magic.VIPMagicMachine;
import ch006.entity.XiaoFang;
import ch006.entity.XiaoMing;
import ch006.entity.XiaoZhang;
import ch006.util.PrintUtil;

/**
 * @Author mapKey
 * @Date 2022-10-17-3:42 PM
 */
public class AppMain {
    public static void main(String[] args) {
        System.out.println("进入魔法屋前");
        XiaoMing xm = new XiaoMing(140);
        System.out.println("小明身高是: " + xm.getHeight() + "厘米");
        System.out.println("========");
        Bread brd1 = new Bread();
        Bread brd2 = new Bread();
        System.out.println("小明吃面包长高");
        System.out.println("小明吃了一片面包");
        xm.eat(brd1);
        System.out.println("现在, 小明的身高是: " + xm.getHeight() + "厘米");
        xm.eat(brd2);
        System.out.println("现在, 小明的身高是: " + xm.getHeight() + "厘米");
        System.out.println("========");
        System.out.println("太慢了, 小明尝试魔法机器");
        MagicMachine mm = new MagicMachine();
        xm.useMachine(mm);
        System.out.println("现在, 小明的身高是: " + xm.getHeight() + "厘米");
        System.out.println("太神奇了");

        PrintUtil.story1();
        System.out.println("=========");
        System.out.println("进入魔法屋前");
        XiaoFang xf = new XiaoFang(130);
        System.out.println("小芳的身高是: " + xf.getHeight() + "厘米");
        XiaoZhang xz = new XiaoZhang(145);
        System.out.println("小张的身高是: " + xz.getHeight() + "厘米");
        System.out.println("=========");
        System.out.println("小芳使用魔法机器...");
        VIPMagicMachine vmm = new VIPMagicMachine();
        xf.getService(vmm, "女生");
        System.out.println("小张使用魔法机器...");
        xz.getService(vmm, "男生");

        PrintUtil.end1();
    }
}
