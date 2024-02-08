package oops;

public class One {

    public static void main(String[] args) {
        // Pen p1=new Pen();//created object

        // p1.setColor("blue");//calling function
        // p1.setPoint(7);

        // System.out.println(p1.color);//print
        // System.out.println(p1.point);

        Animal a=new Animal();
        a.eat();
        
    }

}

// class Pen{
//     String color;
//     int point;

//     void setColor(String newColor){
//         color = newColor;
//     }

//     void setPoint(int newPoint){
//         point = newPoint;
//     }
// }

class Animal{
        String color;
    
        void eat(){
            System.out.println("mango");
        }
    
        void breathe(){
            System.out.println("rose smell");
        }

        
    }

class birds extends Animal{
    void fly(){
        System.out.println("ya it can flyyyyyyyyyyyy");
    }
}

class mamals extends Animal{
    void walk(){
        System.out.println("ya we can walk here talking about us.");
    }
}

class fish extends Animal{
    void swim(){
        System.out.println("ya here taling about my favoirote animal");
    }
}