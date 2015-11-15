/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

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
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Dario Calderon
 */
@Entity
@Table(name = "PERSON")
public class Person implements java.io.Serializable {

    private int idPerson;
    private String txtFullName;
    private String txtFirstNameF;
    private String txtFirstNameS;
    private String txtFirstNameT;
    private String txtLastNameF;
    private String txtLastNameS;
    private String txtLastNameT;
    private Address address;
    private List<Document> documents;

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

    @Column(name = "txtFullName", nullable = false)
    public String getTxtFullName() {
        return txtFullName;
    }

    public void setTxtFullName(String txtFullName) {
        this.txtFullName = txtFullName;
    }

    @Column(name = "txtFirstNameF", nullable = false)
    public String getTxtFirstNameF() {
        return txtFirstNameF;
    }

    public void setTxtFirstNameF(String txtFirstNameF) {
        this.txtFirstNameF = txtFirstNameF;
    }

    @Column(name = "txtFirstNameS")
    public String getTxtFirstNameS() {
        return txtFirstNameS;
    }

    public void setTxtFirstNameS(String txtFirstNameS) {
        this.txtFirstNameS = txtFirstNameS;
    }

    @Column(name = "txtFirstNameT")
    public String getTxtFirstNameT() {
        return txtFirstNameT;
    }

    public void setTxtFirstNameT(String txtFirstNameT) {
        this.txtFirstNameT = txtFirstNameT;
    }

    @Column(name = "txtLastNameF", nullable = false)
    public String getTxtLastNameF() {
        return txtLastNameF;
    }

    public void setTxtLastNameF(String txtLastNameF) {
        this.txtLastNameF = txtLastNameF;
    }

    @Column(name = "txtLastNameS")
    public String getTxtLastNameS() {
        return txtLastNameS;
    }

    public void setTxtLastNameS(String txtLastNameS) {
        this.txtLastNameS = txtLastNameS;
    }

    @Column(name = "txtLastNameT")
    public String getTxtLastNameT() {
        return txtLastNameT;
    }

    public void setTxtLastNameT(String txtLastNameT) {
        this.txtLastNameT = txtLastNameT;
    }

    @ManyToOne
    @JoinColumn(name = "idAddress", referencedColumnName = "idAddress", nullable = false)
    @Cascade(CascadeType.ALL)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @OneToMany(mappedBy = "person")
    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

}
