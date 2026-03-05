package dev.nandi0813.api.Utilities;

import lombok.Getter;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

@Getter
public class PlayerNametag {

    private final Component prefix;
    private final NamedTextColor colorOfName;
    private final Component suffix;

    public PlayerNametag(Component prefix, NamedTextColor colorOfName, Component suffix) {
        this.prefix = prefix;
        this.colorOfName = colorOfName;
        this.suffix = suffix;
    }

}
