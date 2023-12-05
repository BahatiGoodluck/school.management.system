package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joan Bahati
 */
public class Main {
    public static void main(String[] args) {

        Teacher Lizzy = new Teacher(1,"Lizzy",500);
        Teacher Mike = new Teacher(2,"Mike",700);
        Teacher Joan = new Teacher(3, "Joan",1000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Mike);
        teacherList.add(Joan);


        Student Emil = new Student(1,"Emil",5);
        Student Kasseem = new Student(2,"Kasseem",4);
        Student Washma = new Student(3,"Washma",3);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Emil);
        studentList.add(Kasseem);
        studentList.add(Washma);

        School SHS = new School(teacherList,studentList);


        Washma.payFees(5000);
        Emil.payFees(6000);
        System.out.println("SHS has earned :"+ "$" + SHS.getTotalMoneyEarned());

        System.out.println("...........MAKING SCHOOL PAY SALARY.........");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("SHS has spent for salary to " + Lizzy.getName()
        + " and now has" +" $ " + SHS.getTotalMoneyEarned());

        Mike.receiveSalary(Mike.getSalary());
        System.out.println("SHS has spent for salary to " + Mike.getName()
                + " and now has" +" $ " + SHS.getTotalMoneyEarned());

        System.out.println(Washma);
        System.out.println(Joan);
    }

}
