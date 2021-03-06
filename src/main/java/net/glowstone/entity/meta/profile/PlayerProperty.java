package net.glowstone.entity.meta.profile;

import lombok.Getter;

/**
 * Container for global player properties (such as textures) returned by the auth servers.
 */
public class PlayerProperty {

    /**
     * The name of the property.
     */
    @Getter
    private final String name;

    /**
     * The property's value.
     */
    @Getter
    private final String value;

    /**
     * If this property is signed.
     */
    @Getter
    private final boolean isSigned;

    /**
     * The signature of the value for validation.
     */
    @Getter
    private String signature;

    public PlayerProperty(String name, String value) {
        this.name = name;
        this.value = value;
        isSigned = false;
    }

    public PlayerProperty(String name, String value, String signature) {
        this.name = name;
        this.value = value;
        this.signature = signature;
        isSigned = true;
    }
}
