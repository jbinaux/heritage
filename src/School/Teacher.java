package School;


/**
 * 
 */
public class Teacher extends Staff {

    /**
     * Default constructor
     */
    public Teacher() {
    }

    /**
     * Field of specialization.
     */
    public String field;

    /**
     * Gives a grade to the student.
     * @return
     */
    public void giveAGradeToStudent(Student student, int grade) {
    	int[] tmp = new int[student.getCourse().getGrades().length];
    	for(int i = 0; i < student.getCourse().getGrades().length; i++)
    	{
    		tmp[i] = student.getCourse().getGrades()[i];
    	}
        student.getCourse().setGrades(new int[tmp.length + 1]);
        for(int i = 0; i < tmp.length; i++)
    	{
    		student.getCourse().getGrades()[i] = tmp[i];
    	}
        student.getCourse().getGrades()[student.getCourse().getGrades().length - 1] = grade;
    }

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}