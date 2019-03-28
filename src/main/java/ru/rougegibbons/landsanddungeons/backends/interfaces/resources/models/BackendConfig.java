package ru.rougegibbons.landsanddungeons.backends.interfaces.resources.models;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.backends.interfaces.resources.models.api.ApiVersion;
import ru.rougegibbons.landsanddungeons.backends.interfaces.resources.models.api.RequiredBackends;

/**
 * interface for serializable objects containing various data
 * required to start the {@link ru.rougegibbons.landsanddungeons.backends.interfaces.Backend} objects up.
 *
 * @see ru.rougegibbons.landsanddungeons.backends.interfaces.Backend
 * @since 1.1.3
 */
public interface BackendConfig {
    /**
     * get API version that given {@link ru.rougegibbons.landsanddungeons.backends.interfaces.Backend} implements.
     *
     * @return {@link ApiVersion} implemented by given {@link ru.rougegibbons.landsanddungeons.backends.interfaces.Backend} instance.
     */
    @NotNull ApiVersion getVersion();

    /**
     * get ID of the backend this {@link ru.rougegibbons.landsanddungeons.backends.interfaces.Backend} implements.
     *
     * @return ID of the backend API implemented by given {@link ru.rougegibbons.landsanddungeons.backends.interfaces.Backend} instance.
     */
    @NotNull Integer getBackendId();

    /**
     * get IDs and versions of the backends required for this backend's proper functioniong.
     *
     * @return {@link RequiredBackends} instance storing this backend's requirements.
     */
    @NotNull RequiredBackends getRequirements();
}
