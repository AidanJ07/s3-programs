import java.io.FileWriter;
import java.util.Scanner;
public class exp63{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name with .txt");
		String filePath=sc.nextLine();
		String content="This is A SENTENCE.";
		try{
			FileWriter fw=new FileWriter(filePath);
			fw.write(content);
			
			System.out.println("Successfully wrote to the file. ");
			fw.close();}
		catch(Exception e){
			System.out.println("An error occurred while writing to the file:"+e.getMessage());
			}
		}
}
