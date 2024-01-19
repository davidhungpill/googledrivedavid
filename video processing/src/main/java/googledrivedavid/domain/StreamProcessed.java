package googledrivedavid.domain;

import googledrivedavid.domain.*;
import googledrivedavid.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class StreamProcessed extends AbstractEvent {

    private Long id;

    public StreamProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
