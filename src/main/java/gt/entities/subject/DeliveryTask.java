package gt.entities.subject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table(name = "DELIVERY_TASK", schema = "public")
public class DeliveryTask implements java.io.Serializable {
    
    private Long id;
    private SubjectUserProfile subjectUserProfile;
    private TaskDetail taskDetail;
    private byte[] attach;
    private String response;
    private boolean finished;

    public DeliveryTask() {
    }

    public DeliveryTask(Long id, SubjectUserProfile subjectUserProfile, TaskDetail taskDetail, byte[] attach, String response) {
        this.id = id;
        this.subjectUserProfile = subjectUserProfile;
        this.taskDetail = taskDetail;
        this.attach = attach;
        this.response = response;
    }
    
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdSubjectUserProfile", referencedColumnName = "id", nullable = false)
    public SubjectUserProfile getSubjectUserProfile() {
        return subjectUserProfile;
    }

    public void setSubjectUserProfile(SubjectUserProfile subjectUserProfile) {
        this.subjectUserProfile = subjectUserProfile;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTaskDetail", referencedColumnName = "id", nullable = false)
    public TaskDetail getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(TaskDetail taskDetail) {
        this.taskDetail = taskDetail;
    }
    
    @Column(name = "attach")
    public byte[] getAttach() {
        return attach;
    }

    public void setAttach(byte[] attach) {
        this.attach = attach;
    }
    
    @Column(name = "response")
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    @Column(name = "finished")
    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    
}