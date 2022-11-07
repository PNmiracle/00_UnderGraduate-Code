package ch006.entity;

/**
 * @Author mapKey
 * @Date 2022-10-17-3:44 PM
 */
public class Person {
    private int height;
    private String gender;

    public Person(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
