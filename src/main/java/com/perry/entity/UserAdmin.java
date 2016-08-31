package com.perry.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by zenghuapei on 2016/8/25.
 */
@Entity
@Table(name = "user_admin", schema = "test")
public class UserAdmin {
    private Integer adminId;
    private String adminName;
    private String adminSex;
    private Date adminRegister;

    private UserAccount userAccount;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "admin_id", nullable = false)
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "admin_name", nullable = true, length = 50)
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Basic
    @Column(name = "admin_sex", nullable = true, length = 10)
    public String getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(String adminSex) {
        this.adminSex = adminSex;
    }

    @Basic
    @Column(name = "admin_register", nullable = true)
    public Date getAdminRegister() {
        return adminRegister;
    }

    public void setAdminRegister(Date adminRegister) {
        this.adminRegister = adminRegister;
    }


     @OneToOne(cascade={CascadeType.ALL})
        @JoinColumn(name="account_id",unique=true)
        public UserAccount getUserAccount() {
            return userAccount;
        }

        public void setUserAccount(UserAccount userAccount) {
            this.userAccount = userAccount;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAdmin userAdmin = (UserAdmin) o;

        if (adminId != null ? !adminId.equals(userAdmin.adminId) : userAdmin.adminId != null) return false;
        if (adminName != null ? !adminName.equals(userAdmin.adminName) : userAdmin.adminName != null) return false;
        if (adminSex != null ? !adminSex.equals(userAdmin.adminSex) : userAdmin.adminSex != null) return false;
        if (adminRegister != null ? !adminRegister.equals(userAdmin.adminRegister) : userAdmin.adminRegister != null)
            return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = adminId != null ? adminId.hashCode() : 0;
        result = 31 * result + (adminName != null ? adminName.hashCode() : 0);
        result = 31 * result + (adminSex != null ? adminSex.hashCode() : 0);
        result = 31 * result + (adminRegister != null ? adminRegister.hashCode() : 0);
        return result;
    }
}
