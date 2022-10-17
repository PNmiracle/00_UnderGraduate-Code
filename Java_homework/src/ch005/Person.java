package ch005;

/**
 * @Author mapKey
 * @Date 2022-10-17-3:44 PM
 */
public class Person {
    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
        System.out.println(name + "的身高是: " + height + "厘米");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
