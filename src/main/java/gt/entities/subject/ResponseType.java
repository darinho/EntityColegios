package gt.entities.subject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESPONSE_TYPE", schema = "public")
public class ResponseType implements java.io.Serializable{
    
    private Long id;
    private String description;
    private boolean active;

    public ResponseType() {
    }

    public ResponseType(Long id) {
        this.id = id;
    }

    public ResponseType(Long id, String description, boolean active) {
        this.id = id;
        this.description = description;
        this.active = active;
    }
    
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name="description", length = 200)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name = "active")
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}