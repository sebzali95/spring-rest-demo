package az.spring.rest.demo.springrestdemo.rest.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {


    private long id;
    private String name;
    private String surname;
    private int age;
    private double salary;
}
