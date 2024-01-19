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
    VideoStremingRepository videoStremingRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploaded'"
    )
    public void wheneverFileUploaded_IfFileIsVideoRequestStreamProcess(
        @Payload FileUploaded fileUploaded
    ) {
        FileUploaded event = fileUploaded;
        System.out.println(
            "\n\n##### listener IfFileIsVideoRequestStreamProcess : " +
            fileUploaded +
            "\n\n"
        );

        // Sample Logic //
        VideoStreming.ifFileIsVideoRequestStreamProcess(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
