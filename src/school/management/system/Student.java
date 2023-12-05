package school.management.system;

/**
 * Created by Joan Bahati
 * This class is responsible for keeping track of the student's
 * name, id, grade, feesPaid and totalFees
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Fees for every student is $30,000
     *
     * @param id    id for the students: unique identifier
     * @param name  name for the student
     * @param grade grade of the student
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Not going to alter Student'name, student id.

    /**
     * Used to update the student's grade.
     *
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * feesPaid = 10,000 + 5000+15000
     * The school is going to receive the funds.
     * The school is going to receive the funds
     *
     * @param fees the fees the student pays
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid byt the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees od the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name +
                " Total fees paid so far $"+ feesPaid;


    }
}
