package GenealogicalTree;

import java.util.ArrayList;

public abstract class Research {
    ArrayList<Node> tree;
    private People hum;

    public Research(GenTree pd, People hum) {
        tree = pd.getData();
        this.hum = hum;
    }

    public ArrayList<People> start() {
        return null;
    }

    public People getHum() {
        return hum;
    }
}

