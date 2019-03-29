package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.mixins;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.Context;

/**
 * interface mixin for context processors
 * that have single context during their entire lifetime,
 * allowing to bind it prematurely at/after initialization.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.ContextProcessor
 * @since 1.1.3
 */
public interface BoundContext {
    /**
     * binds given {@link Context} to the processor object.
     *
     * @param context - {@link Context} object to bind to the processor.
     */
    void bindContext(@NotNull Context context);

    /**
     * get {@link Context} instance bound to this processor if there's any.
     *
     * @return {@link Context} instance if there's bound context for this processor, null otherwise.
     */
    @Nullable Context getBoundContext();

    /**
     * check if this processor has {@link Context} instance bound to it.
     *
     * @return true if there's bound {@link Context} for this component, false otherwise.
     */
    default @NotNull Boolean hasBoundContext() {
        return getBoundContext() != null;
    }
}
