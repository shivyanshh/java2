class human{
    public human(){
        int age = 12;
        String name = "john";
    }
    public human(int x,String y){
        String name = y;
        int age = x;
        System.out.println("say hello from constructor:"+name);
    }
}
public class parameter_constructor {
    public static void main(String[] args){
        human obj = new human(90,"suresh");

    }
}
