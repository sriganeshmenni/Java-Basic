class University
{
    String universityName;
    String location;
    public University(String universityName,String location)
    {
        this.universityName=universityName;
        this.location=location;
    }
    public void displayUniversityInfo()
    {
        System.out.println("University Name: "+universityName);
        System.out.println("University Location: "+location);
    }
    class Department
    {
        String deptName;
        int no_courses;
        public Department(String deptName, int no_courses)
        {
            this.deptName=deptName;
            this.no_courses=no_courses;
        }
        public void displayDepartmentInfo()
        {
            System.out.println("Department Name: "+deptName);
            System.out.println("No of courses: "+no_courses);
        }
    }
}
public class NestedClassDemo {
    public static void main(String args[])
    {
        University u = new University("Aditya University","Andhra Pradesh");

        University.Department d1 = u.new Department("CSE",6);
        University.Department d2 = u.new Department("IT",5);
        University.Department d3 = u.new Department("AIML",4);
        System.out.println("University Information: ");
        u.displayUniversityInfo();
        System.out.println("Department Information: ");
        d1.displayDepartmentInfo();
        d2.displayDepartmentInfo();
        d3.displayDepartmentInfo();
    }
}
