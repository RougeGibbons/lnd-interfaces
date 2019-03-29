package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.polls;

import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.mixins.WithAuthor;

/**
 * {@link Poll} interface extension representing polls that are created by users.
 *
 * @see Poll
 * @see WithAuthor
 * @since 1.1.3
 */
public interface UserCreatedPoll extends Poll, WithAuthor {

}
