package creational.prototype;

public class Client {

        public static void main(String[] args) {
            Prototype prototype = new ConcretePrototype("Initial data");
            Prototype clone = prototype.clone();
            System.out.println(prototype);
            System.out.println(clone);
            System.out.println("=====================================");
            ((ConcretePrototype) clone).setData("Modified Data");
            System.out.println(prototype);
            System.out.println(clone);



        }


}
