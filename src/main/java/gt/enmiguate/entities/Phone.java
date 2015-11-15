/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.enmiguate.entities;

import java.io.Serializable;
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
@Table(name = "PHONE", schema = "dbo", catalog = "COLEGIOS")
public class Phone implements Serializable {

    private int idPhone;
    private String txtPhone;

    public Phone() {
    }

    public Phone(int idPhone) {
        this.idPhone = idPhone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idPhone", unique = true, nullable = false)
    public int getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(int idPhone) {
        this.idPhone = idPhone;
    }

    @Column(name = "txtPhone", nullable = false)
    public String getTxtPhone() {
        return txtPhone;
    }

    public void setTxtPhone(String txtPhone) {
        this.txtPhone = txtPhone;
    }

}
