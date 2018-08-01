package school;


/**
 * 
 */
public class Courses {

    /**
     * Default constructor
     */
    public Courses() {
    }

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public int[] grades = new int[0];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

}