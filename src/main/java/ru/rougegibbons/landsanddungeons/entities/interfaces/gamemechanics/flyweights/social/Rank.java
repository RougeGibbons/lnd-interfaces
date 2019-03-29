package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.social;

import org.jetbrains.annotations.NotNull;

/**
 * enumeration representing weights of various guild ranks.
 * There 4 kinds of member ranks - commoner (lowest),
 * minor and major officers, guild leader (highest).
 *
 * @since 1.1.3
 */
public enum Rank {
    GR_NONE(-1),
    GR_COMMONER(0),
    GR_MINOR_OFFICER(1),
    GR_MAJOR_OFFICER(2),
    GR_LEADER(3);

    private final Integer weight;

    /**
     * enum object default constructor.
     *
     * @param weight - rank's social weight.
     */
    Rank(@NotNull Integer weight) {
        this.weight = weight;
    }

    /**
     * get rank's social weight.
     *
     * @return rank's social weight.
     */
    @NotNull Integer getWeight() {
        return weight;
    }
}