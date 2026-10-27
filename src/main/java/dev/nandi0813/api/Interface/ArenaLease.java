package dev.nandi0813.api.Interface;

import org.bukkit.World;
import org.bukkit.util.BoundingBox;

/**
 * An arena leased from ZonePractice Pro by an addon. Main thread only.
 * @since 2.11.0
 */
public interface ArenaLease {

    /**
     * Get the name of the leased arena or arena copy.
     * @return The leased arena name, never null
     */
    String getArenaName();

    /**
     * Get the name of the arena the lease was asked for. For a copy this is the original arena.
     * @return The original arena name, never null
     */
    String getOriginalArenaName();

    /**
     * @return The world of the leased arena
     */
    World getWorld();

    /**
     * Get the box covering every block of the arena region. The upper corner is exclusive.
     * @return The arena bounds, never null
     */
    BoundingBox getBounds();

    /**
     * @return true if the arena is a build arena or an arena copy, which no match can share
     */
    boolean isBuild();

    /**
     * @return true until {@link #release()} is called or the owner plugin disables
     */
    boolean isActive();

    /**
     * Releases the arena. Main thread only. Safe to call more than once.
     */
    void release();

}
