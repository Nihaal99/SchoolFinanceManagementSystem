package school.management.system;

//This class is created for keeping the track of teacher's name,id,salary.
public class Teacher {
	private int id;
	private String name;
	private int salary;
	private static int salaryEarned;

	/**
	 * 
	 * @param id
	 *            id for the teacher(unique)
	 * @param name
	 *            name of the teacher
	 * @param salary
	 *            salary of the teacher
	 */

	/*
	 * Creating the constructor of Teacher class Constructor creates the new object
	 * of teacher's class
	 */
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}

	/*
	 * As we have implemented private access modifier so getters and setters are
	 * required for giving values to the objects.
	 */
	// getters and setters for id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// getters and setters for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// getters and setters for salary
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * Adds to salary Removes from total money earned by the school
	 * 
	 * @param salary
	 */
	public static void recieveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);

	}

	@Override
	public String toString() {
		return "Name of the teacher is " + name + " Total salary earned is $" + salary;
	}

}
