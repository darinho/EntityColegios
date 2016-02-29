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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author dario.calderon
 */
@Entity
@Table(name = "GROUP_USER")
public class GroupUser {

    private long idGroupUser;
    private Group group;
    private UserProfile userProfile;

    public GroupUser() {
    }

    public GroupUser(long idGroupUser) {
        this.idGroupUser = idGroupUser;
    }

    public GroupUser(long idGroupUser, Group group, UserProfile userProfile) {
        this.idGroupUser = idGroupUser;
        this.group = group;
        this.userProfile = userProfile;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idGroupUser", unique = true, nullable = false)
    public long getIdGroupUser() {
        return idGroupUser;
    }

    public void setIdGroupUser(long idGroupUser) {
        this.idGroupUser = idGroupUser;
    }

    @ManyToOne
    @JoinColumn(name = "idGroup", referencedColumnName = "idGroup", nullable = false)
    @Cascade(CascadeType.ALL)
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @ManyToOne
    @JoinColumn(name = "idUserProfile", referencedColumnName = "idUserProfile", nullable = false)
    @Cascade(CascadeType.ALL)
    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

}
