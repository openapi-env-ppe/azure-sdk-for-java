/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2014_04.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Server communication link.
 */
@JsonFlatten
public class ServerCommunicationLinkInner extends ProxyResource {
    /**
     * The state.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /**
     * The name of the partner server.
     */
    @JsonProperty(value = "properties.partnerServer", required = true)
    private String partnerServer;

    /**
     * Communication link location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Communication link kind.  This property is used for Azure Portal
     * metadata.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /**
     * Get the state.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the name of the partner server.
     *
     * @return the partnerServer value
     */
    public String partnerServer() {
        return this.partnerServer;
    }

    /**
     * Set the name of the partner server.
     *
     * @param partnerServer the partnerServer value to set
     * @return the ServerCommunicationLinkInner object itself.
     */
    public ServerCommunicationLinkInner withPartnerServer(String partnerServer) {
        this.partnerServer = partnerServer;
        return this;
    }

    /**
     * Get communication link location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get communication link kind.  This property is used for Azure Portal metadata.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

}
