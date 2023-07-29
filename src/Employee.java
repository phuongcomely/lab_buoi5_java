public class Employee extends Person{

    public Employee(int id, String name, String address, int age) {
        super(id, name, address, age);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    private double exp;
    private String placeWork;

    public Employee(int id, String name, String address, int age, double exp, String placeWork) {
        super(id, name, address, age);
        this.exp = exp;
        this.placeWork = placeWork;
    }

    @Override
    public String toString() {
        return "Employee{" +"id= " +getId() +", "+"name= "+getName() +", "+"address= "+getAddress()+", "+"age= " +getAge()+", "
                +
                "exp= " + exp +
                ", placeWork='" + placeWork + '\'' +
                '}';
    }
}
