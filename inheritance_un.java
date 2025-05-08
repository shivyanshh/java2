public class inheritance_un {
    public static void main(String[] args) {
        int res=new idk().add(2, 5);
        System.out.println(res);
        int res2=new idk().sub(5, 1);
        System.out.println(res2);
        int res3=new idk().multiply(2, 8);
        System.out.println(res3);
    }
}

class idk extends Calc {
    public int div(int n, int y){
        return n/y;
    }
    public int multiply(int n, int y){
        return n*y;
    }
}