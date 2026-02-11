public class Test {
    public static void main(String[] args) {
    Car obj1=new Car("red","harrier");
    Car obj2=new Car("blue","harrier");
    Car obj3=new Car("pink","harrier");
    Car[] car= {obj1, obj2, obj3};
    

        
    }
    
    
}
class Car{
    String colour;
    String model;
    Car(String colour,String model){
        this.colour=colour;
        this.model=model;
    }

    void display() {
        System.out.println("you are driving " + this.colour + " " + this.model);
    }
}


