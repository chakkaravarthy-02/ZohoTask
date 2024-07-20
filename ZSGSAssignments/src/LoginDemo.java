import java.util.Scanner;

public class LoginDemo {
    static String username;
    static String password;
    static{
        username="Saran";
        password="0123";
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the username: ");
        String username=sc.nextLine();
        System.out.println("Enter the password: ");
        String password=sc.nextLine();

        if(username.equals(LoginDemo.username)){
            if(password.equals(LoginDemo.password)){
                System.out.println("Login Successful");
            }else{
                System.out.println("Invalid password");
            }
        }else{
            System.out.println("Invalid username");
        }
    }
}

