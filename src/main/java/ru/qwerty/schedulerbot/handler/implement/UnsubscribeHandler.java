package ru.qwerty.schedulerbot.handler.implement;

import lombok.RequiredArgsConstructor;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.qwerty.schedulerbot.core.service.UserService;
import ru.qwerty.schedulerbot.data.model.UserChanges;
import ru.qwerty.schedulerbot.handler.Handler;

/**
 * The handler is used for the case when a user wants to unsubscribe from the daily schedule mailing.
 */
@RequiredArgsConstructor
public class UnsubscribeHandler implements Handler {

    private final UserService userService;

    @Override
    public String handle(Update update) {
        UserChanges userChanges = new UserChanges();
        userChanges.setIsSubscribed(false);
        userService.update(update.getMessage().getChat().getId(), userChanges);

        return "Вы успешно отписались от ежедневной рассылки расписания";
    }
}
