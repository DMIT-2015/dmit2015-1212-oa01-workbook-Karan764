package dmit2015.dto;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import lombok.Data;

import java.sql.Date;

@Data
public class EmployeesEntityDto {

    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date hireDate;

    private String jobTitle;
    private String departmentName;
    private String managerName;
}
