package googledrivedavid.domain;

import googledrivedavid.VideoProcessingApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VideoStreming_table")
@Data
//<<< DDD / Aggregate Root
public class VideoStreming {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileName;

    private String videoStreamingUrl;

    public static VideoStremingRepository repository() {
        VideoStremingRepository videoStremingRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoStremingRepository.class
        );
        return videoStremingRepository;
    }

    //<<< Clean Arch / Port Method
    public static void ifFileIsVideoRequestStreamProcess(
        FileUploaded fileUploaded
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        VideoStreming videoStreming = new VideoStreming();
        repository().save(videoStreming);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(videoStreming->{
            
            videoStreming // do something
            repository().save(videoStreming);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
