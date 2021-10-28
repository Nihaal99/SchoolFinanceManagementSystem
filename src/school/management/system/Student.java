package school.management.system;
/*Created by Nihaal on 23/10/2021
This class is responsible for keeping the track of students fees,name,grade & fees paid*/

public class Student {
	// private to access these within class only
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	/**
	 * To create a new student by initialising Fees for every student is $30000
	 * 
	 * @param id
	 *            id for the student:unique
	 * @param name
	 *            name of the student
	 * @param grade
	 *            grade of the student
	 */
	// Creating Student class constructor
	public Student(int id, String name, int grade) {
		// this keyword specifies the varaiables of class are equal to arguments
		// provided in this method
		this.id = id;
		this.name = name;
		this.grade = grade;
		// Below we are not using this keyword because feesPaid and feesTotal are not
		// provided as argument so there is no conflict between class variable and
		// argument variable
		feesPaid = 0;
		feesTotal = 30000;

	}

	/**
	 * keep adding the fees to feesPaid field Add the fees to the fees paid Thev
	 * school is going to recieve funds
	 * 
	 * @param fees
	 *            fees that the student pays
	 */
	public void updateFeesPaid(int fees) {
		feesPaid += fees;
	}

	/**
	 * 
	 * @return id of the student
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return the fees paid by the student
	 */
	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	/**
	 * 
	 * @return the total fees of the student
	 */
	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}

	/**
	 * 
	 * @return the grade of the student
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * Used to update the student's grade.
	 * 
	 * @param grade
	 *            new grade of the student.
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * pays the selected amount as fees to school
	 * 
	 * @param fees
	 */
	public void payFees(int fees) {
		// This will update the feesPaid by student
		feesPaid += fees;
		// This will add the fees payed by student to school
		School.updateTotalMoneyEarned(fees);
	}

	/**
	 * 
	 * @return the remaining fees
	 */
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}

	// If we print System.out.println(rakshith); It will give the location of that
	// object,but by overriding we can replace it with desired string as below
	@Override
	public String toString() {
		return "Name of the student " + name + " Total fees paid so far $ " + feesPaid;
	}

}
