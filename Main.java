//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //Qoustion 1
            /*
Account account=new Account("1098776543","Fatimah");
Account account2=new Account("10987732419","manar",2000);


        System.out.println("Account 1 :");
        System.out.println(account);
        System.out.println("-------");
        System.out.println("Account 2 :");
        System.out.println(account2);
        System.out.println("--------");
        account.credit(300);
        System.out.println("Account 1 After credit 300: "+account);

        account.debit(20);
            System.out.println("--------");
        System.out.println("Account 1 After debit 20:"+account);
        System.out.println("--------");

        account2.transfer(account,50);
        System.out.println("After transferring 50 from account2 to account1:"+account);
        System.out.println("-------");
        System.out.println(account2);

             */

            //Qoustion 2

            Employee employee=new Employee("1098225385","Fatimah",12000);
            System.out.println("Employee 1 Information: ");
            System.out.println(employee);
            System.out.println("the annual salary :"+employee.getAnnualSalary());
            System.out.println("the raised salary  10% :"+employee.raisedSalary(10));

            System.out.println("-----------------");
            Employee employee2=new Employee("10076338946","Ibrahim",10000);
            System.out.println("Employee 2 Information: ");
            System.out.println(employee2);
            System.out.println("the annual salary :"+employee2.getAnnualSalary());
            System.out.println("the raised salary  10% :"+employee2.raisedSalary(10));



    }
}