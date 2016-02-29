/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author dc
 */
@Entity
@Table(name = "USER_PROFILE")
public class UserProfile implements Serializable {

    private Long idUserProfile;
    private Profile profile;
    private User user;
    private Licences licence;
    private boolean snActive;

    public UserProfile() {
    }

    public UserProfile(Long idUserProfile) {
        this.idUserProfile = idUserProfile;
    }

    public UserProfile(Long idUserProfile, Profile profile, User user, Licences school) {
        this.idUserProfile = idUserProfile;
        this.profile = profile;
        this.user = user;
        this.licence = school;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUserProfile", unique = true, nullable = false)
    public Long getIdUserProfile() {
        return idUserProfile;
    }

    public void setIdUserProfile(Long idUserProfile) {
        this.idUserProfile = idUserProfile;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idProfile", referencedColumnName = "idProfile", nullable = false)
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser", nullable = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idLicence", nullable = false)
    public Licences getLicence() {
        return licence;
    }

    public void setLicence(Licences licence) {
        this.licence = licence;
    }

    @Column(name = "snActive")
    public boolean isSnActive() {
        return snActive;
    }

    public void setSnActive(boolean snActive) {
        this.snActive = snActive;
    }

}
