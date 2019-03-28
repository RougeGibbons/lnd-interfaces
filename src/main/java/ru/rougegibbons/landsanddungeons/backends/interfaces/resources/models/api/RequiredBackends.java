package ru.rougegibbons.landsanddungeons.backends.interfaces.resources.models.api;

import java.util.Map;

/**
 * interface representing backend or system requirements to other backends.
 * Each field stores an {@link ApiVersion} instance mapped
 * to backend ID from {@link ru.rougegibbons.landsanddungeons.backends.interfaces.BackendId}.
 *
 * @see Map
 * @see ApiVersion
 * @since 1.1.3
 */
public interface RequiredBackends extends Map<Integer, ApiVersion> {

}
