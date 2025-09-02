package kiet;

public class testStudent extends Student {
int attend_per;
String class_room;

public testStudent(int rollno,String name,String Department,char Section,int attend_per,String class_room)
{
	super(rollno,name,Department,Section);
	this.attend_per=attend_per;
	this.class_room=class_room;
}
public void submit() {
	System.out.println("The Student has submitted the assignment in hard copy");
}
public void payfee() {
	System.out.println("The Student with in classroom "+class_room+" has submitted his tuition fee,lab fee,Exam fee");
}
public void displayInfo(){
	super.displayInfo();
	System.out.println("Attend percentage is "+attend_per+" and class room is "+class_room+"");
	
}
}