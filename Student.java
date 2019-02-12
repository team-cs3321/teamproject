package Database;

//Import Java package for use of Arraylist.
import java.util.*;

//Student object to be added to Database arrayList in MAIN class.
    //NOTE: There are no accessor methods at this moment.  Will work on those
    //soon.  They are very simple and I just haven't got around to it yet - Corey
public class Student extends StudentDatabase {
    
    private String Name;
    private int ID;
    private ArrayList<Course> Courses;
    private double GPA;
    
    //Default constructor for student object, and establish
    public Student()
    {
        Name = " ";
        ID = 0;
        //Limits the student to 5 total course for the term.
        Courses = new ArrayList<>();
        GPA = 0.0;
    }
    
    //Input the student name on a blank student object, or modify a student
    //name on a popoulated object.
    public void setName(String name)
    {
        this.Name = name;
    }
    
    //Input the student ID on a blank student object, or modify a student ID
    //on a popoulated object.
    public void setID(int id)
    {
        this.ID = id;
    }
    
    //Add a blank course to a Student object.
    public void AddCourse(Course aCourse)
    {
        if(this.Courses.size() <= 3){
           this.Courses.add(aCourse); 
        }
        else
        {
            System.out.print("This student already has a full course load.");
        }
    }
    
    //Generate GPA based off of entered exam scores.
    //Not sure if we want total GPA for the student, or just GPA of the class.
    //We might have to generate multiple terms, so this can actually be calculated.
    //PLACEHOLDER
    public void calculateGPA(Student aStudent)
    {
        //No code here yet.  The basic idea of this method is to calculate the grade
        //for every course push into the courses ArrayList, reference a score (WE WILL
        //USE THE WHOLE NUMBER UHD SYSTEM), add up points, and then divide by total creditHours.
        //I just haven't done the logic on the nested loops yet.
    }
    
}
