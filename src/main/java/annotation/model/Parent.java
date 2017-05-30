package annotation.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "parent")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parent_id")
    private int parent_id;

    @Column(name = "email")
    private String email;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "phone")
    private String phone;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "status")
    private boolean status;

    @Column(name = "last_login_date")
    private Date lastLoginDate;

    @Column(name = "last_login_id")
    private String lastLoginID;

    public Parent(String email, String fname, String lname, Date dob, String phone, String mobile, boolean status, Date lastLoginDate, String lastLoginID) {
        this.parent_id = parent_id;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.phone = phone;
        this.mobile = mobile;
        this.status = status;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginID = lastLoginID;
    }

    public Parent() {
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginID() {
        return lastLoginID;
    }

    public void setLastLoginID(String lastLoginID) {
        this.lastLoginID = lastLoginID;
    }
}
