package Assignment_Exception;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	private String course;
	
	public Student(int rollNo, String name, int age, String course) throws NameNotValidException, AgeNotWithinRangeException {
		super();
		this.rollNo = rollNo;
		{
		if(!name.matches("^[a-zA-Z]*$")) {
			throw new NameNotValidException("Name should not contain numbers or symbols");
			}
		else {
			this.name = name;
			}
		}
		{
		if(age<15 || age>21) {
			throw new AgeNotWithinRangeException("Age should be between 15 and 21");
		}
		else {
			this.age = age;
			}
		}
		this.course = course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
}
