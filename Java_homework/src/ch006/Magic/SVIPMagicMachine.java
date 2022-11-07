package ch006.Magic;

import ch006.exception.NoSuchGenderException;
import ch006.exception.NotEnoughException;

/**
 * @Author mapKey
 * @Date 2022-11-07-15:21
 */
public class SVIPMagicMachine extends MagicMachine {
    private String boy = "男生";
    private String girl = "女生";

    private int balance;

    public int getBalance() {
        return balance;
    }

    /**
     * SVIP魔法机器判断是否能够改变高度
     * @param gender 性别
     * @param diff   变化量
     * @param isDec   是否要降低
     * @author mapKey
     */
    public boolean canChangeH(String gender, int diff, boolean isDec) {
        int cost = 0;
        System.out.println("**********************************");
        System.out.println("魔法机器: 尊贵的超级VIP, 感谢您体验魔法机器");
        System.out.println("魔法机器: 超级VIP可以享受定制的增高或降低服务");
        if (boy.equals(gender)) {
            cost = diff * 10;
        } else if (girl.equals(gender)) {
            cost = diff * 5;
        } else {
            try {
                throw new NoSuchGenderException();
            } catch (NoSuchGenderException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("魔法机器: 本次服务将收费: " + cost + "元");
        if (balance - cost < 0) {
            try {
                throw new NotEnoughException("魔法机器: 错误: 账户不足, 机器停止工作!");//Todo:异常
            } catch (NotEnoughException e) {
                balance = 0;
                System.out.println("魔法机器: 错误: 账户不足, 机器停止工作!");
                System.out.println("========");
                System.out.println("紧急呼叫老板, 魔法机器里面卡人了.....");
                System.out.println("小明: 救命!!!!!!!我被卡住了!!!!");
                System.out.println("========");
                return false;
            }
        }
        balance -= cost;
        System.out.println("魔法机器: 机器识别您是: " + gender);
        if (isDec) {
            System.out.println("魔法机器: 机器将使您降低: " + diff + "厘米");
        } else {
            System.out.println("魔法机器: 机器将使您增高: " + diff + "厘米");
        }
        System.out.println("**********************************");
        return true;
    }

    public void depositRedPacket(int total) {
        balance += total;
    }
}
