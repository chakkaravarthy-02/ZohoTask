import java.util.Scanner;

public class MergeTwoSorted {
    public static void main(String[] args){
        int start1=0;
        int start2=0;
        int k=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array size");
        int n1=sc.nextInt();

        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the second array size");
        int n2=sc.nextInt();

        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int[] temp=new int[arr1.length+arr2.length];
        while(start1<n1 && start2<n2){
            if(arr1[start1]<arr2[start2]) {
                if (k == 0 || temp[k - 1] != arr1[start1]){
                    temp[k++] = arr1[start1];
                }
                start1++;
            }else if(arr1[start1]>arr2[start2]){
                if(k==0 || temp[k-1]!=arr2[start2]) {
                    temp[k++] = arr2[start2];
                }
                start2++;
            }else{
                if(k==0 || temp[k-1]!=arr1[start1]){
                    temp[k++]=arr1[start1];
                }
                start1++;
                start2++;
            }
        }
        while(start1<n1){
            if(k==0 || temp[k-1]!=arr1[start1]){
                temp[k++]=arr1[start1];
            }
            start1++;
        }
        while(start2<n2){
            if(k==0 || temp[k-1]!=arr2[start2]){
                temp[k++]=arr2[start2];
            }
            start2++;
        }

        for(int a:temp){
            if(a!=0)
                System.out.print(a+" ");
        }
    }
}

