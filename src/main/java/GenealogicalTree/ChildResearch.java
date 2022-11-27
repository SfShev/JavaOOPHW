package GenealogicalTree;

import java.util.ArrayList;

public class ChildResearch extends Research {
    public ChildResearch(GenTree pd, People hum) {
        super(pd, hum);
    }

    @Override
    public ArrayList<People> start() {
        var result = new ArrayList<People>();

        for (Node node : tree) {
            if (super.getHum().getName().equals(node.hum2.getName())
                    && node.relation == Relationship.child) {
                result.add(node.hum1);
            }
        }

        return result;
    }
}