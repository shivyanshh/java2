package inheritance;
public class method_overriding {
    public static void main(String[] args){
        advcalc obj = new advcalc();
        int res=obj.add(5,1);
        System.out.println(res);

    }
}
class calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
class advcalc extends calc{
    public int add(int n1,int n2){    //this method is overriding the method in the other class with same name and parameters
        return n1+n2+1;
    }
}