
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
      private Employees boss; 
            private String name;
            private String dept;
            private int salary;
            private List<Employees> subordinates;
            
             public Employees(String name,String dept, int sal) {
               this.name = name;
               this.dept = dept;
               this.salary = sal;
               subordinates = new ArrayList<Employees>();
            }

            public String getName() {
                 return name;
            }
            public int getSalary() {
                 return salary;
            }
            public String dept() {
                 return dept;
            }
            public String setBoss(Employees boss) {
                
                 this.boss = boss;
                 System.out.println("The boss of "+ name+" is "+ boss.getName());
                return null;
            }
            public Employees getBoss() {
                 return this.boss;
            }

            public ArrayList getAllBosses() {

                ArrayList<Employees> emps = new ArrayList<>();
                 if (this.boss != null ) {
                    emps.add(this.boss.getBoss());
                    System.out.print(this.boss.getName()+"\n"); 
                   this.boss.getAllBosses(); 
                 }  
                return emps;
            }


            public int getAllEmployeeSalary() {
                 int totalSalary = salary;
                 if(true){
                    
                             for (Iterator<Employees> it = subordinates.iterator(); it.hasNext();) {
                                 Employees item;
                                 item = it.next();
                                 totalSalary = totalSalary + item.getAllEmployeeSalary();
                             }
                }
                         return totalSalary; 
            }
                    
            

           public ArrayList getLowerEmployee(){
                ArrayList<Employees> emps = new ArrayList<>();
                emps.add(this);
                int a = subordinates.size();
                if(a > 0){
                    for (Employees element : subordinates) {
                        emps.add(element);
                        element.getLowerEmployee();
                    }
                }
                return emps; 
    }


             public Employees setEmployeeBoss(Employees e) {
                     e.setBoss(this);
                     return null;
             }

            public void add(Employees e) {
               subordinates.add(e);
            }

            public void remove(Employees e) {
               subordinates.remove(e);
            }

            public List<Employees> getSubordinates(){
              return subordinates;
            }

             @Override
            public String toString(){
               return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
            } 
            
    
}
