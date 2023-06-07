public interface UserService {
    void insertUserInDatabase(User user);
    boolean verifyIfTheUserIsAdmin(User user);
}