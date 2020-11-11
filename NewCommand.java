package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem8;

public class NewCommand implements Command {
    @Override
    public void execute(StudentRepository repository, String[] args) {
        System.out.println("NEW COMMAND");
    }
}
