package dan.dcalabrese22.com.rkcworkout;

/**
 * Created by dcalabrese on 1/29/2018.
 */

public class Movement {

    private String name;
    private String tempo;

    public Movement(String name, String tempo) {
        this.name = name;
        this.tempo = tempo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
}
