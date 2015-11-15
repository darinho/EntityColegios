/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.enmiguate.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author dc
 */
public class ProfileWindow {

    private int idProfileWindow;
    private Profile profile;
    private List<Window> window;

    public ProfileWindow(int idProfileWindow) {
        this.idProfileWindow = idProfileWindow;
    }

    public ProfileWindow() {
    }

    public ProfileWindow(int idProfileWindow, Profile profile) {
        this.idProfileWindow = idProfileWindow;
        this.profile = profile;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idProfileWindow", unique = true, nullable = false)
    public int getIdProfileWindow() {
        return idProfileWindow;
    }

    public void setIdProfileWindow(int idProfileWindow) {
        this.idProfileWindow = idProfileWindow;
    }

    @ManyToOne
    @JoinColumn(name = "idProfile", referencedColumnName = "idProfile", nullable = false)
    @Cascade(CascadeType.ALL)
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @OneToMany
    @JoinColumn(name = "idWindow", referencedColumnName = "idWindow")
    public List<Window> getWindow() {
        return window;
    }

    public void setWindow(List<Window> window) {
        this.window = window;
    }

}
