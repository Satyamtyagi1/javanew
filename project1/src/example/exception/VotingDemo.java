package example.exception;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}
class Voting{
	public void checkEligibility(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("You are not eligible to vote");
		}
		else
		{
			System.out.println("You are eligible to vote");
		}
	}
}
public class VotingDemo {
	
public static void main(String args[])
{
	Voting vote = new Voting();
	try {
	vote.checkEligibility(10);
	}
	catch(InvalidAgeException e)
	{
		System.out.println("Exception is handled");
	}
	System.out.println("Done");
}

}
