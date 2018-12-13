/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.GeoBackupPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.GeoBackupPolicyState;

class GeoBackupPolicyImpl extends CreatableUpdatableImpl<GeoBackupPolicy, GeoBackupPolicyInner, GeoBackupPolicyImpl> implements GeoBackupPolicy, GeoBackupPolicy.Definition, GeoBackupPolicy.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;
    private GeoBackupPolicyState cstate;
    private GeoBackupPolicyState ustate;

    GeoBackupPolicyImpl(String name, SqlManager manager) {
        super(name, new GeoBackupPolicyInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
    }

    GeoBackupPolicyImpl(GeoBackupPolicyInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<GeoBackupPolicy> createResourceAsync() {
        GeoBackupPoliciesInner client = this.manager().inner().geoBackupPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.cstate)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<GeoBackupPolicy> updateResourceAsync() {
        GeoBackupPoliciesInner client = this.manager().inner().geoBackupPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.ustate)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<GeoBackupPolicyInner> getInnerAsync() {
        GeoBackupPoliciesInner client = this.manager().inner().geoBackupPolicies();
        return client.getAsync(this.resourceGroupName, this.serverName, this.databaseName);
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
    public GeoBackupPolicyState state() {
        return this.inner().state();
    }

    @Override
    public String storageType() {
        return this.inner().storageType();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public GeoBackupPolicyImpl withExistingDatabasis(String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public GeoBackupPolicyImpl withState(GeoBackupPolicyState state) {
        if (isInCreateMode()) {
            this.cstate = state;
        } else {
            this.ustate = state;
        }
        return this;
    }

}
