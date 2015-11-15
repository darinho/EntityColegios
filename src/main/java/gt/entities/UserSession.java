/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author dc
 */
@Entity
@Table(name = "USER_SESSION")
public class UserSession implements Serializable {

    private int idUserSession;
    private User user;
    private int idUser;
    private String token;
    private Date startDate;
    private Date endDate;

    public UserSession() {
    }

    public UserSession(int idUserSession) {
        this.idUserSession = idUserSession;
    }

    public UserSession(int idUserSession, User user) {
        this.idUserSession = idUserSession;
        this.user = user;
    }

    public UserSession(int idUserSession, User user, String token, Date startDate, Date endDate) {
        this.idUserSession = idUserSession;
        this.user = user;
        this.token = token;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUserSession", unique = true)
    public int getIdUserSession() {
        return idUserSession;
    }

    public void setIdUserSession(int idUserSession) {
        this.idUserSession = idUserSession;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser", nullable = false, insertable = false, updatable = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "idUser", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Column(name = "token", nullable = false, unique = true)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "startDate", nullable = false)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "endDate", nullable = false)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}
