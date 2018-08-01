package school;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student tom = new Student();
		Teacher tournesol = new Teacher();
		Admin michu = new Admin();
		
		tom.setAge(16);
		tom.setFirstName("tom");
		tom.setGender("h");
		tom.setSurName("tim");
		tom.setYearOfStudy(2);
		tom.getCourse().setName("math");
		tournesol.setGender("h");
		tournesol.setAge(42);
		tournesol.setYearsOfExperience(12);
		tournesol.setFirstName("jean-martin");
		tournesol.setSurName("Tournesol");
		tournesol.setSalary(1600);
		tournesol.receivesSalaryIncrease(100);
		tournesol.giveAGradeToStudent(tom, 13);
		tournesol.giveAGradeToStudent(tom, 16);
		tournesol.giveAGradeToStudent(tom, 9);
		tournesol.giveAGradeToStudent(tom, 11);
		tournesol.giveAGradeToStudent(tom, 15);
		
		System.out.println("");
		System.out.print(tom.getFirstName() + " has ");
		for(int i = 0; i < tom.getCourse().getGrades().length; i++)
		{
			System.out.print(tom.getCourse().getGrades()[i] + " ");
		}
		System.out.println(" in " + tom.getCourse().getName());
	}

}
