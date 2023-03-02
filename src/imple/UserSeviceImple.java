package imple;

import company.dao.UserDao;
import company.model.User;

public class UserSeviceImple implements UserService{
    private  final UserDao userDao=new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getUserList().add(user);
    }

    @Override
    public User findByID(int id) {

        for (int i = 0; i < userDao.getUserList().size(); i++) {
            if(userDao.getUserList().get(i).getId()==id){
                return userDao.getUserList().get(i);
            }}
        throw new MyExeption("user with this ID not find");
    }

    @Override
    public void dellById(int id) {
        for (int i = 0; i < userDao.getUserList().size(); i++) {
            if(userDao.getUserList().get(i).getId()==id){
            userDao.getUserList().remove(userDao.getUserList().get(i));
                System.out.println(userDao.getUserList());

            }

        }throw new MyExeption("user with this ID not find");



    }

    @Override
    public void getAllUsers() {
        for (int i = 0; i < userDao.getUserList().size(); i++) {
            System.out.println(userDao.getUserList().get(i));
        }



    }
}
