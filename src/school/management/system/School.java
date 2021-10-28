package school.management.system;

import java.util.List;

public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;

	/**
	 * @param teachers
	 *            list of teachers in the school
	 * @param students
	 *            list of students in the school
	 */
	public School(List<Teacher> teachers, List<Student> students) {

		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}

	/**
	 * 
	 * @return the list of teachers
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * 
	 * @param teacher
	 *            This will add teacher to teachers array list
	 */
	public void addTeacher(Teacher teacher) {

		teachers.add(teacher);
	}

	/**
	 * 
	 * @return the list of students
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * 
	 * @param student
	 *            This will add student to students array list
	 */
	public void addStudent(Student student) {

		students.add(student);
	}

	/**
	 * 
	 * @return the total money earned by school
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned - totalMoneySpent;
	}

	/**
	 * fees parameter from payFees method of Student Class is passed to the below
	 * method
	 * 
	 * @param MoneyEarned
	 *            adds the MoneyEarned to totalMoneyEarned
	 * @return
	 */
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;

	}

	/**
	 * 
	 * @return the total money spent by the school
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * 
	 * @param totalMoneySpent
	 *            add the MoneySpent to totalMoneySpent
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneySpent += moneySpent;
	}

}
