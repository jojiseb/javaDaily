class Company {
    private String companyId;
    private String companyName;
    private int numberOfEmployees;

    public void setNumberOfEmployees(int newEmployees) {
        if(newEmployees > 0) {
            this.numberOfEmployees = this.numberOfEmployees + newEmployees;
        }
        else {
            throw new NullPointerException("Invalid Employee");
        }
    }

    Company(String compId, String companyName, int numberOfEmployees) {
        this.companyId = compId;
        this.companyName = companyName;
        this.numberOfEmployees = numberOfEmployees;
    }

    public void companyDetails() {
        System.out.println("Id : "+this.companyId+", Name : "+this.companyName+", Number of Employees : "+this.numberOfEmployees);
    }
}

public class MainPart2 {
    public static void main(String[] args) {
        Company company = new Company("A1", "A1Networks", 300);
        Company company1 = new Company("A1", "A1Networks", 300);

        company.companyDetails();
        company1.companyDetails();

        System.out.println(company.equals(company1)); //false, since comparison based on object identity/hashcode is done, and hashCode is different for each object created
        //Each object is stored in different location in heap, to ensure integrity & avoid manipulation

        System.out.println("company hashCode : "+company.hashCode()+", company1 hashCode : "+company1.hashCode());

        Company company2 = company; //Now, New reference company2 also refers to same object which company refers to

            //Both company & company2 refers to same object in memory

            //If one of ref.variables make any change to object, it will also reflect the other object

        company2.companyDetails();

        System.out.println(company.equals(company2)); //true, Since company and company2 refers to same data

        company.setNumberOfEmployees(13); //numberOfEmployees will be updated for both ref.Variables since
                            //both are referring to same data
        company.companyDetails();
        company2.companyDetails();

        System.out.println("company hashCode : "+company.hashCode()+", company2 hashCode : "+company2.hashCode());
    }
}
