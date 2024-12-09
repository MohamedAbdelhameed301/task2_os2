//
import java.util.*;
public class abdelhameed {

    public static void main(String[] args) {

        //final int inner_port=8001,outer_port=4001;
        
        Scanner input =new Scanner(System.in);
       
        System.out.print("enter two number : ");
        double num1,num2;
        num1=input.nextDouble();
        num2=input.nextDouble();
        System.out.println("choose the number of the operation you want to  do : ");
        System.out.println("1. + ");
        System.out.println("2. - ");
        System.out.println("3. * ");
        System.out.println("4. / ");
       System.out.println("5. % ");
       int operation;
       operation=input.nextInt();
       input.close();
       
       switch(operation){
           
           case 1:
           {
               System.out.println("the summition is : "+(num1+num2));
               break;
           }
           case 2:
           {
                System.out.println("the difference is : "+(num1-num2));
                    break;
           }
           case 3:
           {
               System.out.println("the multiplication is : "+(num1*num2));
               break;
           }
           case 4:
           {
               if(num2==0){
                   System.out.println("cannot devide by zero ,please enter another number !");
                   break;
               }
               else{
                 System.out.println("the devission is : "+(num1/num2));
                    break;  
               }
           }
           case 5:
           {
           System.out.println("the modulase is : "+(num1%num2));
               break;
           }
           
           default:
               System.out.println("invalid operation *_* ,try again !");
       }



    }


}