public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Employee:");
        Employee employee1 = new Employee();
        employee1.applyForVacation();
        employee1.showHours();
        employee1.showSalary();
        employee1.showVacation();
        System.out.println();
        
        System.out.println("Janitor:");
        Janitor employee2 = new Janitor();
        employee2.applyForVacation();
        employee2.showHours();
        employee2.showSalary();
        employee2.showVacation();
        employee2.tired();
        
        System.out.println("Harvard Lawyer:");
        HarvardLawyer employee3 = new HarvardLawyer();
        employee3.applyForVacation();
        employee3.showHours();
        employee3.showSalary();
        employee3.showVacation();
        employee3.sue();
    }
}
