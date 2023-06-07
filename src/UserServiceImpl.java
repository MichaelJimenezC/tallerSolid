public class UserServiceImpl implements UserService {
    DatabaseService databaseService;

    public UserServiceImpl(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    public void insertUserInDatabase(User user) {
        // Insert user in database using the database service
        databaseService.insert("INSERT INTO ...");
    }

    public boolean verifyIfTheUserIsAdmin(User user) {
        // Do something
        return true;
    }
}