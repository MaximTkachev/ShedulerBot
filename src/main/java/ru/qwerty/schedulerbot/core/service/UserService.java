package ru.qwerty.schedulerbot.core.service;

import ru.qwerty.schedulerbot.data.entity.UserEntity;
import ru.qwerty.schedulerbot.data.model.UserChanges;

/**
 * The service provides user management functionality.
 */
public interface UserService {

    UserEntity get(long id);

    void save(UserEntity userEntity);

    void update(long id, UserChanges userChanges);
}
