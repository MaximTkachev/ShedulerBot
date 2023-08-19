package ru.qwerty.schedulerbot.core.api;

import ru.qwerty.schedulerbot.data.model.dto.Schedule;
import ru.qwerty.schedulerbot.data.model.dto.Group;

import java.util.Date;
import java.util.List;

/**
 * The interface is used to send http requests to external services.
 */
public interface TsuInTimeClient {

    List<Group> getGroups();

    Schedule getSchedule(String groupId, Date date);
}
