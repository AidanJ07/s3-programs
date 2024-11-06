import java.io.FileReader;
import java.util.*;
public class exp62{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name with .txt \n");
		String filePath=sc.nextLine();
		try{
			FileReader fileReader = new FileReader(filePath);
			int character;
			while((character=fileReader.read()) !=-1) {
				System.out.print((char) character); }
			fileReader.close();}
		catch(Exception e){
		System.out.println("An error occured while reading the file: " +e.getMessage());
		}
		}
		}
