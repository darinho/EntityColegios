/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities.subject;

/**
 *
 * @author dario.calderon
 */
public class Relationship {

    private Long id;
    private String txtDescription;

    public Relationship() {
    }

    public Relationship(Long id) {
        this.id = id;
    }

    public Relationship(Long id, String txtDescription) {
        this.id = id;
        this.txtDescription = txtDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

}
