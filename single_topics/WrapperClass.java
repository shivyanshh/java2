package single_topics;


//basically variables and primitive variables are different. variavbles are stored in heap and stack memory but primitive
//like int, string are stored in primitive so its faster



public class WrapperClass {
    public static void main(String[] args){
        int num =7;
        Integer num1 = new Integer(9); //auto-boxing  primitive type to object type

        System.out.println(num1);



        int num2 = num1;
        System.out.println(num2); //auto-unboxing   object to primitive type


        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}
