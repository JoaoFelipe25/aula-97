import javax.management.remote.SubjectDelegationPermission;

public class Student extends Person implements ScholInterface{

    private int className;
    private int Year;


    public Student(int id, String name, int age, int className, int year) {
        super(id, name, age);
        
        this.className = className;
        this.Year = year;        
    }

    public void setClassName(int className) {
        this.className = className;
    }
    public int getClassName() {
        return className;
    }

    public void setYear(int year) {
        Year = year;
    }
    public int getYear() {
        return Year;
    }

    @Override
    public void checkIn(String name) {
        System.out.println("O aluno " + name + " assinou a lista de entrada");
        
    }

    @Override
    public void checkOut(String name) {
        System.out.println("O aluno " + name + " assinou a lista de saida");
        
    }

    
}
