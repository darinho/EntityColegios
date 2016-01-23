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
@Table(name = "TASK_DETAIL", schema = "public")
public class TaskDetail implements java.io.Serializable {

    private Long id;
    private Task task;
    private ResponseType responseType;
    private FileType fileType;
    private byte[] attach;
    private String content;
    private boolean askResponse;

    public TaskDetail() {
    }

    public TaskDetail(Long id, Task task) {
        this.id = id;
        this.task = task;
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
    @JoinColumn(name = "idTask", referencedColumnName = "id", nullable = false)
    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idResponseType", referencedColumnName = "id", nullable = false)
    public ResponseType getResponseType() {
        return responseType;
    }

    public void setResponseType(ResponseType responseType) {
        this.responseType = responseType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idFileType", referencedColumnName = "id", nullable = false)
    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    @Column(name = "attach")
    public byte[] getAttach() {
        return attach;
    }

    public void setAttach(byte[] attach) {
        this.attach = attach;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    @Column(name = "askResponse")
    public boolean isAskResponse() {
        return askResponse;
    }
    
    public void setAskResponse(boolean askResponse) {
        this.askResponse = askResponse;
    }
    
}
