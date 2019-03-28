package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.AbilityUsageContext;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.ActionResultPart;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.Named;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.WithDescription;

import java.util.List;

/**
 * {@link GameEntity} interface extension representing
 * various characters' (players and NPCs) battle skills.
 *
 * @see GameEntity
 * @see Named
 * @see WithDescription
 * @see AbilityUsageContext
 * @see ActionResultPart
 * @since 1.1.3
 */
public interface Ability extends GameEntity, Named, WithDescription {
    /**
     * use ability according to the given battle context.
     *
     * @param context {@link AbilityUsageContext} instance storing battle's current state.
     * @return {@link List} storing spawned {@link ActionResultPart}s representing turn events generated during ability's action processing.
     */
    @NotNull List<ActionResultPart> use(@NotNull AbilityUsageContext context);
}
