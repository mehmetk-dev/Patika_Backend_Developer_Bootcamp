package hafta2.oop.user;

public class ComplexUserCheckService implements IUserCheckService {

    @Override
    public boolean checkUser(User user) {
        if (user.getAge() >= 18 && user.getName().startsWith("M")) {
            return true;
        }
        return false;
    }
}
