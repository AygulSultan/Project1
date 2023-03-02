package company.dao;

import company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private List<User> userList=new ArrayList<>();

    public UserDao(List<User> userList) {
        this.userList = userList;
    }
    public UserDao (){

    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "userList=" + userList +
                '}';
    }
}
