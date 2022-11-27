package GenealogicalTree;

public class Main {
    public static void main(String[] args) {

        People irina = new People("Irina");
        People vasiliy = new People("Vasiliy");
        People masha = new People("Masha");
        People jane = new People("Jane");
        People ivan = new People("Ivan");
        People igor = new People("Igor");
        People egor = new People("Egor");
        People polina = new People("Polina");
        People vladimir = new People("Vladimir");
        People svetlana = new People("Svetlana");
        People stepan = new People("Stepan");
        People vova = new People("Vova");

        GenTree genTree1 = new GenTree();
        genTree1.addData(irina, vasiliy);
        genTree1.addData(igor, vasiliy);
        genTree1.addData(irina, masha);
        genTree1.addData(irina, egor);
        genTree1.addData(vasiliy, jane);
        genTree1.addData(vasiliy, ivan);

        GenTree genTree2 = new GenTree();
        genTree2.addData(svetlana, polina);
        genTree2.addData(vladimir, polina);
        genTree2.addData(svetlana, stepan);
        genTree2.addData(vladimir, stepan);
        genTree2.addData(svetlana, vova);
        genTree2.addData(vladimir, vova);

        System.out.println("Родители:");
        for (People hum : (new ParentResearch(genTree2, polina).start())) {
            System.out.println(hum.getName());
        }

        System.out.println("Дети:");
        for (People hum : (new ChildResearch(genTree2, vladimir).start())) {
            System.out.println(hum.getName());
        }
    }
}
