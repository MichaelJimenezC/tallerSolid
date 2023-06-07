public class LogInAdmin implements LogInInterface {
    UserService userService;
    private boolean userIsAdmin;

    public LogInAdmin(UserService userService) {
        this.userService = userService;
    }

    public void log(User user) {
        this.userIsAdmin = userService.verifyIfTheUserIsAdmin(user);
        if(!userIsAdmin){
            return;
        }
        System.out.println("Has access to the website in admin mode");
        // Logic
    }
}