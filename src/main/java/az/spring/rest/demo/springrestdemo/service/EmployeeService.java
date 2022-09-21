package az.spring.rest.demo.springrestdemo.service;

import az.spring.rest.demo.springrestdemo.rest.model.dto.EmployeeDto;
import az.spring.rest.demo.springrestdemo.rest.model.response.EmployeeResponse;

public interface EmployeeService {

    EmployeeResponse getAllEmployees();

    EmployeeDto getEmployee(long id);

    EmployeeResponse getEmployeeByNameAndSurname(String name, String surname);

    void insert(EmployeeDto employeeDto);

    void update(EmployeeDto employeeDto, long id);


    void updateSome(EmployeeDto employeeDto, long id);

    void delete(long id);
}
