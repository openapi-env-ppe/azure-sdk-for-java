/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.management.sql.v2015_05_01_preview.ServerKey;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2015_05_01_preview.ServerKeyType;
import org.joda.time.DateTime;

class ServerKeyImpl extends CreatableUpdatableImpl<ServerKey, ServerKeyInner, ServerKeyImpl> implements ServerKey, ServerKey.Definition, ServerKey.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String keyName;

    ServerKeyImpl(String name, SqlManager manager) {
        super(name, new ServerKeyInner());
        this.manager = manager;
        // Set resource name
        this.keyName = name;
        //
    }

    ServerKeyImpl(ServerKeyInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.keyName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.keyName = IdParsingUtils.getValueFromIdByName(inner.id(), "keys");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServerKey> createResourceAsync() {
        ServerKeysInner client = this.manager().inner().serverKeys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.keyName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServerKey> updateResourceAsync() {
        ServerKeysInner client = this.manager().inner().serverKeys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.keyName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServerKeyInner> getInnerAsync() {
        ServerKeysInner client = this.manager().inner().serverKeys();
        return client.getAsync(this.resourceGroupName, this.serverName, this.keyName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
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
    public ServerKeyType serverKeyType() {
        return this.inner().serverKeyType();
    }

    @Override
    public String subregion() {
        return this.inner().subregion();
    }

    @Override
    public String thumbprint() {
        return this.inner().thumbprint();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String uri() {
        return this.inner().uri();
    }

    @Override
    public ServerKeyImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public ServerKeyImpl withServerKeyType(ServerKeyType serverKeyType) {
        this.inner().withServerKeyType(serverKeyType);
        return this;
    }

    @Override
    public ServerKeyImpl withCreationDate(DateTime creationDate) {
        this.inner().withCreationDate(creationDate);
        return this;
    }

    @Override
    public ServerKeyImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public ServerKeyImpl withThumbprint(String thumbprint) {
        this.inner().withThumbprint(thumbprint);
        return this;
    }

    @Override
    public ServerKeyImpl withUri(String uri) {
        this.inner().withUri(uri);
        return this;
    }

}
