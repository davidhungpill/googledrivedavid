package googledrivedavid.infra;

import googledrivedavid.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VideoStremingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<VideoStreming>> {

    @Override
    public EntityModel<VideoStreming> process(
        EntityModel<VideoStreming> model
    ) {
        return model;
    }
}
