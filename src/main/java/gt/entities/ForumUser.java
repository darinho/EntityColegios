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
@Table(name = "FORUM_USER")
public class ForumUser {

    private long idForumUser;
    private UserProfile userProfile;
    private Forum forum;

    public ForumUser() {
    }

    public ForumUser(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public ForumUser(long idForumUser, UserProfile userProfile, Forum forum) {
        this.idForumUser = idForumUser;
        this.userProfile = userProfile;
        this.forum = forum;
    }

    public ForumUser(UserProfile userProfile, Forum forum) {
        this.userProfile = userProfile;
        this.forum = forum;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idForumUser", unique = true, nullable = false)
    public long getIdForumUser() {
        return idForumUser;
    }

    public void setIdForumUser(long idForumUser) {
        this.idForumUser = idForumUser;
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

    @ManyToOne
    @JoinColumn(name = "idForum", referencedColumnName = "idForum", nullable = false)
    @Cascade(CascadeType.ALL)
    public Forum getForum() {
        return forum;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }

}
