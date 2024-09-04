import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable{

    private String name;
    private  LocalDate birthdate;
   // private Float age = Float.valueOf(LocalDate.now().getYear() - this.birthdate.getYear() +(LocalDate.now().getDayOfYear() - this.birthdate.getDayOfYear())/365);

    public Person (String name, LocalDate birthdate){
        this.name = name;
        this.birthdate=birthdate;
        
    }

    public String getName(){
        return this.name;
    }
    public Float getAge(){
        Float result = Float.valueOf(LocalDate.now().getYear() - this.birthdate.getYear() +(LocalDate.now().getDayOfYear() - this.birthdate.getDayOfYear())/365);
        return result;
    } 

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getName().concat(getAge().toString());
    }

}
