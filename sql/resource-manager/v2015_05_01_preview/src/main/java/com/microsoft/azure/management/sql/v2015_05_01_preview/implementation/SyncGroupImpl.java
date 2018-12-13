/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncGroup;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncConflictResolutionPolicy;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncGroupState;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncGroupSchema;

class SyncGroupImpl extends CreatableUpdatableImpl<SyncGroup, SyncGroupInner, SyncGroupImpl> implements SyncGroup, SyncGroup.Definition, SyncGroup.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;
    private String syncGroupName;

    SyncGroupImpl(String name, SqlManager manager) {
        super(name, new SyncGroupInner());
        this.manager = manager;
        // Set resource name
        this.syncGroupName = name;
        //
    }

    SyncGroupImpl(SyncGroupInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.syncGroupName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        this.syncGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "syncGroups");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SyncGroup> createResourceAsync() {
        SyncGroupsInner client = this.manager().inner().syncGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.syncGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SyncGroup> updateResourceAsync() {
        SyncGroupsInner client = this.manager().inner().syncGroups();
        return client.updateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.syncGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SyncGroupInner> getInnerAsync() {
        SyncGroupsInner client = this.manager().inner().syncGroups();
        return client.getAsync(this.resourceGroupName, this.serverName, this.databaseName, this.syncGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public SyncConflictResolutionPolicy conflictResolutionPolicy() {
        return this.inner().conflictResolutionPolicy();
    }

    @Override
    public String hubDatabasePassword() {
        return this.inner().hubDatabasePassword();
    }

    @Override
    public String hubDatabaseUserName() {
        return this.inner().hubDatabaseUserName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Integer interval() {
        return this.inner().interval();
    }

    @Override
    public DateTime lastSyncTime() {
        return this.inner().lastSyncTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SyncGroupSchema schema() {
        return this.inner().schema();
    }

    @Override
    public String syncDatabaseId() {
        return this.inner().syncDatabaseId();
    }

    @Override
    public SyncGroupState syncState() {
        return this.inner().syncState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SyncGroupImpl withExistingDatabasis(String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public SyncGroupImpl withConflictResolutionPolicy(SyncConflictResolutionPolicy conflictResolutionPolicy) {
        this.inner().withConflictResolutionPolicy(conflictResolutionPolicy);
        return this;
    }

    @Override
    public SyncGroupImpl withHubDatabasePassword(String hubDatabasePassword) {
        this.inner().withHubDatabasePassword(hubDatabasePassword);
        return this;
    }

    @Override
    public SyncGroupImpl withHubDatabaseUserName(String hubDatabaseUserName) {
        this.inner().withHubDatabaseUserName(hubDatabaseUserName);
        return this;
    }

    @Override
    public SyncGroupImpl withInterval(Integer interval) {
        this.inner().withInterval(interval);
        return this;
    }

    @Override
    public SyncGroupImpl withSchema(SyncGroupSchema schema) {
        this.inner().withSchema(schema);
        return this;
    }

    @Override
    public SyncGroupImpl withSyncDatabaseId(String syncDatabaseId) {
        this.inner().withSyncDatabaseId(syncDatabaseId);
        return this;
    }

}
