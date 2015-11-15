/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dc
 */
@Entity
@Table(name = "PROFILE")
public class Profile implements Serializable {

    private int idProfile;
    private String txtDescription;
    private Boolean snActive;

    public Profile() {
    }

    public Profile(int idProfile) {
        this.idProfile = idProfile;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idProfile", unique = true, nullable = false)
    public int getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(int idProfile) {
        this.idProfile = idProfile;
    }

    @Column(name = "txtDescription", nullable = false)
    public String getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

    @Column(name = "snActive", nullable = false)
    public Boolean getSnActive() {
        return snActive;
    }

    public void setSnActive(Boolean snActive) {
        this.snActive = snActive;
    }

}
