package weekFive;

import java.util.ArrayList;
import java.util.Scanner;

public class ex88 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true){
            System.out.print("Name: ");
            String name = reader.nextLine();

            if(name.equals("")){
                for(Student student : list){
                    System.out.println(student.toString());
                }
                break;
            }
            System.out.print("Studentnumber: ");
            String studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
        }
        System.out.print("Give search term: ");
        String searchInput = reader.nextLine();

        for(Student student : list){
            if(student.getName().contains(searchInput)){
                System.out.println(student.toString());
            }
        }

    }
}
