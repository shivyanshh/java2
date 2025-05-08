public class AnonymousObject {
    public static void main(String[] args){
        new demo().show();  // new way to create object known as anonymous
        new demo().show();  //they can be used once
    }

}
class demo{
    public void show(){
        System.out.println("hello jii");
    }
    public demo(){
        System.out.println("object created!!");
    }
}
