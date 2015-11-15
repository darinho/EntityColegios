/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.enmiguate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dario Calderon
 */
@Entity
@Table(name = "PERSON", schema = "dbo", catalog = "COLEGIOS")
public class Person implements java.io.Serializable {

    private int idPerson;
    private String txtName;

    public Person() {
    }

    public Person(int idPerson) {
        this.idPerson = idPerson;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idPerson", unique = true, nullable = false)
    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    @Column(name = "txtName", nullable = false)
    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

}
