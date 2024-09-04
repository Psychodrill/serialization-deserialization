import java.io.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Person employee = new Person("Mark", LocalDate.of(2000,11,06));

        try(FileOutputStream fos = new FileOutputStream("persondata.bin")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
            System.out.println("Object has been serialized!");
            
        }
        
        try(FileInputStream fis = new FileInputStream("persondata.bin")){
            ObjectInputStream ois = new ObjectInputStream(fis);
                Person otherEmployee= (Person)ois.readObject();
                System.out.println(String.format("Object has been deserialized! %s", otherEmployee.toString()));
            
        }
    }
}
