package gt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author wilver
 */
@Entity
@Table(name="SCHOOL_DAY_TYPE", schema = "public")
public class SchoolDayType implements java.io.Serializable {
    
    private Long id;
    private String txtName;

    public SchoolDayType() {
    }

    public SchoolDayType(Long id, String txtName) {
        this.id = id;
        this.txtName = txtName;
    }
    
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name = "txtName", length = 128)
    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }
    
}