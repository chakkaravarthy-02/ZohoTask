package shoping;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Product {
    public abstract int getPrice();
    public abstract String description();
}
abstract class Electronic extends Product{
    Electronic(){
        System.out.println("Product Name:"+description());
        System.out.println("Price:"+getPrice());
    }
}
abstract class Clothing extends Product{
    Clothing(){
        System.out.println("Product Name:"+description());
        System.out.println("Price:"+getPrice());
    }
}
abstract class Book extends Product{
    Book(){
        System.out.println("Product Name:"+description());
        System.out.println("Price:"+getPrice());
    }
}
class Mobile extends Electronic{

    @Override
    public int getPrice() {
        return 20000;
    }

    @Override
    public String description() {
        return "Mobile";
    }
}
class Laptop extends Electronic{

    @Override
    public int getPrice() {
        return 80000;
    }

    @Override
    public String description() {
        return "Laptop";
    }
}
class Chudi extends Clothing{

    @Override
    public int getPrice() {
        return 2000;
    }

    @Override
    public String description() {
        return "Chudi";
    }
}
class vesti extends Clothing{

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String description() {
        return "vesti";
    }
}
class AtomicHabits extends Book{

    @Override
    public int getPrice() {
        return 700;
    }

    @Override
    public String description() {
        return "Atomic Habits";
    }
}
class ThinkAndGrowRich extends Book{

    @Override
    public int getPrice() {
        return 400;
    }

    @Override
    public String description() {
        return "ThinkAndGrowRich";
    }
}
class ShoppingCart{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int whichType;
        ArrayList<Product>cart=new ArrayList<>();
        do{
            System.out.println("Which type of product you want : ");
            System.out.println("1.Electronic");
            System.out.println("2.Clothing");
            System.out.println("3.Books");
            System.out.println("4.Exit");

            whichType=sc.nextInt();
            shoppingCartAdd(whichType,cart);
        }while(whichType<4);
        System.out.println("\t\t\tShopping Cart\t\t\t");
        System.out.println("_________________________________");
        int total=0;
        for(Product product:cart){
            System.out.println(product.description()+" : "+product.getPrice());
            total+=product.getPrice();
        }
        System.out.println("Total : "+total);
    }
    private static void shoppingCartAdd(int whichType, ArrayList<Product> cart) {
        Scanner sc=new Scanner(System.in);
        int n;
        if(whichType==1){
            Mobile m=new Mobile();
            Laptop l=new Laptop();
            do{
                System.out.println("1.Mobile");
                System.out.println("2.Laptop");
                System.out.println("3.to return to main page");
                n= sc.nextInt();
                if(n==1){
                    cart.add(m);
                }else{
                    cart.add(l);
                }
            }while(n<3);
        }else if(whichType==2){
            Chudi c=new Chudi();
            vesti v=new vesti();
            do{
                System.out.println("1.Chudi");
                System.out.println("2.Vesti");
                System.out.println("3.to return to main page");
                n= sc.nextInt();
                if(n==1){
                    cart.add(c);
                }else{
                    cart.add(v);
                }
            }while(n<3);
        }else if(whichType==3){
            AtomicHabits ah=new AtomicHabits();
            ThinkAndGrowRich tagr=new ThinkAndGrowRich();
            do{
                System.out.println("1.Atomic Habits");
                System.out.println("2.Think and Grow Rich");
                System.out.println("3.to return to main page");
                n= sc.nextInt();
                if(n==1){
                    cart.add(ah);
                }else{
                    cart.add(tagr);
                }
            }while(n<3);
        }
    }
}
