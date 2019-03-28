package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.instances;

import org.jetbrains.annotations.NotNull;

/**
 * class storing game mode codes and some utilitary functions regarding these modes.
 *
 * @since 1.1.3
 */
public final class GameModes {
    public static final int GM_COOP_PVE = 0;
    public static final int GM_SOLO_PVE = 1;
    public static final int GM_COOP_PVP = 2;
    public static final int GM_SQUAD_PVP = 3;

    /**
     * check if given game mode is a PvE one.
     *
     * @param gameMode - game mode to check.
     * @return true if given game mode is PvE one, false otherwise.
     */
    public static @NotNull Boolean isPve(@NotNull Integer gameMode) {
        return (gameMode == GM_COOP_PVE) || (gameMode == GM_SOLO_PVE);
    }

    /**
     * check if given game mode is a PvP one.
     *
     * @param gameMode - game mode to check.
     * @return true if given game mode is PvP one, false otherwise.
     */
    public static @NotNull Boolean isPvp(@NotNull Integer gameMode) {
        return (gameMode == GM_COOP_PVP) || (gameMode == GM_SQUAD_PVP);
    }

    /**
     * check if given game mode is multiplayer one.
     *
     * @param gameMode - game mode to check.
     * @return true if given game mode is multiplayer one, false otherwise.
     */
    public static @NotNull Boolean isMultiplayer(@NotNull Integer gameMode) {
        return (gameMode == GM_SQUAD_PVP) || (gameMode == GM_COOP_PVP)
                || (gameMode == GM_COOP_PVE);
    }

    private GameModes() {

    }
}
