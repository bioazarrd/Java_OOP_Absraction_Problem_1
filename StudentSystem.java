package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem8;
public class StudentSystem {
    private StudentRepository repo;

    public StudentSystem() {
        this.repo = new StudentRepository();
    }

    @Deprecated
    public StudentRepository getRepo() {
        return this.repo;
    }

    public void ParseCommand(String[]args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] args = scanner.nextLine().split(" ");

        Command command = CommandFactory.createCommand(args[0]);
        command.execute(this.repo, args);

    }
}
