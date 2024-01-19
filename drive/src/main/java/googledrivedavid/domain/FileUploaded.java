package googledrivedavid.domain;

import googledrivedavid.domain.*;
import googledrivedavid.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;

    public FileUploaded() {
        super();
    }
}
//>>> DDD / Domain Event
