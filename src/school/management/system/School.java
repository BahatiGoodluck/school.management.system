package school.management.system;

import java.util.List;

/**
 * Created by Joan Bahati
 * Many teachers, many students in a school
 * Implements teahers, students, using an ArrayList
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * a new school object created
     * @param teachers list of teachers in the school
     * @param students list of students inthe school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Add a student to the school
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param MoneyEarned money that is supposed to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Update the money spent by the school
     * is the salary given by the school to its teachers
     * @param MoneySpent the money spent by the school
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned-= MoneySpent;
    }

}
