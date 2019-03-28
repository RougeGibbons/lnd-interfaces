package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts;

import org.jetbrains.annotations.NotNull;

/**
 * interface representing entities converting {@link Context} derivatives
 * into {@link ProcessingResult} derivatives.
 *
 * @param <C> - {@link Context} derivative instance.
 * @param <R> - {@link ProcessingResult} derivative instance.
 * @see Context
 * @see ProcessingResult
 * @since 1.1.3
 */
public interface ContextProcessor<C extends Context, R extends ProcessingResult> {
    /**
     * makes {@link R} result instance from given {@link C} context instance.
     *
     * @param context - given context.
     * @return result made basing on given context.
     */
    @NotNull R process(@NotNull C context);
}
