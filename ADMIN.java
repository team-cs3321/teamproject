
package Database;


class ADMIN extends STUDENT{
    
    private String Login;
    private String Password;
    
    ADMIN(){
        this.Login = " ";
        this.Password = " ";
    }

    ADMIN(String login, String password){
        this.Login = login;
        this.Password = password;
    }
    
    //loginCheck()
    /*
    **
    */
    
    private void setLogin(String login)
    {
        this.Login = login;
    }
    
    private void setPassword(String password)
    {
        this.Password = password;
    }
    
    private void setSTUDENTlogin(String login)
    {
        super.Login = login;
    }
    
    private void setSTUDENTpassword(String password)
    {
        super.Login = password;
    }
    
    private void setSTUDENTnameFirst(String name)
    {
        super.First = name;
    }
    
    private void setSTUDENTnameLast (String name)
    {
        super.Last = name;
    }
    
    private void setSTUDENTid (int id)
    {
        super.ID = id;
    }
        
    private void addSTUDENTCourse(COURSE aCourse)
    {       
        super.Courses.add(aCourse);
    }
    
}
