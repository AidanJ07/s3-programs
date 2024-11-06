import java.util.*;
public class fibonacci{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of terms in fibonacci: ");
int n = sc.nextInt();
int first=0;
int second=1;
System.out.println("The fibonacci series upto "+n+"terms is");
for(int i=1;i<=n;i++){
System.out.print(first+""+ "\t");
int next = first + second;
first = second;
second = next;
}
}
}


