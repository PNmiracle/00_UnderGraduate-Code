package ch005;

/**
 * @Author mapKey
 * @Date 2022-10-17-3:49 PM
 */
public class Bread {
    private Person person;

    public Bread(Person person) {
        this.person = person;
    }

    public void eaten() {
        System.out.println(person.getName() + "吃了一片面包");
        person.setHeight(person.getHeight() + 1);
        System.out.println("现在," + person.getName() + "的身高是: " + person.getHeight() + "厘米");
    }
}
