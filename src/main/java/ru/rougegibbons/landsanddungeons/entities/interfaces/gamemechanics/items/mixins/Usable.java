package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.affectors.generic.AffectorComponent;

import java.util.List;

/**
 * interface mixin for item entities
 * that can be somehow usedby their owners (like food, potions, etc.).
 *
 * @see AffectorComponent
 * @see List
 * @since 1.1.3
 */
public interface Usable {
    /**
     * get affection gained from using the item.
     *
     * @return {@link List} of {@link AffectorComponent} gained from using this item.
     */
    @NotNull List<AffectorComponent> use();
}
