package googledrivedavid.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import googledrivedavid.config.kafka.KafkaProcessor;
import googledrivedavid.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    MessageRepository messageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploaded'"
    )
    public void wheneverFileUploaded_RequestNotify(
        @Payload FileUploaded fileUploaded
    ) {
        FileUploaded event = fileUploaded;
        System.out.println(
            "\n\n##### listener RequestNotify : " + fileUploaded + "\n\n"
        );

        // Sample Logic //
        Message.requestNotify(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StreamProcessed'"
    )
    public void wheneverStreamProcessed_RequestNotify(
        @Payload StreamProcessed streamProcessed
    ) {
        StreamProcessed event = streamProcessed;
        System.out.println(
            "\n\n##### listener RequestNotify : " + streamProcessed + "\n\n"
        );

        // Sample Logic //
        Message.requestNotify(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
