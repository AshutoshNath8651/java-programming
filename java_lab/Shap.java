public class Shap {
    int len;
    int wir;
    
    Shap(int len,int wir){
        this.len = len;
        this.wir = wir;
        
    }
    int area(){
        System.out.println("superclass area:");
        return this.len*this.wir;
    } 
}
  

 class Rectangle extends Shap{
    int leng;
    int wirth;
    Rectangle(int leng,int wirth){
        super(leng,wirth);
        this.leng=leng;
        this.wirth=wirth;
    }
    int area(){
        System.out.println("rectangle area:");
        return this.leng*this.wirth;
    }
}
 class Circle extends Shap{
    int rds;
    Circle(int rds){
        super(rds,0);
        this.rds=rds;
    }
    int area(){
        System.out.print("area of circle:");
        return (22/7)*this.rds*this.rds;
    }

}
 class Main{
    public static void main(String[] args) {
        Shap are =new Shap(4, 4);
        System.out.println("area of superclass:"+are.area());
        Shap are1 =new Rectangle(4,6);
        System.out.println("area of subclass:"+are1.area());
        Shap are2 =new Circle(5);
        System.out.println("area of subclass:"+are2.area());
    }


}
