package bottleopener.task;

/**
 * Represents a ToDo task.
 * <p>
 * A ToDo task is a basic task with only a description and a status indicating whether it is completed.
 * </p>
 */
public class ToDo extends Task {

    /**
     * Constructs a new ToDo task with the specified description.
     * The task is initially marked as not done.
     *
     * @param description The description of the ToDo task.
     */
    public ToDo(String description) {
        super(description);
    }

    /**
     * Constructs a new ToDo task with the specified description and status.
     *
     * @param description The description of the ToDo task.
     * @param status      The completion status of the ToDo task; {@code true} if the task is done, {@code false} otherwise.
     */
    public ToDo(String description, boolean status) {
        super(description, status);
    }

    public ToDo markAsDone() {
        return new ToDo(this.description, true);
    }

    public ToDo markAsUndone() {
        return new ToDo(this.description, false);
    }

    /**
     * Returns the type of the task.
     *
     * @return "T", representing that this task is a ToDo.
     */
    public String getType() {
        return "T";
    }

    /**
     * Returns an empty string since ToDo tasks do not have an associated time.
     *
     * @return An empty string.
     */
    public String getTime() {
        return "";
    }

}
