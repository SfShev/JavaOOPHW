package GenealogicalTree;

import java.util.ArrayList;

class ParentResearch extends Research {

    public ParentResearch(GenTree pd, People hum) {
        super(pd, hum);
    }

    @Override
    public ArrayList<People> start() {

        var result = new ArrayList<People>();

        for (Node node : tree) {
            if (super.getHum().getName().equals(node.hum2.getName())
                    && node.relation == Relationship.parent) {
                result.add(node.hum1);
            }
        }

        return result;
    }

}