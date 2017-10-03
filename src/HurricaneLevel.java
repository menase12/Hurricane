import java.util.Scanner;

public class HurricaneLevel {

    public static void main(String[]args){
        int speed;
        Scanner scan=new Scanner(System.in);
        System.out.print("How fast the wind is blowing?");
        speed=scan.nextInt();

        if (speed<73)
            System.out.println("It's not a hurricane");
        else if (speed >73 && speed<=95)
            System.out.println("It is a first class hurricane");
        else if (speed >95 && speed<=110)
            System.out.println("It is a second class hurricane");
        else if (speed >110 && speed<=130)
        System.out.println("It is a third class hurricane");
        else if (speed >130 && speed<=155)
        System.out.println("It is a fourth class hurricane");
        else{
            System.out.println("It is a fifth class hurricane");
        }
    }
}
