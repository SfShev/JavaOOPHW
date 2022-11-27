package GenealogicalTree;

import java.util.ArrayList;

    public interface DataKeeper {
        ArrayList<Node> getData();
        void addData(People human1, People human2);
    }


