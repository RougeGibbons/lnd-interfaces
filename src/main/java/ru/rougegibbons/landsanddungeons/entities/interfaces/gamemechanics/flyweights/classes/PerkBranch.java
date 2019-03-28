package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression.PerksHolderComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.Named;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.WithDescription;

/**
 * {@link GameEntity} interface extension representing perk branch flyweights.
 *
 * @see GameEntity
 * @see PerksHolderComponent
 * @see Perk
 * @see Named
 * @see WithDescription
 * @since 1.1.3
 */
public interface PerkBranch extends GameEntity, Named, WithDescription {
    /**
     * @return
     */
    @NotNull PerksHolderComponent getPerks();
}
