package ch006.entity;

import ch006.Magic.MagicHouseVIP;
import ch006.Magic.VIPMagicMachine;

/**
 * @Author mapKey
 * @Date 2022-11-07-15:52
 */
public class XiaoZhang extends Person implements MagicHouseVIP {

    public XiaoZhang(int height) {
        super(height);
    }

    @Override
    public void getService(VIPMagicMachine vmm, String gender) {
        int inc_height = vmm.incHeight(getHeight(), gender);
        setHeight(inc_height);
        System.out.println("************");
        System.out.println("现在, 小张的身高是: " + getHeight() + "厘米");
    }
}
