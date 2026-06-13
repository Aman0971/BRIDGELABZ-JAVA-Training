package Design_Principles;


// Interface for version control system
interface IVersionControl {
    void commit(String message);
    void push();
    void pull();
}

// Git version control implementation
class GitVersionControl implements IVersionControl {
    @Override
    public void commit(String message) {
        System.out.println("Committing changes to Git with message: " + message);
    }

    @Override
    public void push() {
        System.out.println("Pushing changes to remote Git repository.");
    }

    @Override
    public void pull() {
        System.out.println("Pulling changes from remote Git repository.");
    }
}

// Team class that relies on version control
class DevelopmentTeam {
    private IVersionControl versionControl;

    public DevelopmentTeam(IVersionControl vc) {
        this.versionControl = vc;
    }
    
    public void makeCommit(String message) {
        versionControl.commit(message);
    }

    public void performPush() {
        versionControl.push();
    }

    public void performPull() {
        versionControl.pull();
    }
}

public class DIP_Solid {
    public static void main(String[] args) {
        GitVersionControl git = new GitVersionControl();
        DevelopmentTeam team = new DevelopmentTeam(git);

        team.makeCommit("Initial commit");
        team.performPush();
        team.performPull();
    }
}

//---> Violates Dependency Inversion Principle.-->

//  class MySQLDatabase {

//     public void connect() {
//         System.out.println("Connected to MySQL");
//     }
// }

// class UserService {

//     private MySQLDatabase db = new MySQLDatabase();

//     public void saveUser() {
//         db.connect();
//         System.out.println("User Saved");
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         UserService user = new UserService();
//         user.saveUser();
//     }
// }
