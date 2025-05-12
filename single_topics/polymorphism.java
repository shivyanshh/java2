package single_topics;
class Computer{
    public void show(){
        System.out.println("this is computer baby!!");
    }
}
class laptop extends Computer{    //since laptop is also a computer
    public void show(){
        System.out.println("this is laptop baby!!");
    }
}
class printer{
    public void show(){
        System.out.println("dude printer has no relation with computer and laptops duhhh!!!");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Computer obj = new Computer();     //computer is the type since its a parent class
        obj.show();


        obj = new laptop(); //type is still same and doesnt affect tht much. wht matters is the obj();
        obj.show();
        //obj = new printer(); this only works with inheritance 
    }
}
