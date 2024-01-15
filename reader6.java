import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.util.Scanner;
class CharArrayWriterExample{
public static void main(String args[])throws Exception{
Scanner sc=new Scanner(System.in);
CharArrayWriter out=new CharArrayWriter();
out.write(sc.nextLine());
out.write("Welcome  to this Training");
FileWriter f1=new FileWriter("C:\\fh\\a.txt");
FileWriter f2=new FileWriter("C:\\fh\\b.txt");
out.writeTo(f1);
out.writeTo(f2);
f1.close();
f2.close();
System.out.println("Success....");
}
}