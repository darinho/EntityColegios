/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dario.calderon
 */
@Entity
@Table(name = "GROUP")
public class Group {

    private long idGroup;
    private String txtDescription;
    private Boolean automatic;

    public Group() {
    }

    public Group(long idGroup, String txtDescription) {
        this.idGroup = idGroup;
        this.txtDescription = txtDescription;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idGroup", unique = true, nullable = false)
    public long getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(long idGroup) { 
        this.idGroup = idGroup;
    }

    @Column(name = "txtDescription", length = 100)
    public String getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

    @Column(name = "automatic")
    public Boolean getAutomatic() {
        return automatic;
    }

    public void setAutomatic(Boolean automatic) {
        this.automatic = automatic;
    }

}
