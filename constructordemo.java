class Human {
    private String name;
    private int age;

    public Human(){
        System.out.println("in constructor");
        age=12;
        name="sasuke";

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;                                 
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class constructordemo {
    public static void main(String[] args){
        Human obj = new Human();             //whenever a new object is created the constructor will work tht many times as the object created
        System.out.println(obj.getName()+":"+obj.getAge());
        //obj.setName("nikunj");
        //Human obj2 = new Human();  
        //System.out.println(obj.getName()+":"+obj.getAge());
    }
}
