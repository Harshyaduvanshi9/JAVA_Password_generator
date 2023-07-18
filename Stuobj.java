import java.util.Scanner;
class StuDetail{
	
	
	
	Scanner sc = new Scanner(System.in);
	StuDetail()
	{
		System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        System.out.print("Enter date of birth (dd-mm-yyyy): ");
        String dob = sc.nextLine();

        System.out.print("Enter mobile number: ");
        String mobileNumber = sc.nextLine();

        String password = generatePass(name, rollNumber, city, dob, mobileNumber);
        System.out.println("Generated Password: " + password);
		
	}
	 String generatePass(String name, int rollNumber, String city, String dob, String mobileNumber) {
      
        String password = name.substring(0, 3).toLowerCase() +
                rollNumber +
                city.substring(0, 3).toLowerCase() +
                dob.substring(0, 2) +
                mobileNumber.substring(mobileNumber.length() - 3);

        return password;
    }
}

public class Stuobj {
    public static void main(String[] args) {
    	StuDetail s=new StuDetail();
    }
       

       

      
}