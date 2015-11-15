/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.enmiguate.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Dario Calderon
 */
public class UserProfleUserGrade {

    private Grade grade;
    private Profile profile1;
    private User user1;
    private Profile profile2;
    private User user2;

    public UserProfleUserGrade() {
    }

    public UserProfleUserGrade(Grade grade, Profile profile1, User user1, Profile profile2, User user2) {
        this.grade = grade;
        this.profile1 = profile1;
        this.user1 = user1;
        this.profile2 = profile2;
        this.user2 = user2;
    }

    @ManyToOne
    @JoinColumn(name = "idGrade", referencedColumnName = "idGrade", nullable = false)
    @Cascade(CascadeType.ALL)
    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @ManyToOne
    @JoinColumn(name = "idProfile1", referencedColumnName = "idProfile", nullable = false)
    @Cascade(CascadeType.ALL)
    public Profile getProfile1() {
        return profile1;
    }

    public void setProfile1(Profile profile1) {
        this.profile1 = profile1;
    }

    @ManyToOne
    @JoinColumn(name = "idUser1", referencedColumnName = "idUser", nullable = false)
    @Cascade(CascadeType.ALL)
    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    @ManyToOne
    @JoinColumn(name = "idProfile2", referencedColumnName = "idProfile", nullable = false)
    @Cascade(CascadeType.ALL)
    public Profile getProfile2() {
        return profile2;
    }

    public void setProfile2(Profile profile2) {
        this.profile2 = profile2;
    }

    @ManyToOne
    @JoinColumn(name = "idUser2", referencedColumnName = "idUser", nullable = false)
    @Cascade(CascadeType.ALL)
    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

}
