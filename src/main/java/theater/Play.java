
package theater;

/**
 * Represents a play in the theater system.
 *
 * @author Howard Zhang
 * @version 1.0
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
