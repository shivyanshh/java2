public class this_super {
    public static void main(String[] args) {
        B obj = new B(9);
    }
    
}
class A extends Object{        //"extends Object" is also always present even if u mention or not
    public A(){
        super();                                       //super is always the first instruction in a constructor class
                                                     //it checks for the constructor of the super class or the parent class 
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }

}
class B extends A{
    public B(){
        super(5);
        System.out.println("in B");
    }
    public B(int n){
        this();                                      //this() runs the default constructor which is B()
        System.out.println("in B int");
    }
}