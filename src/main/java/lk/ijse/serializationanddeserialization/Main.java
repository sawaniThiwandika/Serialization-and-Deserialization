package lk.ijse.serializationanddeserialization;

import java.io.*;

public class Main {

        public static void main(String[] args) {
            // Create an object
            Employee emp = new Employee("Sawani Thiwandika", 21);

            // Serialize the object
            try {
                FileOutputStream fileOut = new FileOutputStream("employee.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(emp);
                out.close();
                fileOut.close();
                System.out.println("Serialized data is saved in employee.ser");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Deserialize the object
            Employee empDeserialized = null;
            try {
                FileInputStream fileIn = new FileInputStream("employee.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                empDeserialized = (Employee) in.readObject();
                in.close();
                fileIn.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }


            if (empDeserialized != null) {
                System.out.print("Deserialized Employee: ");
                empDeserialized.display(); // Print deserialized object
            }
        }

}
