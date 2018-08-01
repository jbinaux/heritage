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

}