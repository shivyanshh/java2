public class inheritance {
    public static void main(String[] args){
    int res=new Calc().add(9,1);
    System.out.println(res);
    }
}

class Calc{
    public int add(int x,int y){
        return x+y;
    }
    public int sub(int x,int y){
        return x-y;
    }
}