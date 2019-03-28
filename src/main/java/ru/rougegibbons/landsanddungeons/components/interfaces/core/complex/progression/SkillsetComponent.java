package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * {@link MapProviderComponent} interface extension for components storing
 * given {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity}'s
 * skills: their levels, mastery levels, current cooldowns and availability, etc.
 *
 * @see MapProviderComponent
 * @see AbilityProgressionComponent
 * @see PropertyComponent
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.Ability
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter
 * @since 1.1.3
 */
public interface SkillsetComponent extends
        MapProviderComponent<Long, AbilityProgressionComponent>, PropertyComponent {
    /**
     * @param abilityId - id of the ability to check.
     * @return true if ability with given id is present in skillset and
     */
    default @NotNull Boolean isAvailable(@NotNull Long abilityId) {
        return containsKey(abilityId) && get(abilityId).isAvailable();
    }
}
