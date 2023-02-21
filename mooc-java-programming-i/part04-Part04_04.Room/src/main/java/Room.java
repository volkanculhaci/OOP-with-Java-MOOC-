import java.beans.ConstructorProperties;
import java.lang.reflect.Constructor;

public class Room {
    private String code;
    private int seats;

    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }

}
