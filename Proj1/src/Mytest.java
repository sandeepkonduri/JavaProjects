import java.util.*;
class Box{
    float l;
    float w;
    float h;
    Scanner sc = new Scanner(System.in);

    void getDimensions(){
        System.out.print("Enter the l, w, h of the box: ");
        l = sc.nextFloat();
        w = sc.nextFloat();
        h = sc.nextFloat();
    }

    float surfaceArea(){
        return 2*l*w + 2*w*h + 2*h*l;
    }

    float volume(){
        return l*w*h;
    }
}

public class Mytest{
    public static void main(String[] args){
        Box b1 = new Box();
        b1.getDimensions();

        System.out.println("The Surface Area of the box is: "+ b1.surfaceArea());
        System.out.println("The volume of the box is: "+ b1.volume());

        System.out.println("Good bye!!");
    }
}