package GenealogicalTree;


class Node {

    public Node(People hum1, int relation, People hum2) {
        this.hum1 = hum1;
        this.relation = relation;
        this.hum2 = hum2;
    }

    People hum1;
    int relation;
    People hum2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", hum1, relation, hum2);
    }
}
