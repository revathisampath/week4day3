package week4day3;

public class Students {
	
	public void getStudentInfo(int studentId,String name) {
		System.out.println("StudentId:"+studentId+" **** "+"Studentname:"+name);
	}
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("EmailId:"+email+" **** "+"PhoneNumber:"+phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Students stud = new Students();
        stud.getStudentInfo(01,"Revathi");
        stud.getStudentInfo("revathisampath01@gmail.com",6034567891l);
	}

}
