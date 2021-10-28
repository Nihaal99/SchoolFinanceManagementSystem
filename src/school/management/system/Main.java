package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Creating the object of teacher class and adding Teacher objects to school
		 * Teachers list in School class Since constructor of teacher class contains
		 * parameters so for object creation we need to assign values to the parameters
		 */
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher mellina = new Teacher(2, "Mellina", 700);
		Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

		// Student class object creation and adding Student objects to school Students
		// list in School class
		Student tamasha = new Student(1, "Tamasha", 4);
		Student rakshith = new Student(2, "Rakshith", 12);
		Student rabbi = new Student(3, "Rabbi", 5);

		/*
		 * In order to create objects of School class we need to pass Teachers list and
		 * Students list to it Adding teacher objects to taechers list
		 */
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellina);
		teacherList.add(vanderhorn);

		// Adding student objects to student list
		List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rakshith);
		studentList.add(rabbi);

		// Creating School class object
		School gps = new School(teacherList, studentList);
		rakshith.payFees(6000);
		tamasha.payFees(5000);
		System.out.println("The total money earned by gps is:" + " " + gps.getTotalMoneyEarned());

		System.out.println("-------MAKING SCHOOL PAY SALARY--------");
		/*
		 * lizzy.getSalary() will dynamically get the salary of lizzy which is assigned
		 * as 500 at Main Class at line no.12
		 */
		lizzy.recieveSalary(lizzy.getSalary());

		System.out.println("GPS has spent for salary to " + lizzy.getName() + " $ " + lizzy.getSalary()
				+ " and now has " + gps.getTotalMoneyEarned());
		System.out.println(rakshith);
		System.out.println(mellina);

	}

}
