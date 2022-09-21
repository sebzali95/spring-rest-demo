package az.spring.rest.demo.springrestdemo.controller;


import az.spring.rest.demo.springrestdemo.rest.model.dto.EmployeeDto;
import az.spring.rest.demo.springrestdemo.rest.model.response.EmployeeResponse;
import az.spring.rest.demo.springrestdemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping
    public EmployeeResponse getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{employee-id}")
    public EmployeeDto getEmployee(@PathVariable("employee-id") long id) {
        return employeeService.getEmployee(id);
    }

    @GetMapping("/search")
    public EmployeeResponse getEmployeeByNameAndSurname(
            @RequestParam("name") String name,
            @RequestParam("surname") String surname) {

        return employeeService.getEmployeeByNameAndSurname(name, surname);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insert(@RequestBody EmployeeDto employeeDto) {
        employeeService.insert(employeeDto);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody EmployeeDto employeeDto, @PathVariable("id") long id) {
        employeeService.update(employeeDto, id);
    }

    @PatchMapping("/{id}")
    public void updateSome(@RequestBody EmployeeDto employeeDto, @PathVariable("id") long id) {
        employeeService.updateSome(employeeDto, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) {
        employeeService.delete(id);


    }
}
