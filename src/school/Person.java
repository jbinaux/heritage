package school;


/**
 * 
 */
public class Person {

    /**
     * Default constructor
     */
    public Person() {
    }

    /**
     * 
     */
    public String firstName;

    /**
     * 
     */
    public String surName;

    /**
     * 
     */
    public int age;

    /**
     * 
     */
    public String gender;

    /**
     * To know if the person is absent from the school or not.
     * @return
     */
    public boolean isAbsent() {
        // TODO implement here
        return false;
    }

    /**
     * To know if the person is having lunch at the cafeteria or not.
     * @return
     */
    public boolean hasLunchAtTheCafeteria() {
        // TODO implement here
        return false;
    }

    /**
     * Caculate how many minutes the person is late.
     * @return
     */
    public int isXMinutesLate() {
        // TODO implement here
        return 0;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}