package school.management.system;

/**
 * Created by Joan Bahati
 * This class is responsible for keeping the track
 * of the teacher's name, id and salary
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object
     * @param id id of the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return the id, name and salary
     * of the teacher
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    /**
     * Update the salary of the teacher
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to salaryEarned
     * Removes from the total money earned by the school
     * @param salary
     */

    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Teacher's name: " + name +
                " Total salary earned so far $" + salary;
    }
}
