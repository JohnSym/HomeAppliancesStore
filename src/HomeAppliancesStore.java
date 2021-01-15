public class HomeAppliancesStore {
    static String company;
    static String adress;
    static int employees;
    public String getCompany() {
        return this.company;
    }

    public void setCompany(String newcompany) {
        this.company = newcompany;
    }

    public String getAddress() {
        return this.adress;
    }

    public void setAddress(String newaddress) {
        this.adress = newaddress;
    }

    public int getEmployees() {
        return this.employees;
    }

    public void setEmployees(int newemployees) {
        this.employees = newemployees;
    }
    public static void main(String[] args) {
        try {
            company = args[0];
            adress = args[1];
            employees = Integer.parseInt(args[2]);
            System.out.println(company);
            System.out.println(adress);
            System.out.println(employees);
        }
        catch (Exception e) {
            if (company == null) {
                System.out.println("False, company is null!");
            }
        }
        if (adress == null) {
            System.out.println("False, adress is null!");
        }
        try{
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        } catch (Exception e) {
            System.out.println(args[3]);
        }
    }
}
