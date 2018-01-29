package dan.dcalabrese22.com.rkcworkout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dcalabrese on 1/29/2018.
 */

public class Exercises {

    private static final String[] movementNames = {
            "Weighted Pull Up",
            "Double Front Squat",
            "Renegade Row",
            "Racked Back Lunges",
            "DBL Clean and Press",
            "Single Leg Deadlift",
            "See Saw Press",
            "DBL KB Deadlift",
            "Bent Press"
    };

    private static final String[] movementTempos = {
            "2-1-2",
            "3-2-2",
            "2-1-2",
            "2-1-1",
            "3-1-3",
            "3-1-2",
            "2-1-2",
            "5-1-2",
            "1-2-2",
            "2-1-2"
    };

    public static List<Movement> movements = createMovements();

    public static List<Movement> createMovements() {
        List<Movement> movements = new ArrayList<>();
        for (int i = 0; i < movementNames.length; i++) {
            movements.add(new Movement(movementNames[i], movementTempos[i]));
        }
        return movements;
    }

}
