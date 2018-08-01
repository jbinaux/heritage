package school;

/**
 * 
 */
public class Admin extends Staff {

    /**
     * Default constructor
     */
    public Admin() {
    }

    /**
     * In which department the administrative staff is attached.
     */
    public String department;

    /**
     * The admin attributes a class number to the student.
     * @return
     */
    public void giveAClassNumberToStudent() {
        // TODO implement here
    }

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}