package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.flyweights;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.EffectUsageContext;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects.Effect;

/**
 * {@link GameEntityStorageComponent} interface extension representing effect slots.
 *
 * @see GameEntityStorageComponent
 * @see Effect
 * @see EffectUsageContext
 * @since 1.1.3
 */
public interface EffectSlot extends GameEntityStorageComponent<Effect> {
    /**
     * get effect's context.
     *
     * @return {@link EffectUsageContext} instance representing stored effect's context.
     */
    @NotNull EffectUsageContext getContext();
}
