import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new TechnicalWriter("Mark", 50000, 4, 2));
        employees.add(new Engineer("Natashia", 50000, 7, 2));
        employees.add(new ProductManager("Carlos", 50000, 8, 5));

        for(Employee e : employees){
            System.out.println(e);
            System.out.println();
        }

    }
}
