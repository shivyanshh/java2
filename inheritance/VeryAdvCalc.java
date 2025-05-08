package inheritance;
public class VeryAdvCalc extends idk {    //VerAdvCalc --> idk --> Calc
    public double power(int n1,int n2){   //multilevel inheritance aint allowed in java EG. VeryAdvCalc extends idk,Calc
        return Math.pow(n1, n2);
    }
    
}
