/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import java.io.Serializable;
import java.util.ArrayList;
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
 * @author dc
 */
@Entity
@Table(name = "SCHOOL")
public class School implements Serializable {

    private Long idSchool;
    private String txtName;
    private String nit;
    private Address address;
    private Boolean snActive;
//    private List<Phone> phones = new ArrayList<>();

    public School() {
    }

    public School(Long idSchool) {
        this.idSchool = idSchool;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idSchool", unique = true, nullable = false)
    public Long getIdSchool() {
        return idSchool;
    }

    public void setIdSchool(Long idSchool) {
        this.idSchool = idSchool;
    }

    @Column(name = "txtNit", nullable = false, unique = true)
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Column(name = "txtName", nullable = false)
    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
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

//    @OneToMany
//    @JoinColumn(name = "idPhone", referencedColumnName = "idPhone", nullable = false)
//    @Cascade(CascadeType.ALL)
//    public List<Phone> getPhones() {
//        return phones;
//    }
//
//    public void setPhones(List<Phone> phones) {
//        this.phones = phones;
//    }

    @Column(name = "snActive", nullable = false)
    public Boolean getSnActive() {
        return snActive;
    }

    public void setSnActive(Boolean snActive) {
        this.snActive = snActive;
    }

}
