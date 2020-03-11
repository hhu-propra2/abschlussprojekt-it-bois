package mops.gruppen2;

import mops.gruppen2.domain.Exceptions.EventException;
import mops.gruppen2.domain.Group;
import mops.gruppen2.service.EventService;
import mops.gruppen2.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Gruppen2Config {

    @Autowired
    GroupService groupService;
    @Autowired
    EventService eventService;

    @Bean
    public List<Group> groups() throws EventException {
        return groupService.projectEventList(eventService.findAllEvents());
    }

}
