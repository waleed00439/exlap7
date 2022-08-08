public class Main {
    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("waleed", 1, 100);
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee("Fares", 2, 50);
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("Ali", 1, 8, 100);
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Salah", 2, 5, 3);
        Company company = new Company("Tuwaiq");
        company.add(fullTimeEmployee1);
        company.add(fullTimeEmployee2);
        company.add(partTimeEmployee1);
        company.add(partTimeEmployee2);
        System.out.println(company);
        System.out.println(company.computeAmount());
    }
}