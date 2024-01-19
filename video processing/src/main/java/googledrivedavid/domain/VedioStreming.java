package googledrivedavid.domain;

import googledrivedavid.VideoProcessingApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VedioStreming_table")
@Data
//<<< DDD / Aggregate Root
public class VedioStreming {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileName;

    private String vedioStreamingUrl;

    public static VedioStremingRepository repository() {
        VedioStremingRepository vedioStremingRepository = VideoProcessingApplication.applicationContext.getBean(
            VedioStremingRepository.class
        );
        return vedioStremingRepository;
    }
}
//>>> DDD / Aggregate Root
