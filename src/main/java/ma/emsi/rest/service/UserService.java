package ma.emsi.rest.service;

import ma.emsi.rest.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private List<User> userList;
    public UserService() {
        userList = new ArrayList<>();
        User user1=new User(1,"Mohammed","mhd@mail.com");
        User user2=new User(2,"Moad","moad@mail.com");
        User user3=new User(3,"Sana","sana@mail.com");
        User user4=new User(4,"Ahlam","ahlam@mail.com");
        userList.addAll(Arrays.asList(user1,user2,user3,user4));
    }
    public User getUser(Integer id){
        for(User usr:userList)
            if(id==usr.getId()) {
                return usr;
            }
        return null;
    }
    public void addUser(User user) {
        userList.add(user);
    }
    public void suppUser(Integer id){
        for(User usr:userList)
            if(id==usr.getId()) {
                userList.remove(usr);
            }
    }

    public List<User> getUsers(){
        return userList;
    }
}