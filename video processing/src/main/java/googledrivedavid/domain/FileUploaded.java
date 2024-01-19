package googledrivedavid.domain;

import googledrivedavid.domain.*;
import googledrivedavid.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
}
