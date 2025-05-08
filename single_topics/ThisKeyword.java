package single_topics;
class Human {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;                                 //when parameters name == instance variable , then we use this. to represent current object
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("Charlie");
        obj.setAge(25);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
