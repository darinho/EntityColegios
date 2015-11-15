/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.enmiguate.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dario Calderon
 */
public class SchoolLevel {

    private int idSchoolLevel;
    private String txtDescription;

    public SchoolLevel() {
    }

    public SchoolLevel(int idSchoolLevel) {
        this.idSchoolLevel = idSchoolLevel;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idSchoolLevel", unique = true, nullable = false)
    public int getIdSchoolLevel() {
        return idSchoolLevel;
    }

    public void setIdSchoolLevel(int idSchoolLevel) {
        this.idSchoolLevel = idSchoolLevel;
    }

    @Column(name = "txtDescripcion", nullable = false)
    public String getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

}
