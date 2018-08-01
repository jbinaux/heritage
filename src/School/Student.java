package School;


/**
 * 
 */
public class Student extends Person {

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * How many years the student spend in the school until now.
     */
    public int yearOfStudy;

    /**
     * 
     */
    public int classNumber;

    /**
     * Field of specialisation.
     */
    public String specialization;

    /**
     * 
     */
    public Courses course;

    /**
     * If the student pass the final exeam, he gains one yeaf of study.
     * @return
     */
    public boolean performAtFinalExam() {
        // TODO implement here
        return false;
    }

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

}