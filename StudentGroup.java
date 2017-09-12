import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
	l=student.length;
	this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	int i;
	for(i=0;i<=students;i++)
	{
		return Student[i]
	}
	}

	@Override
	public void setStudents(Student[] students) {
	int a;
	a=l;
	Student[a+1]=students;
	l++;

	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
	int	a=0;
	Student[a]==student;
	l++;
	
	}

	@Override
	public void addLast(Student student) {
	a=l;
	Student[a+1]=student;
	l++;	// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		a=l;
		Students[a]='\0';
		l--;
	}

	@Override
	public void remove(Student student) {
		a=l;
		Students[a]='\0';
		l--;
		
	}

	@Override
	public void removeFromIndex(int index) {
		a=l;
		Students[a]='\0';
		l--;
	}

	@Override
	public void removeFromElement(Student student) {
		a=l;
		Students[a]='\0';
		l--;
	}

	@Override
	public void removeToIndex(int index) {
		a=l;
		Students[a]='\0';
		l--;
	}

	@Override
	public void removeToElement(Student student) {
		a=l;
		Students[a]='\0';
		l--;
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
