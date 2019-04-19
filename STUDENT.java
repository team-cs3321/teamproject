package Database;

import java.util.*;

public class STUDENT extends STUDENTdatabase {
    
    public String First;
    public String Last;
    public int ID;
    public ArrayList<COURSE> Courses;
    public double GPA;
    protected String Login;
    protected String Password;
    
    public STUDENT()
    {
        First = " ";
        Last = " ";
        ID = 0;
        Courses = new ArrayList<>();
        GPA = 0.0;
        Login = " ";
        Password = " ";
    }
    
    public String getFirst(){
        return this.First;
    }
    
    public String getLast(){
        return this.First;
    }
        
    public int getID(){
        return this.ID;
    }        

    public COURSE getCourse(int a){
        if(a > this.Courses.size() || a < 0)
        {
            System.out.print("Invalid value, please input a number between 0"
                    + " and 3 when calling this method.");
            
            return null;
        }
        else
            return this.Courses.get(a);
    }
    
    public double getGPA(){
        return this.GPA;
    }
    
    public STUDENT accessStudent(STUDENT aStudent){
        return aStudent;
    }

    public void calculateGPA()
    {
        double tempGPA = 0, tempSUM = 0;
        if(this.Courses.isEmpty() == true || this.Courses.get(0).Exam1 == 0.0)
        {
            System.out.print("This student hasn't taken an Exam yet.");
        }
        else
        {
            for(int i = 0; i < this.Courses.size(); i++)
            {
                tempSUM = (this.Courses.get(i).Exam1 + this.Courses.get(i).Exam2
                        + this.Courses.get(i).Exam3)/this.Courses.get(i).CreditHours;
                tempGPA = tempGPA + tempSUM;
                tempSUM = 0;
            }
            
            this.GPA = tempGPA/this.Courses.size();
        }
    }
    
}
