package com.example.employeepayrollappspring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@RequiredArgsConstructor
public @ToString class EmployeeDTO {

    @NotEmpty(message="Employee name cannot be null")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name is invalid")
    public String name;
    @NotNull(message = "Department should not be empty.")
    public List<String> department;
    @Min(value = 5000, message = "Minimum salary should be more than 5000")
    public long salary;
    @Pattern(regexp = "Male|Female", message = "Gender needs to be Male or Female.")
    public String gender;
    @JsonFormat(pattern = "MM/dd/yyyy")
    @NotNull(message = "Date should not be empty")
    @PastOrPresent(message = "Date should be pat or today's date.")
    public LocalDate startDate;
    @NotBlank(message = "Note cannot be blank.")
    public String note;
    @NotBlank(message = "ProfilePic cannot be blank.")
    public String profilePic;
}
