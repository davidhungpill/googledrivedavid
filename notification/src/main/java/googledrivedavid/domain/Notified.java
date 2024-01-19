package googledrivedavid.domain;

import googledrivedavid.domain.*;
import googledrivedavid.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Notified extends AbstractEvent {

    private Long id;

    public Notified(Message aggregate) {
        super(aggregate);
    }

    public Notified() {
        super();
    }
}
//>>> DDD / Domain Event
