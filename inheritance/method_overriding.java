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
    public int add(int n1,int n2){
        return n1+n2+1;
    }
}