package imple;

import company.model.User;

public interface UserService {
     void addUser (User user);
     User findByID (int id);
     void dellById (int id);
     void getAllUsers ();






}
