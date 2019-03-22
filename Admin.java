
package Database;


class Admin extends StudentDatabase {
    
    private String Login;
    private String Password;
    
    Admin(){
        this.Login = " ";
        this.Password = " ";
    }

    Admin(String login, String password){
        this.Login = login;
        this.Password = password;
    }
    
    public void setLogin(String login)
    {
        this.Login = login;
    }
    
    public void setPassword(String password)
    {
        this.Password = password;
    }
    
    /*
    public void AddCourse(Course aCourse)
    {       
        if(){
           ; 
        }
        else
        {
            System.out.print("This student already has a full course load.");
        }
    }*/
    
}
