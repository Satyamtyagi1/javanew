package kiet;

public class OnlineStudent extends Student{
	String Platform;
	String internetspeed;
	public OnlineStudent(int RollNo,String Name,String Department,char Section,String Platform,String internetspeed) {
		super(RollNo,Name,Department,Section);
		this.Platform=Platform;
		this.internetspeed=internetspeed;
	}
	
	public void payfee() {
		super.payfee();
		System.out.println("He Can Now Attend Classes");
	}
}