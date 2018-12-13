/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2014_04;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ServerConnectionType.
 */
public enum ServerConnectionType {
    /** Enum value Default. */
    DEFAULT("Default"),

    /** Enum value Proxy. */
    PROXY("Proxy"),

    /** Enum value Redirect. */
    REDIRECT("Redirect");

    /** The actual serialized value for a ServerConnectionType instance. */
    private String value;

    ServerConnectionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ServerConnectionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ServerConnectionType object, or null if unable to parse.
     */
    @JsonCreator
    public static ServerConnectionType fromString(String value) {
        ServerConnectionType[] items = ServerConnectionType.values();
        for (ServerConnectionType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
