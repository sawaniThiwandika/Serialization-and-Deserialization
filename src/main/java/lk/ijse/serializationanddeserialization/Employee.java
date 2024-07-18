package lk.ijse.serializationanddeserialization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Getter
@AllArgsConstructor
@NoArgsConstructor
class Employee implements Serializable {

    private String name;
    private int age;

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
