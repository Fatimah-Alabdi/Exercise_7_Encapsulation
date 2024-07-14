public class Employee {

private String id;
private String name;
private int salary;

public Employee(String id, String name, int salary) {
this.id = id;
this.name = name;
this.salary = salary;
}
public String setId(String id){
    return this.id = id;

}
public String setName(String name){
    return this.name = name;
}
public int setSalary(int salary){
    return this.salary = salary;
}
public String getId(){
    return this.id;
}
public String getName(){
    return this.name;
}
public int getSalary(){
    return this.salary;
}
public int getAnnualSalary(){
    return this.salary * 12;
}
public int raisedSalary(int percent) {
    return this.salary * percent / 100;


}
public String toString(){
    return "\nID: "+id + "\n name: " + name + " \n salary:" + salary;
}


}
