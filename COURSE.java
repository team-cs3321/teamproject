package Database;

public class COURSE extends STUDENT {
    
    public String Title;
    public double Exam1, Exam2, Exam3;
    public int CreditHours;
    
    public COURSE()
    {
        Title = " ";
        Exam1 = 0.0;
        Exam2 = 0.0;
        Exam3 = 0.0;
        CreditHours = 0;
    }
    
    public COURSE(String title, double exam1 , double exam2, double exam3, int creditHours )
    {
        this.Title = title;
        this.Exam1 = exam1;
        this.Exam2 = exam2;
        this.Exam3 = exam3;
        this.CreditHours = creditHours;
    }

    public COURSE(COURSE aCourse)
    {        
        this.Title = aCourse.Title;
        this.Exam1 = aCourse.Exam1;
        this.Exam2 = aCourse.Exam2;
        this.Exam3 = aCourse.Exam3;
        this.CreditHours = aCourse.CreditHours;
        
    }
    
    public void setTitle(String title)
    {
        this.Title = title;
    }
    
    public void setExam1(double exam1)
    {
        this.Exam1 = exam1;
    }
    
    public void setExam2(double exam2)
    {
        this.Exam2 = exam2;
    }
    
    public void setExam3(double exam3)
    {
        this.Exam3 = exam3;
    }
    
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
    
    public String getTitle()
    {
        return this.Title;
    }
    
    public double getExam1()
    {
        return this.Exam1;
    }
    
    public double getExam2()
    {
        return this.Exam2;
    }
    
    public double getExam3()
    {
        return this.Exam3;
    }
    
    public double getCreditHours()
    {
            return this.CreditHours;
    }
    
    public void displayTITLE(COURSE aCourse)
    {
        System.out.print(this.Title);
    }
    
    public void displayEXAM1(COURSE aCourse)
    {
        System.out.print(this.Exam1);
    }
    
    public void displayEXAM2(COURSE aCourse)
    {
        System.out.print(this.Exam2);
    }
    
    public void displayEXAM3(COURSE aCourse)
    {
        System.out.print(this.Exam3);
    }
    
    public void displayCREDITHOURS(COURSE aCourse)
    {
        System.out.print(this.CreditHours);
    }
    
    public void displayCourse(COURSE aCourse)
    {
        System.out.print("Title: " + this.Title + " Exam1: " + this.Exam1
        + " Exam2: " + this.Exam2 + " Exam3: " + this.Exam3 + " CreditHours: "
        + this.CreditHours);
    }
       
}
