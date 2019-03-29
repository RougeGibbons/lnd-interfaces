package ru.rougegibbons.landsanddungeons.backends.interfaces.resources.models.api;

import org.jetbrains.annotations.NotNull;

/**
 * interface representing API version data holders.
 *
 * @since 1.1.3
 */
public interface ApiVersion {
    char SEPARATOR = '.';

    /**
     * get API version as {@link String} object.
     *
     * @return {@link String} object with API version in $VersionMajor.$VersionMinor.$BuildVersion format.
     */
    default @NotNull String getVersion() {
        return String.valueOf(getVersionMajor()) + SEPARATOR
                + getVersionMinor() + SEPARATOR + getBuildVersion();
    }

    /**
     * get API build version number.
     *
     * @return API build version number.
     */
    @NotNull Integer getBuildVersion();

    /**
     * get API minor version number.
     *
     * @return API minor version number.
     */
    @NotNull Integer getVersionMinor();

    /**
     * get API major version number.
     *
     * @return API major version number.
     */
    @NotNull Integer getVersionMajor();

    /**
     * compare this API version with another one and check if this version is younger than another.
     *
     * @param other - {@link ApiVersion} to compare with.
     * @return true if this API version is younger than given one, false otherwise.
     */
    default @NotNull Boolean isYoungerThan(@NotNull ApiVersion other) {
        if (getVersionMajor() > other.getVersionMajor()) {
            return true;
        } else if (getVersionMajor().equals(other.getVersionMajor())) {
            if (getVersionMinor() > other.getVersionMinor()) {
                return true;
            } else if (getVersionMinor().equals(other.getVersionMinor())) {
                return getBuildVersion() > other.getBuildVersion();
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * check if this API version is equal to given one.
     *
     * @param other - {@link ApiVersion} to compare with.
     * @return true if major, minor and build versions of both APIs are equal, false otherwise.
     */
    default @NotNull Boolean areEqual(@NotNull ApiVersion other) {
        return (getVersionMajor().equals(other.getVersionMajor()))
                && (getVersionMinor().equals(other.getVersionMinor()))
                && (getBuildVersion().equals(other.getBuildVersion()));
    }

    /**
     * check if this API version is older than given one.
     *
     * @param other - {@link ApiVersion} to compare with.
     * @return true if this API version is not equal and not younger than given one, false otherwise.
     */
    default @NotNull Boolean isOlderThan(@NotNull ApiVersion other) {
        return !areEqual(other) && !isYoungerThan(other);
    }
}
