package ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * interface mixin for {@link ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity}
 * implementations that have container for {@link PropertyComponent} implementations.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @see PropertyComponent
 * @see MapProviderComponent
 * @since 1.0.2
 */
public interface PropertyOwner {
    /**
     * get entity's properties collection.
     *
     * @return {@link MapProviderComponent.GameEntityPropertiesContainer} implementation instance with entity properties.
     */
    @NotNull MapProviderComponent.GameEntityPropertiesContainer getAllProperties();

    /**
     * checks if entity has property with given label.
     *
     * @param label - property label to check existence in entity properties.
     * @return true if entity has property with given label, false otherwise.
     */
    default @NotNull Boolean hasProperty(@NotNull Long label) {
        return getAllProperties().containsKey(label);
    }

    /**
     * gets a property instance by given label if such property is present in entity properties.
     *
     * @param label - label to get entity property by.
     * @return {@link PropertyComponent} instance if such property is present in entity properties, null otherwise.
     */
    default @Nullable PropertyComponent getProperty(@NotNull Long label) {
        return getAllProperties().getOrDefault(label, null);
    }

    /**
     * tries to add given property in entity properties collection.
     *
     * @param property - {@link PropertyComponent} implementation instance to add in entity properties collection.
     * @return true if property was added in collection successfully, false otherwise.
     */
    default @NotNull Boolean addProperty(@NotNull PropertyComponent property) {
        if (!getAllProperties().containsKey(property.getLabel())) {
            getAllProperties().put(property.getLabel(), property);
            return true;
        } else {
            return false;
        }
    }

    /**
     * tries to remove property from entity properties collection by given label.
     *
     * @param label - label to remove property from collection by.
     * @return true if removal was successful, false otherwise.
     */
    default @NotNull Boolean removeProperty(@NotNull Long label) {
        final Boolean success = getAllProperties().containsKey(label);
        getAllProperties().remove(label);
        return success;
    }
}
