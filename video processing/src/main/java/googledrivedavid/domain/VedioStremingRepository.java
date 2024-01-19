package googledrivedavid.domain;

import googledrivedavid.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "vedioStremings",
    path = "vedioStremings"
)
public interface VedioStremingRepository
    extends PagingAndSortingRepository<VedioStreming, Long> {}
