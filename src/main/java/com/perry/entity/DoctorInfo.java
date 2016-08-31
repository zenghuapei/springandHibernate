package com.perry.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by zenghuapei on 2016/8/24.
 */
@Entity
@Table(name = "doctor_info", schema = "test")
public class DoctorInfo {
    private Integer doctorId;
    private String doctorBrief;
    private String doctorCode;
    private String doctorName;
    private String doctorPic;
    private String doctorPost;
    private String doctorSex;
    private String doctorSpecialty;
    private String doctorType;
    private String doctorXl;
    private Integer doctorYears;
    private String email;
    private Integer subjectId;
    private List<Booking> bookingList;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "doctor_id", nullable = false)
    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    @Basic
    @Column(name = "doctor_brief", nullable = false, length = 2000)
    public String getDoctorBrief() {
        return doctorBrief;
    }

    public void setDoctorBrief(String doctorBrief) {
        this.doctorBrief = doctorBrief;
    }

    @Basic
    @Column(name = "doctor_code", nullable = true, length = 12)
    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    @Basic
    @Column(name = "doctor_name", nullable = true, length = 20)
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Basic
    @Column(name = "doctor_pic", nullable = true, length = 200)
    public String getDoctorPic() {
        return doctorPic;
    }

    public void setDoctorPic(String doctorPic) {
        this.doctorPic = doctorPic;
    }

    @Basic
    @Column(name = "doctor_post", nullable = true, length = 10)
    public String getDoctorPost() {
        return doctorPost;
    }

    public void setDoctorPost(String doctorPost) {
        this.doctorPost = doctorPost;
    }

    @Basic
    @Column(name = "doctor_sex", nullable = true, length = 10)
    public String getDoctorSex() {
        return doctorSex;
    }

    public void setDoctorSex(String doctorSex) {
        this.doctorSex = doctorSex;
    }

    @Basic
    @Column(name = "doctor_specialty", nullable = true, length = 30)
    public String getDoctorSpecialty() {
        return doctorSpecialty;
    }

    public void setDoctorSpecialty(String doctorSpecialty) {
        this.doctorSpecialty = doctorSpecialty;
    }

    @Basic
    @Column(name = "doctor_type", nullable = true, length = 10)
    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }

    @Basic
    @Column(name = "doctor_xl", nullable = true, length = 30)
    public String getDoctorXl() {
        return doctorXl;
    }

    public void setDoctorXl(String doctorXl) {
        this.doctorXl = doctorXl;
    }

    @Basic
    @Column(name = "doctor_years", nullable = true)
    public Integer getDoctorYears() {
        return doctorYears;
    }

    public void setDoctorYears(Integer doctorYears) {
        this.doctorYears = doctorYears;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "subject_id", nullable = true)
    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    @OneToMany(mappedBy="doctorInfo")
    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoctorInfo that = (DoctorInfo) o;

        if (doctorId != null ? !doctorId.equals(that.doctorId) : that.doctorId != null) return false;
        if (doctorBrief != null ? !doctorBrief.equals(that.doctorBrief) : that.doctorBrief != null) return false;
        if (doctorCode != null ? !doctorCode.equals(that.doctorCode) : that.doctorCode != null) return false;
        if (doctorName != null ? !doctorName.equals(that.doctorName) : that.doctorName != null) return false;
        if (doctorPic != null ? !doctorPic.equals(that.doctorPic) : that.doctorPic != null) return false;
        if (doctorPost != null ? !doctorPost.equals(that.doctorPost) : that.doctorPost != null) return false;
        if (doctorSex != null ? !doctorSex.equals(that.doctorSex) : that.doctorSex != null) return false;
        if (doctorSpecialty != null ? !doctorSpecialty.equals(that.doctorSpecialty) : that.doctorSpecialty != null)
            return false;
        if (doctorType != null ? !doctorType.equals(that.doctorType) : that.doctorType != null) return false;
        if (doctorXl != null ? !doctorXl.equals(that.doctorXl) : that.doctorXl != null) return false;
        if (doctorYears != null ? !doctorYears.equals(that.doctorYears) : that.doctorYears != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (subjectId != null ? !subjectId.equals(that.subjectId) : that.subjectId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = doctorId != null ? doctorId.hashCode() : 0;
        result = 31 * result + (doctorBrief != null ? doctorBrief.hashCode() : 0);
        result = 31 * result + (doctorCode != null ? doctorCode.hashCode() : 0);
        result = 31 * result + (doctorName != null ? doctorName.hashCode() : 0);
        result = 31 * result + (doctorPic != null ? doctorPic.hashCode() : 0);
        result = 31 * result + (doctorPost != null ? doctorPost.hashCode() : 0);
        result = 31 * result + (doctorSex != null ? doctorSex.hashCode() : 0);
        result = 31 * result + (doctorSpecialty != null ? doctorSpecialty.hashCode() : 0);
        result = 31 * result + (doctorType != null ? doctorType.hashCode() : 0);
        result = 31 * result + (doctorXl != null ? doctorXl.hashCode() : 0);
        result = 31 * result + (doctorYears != null ? doctorYears.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        return result;
    }
}
