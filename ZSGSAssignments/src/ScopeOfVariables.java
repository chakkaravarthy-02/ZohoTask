public class ScopeOfVariables {
    public static void main(String[] args){
        int first=5;
        if(first%5==0){
            int second=10;
            System.out.println(second);
            System.out.println(first);
        }
        System.out.println();
        System.out.println(first);
    }
}
//java: cannot find symbol
//  symbol:   variable second
//  location: class ScopeOfVariables
