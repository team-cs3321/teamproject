package Database;

//Import Java package for use of Arraylist.
import java.util.*;

//Main driver function.  Will have to invest some time into exporting the
//database to a textfile that the program can read and display through the GUI
//.  Also, working on having this stay in the memory until a exit method is
//called.
public class StudentDatabase {
        
        public static void main(String[] args)
        {
            //Here I am adding the first student to the records dabase.
            //When this happens the empty Courses ArrayList will automatically
            //be added to the Student object.
            ArrayList<Student> studentRecords = new ArrayList<>();
            studentRecords.add(new Student());
            
            //All current mutator methods can be used to populate the Student
            //Objects.
        }
    
    
}
