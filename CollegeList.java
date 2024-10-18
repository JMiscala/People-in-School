import java.util.*;

class Person {
    private String name, contactNum;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return "Name: " + name;
    }
    public void setContactNum(String c){
        this.contactNum = c;
    }
    public String getContactNum(){
        return "Contact Number: " + contactNum;
    }

}

class Student {
    private String program;
    private int yearLevel;

    public void setProgram(String p){
        this.program = p;
    }
    public String getProgram(){
        return "Enrolled Program: "+program;
    }
    public void setYearLevel(String y){
        int yNew = Integer.parseInt(y);
        this.yearLevel = yNew;
    }
    public int getYearLevel(){
        return yearLevel;
    }
}

class Employee {
    private double salary;
    private String department;

    public void setSalary(double s){
        this.salary = s;
    }
    public double getSalary(){
        return salary;
    }
    public void setDepartment(String d){
        this.department = d;
    }
    public String getDepartment(){
        return department;
    }
}

class Faculty{
    private boolean status;
    public void setStatus(boolean trORfl) {
        this.status = trORfl;
    }
    public boolean isRegular() {
        return status;
    }
}

public class CollegeList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
    
        char whatType, stats;
        String empDept, employeeName, contactNo, enrolledProgram, studYear, design = "---------------------------\n";
        int employeeSalary, checkFirstStud;
        boolean isStats;

        System.out.print("Press E for Employee, F for Faculty, or S for Student:  ");
        whatType = in.next().toUpperCase().charAt(0);
        if(whatType == 'E'){
            System.out.println("Type Employee's name, contact number, Salary and Department."+"\nPress enter after every"+
                    " input.");
      
            System.out.print("Name: "); employeeName = sc.nextLine();
            System.out.print("Contact #: "); contactNo = sc.nextLine();
            System.out.print("Salary: "); employeeSalary = in.nextInt();
            System.out.print("Department: "); empDept = sc.nextLine();
           
            Employee em = new Employee();
            em.setDepartment(empDept); em.setSalary(employeeSalary);
            Person employee = new Person();
            employee.setName(employeeName); employee.setContactNum(contactNo);
            System.out.println(design+employee.getName()+"\n"+
                    employee.getContactNum()+"\nSalary: "+em.getSalary()+"\nDepartment: "
                    +em.getDepartment());
        }
        else if(whatType == 'F'){
            System.out.print("Regular/Tenured or Not(Y/N): ");
      
            stats = in.next().toUpperCase().charAt(0);
            if(stats == 'Y'){
                isStats = true;
                System.out.println("Type Employee's name, contact number, Salary and Department."+"\nPress enter after every"+
                        " input.");
             
                System.out.print("Name: "); employeeName = sc.nextLine();
                System.out.print("Contact #: "); contactNo = sc.nextLine();
                System.out.print("Salary: "); employeeSalary = in.nextInt();
                System.out.print("Department: "); empDept = sc.nextLine();
           
                Employee em = new Employee();
                em.setDepartment(empDept); em.setSalary(employeeSalary);
                Person employee = new Person();
                employee.setName(employeeName); employee.setContactNum(contactNo);
                Faculty fc = new Faculty();
                fc.setStatus(isStats);
                System.out.println(design+employee.getName()+"\n"+
                        employee.getContactNum()+"\nSalary: "+em.getSalary()+"\nDepartment: "
                        +em.getDepartment()+"\nRegular: "+fc.isRegular());
            }
            else if(stats == 'N'){
                isStats = false;
                System.out.println("Type Employee's name, contact number, Salary and Department."+"\nPress enter after every"+
                        " input.");
            
                System.out.print("Name: "); employeeName = sc.nextLine();
                System.out.print("Contact #: "); contactNo = sc.nextLine();
                System.out.print("Salary: "); employeeSalary = in.nextInt();
                System.out.print("Department: "); empDept = sc.nextLine();
           
                Employee em = new Employee();
                em.setDepartment(empDept); em.setSalary(employeeSalary);
                Person employee = new Person();
                employee.setName(employeeName); employee.setContactNum(contactNo);
                Faculty fc = new Faculty();
                fc.setStatus(isStats);
                System.out.println(design+employee.getName()+"\n"+
                        employee.getContactNum()+"\nSalary: "+em.getSalary()+"\nDepartment: "
                        +em.getDepartment()+"\nRegular: "+fc.isRegular());
            }

        }
        else if(whatType == 'S'){
            System.out.println("Type Student's name, contact number, enrolled program and Year(1-4)."+"\n"+
            "Press enter after every Input.");
            System.out.print("Name: "); employeeName = sc.nextLine();
            System.out.print("Contact #: "); contactNo = sc.nextLine();
            System.out.print("Enrolled Program: "); enrolledProgram = sc.nextLine();
            System.out.print("Student Year: "); studYear = sc.next(); checkFirstStud = Integer.parseInt(studYear);
            if(checkFirstStud > 4){
                System.out.println("Error on College Input... Terminating.");
                System.exit(0);
            }else{
             
                Person student = new Person();
                student.setName(employeeName); student.setContactNum(contactNo);
                Student stud = new Student();
                stud.setProgram(enrolledProgram); stud.setYearLevel(studYear);
                System.out.println(design+student.getName()+"\n"+student.getContactNum()+"\n"
                        +stud.getProgram()+"\nYear Level: "+stud.getYearLevel());
            }

        }

    }
}