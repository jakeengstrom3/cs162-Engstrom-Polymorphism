import java.util.ArrayList;
public class Owner {
    ArrayList<Employee> employees;

    public Owner(){
        employees = new ArrayList<Employee>();
    }
    public void add(Employee e){
        employees.add(e);
    }
    public void giveRaise(Employee employee, double raise){
        for(Employee e : employees){
            if(e.equals(employee)){
                e.setBaseSalary(e.getBaseSalary() * (1 + raise));
                break;
            }
        }
    }
    public void giveUniversalRaise(double raise){
        for(Employee e : employees){
            e.setBaseSalary(e.getBaseSalary() * (raise));
        }
    }
    public void giveRaiseToEngineers(double raise){
        for(Employee e : employees){
            if(e instanceof Engineer){
                e.setBaseSalary(e.getBaseSalary() * (raise));
            }
        }
    }
    public void giveRaiseFromName(String name, double raise){
        for(Employee e : employees){
            if(e.getName().equals(name)){
                e.setBaseSalary(e.getBaseSalary() * (raise));
                break;
            }
        }
    }
    public void printEmployees(){
        for(Employee e : employees){
            System.out.println(e + "\n");
        }
    }
}
