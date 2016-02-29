/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author dario.calderon
 */
@Entity
@Table(name = "FORUM")
public class Forum {

    private long idForum;
    private String txtComment;
    private Date date;
    private int intLikes;
    private int intComments;
    private UserProfile userProfile;
    private long idForumParent;
    private Forum forumParent;
    private List<Forum> discution;

    public Forum() {
    }

    public Forum(long idForum) {
        this.idForum = idForum;
    }

    public Forum(String txtComment, Date date, int intLikes, int intComments, UserProfile userProfile, long idForumParent) {
        this.txtComment = txtComment;
        this.date = date;
        this.intLikes = intLikes;
        this.intComments = intComments;
        this.userProfile = userProfile;
        this.idForumParent = idForumParent;
    }

    public Forum(long idForum, String txtComment, Date date, int intLikes, int intComments) {
        this.idForum = idForum;
        this.txtComment = txtComment;
        this.date = date;
        this.intLikes = intLikes;
        this.intComments = intComments;
    }

    public Forum(long idForum, String txtComment, Date date, int intLikes, int intComments, List<Forum> discution) {
        this.idForum = idForum;
        this.txtComment = txtComment;
        this.date = date;
        this.intLikes = intLikes;
        this.intComments = intComments;
        this.discution = discution;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idForum", unique = true, nullable = false)
    public long getIdForum() {
        return idForum;
    }

    public void setIdForum(long idForum) {
        this.idForum = idForum;
    }

    @Column(name = "txtComment", length = 255)
    public String getTxtComment() {
        return txtComment;
    }

    public void setTxtComment(String txtComment) {
        this.txtComment = txtComment;
    }

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "dates", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "intLikes")
    public int getIntLikes() {
        return intLikes;
    }

    public void setIntLikes(int intLikes) {
        this.intLikes = intLikes;
    }

    @Column(name = "intComments")
    public int getIntComments() {
        return intComments;
    }

    public void setIntComments(int intComments) {
        this.intComments = intComments;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idUserProfile", referencedColumnName = "idUserProfile", nullable = false)
    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    @Column(name = "idForumParent")
    public long getIdForumParent() {
        return idForumParent;
    }

    public void setIdForumParent(long idForumParent) {
        this.idForumParent = idForumParent;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties()
    @JoinColumn(name = "idForumParent", referencedColumnName = "idForum", nullable = false, insertable = false, updatable = false)
    public Forum getForumParent() {
        return forumParent;
    }

    public void setForumParent(Forum forumParent) {
        this.forumParent = forumParent;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "forumParent")   
    public List<Forum> getDiscution() {
        return discution;
    }

    public void setDiscution(List<Forum> discution) {
        this.discution = discution;
    }

}
