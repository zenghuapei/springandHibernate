package com.perry.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by zenghuapei on 2016/8/23.
 */
@Entity
public class Booking {
    private Integer bookingId;
    private String bookingState;
    private Date booknow;
    private Integer userId;
    private String bookName;
    private String bookIdCard;
    private String bookNum;
    private String bookAddress;
    private Integer bookXuhao;
    private DoctorInfo doctorInfo;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "booking_id")
    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    @Basic
    @Column(name = "booking_state")
    public String getBookingState() {
        return bookingState;
    }

    public void setBookingState(String bookingState) {
        this.bookingState = bookingState;
    }

    @Basic
    @Column(name = "booknow")
    public Date getBooknow() {
        return booknow;
    }

    public void setBooknow(Date booknow) {
        this.booknow = booknow;
    }


    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "book_name")
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Basic
    @Column(name = "book_idCard")
    public String getBookIdCard() {
        return bookIdCard;
    }

    public void setBookIdCard(String bookIdCard) {
        this.bookIdCard = bookIdCard;
    }

    @Basic
    @Column(name = "book_num")
    public String getBookNum() {
        return bookNum;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum;
    }

    @Basic
    @Column(name = "book_address")
    public String getBookAddress() {
        return bookAddress;
    }

    public void setBookAddress(String bookAddress) {
        this.bookAddress = bookAddress;
    }

    @Basic
    @Column(name = "book_xuhao")
    public Integer getBookXuhao() {
        return bookXuhao;
    }

    public void setBookXuhao(Integer bookXuhao) {
        this.bookXuhao = bookXuhao;
    }

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    public DoctorInfo getDoctorInfo() {
        return doctorInfo;
    }

    public void setDoctorInfo(DoctorInfo doctorInfo) {
        this.doctorInfo = doctorInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Booking booking = (Booking) o;

        if (bookingId != null ? !bookingId.equals(booking.bookingId) : booking.bookingId != null) return false;
        if (bookingState != null ? !bookingState.equals(booking.bookingState) : booking.bookingState != null)
            return false;
        if (booknow != null ? !booknow.equals(booking.booknow) : booking.booknow != null) return false;
        if (userId != null ? !userId.equals(booking.userId) : booking.userId != null) return false;
        if (bookName != null ? !bookName.equals(booking.bookName) : booking.bookName != null) return false;
        if (bookIdCard != null ? !bookIdCard.equals(booking.bookIdCard) : booking.bookIdCard != null) return false;
        if (bookNum != null ? !bookNum.equals(booking.bookNum) : booking.bookNum != null) return false;
        if (bookAddress != null ? !bookAddress.equals(booking.bookAddress) : booking.bookAddress != null) return false;
        if (bookXuhao != null ? !bookXuhao.equals(booking.bookXuhao) : booking.bookXuhao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookingId != null ? bookingId.hashCode() : 0;
        result = 31 * result + (bookingState != null ? bookingState.hashCode() : 0);
        result = 31 * result + (booknow != null ? booknow.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (bookIdCard != null ? bookIdCard.hashCode() : 0);
        result = 31 * result + (bookNum != null ? bookNum.hashCode() : 0);
        result = 31 * result + (bookAddress != null ? bookAddress.hashCode() : 0);
        result = 31 * result + (bookXuhao != null ? bookXuhao.hashCode() : 0);
        return result;
    }
}
