
public class Salary {

	static void validateSalary(int salary) throws InvalidSalaryException {
		if (salary < 2100)
			throw new InvalidSalaryException("You need to work hard");
		else
			System.out.println("You need to work hard");
	}

	public static void main(String args[]) {
		try {
			validateSalary(3000);
		} catch (Exception m) {
			System.out.println(  m.getMessage());
		}

		System.out.println("Salary is good");
	}
}

class InvalidSalaryException extends Exception { 

	InvalidSalaryException(String s) { 
		super(s);
	}
}
