package single_topics;

//final - variable,methods ,class

public class final_keyword {
    public static void main(String[] args){
        final double pie = 3.14;
        //pie =0;
        System.out.println(pie);
        Calc obj = new Calc();
        //obj.show();
        //obj.add(9,1);
        AdvCalc obj2 = new AdvCalc();
        obj2.add(2, 3);
        obj2.show();
    }
}
final class hello{
//u can stop extending     
}
class Calc{
    final public void show(){
        System.out.println("by shivyansh");

    }
    public void add(int a , int b){
        System.out.println(a+b);
    }
}
// class AdvCalc extends Calc{

// }
class AdvCalc extends Calc{
    // public void show(){
    //     System.out.println("by john");
    // }
     // someone can do method overriding so to prevent this we use final 
}