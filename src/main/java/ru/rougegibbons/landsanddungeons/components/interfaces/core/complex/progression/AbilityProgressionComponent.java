package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.ClampedNumberComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.timers.CountdownComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.UpdateablePropertyComponent;

/**
 * Component representing {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter}'s
 * progression and current state of given
 * {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.Ability}:
 * its level, mastery, level, cooldown, etc.
 *
 * @see UpdateablePropertyComponent
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.Ability
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter
 * @see CountdownComponent
 * @see ClampedNumberComponent
 * @since 1.1.3
 */
public interface AbilityProgressionComponent
        extends UpdateablePropertyComponent {
    /**
     * get ability id this progression component corresponds to.
     *
     * @return {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.Ability} id.
     */
    @NotNull Long getAbilityId();

    /**
     * get ability level.
     *
     * @return given ability's level as {@link Integer}.
     */
    @NotNull Integer getAbilityLevel();

    /**
     * get ability's mastery level.
     *
     * @return given ability's mastery level as {@link Integer}.
     */
    @NotNull Integer getAbilityMasteryLevel();

    /**
     * get timer representing ability's cooldown.
     *
     * @return {@link CountdownComponent} representing cooldown timer for this ability.
     */
    @NotNull CountdownComponent getCooldownTimer();

    /**
     * get character's level progression in given ability.
     *
     * @return {@link ClampedNumberComponent} instance storing progress bar for current level in given ability.
     */
    @NotNull ClampedNumberComponent.ClampedIntegerComponent getLevelProgression();

    /**
     * get character's mastery progression in given ability.
     *
     * @return {@link ClampedNumberComponent} instance storing progress bar for current mastery level in given ability.
     */
    @NotNull ClampedNumberComponent.ClampedIntegerComponent getMasteryProgression();

    /**
     * check if ability is available for usage.
     *
     * @return true if ability's cooldown is zero, false otherwise.
     */
    default @NotNull Boolean isAvailable() {
        return getCooldownTimer().isElapsed();
    }
}
