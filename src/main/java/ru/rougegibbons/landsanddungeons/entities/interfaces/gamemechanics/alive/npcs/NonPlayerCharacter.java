package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.npcs;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.WithDescription;

/**
 * {@link AliveEntity} interface extension representing various non-player characters (NPCs).
 *
 * @see AliveEntity
 * @see WithDescription
 * @since 1.1.3
 */
public interface NonPlayerCharacter extends AliveEntity, WithDescription {
    /**
     * check if this NPCs is elite.
     *
     * @return true if this NPC is an elite one, false otherwise.
     */
    @NotNull Boolean isElite();

    /**
     * check if this NPC is boss.
     *
     * @return true if this NPC is boss, false otherwise.
     */
    @NotNull Boolean isBoss();

    /**
     * see {@link AliveEntity} description.
     *
     * @return always true.
     */
    @Override
    default @NotNull Boolean isAiControlled() {
        return true;
    }
}
