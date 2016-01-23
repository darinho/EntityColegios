package gt.entities.subject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "FILE_TYPE", schema = "public")
public class FileType implements java.io.Serializable  {
    
    private Long id;
    private String description;
    private boolean active;

    public FileType() {
    }

    public FileType(Long id) {
        this.id = id;
    }

    public FileType(Long id, String description, boolean active) {
        this.id = id;
        this.description = description;
        this.active = active;
    }
    
    @Id()
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name = "description")
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