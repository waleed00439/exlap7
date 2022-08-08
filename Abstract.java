public abstract class Abstract implements PayAble {
    private String name ;
    private int id ;

    public Abstract (String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double computeAmount();

    @Override
    public String toString() {
        return "EmployeeOfPayAble{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }  }


