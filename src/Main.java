import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Owner owner = new Owner();
        owner.add(new TechnicalWriter("Mark", 50000, 4, 2));
        owner.add(new Engineer("Natashia", 50000, 7, 2));
        owner.add(new ProductManager("Carlos", 50000, 8, 5));

        owner.giveUniversalRaise(1.25);
        owner.giveUniversalRaise(.8);
        owner.giveRaiseToEngineers(1.25);

        owner.printEmployees();
    }
}
