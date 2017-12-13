package coursemanager7;

public class coursemanager7 {

	private Student s[];
	private int n;
	public static final int MAX_NUM = 100;

	public coursemanager7() {
		s = new Student[MAX_NUM];
		setN(0);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void addStudent(Student newStudent) {
		if (n < MAX_NUM) {
			if(fsbn(newStudent.getName())==-1) {
				s[n]=newStudent;
				n++;	
			}
		} else
			System.out.println("ERROR: COURSE IS FULL");
	}

	public int fsbn(String name) {
		for (int i = 0; i < n; i++) {
			if (s[i].getName().equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}
	public void displayallstudents() {
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Student ["+i+"]'s id  "+s[i].getId()+" \n"+ s[i].getName() + " \n" + s[i].getGpa() +"\n");
		}
	}
}
