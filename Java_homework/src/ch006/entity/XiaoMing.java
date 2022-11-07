package ch006.entity;

import ch006.Magic.Bread;
import ch006.Magic.MagicHouseSVIP;
import ch006.Magic.MagicMachine;
import ch006.Magic.SVIPMagicMachine;

/**
 * @Author mapKey
 * @Date 2022-11-07-13:42
 */
public class XiaoMing extends Person implements MagicHouseSVIP {
    public XiaoMing(int height) {
        super(height);
    }

    public void eat(Bread brd) {
        if (brd.isEaten == false) {
            setHeight(getHeight() + 1);
            brd.beEaten();
        }
    }

    public void useMachine(MagicMachine mm) {
        setHeight(mm.incHeight(getHeight()));
    }

    @Override
    public void getService(SVIPMagicMachine svmm, String gender, boolean isDec, int diff) {
        boolean isChanged = svmm.canChangeH( gender, diff, isDec);
        if (isChanged == false) {
            return;
        }

        int newHeight = isDec ? getHeight() - diff : getHeight() + diff;
        setHeight(newHeight);
        System.out.println("************");
        System.out.println("现在, 小明的身高是: " + getHeight() + "厘米");
    }
}
