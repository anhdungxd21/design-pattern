package command.commad;

public interface Command {
    void execute();
    default void undo(){};
}
