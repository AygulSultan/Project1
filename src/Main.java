import company.model.Gender;
import company.model.User;
import imple.MyExeption;
import imple.UserSeviceImple;

public class Main {
    public static void main(String[] args) {

        User user1=new User(1,"Asan",25, Gender.MALE);
        User user2=new User(2,"Uson",27, Gender.MALE);
        User user3=new User(3,"Zuura",19, Gender.FEMALE);

        UserSeviceImple userSeviceImple=new UserSeviceImple();
        userSeviceImple.addUser(user1);
        userSeviceImple.addUser(user2);
        userSeviceImple.addUser(user3);

        try {
            System.out.println(userSeviceImple.findByID(2));
        } catch (MyExeption myExeption){
            System.out.println(myExeption.getMessage());
        }
        userSeviceImple.getAllUsers();

        try {
            userSeviceImple.dellById(3);

        }catch (MyExeption myExeption){
            System.out.println(myExeption.getMessage());
        }
        userSeviceImple.getAllUsers();

    }
}