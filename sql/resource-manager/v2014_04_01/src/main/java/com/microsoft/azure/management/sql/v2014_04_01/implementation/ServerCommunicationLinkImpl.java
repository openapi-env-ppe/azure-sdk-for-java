/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.ServerCommunicationLink;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class ServerCommunicationLinkImpl extends CreatableUpdatableImpl<ServerCommunicationLink, ServerCommunicationLinkInner, ServerCommunicationLinkImpl> implements ServerCommunicationLink, ServerCommunicationLink.Definition, ServerCommunicationLink.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String communicationLinkName;
    private String cpartnerServer;
    private String upartnerServer;

    ServerCommunicationLinkImpl(String name, SqlManager manager) {
        super(name, new ServerCommunicationLinkInner());
        this.manager = manager;
        // Set resource name
        this.communicationLinkName = name;
        //
    }

    ServerCommunicationLinkImpl(ServerCommunicationLinkInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.communicationLinkName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.communicationLinkName = IdParsingUtils.getValueFromIdByName(inner.id(), "communicationLinks");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServerCommunicationLink> createResourceAsync() {
        ServerCommunicationLinksInner client = this.manager().inner().serverCommunicationLinks();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.communicationLinkName, this.cpartnerServer)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServerCommunicationLink> updateResourceAsync() {
        ServerCommunicationLinksInner client = this.manager().inner().serverCommunicationLinks();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.communicationLinkName, this.upartnerServer)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServerCommunicationLinkInner> getInnerAsync() {
        ServerCommunicationLinksInner client = this.manager().inner().serverCommunicationLinks();
        return client.getAsync(this.resourceGroupName, this.serverName, this.communicationLinkName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String partnerServer() {
        return this.inner().partnerServer();
    }

    @Override
    public String state() {
        return this.inner().state();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ServerCommunicationLinkImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public ServerCommunicationLinkImpl withPartnerServer(String partnerServer) {
        if (isInCreateMode()) {
            this.cpartnerServer = partnerServer;
        } else {
            this.upartnerServer = partnerServer;
        }
        return this;
    }

}
