import java.util.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void updateName(String newName) {
        this.name = newName;
    }

    void displayName() {
        System.out.println(name);
    }
}

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the name: ");
        String initialName = sc.nextLine();
       
        Person person = new Person(initialName);
       
        System.out.println("Inputted name:");
        person.displayName();
       
        System.out.print("Enter new name: ");
        String newName = sc.nextLine();
       
        person.updateName(newName);
        System.out.println("Modified name:");
        person.displayName();
       
        sc.close();
    }
}
