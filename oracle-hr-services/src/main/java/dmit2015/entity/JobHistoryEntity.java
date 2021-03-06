package dmit2015.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "JOB_HISTORY", schema = "HR")
@IdClass(JobHistoryEntityPK.class)
public class JobHistoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false, precision = 0)
    private Integer employeeId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "START_DATE", nullable = false)
    private Date startDate;
    @Basic
    @Column(name = "END_DATE", nullable = false)
    private Date endDate;
    @Basic
    @Column(name = "JOB_ID", nullable = false, length = 10)
    private String jobId;
    @Basic
    @Column(name = "DEPARTMENT_ID", nullable = true, precision = 0)
    private Short departmentId;
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID", nullable = false)
    private EmployeesEntity employeesByEmployeeId;
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "JOB_ID", referencedColumnName = "JOB_ID", nullable = false)
    private JobsEntity jobsByJobId;
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "DEPARTMENT_ID", referencedColumnName = "DEPARTMENT_ID")
    private DepartmentsEntity departmentsByDepartmentId;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Short getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Short departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobHistoryEntity that = (JobHistoryEntity) o;
        return Objects.equals(employeeId, that.employeeId) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(jobId, that.jobId) && Objects.equals(departmentId, that.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, startDate, endDate, jobId, departmentId);
    }

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }

    public JobsEntity getJobsByJobId() {
        return jobsByJobId;
    }

    public void setJobsByJobId(JobsEntity jobsByJobId) {
        this.jobsByJobId = jobsByJobId;
    }

    public DepartmentsEntity getDepartmentsByDepartmentId() {
        return departmentsByDepartmentId;
    }

    public void setDepartmentsByDepartmentId(DepartmentsEntity departmentsByDepartmentId) {
        this.departmentsByDepartmentId = departmentsByDepartmentId;
    }
}
