package googledrivedavid.domain;

import googledrivedavid.domain.*;
import googledrivedavid.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;

    public FileIndexed(FileIndex aggregate) {
        super(aggregate);
    }

    public FileIndexed() {
        super();
    }
}
//>>> DDD / Domain Event
