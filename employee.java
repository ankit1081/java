public class employee {
    int serial_no;
    String name;
    String department;
    double salary;

    public void employee_details(int serial_no, String name, String department , double salary){
        this.serial_no= serial_no;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public void change_dept(String department){
        this.department = department;
    }

     void display_info(){
            System.out.println("Serial No="+serial_no );
            System.out.println("Name="+name);
            System.out.println("Department="+department);
            System.out.println("Salary="+salary);

        }
     
    
    public void inc_salary(double percentage){
        double inc_salary = salary+((percentage/100)*salary);
        System.out.println("Net percent increment="+percentage);
        System.out.println("Department and salary updated");
        System.out.println("New Department="+department);
        System.out.println("Incresed salary = "+ inc_salary);
    }

    public static void main(String arg[]){
        employee e1 = new employee();
        e1.employee_details(1, "Ankit", "Manager", 50000);
        e1.display_info();
        e1.change_dept("HR");
        e1.inc_salary(2);
        
    }
}