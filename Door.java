/**
 * Represents a door. Door are automatic and will open for a short time and then
 * close again automatically.
 * @author cwl
 *
 */
public abstract interface Door {
	/**
	 * Make a request to open the door. The door will in time open.
	 * How long this takes depends on the implementation
	 */
	public void requestToOpen();
}

