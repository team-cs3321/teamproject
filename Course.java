    //NOTE: There are no accessor methods at this moment.  Will work on those
    //soon.  They are very simple and I just haven't got around to it yet - Corey
package Database;

//Course is a subClass of Student to allow use of course modification functions
//without having overwrite all other student data.
public class Course extends Student {
    
    private String Title;
    private double Exam1, Exam2, Exam3;
    private int CreditHours;
    
    //Default Constructor for Course.
    public Course()
    {
        Title = " ";
        Exam1 = 0;
        Exam2 = 0;
        Exam3 = 0;
        CreditHours = 0;
    }
    
    //Variable Constructor for course information.
    public Course(String title, double exam1 , double exam2, double exam3, int creditHours )
    {
        this.Title = title;
        this.Exam1 = exam1;
        this.Exam2 = exam2;
        this.Exam3 = exam3;
        this.CreditHours = creditHours;
    }
    
    //Copy Constructor to help move students around, and overwrite
    //parts of the arrayList.
    public Course(Course aCourse)
    {        
        this.Title = aCourse.Title;
        this.Exam1 = aCourse.Exam1;
        this.Exam2 = aCourse.Exam2;
        this.Exam3 = aCourse.Exam3;
        this.CreditHours = aCourse.CreditHours;
        
    }
    
    //Set course title.
    public void setTitle(String title)
    {
        this.Title = title;
    }
    
    //Set Exam 1 score.
    public void setExam1(double exam1)
    {
        this.Exam1 = exam1;
    }
    
    //Set Exam 1 score.
    public void setExam2(double exam2)
    {
        this.Exam2 = exam2;
    }
    
    //Set Exam 1 score.
    public void setExam3(double exam3)
    {
        this.Exam3 = exam3;
    }
    
    //Set credit hours for the course.
    public void setCreditHours(int creditHours)
    {
        if(creditHours <= 4 && creditHours > 0)
        {
            this.CreditHours = creditHours;
        }
        else
        {
            System.out.print("Invalid input, number of Credit Hours for a course"
                    + " must be between 1 - 4");
        }
    }
       
}
