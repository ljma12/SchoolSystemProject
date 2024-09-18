   public class Student {
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
       
   public Student() {
	   this.firstName = "Luis";
	   this.lastName = "Meléndez";
	   this.registration = 1;
	   this.grade = 100;
	   this.year = 4;
   }
   
   public Student(String firstName, String lastName) {
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.registration = 1;
	   this.grade = 5;
	   this.year = 4;
   }
   
   public Student(String firstName, String lastName, int registration, int grade, int year) {
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.registration = registration;
	   this.grade = grade;
	   this.year = year;
   }
   

   public void printFullName(){
	      System.out.println(firstName + " " + lastName);
	   }

	   public boolean isApproved(){
	       return grade >=60; 
	   }

	   public int changeYearIfApproved(){
	      if (isApproved()) {
		   year += 1;
	       System.out.println("Congratulations! You've been promoted to the next year.");
	      }
	      return year;
	   }
   }