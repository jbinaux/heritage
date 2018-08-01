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
    public int giveAGradeToStudent() {
        // TODO implement here
    }

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}