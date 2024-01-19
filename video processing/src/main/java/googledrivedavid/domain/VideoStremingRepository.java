package googledrivedavid.domain;

import googledrivedavid.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "videoStremings",
    path = "videoStremings"
)
public interface VideoStremingRepository
    extends PagingAndSortingRepository<VideoStreming, Long> {}
