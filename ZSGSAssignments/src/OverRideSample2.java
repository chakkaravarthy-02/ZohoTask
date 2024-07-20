
class Movie{
    public void display(){
        System.out.println("This is movie");
    }
}
class Action extends Movie{
    public void display(){
        System.out.println("This is Action movie");
    }
}
class Comedy extends Movie{
    public void display(){
        System.out.println("This is Comedy movie");
    }
}
class Romance extends Movie{
    public void display(){
        System.out.println("This is Romance movie");
    }
}

public class OverRideSample2 {
    public static void main(String[] args){
        Movie am=new Action();
        am.display();
        Movie cm=new Comedy();
        cm.display();
        Movie rm=new Romance();
        rm.display();
    }
}
