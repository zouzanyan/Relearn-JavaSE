package 面向对象.entity;

public class User {
    public int id;
    public String username;
    public String password;

    public User(){
    }

    public User(int id){
        this.id = id;
    }
    public String getInfo(){
        return id + username + password;
    }
}
