package annotation.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by vanluong on 26/05/2017.
 */
@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @Column(name = "attendance_id")
    private int attendanceId;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "remark")
    private String remark;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    public Attendance(int attendanceId, Date date, Boolean status, String remark, Student student) {
        this.attendanceId = attendanceId;
        this.date = date;
        this.status = status;
        this.remark = remark;
        this.student = student;
    }

    public Attendance() {
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
