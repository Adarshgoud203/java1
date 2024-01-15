import java.io.*;
classFileRead1 {
public static void main(String args[])throws Exception{
FileReader fr= new FileReader("c:\\fh\\abc.txt");
BufferedReader br= new BufferedReader(fr);
int i;
while((i=br.read())!=-1)
{System.out.println((char)i);
}
br.close();
fr.close();
}
}