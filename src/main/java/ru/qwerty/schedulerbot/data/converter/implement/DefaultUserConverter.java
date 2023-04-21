package ru.qwerty.schedulerbot.data.converter.implement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.qwerty.schedulerbot.data.converter.UserConverter;
import ru.qwerty.schedulerbot.data.entity.UserEntity;

import java.time.Clock;
import java.util.Date;

/**
 * The default implementation of the {@link UserConverter} interface.
 */
@Component
@RequiredArgsConstructor
public class DefaultUserConverter implements UserConverter {

    private final Clock clock;

    @Override
    public UserEntity convertToEntity(Update update) {
        UserEntity user = new UserEntity();
        user.setId(update.getMessage().getChat().getId());
        user.setCreationDate(new Date(clock.millis()));
        user.setIsSubscribed(false);

        return user;
    }
}