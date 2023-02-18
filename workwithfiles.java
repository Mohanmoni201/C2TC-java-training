package mohan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class workwithfiles {
	public static void main(String  a[]) throws IOException {
BufferedReader b = new BufferedReader(new FileReader("C:\\\\Users\\\\MOHAN KUMAR\\\\Desktop\\\\def.txt"));
String data="";
while((data = b.readLine())!=null) {
	System.out.println(data);	
}


	}
}