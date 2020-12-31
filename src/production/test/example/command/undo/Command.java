package production.test.example.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
