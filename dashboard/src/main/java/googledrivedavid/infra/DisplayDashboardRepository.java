package googledrivedavid.infra;

import googledrivedavid.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "displayDashboards",
    path = "displayDashboards"
)
public interface DisplayDashboardRepository
    extends PagingAndSortingRepository<DisplayDashboard, Long> {}
