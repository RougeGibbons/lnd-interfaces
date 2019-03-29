package ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.collections;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.string.StringComponent;

/**
 * component for storing quest descriptions for various phases.
 *
 * @see MapProviderComponent
 * @see StringComponent
 * @since 1.1.3
 */
public interface QuestDescriptionPropertyComponent
        extends MapProviderComponent<Integer, StringComponent> {
    /**
     * get current quest phase description.
     *
     * @param activePhase - current quest phase.
     * @return current quest phase description.
     */
    @NotNull String getActivePhaseDescription(@NotNull Integer activePhase);

    /**
     * get next quest phase description.
     *
     * @param activePhase - current quest phase.
     * @return next quest phase description.
     */
    @NotNull String getNextPhaseDescription(@NotNull Integer activePhase);
}
