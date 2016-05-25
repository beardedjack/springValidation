package com.evgen.mvc.entity;

import com.evgen.mvc.validator.Phone;
import com.evgen.mvc.validator.Year;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Past;
import java.util.Date;

public class User {
private String name;
 
    @DateTimeFormat(pattern="dd.MM.yyyy")
    @Past
    @Year(2000)
    private Date date;
 
    @Phone
    private String phone;
 
    public User(String name, Date date, String phone) {
        this.name = name;
        this.date = date;
        this.phone = phone;
    }
 
    public User() {
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Date getDate() {
        return date;
    }
 
    public void setDate(Date date) {
        this.date = date;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }    
}
