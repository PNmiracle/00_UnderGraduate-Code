package ch005;

/**
 * @Author mapKey
 * @Date 2022-10-17-3:57 PM
 */
public class MagicMachine {
    private Person person;

    public MagicMachine(Person person) {
        this.person = person;
    }

    public void tryUse() {
        person.setHeight(person.getHeight() + 50);
        System.out.println("现在," + person.getName() + "的身高是: " + person.getHeight() + "厘米");
        System.out.println("太神奇了");
    }
}
