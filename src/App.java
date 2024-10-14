class Person{
    String name;
    int age;

    Person (){ //This gives the object a placeholder values for age and name
        age = 24;
        name = "Normal McNormal-Face";
    }

    void displayInfo(){ //To display name and age
        System.out.println("Name: "+name+"\nAge: "+ age+  " years old");
    }

    void printDetails(Person p){ // This is a Method that polymorphs into other Objects and showing outputting their respective
        p.displayInfo();        //displayInfo Methods
    }
}

class Student extends Person{
    String studentID;
    String course;
    int units;
    int feePerUnit = 1000;

    Student (String a, String b, int c, int d, String e){ //Setting the values for the Student Object
        name = e;
        age = d;
        studentID = a;
        course = b;
        units = c;
    }

    double calculateFees (double x){ //Used to calculate the fee of Enrollment
        x = units*feePerUnit;
        System.out.print(x);
        return x;
    }

    void displayInfo(){ //Methods for showing the values of the Student Object
        System.out.println("Name: "+name+"\nAge: "+ age+  " years old");
        System.out.println("Student ID: "+studentID+"\nCourse: "+ course);
        System.out.println("Units: "+units+"\nTotal Fee: P"+ units*feePerUnit);
    }
}

class Instructor extends Person{
    String employeeID;
    String department;
    double salary;

    Instructor (String a, String b, double c, int d, String e){  //Setting the values for the Instructor Object
        name = e;
        age = d;
        employeeID = a;
        department = b;
        salary = c;
    }

    void displayInfo(){ //Methods for showing the values of the Instructor Object
        System.out.println("Name: "+name+"\nAge: "+ age+  " years old");
        System.out.println("Employee ID: "+employeeID+"\nDepartment: "+ department);
        System.out.println("Salary: P"+ salary);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
       //Making objects and setting their values with the constructor
       Student Boy = new Student("1stM","Math",3,16,"Jason Matthews");
       Student Girl = new Student("1stF","Geography",2,17,"Elizabeth Santol");
       Instructor Male = new Instructor("Old1stM", "CEA", 42069, 69, "Bo Tox");
       Instructor Female = new Instructor("MiddleAge1stF", "ACADS", 40000, 30, "Fenta Nyl");
       Person Normal = new Person();

       //Using the displayInfo Method for each respective objects
       System.out.println("People");
       System.out.println("*~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*");
       Normal.displayInfo();
       System.out.println();
       Normal.printDetails(Boy); //Showing Polymorhism by using the printDetails method and the Boy object
       System.out.println("*~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*");

       System.out.println("\nStudents");
       System.out.println("*~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*");
       Boy.displayInfo();
       System.out.println();
       Girl.displayInfo();
       System.out.println("*~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*");


       System.out.println("\nInstructors");
       System.out.println("*~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*");
       Male.displayInfo();
       System.out.println();
       Female.displayInfo();
       System.out.println("*~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*~~~~~~*");
    }
}
