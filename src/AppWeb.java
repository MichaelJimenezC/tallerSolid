public class AppWeb {
    LogInInterface logIn;
    DatabaseService databaseService;

    public AppWeb (LogInInterface logIn, DatabaseService databaseService) {
        this.logIn = logIn;
        this.databaseService = databaseService;
    }
    
    public void connectToDatabase () {
        // Logic using the database service
    }
}