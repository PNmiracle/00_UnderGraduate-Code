package ch006;

import ch006.Magic.Bread;
import ch006.Magic.MagicMachine;
import ch006.Magic.SVIPMagicMachine;
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

        PrintUtil.begin2();
        System.out.println("=========");
        System.out.println("小明的身高: " + xm.getHeight() + "厘米");
        System.out.println("=========");
        System.out.println("小明使用魔法机器....");
        SVIPMagicMachine svmm = new SVIPMagicMachine();
        xm.getService(svmm, "男生", true, 10);

        System.out.println("老板打开机器, 把小明拽了出来");
        System.out.println("小明: 吓死我了, 什么破机器啊啊");
        System.out.println("老板拿出尺子量了量, 小明的身高是: " + xm.getHeight() + "厘米");
        System.out.println("老板: 还好身高没变, 实在抱歉");
        System.out.println("老板: 麻烦您查看下账户余额, 谢谢.");
        System.out.println("小明: 好");
        System.out.println("账户余额 : " + svmm.getBalance() + "元");
        System.out.println("老板: 啊, 没钱你TM变个啥?");
        System.out.println("小明: 哦, 我忘记把红包充值进去了");
        System.out.println("老板: 搜嘎, sorry, 您受惊了");
        System.out.println("老板: 为了表达我的歉意, 我送您5个50的红包哟, 亲~(づ￣3￣)づ╭❤～");
        System.out.println("老板: 这次不要忘了充值思密达");
        System.out.println("小明: 3Q~");
        System.out.println("小明往SVIP账户上冲了350元");
        svmm.depositRedPacket(7 * 50);
        System.out.println("账户余额 : " + svmm.getBalance() + "元");
        System.out.println("=========");
        System.out.println("小明使用魔法机器....");
        xm.getService(svmm, "男生", true, 10);
        System.out.println("=======");
        System.out.println("账户余额 : " + svmm.getBalance() + "元");
        PrintUtil.hahaha();


    }
}
