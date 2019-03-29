package ru.rougegibbons.landsanddungeons.backends.interfaces.auth;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.backends.interfaces.Backend;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.User;

import java.util.Map;

/**
 * {@link Backend} interface extenison serving for users authentication and sign up.
 *
 * @see Backend
 * @see User
 * @since 1.1.3
 */
public interface AuthBackend extends Backend {
    /**
     * get all users registered on the current backend.
     *
     * @return {@link Map} containing all registered  {@link User} accounts.
     */
    @NotNull Map<Long, User> getRegisteredUsers();

    /**
     * get registered user account data, if such user is registered in the current backend.
     *
     * @param userId - id of the user account to get.
     * @return {@link User} account if such user is registered, null otherwise.
     */
    default @Nullable User getUser(@NotNull Long userId) {
        return getRegisteredUsers().getOrDefault(userId, null);
    }

    /**
     * check if such user is already registered on current backend.
     *
     * @param userId - id of the user account to check.
     * @return true if user account with such id is registered, false otherwise.
     */
    default @NotNull Boolean isRegistered(@NotNull Long userId) {
        return getRegisteredUsers().containsKey(userId);
    }

    /**
     * check if such {@link User} account is already registered in the current backend.
     *
     * @param user - {@link User} account to check.
     * @return true if this {@link User} account is already registered, false otherwise.
     */
    default @NotNull Boolean isRegistered(@NotNull User user) {
        return isRegistered(user.getId());
    }
}
