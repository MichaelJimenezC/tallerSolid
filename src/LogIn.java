
public class LogIn implements LogInInterface {
    UserService userService;
    
    public LogIn(UserService userService) {
        this.userService = userService;
    }

    public void log(User user) {
        System.out.println("Has access to the website");
        userService.insertUserInDatabase(user);
        // Logic
    }
}