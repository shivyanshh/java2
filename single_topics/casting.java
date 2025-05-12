package single_topics;
class A{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A {
    public void show1(){
        System.out.println("in B show");
    }
}
public class casting {
    public static void main(String[] args){
        // double d =1.5;
        // int i = (int) d;
        // System.out.println(i);
        A obj =  new B();  //object of B but refering to A.... this is called upcasting
        obj.show1();

        B obj1 = (B) obj;  //downcasting 
        obj1.show1();

    }
}
