package googledrivedavid.domain;

import googledrivedavid.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "fileIndices",
    path = "fileIndices"
)
public interface FileIndexRepository
    extends PagingAndSortingRepository<FileIndex, Long> {}
