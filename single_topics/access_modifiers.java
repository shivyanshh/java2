//     //we have already seen two access modifiers public private
//     //other are protected and default
// protected can be accesible in same package + subclasses in other packages
//private only accessible within same class
package single_topics;

public class access_modifiers {
    public static void main(String[] args) {
        test obj = new test();                 
        System.out.println(obj.marks);
    }
}
