import java.util.Scanner;
class Prog{
public static void main(String args[]){
int[] num={11,22,33,44,55};
try
{
for(int i=0;i<=5;i++)
{System.out.println(num[i]);}
}
catch(ArithmeticException e)
{
System.out.println(e+"one1");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e+"two2");
}
catch(Excetion ob){
System.out.println(ob+"three 3");
}
System.out.println("Thank you");
}}




