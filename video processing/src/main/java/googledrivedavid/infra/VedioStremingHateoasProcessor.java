package googledrivedavid.infra;

import googledrivedavid.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VedioStremingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<VedioStreming>> {

    @Override
    public EntityModel<VedioStreming> process(
        EntityModel<VedioStreming> model
    ) {
        return model;
    }
}
