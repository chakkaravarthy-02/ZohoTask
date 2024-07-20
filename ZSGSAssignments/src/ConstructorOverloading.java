public class ConstructorOverloading {
    public static void main(String[] args){
        Person p=new Person("siva");
        Person p1=new Person("siva",21);
        Person p2=new Person("siva",21,"7/A,MGR Nagar,chennai");

        //first constructor
        System.out.println("Name:"+p.name);
        //second constructor
        System.out.println("Name:"+p1.name+" "+"Age:"+p1.age);
        //third constructor
        System.out.println("Name:"+p2.name+" "+"Age:"+p2.age+" "+"Address:"+p2.address);
    }
}
class Person{
    String name;
    int age;
    String address;

    Person(String name){
        this.name=name;
    }

    Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    Person(String name, int age, String address) {
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
