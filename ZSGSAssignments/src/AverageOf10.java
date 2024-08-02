import java.util.Scanner;

public class AverageOf10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the people : ");
        int sumOfWeights=0;
        for(int i=0;i<10;i++){
            sumOfWeights+=sc.nextInt();
        }
        //Average=sum/total number
        double averageWeight=sumOfWeights/10.0;
        System.out.println("The average weight for 10 people is : "+averageWeight);
    }
}
