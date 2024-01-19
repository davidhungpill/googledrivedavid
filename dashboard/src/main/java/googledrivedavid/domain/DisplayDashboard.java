package googledrivedavid.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "DisplayDashboard_table")
@Data
public class DisplayDashboard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String fileStatus;
    private Long fileSize;
    private Boolean isIndexed;
    private String streamingUrl;
}
