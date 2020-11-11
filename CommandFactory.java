package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem8;
public class CommandFactory {
    public static Command createCommand(String commandType) {

        if (commandType.equals("Create")) {
            return new CreateCommand();
        } else if (commandType.equals("Show")) {
            return new ShowCommand();
        } else {
            throw new IllegalArgumentException("Unknown command type!");
        }
    }


}
