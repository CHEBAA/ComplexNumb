import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое комплексное число 1");
        String a = in.nextLine();
        System.out.print("Введите первое комплексное число 2");
        String b = in.nextLine();
        String[] words = a.split("");
        String[] words2 = b.split("");


        ComplexNumb Numb = new ComplexNumb(Integer.parseInt(words[0]),Integer.parseInt(words[4]));
        Numb.setB(10000);
       ComplexNumb Numb2 = new ComplexNumb(Integer.parseInt(words2[0]),Integer.parseInt(words2[4]));

        ComplexNumb sum = (ComplexNumb)   Numb2.sum(Numb);//
        System.out.println(sum.getA()+ " + " + sum.getB() + "i");

        ComplexNumb dif = (ComplexNumb) Numb2.dif(Numb);
        System.out.println(dif.getA()+ " + " + dif.getB() + "i");

        ComplexNumb mul = (ComplexNumb) Numb2.mul(Numb);
        System.out.println(mul.getA()+ " + " + mul.getB() + "i");

        ComplexNumb div = (ComplexNumb) Numb2.div(Numb);
        System.out.println(div.getA()+ " + " + div.getB() + "i");

        System.out.println("сопряженное число 1 " + words[0] + " - " + words[4]+ "i");
        System.out.println("сопряженное число 2 " + words2[0] + " - " + words2[4]+ "i");

        System.out.print("Введите степень");
        int n = Integer.parseInt(in.nextLine());
        ComplexNumb pow =Numb ;
        for(int i=0;i<n-1;i++){
            pow =  Numb.mul(pow);
        }
        System.out.println(pow.getA()+ " + " + pow.getB() + "i");


    }


}
