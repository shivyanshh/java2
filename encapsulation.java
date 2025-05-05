class human{
     private  int age;//=18;
     private  String name ;//="shivyansh";

     public void setage(int a){    //since it aint gonna returning anything its void
        age = a;
     }
     public void setname(String a){    //since it aint gonna returning anything its void
        name = a;
     }

     public int getage(){
        return age;
     }
     public String getname(){
        return name;
     }
}
public class encapsulation{
    public static void main(String[] args){ // basically private is used for so tht nobody directly access it
        human obj = new human();
        obj.setage((15));
        obj.setname("krrish");
        System.out.println(obj.getage());
        System.out.println(obj.getname());
    }
}