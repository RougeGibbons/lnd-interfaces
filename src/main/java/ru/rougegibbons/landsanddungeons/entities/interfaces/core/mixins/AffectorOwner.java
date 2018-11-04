package ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.affectors.generic.AffectorComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.ListProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;

/**
 * interface mixin for {@link ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity}
 * implementations that have {@link AffectorComponent} implementations container.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @see AffectorComponent
 * @see MapProviderComponent
 * @since 1.0.2
 */
public interface AffectorOwner {
    /**
     * get entity affectors collection.
     *
     * @return {@link MapProviderComponent.GameEntityAffectorsContainer} implementation instance.
     */
    @NotNull MapProviderComponent.GameEntityAffectorsContainer getAllAffectors();

    /**
     * checks if entity has any affectors niteracting with given target property and gets first affector from there.
     *
     * @param label - target label to get affector by.
     * @return {@link AffectorComponent} instance if such affectors group is present in collection, null otherwise.
     */
    default @Nullable AffectorComponent getAffector(@NotNull Long label) {
        final ListProviderComponent<AffectorComponent> affectors =
                getAllAffectors().getOrDefault(label, null);
        if (affectors == null || affectors.isEmpty()) {
            return null;
        } else {
            return affectors.get(0);
        }
    }

    /**
     * checks if there is any affectors for given target property label.
     *
     * @param label - target property label to search affectors by.
     * @return true if there's at least one {@link AffectorComponent} for given target group, false otherwise.
     */
    default @NotNull Boolean hasAffector(@NotNull Long label) {
        return getAllAffectors().containsKey(label) && !getAllAffectors().get(label).isEmpty();
    }

    /**
     * attempts to add given affector to its target property group.
     *
     * @param affector - {@link AffectorComponent} instance to add to collection.
     * @return true if new affector was successfully added, false otherwise.
     */
    default @NotNull Boolean addAffector(@NotNull AffectorComponent affector) {
        if (!getAllAffectors().containsKey(affector.getTargetLabel())) {
            getAllAffectors().get(affector.getTargetLabel()).add(affector);
            return true;
        } else {
            return false;
        }
    }

    /**
     * attempts to remove given affector from the entity affectors collection.
     *
     * @param affector - {@link AffectorComponent} instanec to remove from collection.
     * @return true if removal was successful, false otherwise
     */
    default @NotNull Boolean removeAffector(@NotNull AffectorComponent affector) {
        final Boolean success = hasAffector(affector.getTargetLabel());
        getAllAffectors().get(affector.getTargetLabel()).remove(affector);
        return success;
    }
}
