public class student {
    String name;
    int roll_no;
    String section;

    public void student_details(String name, int roll_no, String section){
        this.name=name;
        this.roll_no=roll_no;
        this. section= section;
    }
    public void display_info(){
        System.out.println("Name     =  "+name);
        System.out.println("Roll No  =  "+roll_no);
        System.out.println("Section  =  "+section);
        System.out.println("_____________________________________________");
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.student_details("Ankit", 33, "2A");
        s1.display_info();
        s1.student_details("Anmol", 36, "2A");
        s1.display_info();
        s1.student_details("Keshav", 37, "2B");
        s1.display_info();
        s1.student_details("Saurabh", 31, "2C");
        s1.display_info();
        s1.student_details("Himanshu", 39, "2D");
        s1.display_info();
    }
}
