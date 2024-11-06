import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class exp64{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name to read with .txt \n");
		String inf=sc.nextLine();
		System.out.println("Enter file name to write with .txt \n");
		String onf=sc.nextLine();
		try{
			FileInputStream fr = new FileInputStream(inf);
			FileOutputStream fw = new FileOutputStream(onf);
			int data;
			while((data=fr.read()) !=-1) {
				fw.write(data);}
				System.out.println("File has been copied successfully. ");
				fr.close();
				fw.close();}
		catch(Exception e){
		System.out.println("An error occured while processing the file: " +e.getMessage());
		}
		}
		}
