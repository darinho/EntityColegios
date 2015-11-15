/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.enmiguate.entities;

import java.io.Serializable;
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
@Table(name = "USER", schema = "dbo", catalog = "COLEGIOS")
public class User implements Serializable {

    private int idUser;
    private Person person;
    private List<UserProfile> userProfiles;
    private String txtPwd;
    private String txtUser;

    public User() {
    }

    public User(int idUser) {
        this.idUser = idUser;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @ManyToOne
    @JoinColumn(name = "idPerson", referencedColumnName = "idPerson", nullable = false)
    @Cascade(CascadeType.ALL)
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @OneToMany(mappedBy = "User")
    @Cascade(CascadeType.PERSIST)
    public List<UserProfile> getUserProfiles() {
        return userProfiles;
    }

    public void setUserProfiles(List<UserProfile> userProfiles) {
        this.userProfiles = userProfiles;
    }

    @Column(name = "txtPwd", nullable = false)
    public String getTxtPwd() {
        return txtPwd;
    }

    public void setTxtPwd(String txtPwd) {
        this.txtPwd = txtPwd;
    }

    @Column(name = "txtUser", nullable = false, unique = true)
    public String getTxtUser() {
        return txtUser;
    }

    public void setTxtUser(String txtUser) {
        this.txtUser = txtUser;
    }

}
