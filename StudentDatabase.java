package Database;

import java.util.*;

public class StudentDatabase {    

        private final static String testLogin = "ABC";
        private final static String testPassword = "123";
    
        private static void createDatabase ()
        {
            Admin Admin1 = new Admin(testLogin, testPassword);            
            ArrayList<Student> Spring2019 = new ArrayList<>();
            Spring2019.add(new Student());
        }
    
        public static void main(String[] args)
        {
            createDatabase();
        }
    
    
}
