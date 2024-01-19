package googledrivedavid.domain;

import googledrivedavid.IndexerApplication;
import googledrivedavid.domain.FileIndexed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FileIndex_table")
@Data
//<<< DDD / Aggregate Root
public class FileIndex {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileName;

    private String filePath;

    @PostPersist
    public void onPostPersist() {
        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();
    }

    public static FileIndexRepository repository() {
        FileIndexRepository fileIndexRepository = IndexerApplication.applicationContext.getBean(
            FileIndexRepository.class
        );
        return fileIndexRepository;
    }
}
//>>> DDD / Aggregate Root
