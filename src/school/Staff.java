package school;


/**
 * 
 */
public class Staff extends Person {

    /**
     * Default constructor
     */
    public Staff() {
    }

    /**
     * 
     */
    public int yearsOfExperience;

    /**
     * 
     */
    public int salary;

    /**
     * @param increase 
     * @return
     */
    public void receivesSalaryIncrease(int increase) {
    	if (yearsOfExperience % 2 == 0)
    	{
    		salary += increase;
    	}
    }

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}