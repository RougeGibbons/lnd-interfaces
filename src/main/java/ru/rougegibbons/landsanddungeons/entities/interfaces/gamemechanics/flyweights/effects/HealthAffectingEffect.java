package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.PairNumberComponent;

/**
 * {@link Effect} interface extension representing health-affecting effects.
 *
 * @see Effect
 * @since 1.1.3
 */
public interface HealthAffectingEffect extends Effect {
    /**
     * get effect's health affection range (minimal and maximal values.
     *
     * @return {@link PairNumberComponent.PairIntComponent} instance representing effect's health affection limits.
     */
    @NotNull PairNumberComponent.PairIntComponent getHealthAffectionRange();
}
