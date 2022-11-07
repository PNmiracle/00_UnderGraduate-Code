package ch006.entity;

import ch006.Magic.Bread;
import ch006.Magic.MagicMachine;

/**
 * @Author mapKey
 * @Date 2022-11-07-13:42
 */
public class XiaoMing extends Person {
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

}
