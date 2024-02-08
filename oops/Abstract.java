package oops;


public class Abstract {
    public static void main(String args[])    {
        // Horse hc=new Horse();
        // hc.walk();


        Mustang myhorse=new Mustang();
    }
}

abstract class Animal{
    Animal(){
        System.out.println("Its a constructor");
    }
    void eat(){
        System.out.println("eating peacefully");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("its a contructor of horse");
    }
    void walk(){
        System.out.println("on 4 legssssssssssssssssss.");
    }
}

class Mustang extends Horse{
    void Mustang(){
        System.out.println("its mustang constructor.");
    }
}

class Fish extends Animal{
    void walk(){
        System.out.println("they dont have legs....");
    }
}