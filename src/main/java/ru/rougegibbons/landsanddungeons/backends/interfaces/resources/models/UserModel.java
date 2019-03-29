package ru.rougegibbons.landsanddungeons.backends.interfaces.resources.models;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.managers.interfaces.models.ObjectModel;

/**
 * interface for data models representing {@link ru.rougegibbons.landsanddungeons.entities.interfaces.core.User}.
 *
 * @see ObjectModel
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.User
 * @since 1.1.3
 */
public interface UserModel extends ObjectModel {
    /**
     * get user login.
     *
     * @return user login.
     */
    @NotNull String getLogin();

    /**
     * get user password.
     *
     * @return user password.
     */
    @NotNull String getPassword();


}
