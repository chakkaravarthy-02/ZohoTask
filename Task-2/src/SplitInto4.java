
public class SplitInto4 {
    public static void main(String[] args){
        int students=20;
        int groups=4;
        int rollNoStart=101;

        for(int i=1;i<=groups;i++){
            System.out.println("Group "+i);
            for(int j=rollNoStart;j<rollNoStart+students;j+=groups){
                System.out.println(j);
            }
            rollNoStart++;
        }
    }
}
