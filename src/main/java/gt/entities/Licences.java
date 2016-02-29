/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author dario.calderon
 */
@Entity
@Table(name = "LICENCES")
public class Licences {

    private long id;
    private String txtLicence;
    private Date dates;
    private Profile profile;
    private Status status;
    private School school;
    private boolean snActive;

    public Licences() {
    }

    public Licences(long id) {
        this.id = id;
    }

    public Licences(long id, String txtLicence, Date date, Profile profile, School school) {
        this.id = id;
        this.txtLicence = txtLicence;
        this.dates = date;
        this.profile = profile;
        this.school = school;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "txtLicence", nullable = false, unique = true)
    public String getTxtLicence() {
        return txtLicence;
    }

    public void setTxtLicence(String txtLicence) {
        this.txtLicence = txtLicence;
    }

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "dates", nullable = false)
    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    @ManyToOne
    @JoinColumn(name = "idLicenceType", nullable = false)
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Enumerated(EnumType.ORDINAL)
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @ManyToOne
    @JoinColumn(name = "idSchool", nullable = false)
    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Column(name = "snActive")
    public boolean isSnActive() {
        return snActive;
    }

    public void setSnActive(boolean snActive) {
        this.snActive = snActive;
    }
}
