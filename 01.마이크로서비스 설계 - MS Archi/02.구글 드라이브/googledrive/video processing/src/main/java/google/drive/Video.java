package google.drive;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;


@Entity
@Table(name="Video_table")
public class Video  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private Long id;
    
    private Long fileId;
    
    private String url;

    @PostPersist
    public void onPostPersist(){
        VideoProcessed videoProcessed = new VideoProcessed();
        BeanUtils.copyProperties(this, videoProcessed);
        videoProcessed.publishAfterCommit();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    



}
