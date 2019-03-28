package ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * {@link WithLevel} interface mixin extensions for such entities
 * that not only have level, but also can increase it.
 *
 * @see WithLevel
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @since 1.1.3
 */
public interface Levelable extends WithLevel {
    /**
     * increases entity's current level.
     */
    void levelUp();

    /**
     * get current entity's progression to the next level-up as {@link Integer} number.
     *
     * @return entity's level-up progression as {@link Integer}.
     */
    @NotNull Integer getProgressInt();

    /**
     * get current entity's progression to the next level-up as {@link Float} number.
     *
     * @return entity's level-up progression as {@link Float}.
     */
    @NotNull Float getProgressFloat();

    /**
     * get current experience and level-up cap as a {@link List}.
     *
     * @return {@link List} where first value is entity's current experience and second - its current level-up cap.
     */
    @NotNull List<Integer> getExperiencePair();

    /**
     * shows current entity's experience.
     *
     * @return entity's current experience.
     */
    @NotNull Integer getCurrentExperience();

    /**
     * shows current experience cap for next level-up.
     *
     * @return current level-up cap.
     */
    @NotNull Integer getLevelUpCap();

    /**
     * grant entity given amount of experience points.
     *
     * @param amount - experience point to add to entity's current experience.
     */
    void addExperience(@NotNull Integer amount);
}
