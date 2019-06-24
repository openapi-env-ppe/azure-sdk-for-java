/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for SAP HANA source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapHanaSource")
public class SapHanaSource extends CopySource {
    /**
     * SAP HANA Sql query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * The packet size of data read from SAP HANA. Type: integer(or Expression
     * with resultType integer).
     */
    @JsonProperty(value = "packetSize")
    private Object packetSize;

    /**
     * Get sAP HANA Sql query. Type: string (or Expression with resultType string).
     *
     * @return the query value
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set sAP HANA Sql query. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set
     * @return the SapHanaSource object itself.
     */
    public SapHanaSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the packet size of data read from SAP HANA. Type: integer(or Expression with resultType integer).
     *
     * @return the packetSize value
     */
    public Object packetSize() {
        return this.packetSize;
    }

    /**
     * Set the packet size of data read from SAP HANA. Type: integer(or Expression with resultType integer).
     *
     * @param packetSize the packetSize value to set
     * @return the SapHanaSource object itself.
     */
    public SapHanaSource withPacketSize(Object packetSize) {
        this.packetSize = packetSize;
        return this;
    }

}