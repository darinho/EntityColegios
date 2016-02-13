/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author dc
 */
@Entity
@Table(name = "USUARIO")
public class User implements Serializable {

    private Long idUser;
    private Person person;
    private List<UserProfile> userProfiles;
    private String txtPwd;
    private String txtUser;
    private int intDaysChangePwd;
    private Date lastDatePwd;
    private Boolean snChangePwd;
    private Boolean snActive;

    public User() {
    }

    public User(Long idUser) {
        this.idUser = idUser;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUser", unique = true, nullable = false)
    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    @ManyToOne
    @JoinColumn(name = "idPerson", referencedColumnName = "idPerson", nullable = false)
    @Cascade(CascadeType.ALL)
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    public List<UserProfile> getUserProfiles() {
        return userProfiles;
    }

    @JsonProperty 
    public void setUserProfiles(List<UserProfile> userProfiles) {
        this.userProfiles = userProfiles;
    }

    @Column(name = "txtPwd", nullable = false)
    public String getTxtPwd() {
        return txtPwd;
    }

    public void setTxtPwd(String txtPwd) {
        this.txtPwd = txtPwd;
    }

    @Column(name = "txtUser", nullable = false, unique = true)
    public String getTxtUser() {
        return txtUser;
    }

    public void setTxtUser(String txtUser) {
        this.txtUser = txtUser;
    }

    @Column(name = "intDaysChangePwd", nullable = false)
    public int getIntDaysChangePwd() {
        return intDaysChangePwd;
    }

    public void setIntDaysChangePwd(int intDaysChangePwd) {
        this.intDaysChangePwd = intDaysChangePwd;
    }

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "lastDatePwd", nullable = false)
    public Date getLastDatePwd() {
        return lastDatePwd;
    }

    public void setLastDatePwd(Date lastDatePwd) {
        this.lastDatePwd = lastDatePwd;
    }

    @Column(name = "snChangePwd", nullable = false)
    public Boolean getSnChangePwd() {
        return snChangePwd;
    }

    public void setSnChangePwd(Boolean snChangePwd) {
        this.snChangePwd = snChangePwd;
    }

    @Column(name = "snActive", nullable = false)
    public Boolean getSnActive() {
        return snActive;
    }

    public void setSnActive(Boolean snActive) {
        this.snActive = snActive;
    }
}
