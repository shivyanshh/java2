class human{
     private  int age;//=18;
     private  String name ;//="shivyansh";
     public int getAge() {
        return age;
     }
     public void setAge(int age) {
        this.age = age;  //when using same name in local variable as well as instance variable we use "this" 
     }// or age will be 0 as priority : local varible >>> instance variable
     public String getName() {              // these are default getters and setters by right clicking
        return name;
     }
     public void setName(String name) {
        this.name = name;
     }
     

     //public void setage(int a){    //since it aint gonna returning anything its void
     //   age = a;
     //}
     //public void setname(String a){    //(set + variable)--> setter
      //  name = a;
     //}

     //public int getage(){       //(get + variable)--> getter 
       // return age;
     //}
     //public String getname(){
       // return name;
     //}
}
public class encapsulation{
    public static void main(String[] args){ // basically private is used for so tht nobody directly access it
        human obj = new human();
        obj.setAge((15));
        obj.setName("krrish");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}