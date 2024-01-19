package googledrivedavid.domain;

import googledrivedavid.NotificationApplication;
import googledrivedavid.domain.Notified;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Message_table")
@Data
//<<< DDD / Aggregate Root
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;

    private String name;

    @PostPersist
    public void onPostPersist() {
        Notified notified = new Notified(this);
        notified.publishAfterCommit();
    }

    public static MessageRepository repository() {
        MessageRepository messageRepository = NotificationApplication.applicationContext.getBean(
            MessageRepository.class
        );
        return messageRepository;
    }

    //<<< Clean Arch / Port Method
    public static void requestNotify(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void requestNotify(StreamProcessed streamProcessed) {
        //implement business logic here:

        /** Example 1:  new item 
        Message message = new Message();
        repository().save(message);

        */

        /** Example 2:  finding and process
        
        repository().findById(streamProcessed.get???()).ifPresent(message->{
            
            message // do something
            repository().save(message);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
