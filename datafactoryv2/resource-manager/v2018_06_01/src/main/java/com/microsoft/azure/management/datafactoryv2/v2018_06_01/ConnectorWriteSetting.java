/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Connector write settings.
 */
public class ConnectorWriteSetting {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The write setting type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * The maximum concurrent connection count for the source data store. Type:
     * integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "maxConcurrentConnections")
    private Object maxConcurrentConnections;

    /**
     * The type of copy behavior for copy sink.
     */
    @JsonProperty(value = "copyBehavior")
    private Object copyBehavior;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the ConnectorWriteSetting object itself.
     */
    public ConnectorWriteSetting withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the write setting type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the write setting type.
     *
     * @param type the type value to set
     * @return the ConnectorWriteSetting object itself.
     */
    public ConnectorWriteSetting withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     *
     * @return the maxConcurrentConnections value
     */
    public Object maxConcurrentConnections() {
        return this.maxConcurrentConnections;
    }

    /**
     * Set the maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     *
     * @param maxConcurrentConnections the maxConcurrentConnections value to set
     * @return the ConnectorWriteSetting object itself.
     */
    public ConnectorWriteSetting withMaxConcurrentConnections(Object maxConcurrentConnections) {
        this.maxConcurrentConnections = maxConcurrentConnections;
        return this;
    }

    /**
     * Get the type of copy behavior for copy sink.
     *
     * @return the copyBehavior value
     */
    public Object copyBehavior() {
        return this.copyBehavior;
    }

    /**
     * Set the type of copy behavior for copy sink.
     *
     * @param copyBehavior the copyBehavior value to set
     * @return the ConnectorWriteSetting object itself.
     */
    public ConnectorWriteSetting withCopyBehavior(Object copyBehavior) {
        this.copyBehavior = copyBehavior;
        return this;
    }

}