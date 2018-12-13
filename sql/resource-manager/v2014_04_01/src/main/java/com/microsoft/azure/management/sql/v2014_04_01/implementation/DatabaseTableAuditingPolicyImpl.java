/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.DatabaseTableAuditingPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.UUID;

class DatabaseTableAuditingPolicyImpl extends CreatableUpdatableImpl<DatabaseTableAuditingPolicy, DatabaseTableAuditingPolicyInner, DatabaseTableAuditingPolicyImpl> implements DatabaseTableAuditingPolicy, DatabaseTableAuditingPolicy.Definition, DatabaseTableAuditingPolicy.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;

    DatabaseTableAuditingPolicyImpl(String name, SqlManager manager) {
        super(name, new DatabaseTableAuditingPolicyInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
    }

    DatabaseTableAuditingPolicyImpl(DatabaseTableAuditingPolicyInner inner, SqlManager manager) {
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
    public Observable<DatabaseTableAuditingPolicy> createResourceAsync() {
        DatabaseTableAuditingPoliciesInner client = this.manager().inner().databaseTableAuditingPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DatabaseTableAuditingPolicy> updateResourceAsync() {
        DatabaseTableAuditingPoliciesInner client = this.manager().inner().databaseTableAuditingPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DatabaseTableAuditingPolicyInner> getInnerAsync() {
        DatabaseTableAuditingPoliciesInner client = this.manager().inner().databaseTableAuditingPolicies();
        return client.getAsync(this.resourceGroupName, this.serverName, this.databaseName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String auditingState() {
        return this.inner().auditingState();
    }

    @Override
    public String auditLogsTableName() {
        return this.inner().auditLogsTableName();
    }

    @Override
    public String eventTypesToAudit() {
        return this.inner().eventTypesToAudit();
    }

    @Override
    public String fullAuditLogsTableName() {
        return this.inner().fullAuditLogsTableName();
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
    public String retentionDays() {
        return this.inner().retentionDays();
    }

    @Override
    public String storageAccountKey() {
        return this.inner().storageAccountKey();
    }

    @Override
    public String storageAccountName() {
        return this.inner().storageAccountName();
    }

    @Override
    public String storageAccountResourceGroupName() {
        return this.inner().storageAccountResourceGroupName();
    }

    @Override
    public String storageAccountSecondaryKey() {
        return this.inner().storageAccountSecondaryKey();
    }

    @Override
    public UUID storageAccountSubscriptionId() {
        return this.inner().storageAccountSubscriptionId();
    }

    @Override
    public String storageTableEndpoint() {
        return this.inner().storageTableEndpoint();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String useServerDefault() {
        return this.inner().useServerDefault();
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withExistingDatabasis(String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withAuditingState(String auditingState) {
        this.inner().withAuditingState(auditingState);
        return this;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withAuditLogsTableName(String auditLogsTableName) {
        this.inner().withAuditLogsTableName(auditLogsTableName);
        return this;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withEventTypesToAudit(String eventTypesToAudit) {
        this.inner().withEventTypesToAudit(eventTypesToAudit);
        return this;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withFullAuditLogsTableName(String fullAuditLogsTableName) {
        this.inner().withFullAuditLogsTableName(fullAuditLogsTableName);
        return this;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withRetentionDays(String retentionDays) {
        this.inner().withRetentionDays(retentionDays);
        return this;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withStorageAccountKey(String storageAccountKey) {
        this.inner().withStorageAccountKey(storageAccountKey);
        return this;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withStorageAccountName(String storageAccountName) {
        this.inner().withStorageAccountName(storageAccountName);
        return this;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withStorageAccountResourceGroupName(String storageAccountResourceGroupName) {
        this.inner().withStorageAccountResourceGroupName(storageAccountResourceGroupName);
        return this;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withStorageAccountSecondaryKey(String storageAccountSecondaryKey) {
        this.inner().withStorageAccountSecondaryKey(storageAccountSecondaryKey);
        return this;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.inner().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
        return this;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withStorageTableEndpoint(String storageTableEndpoint) {
        this.inner().withStorageTableEndpoint(storageTableEndpoint);
        return this;
    }

    @Override
    public DatabaseTableAuditingPolicyImpl withUseServerDefault(String useServerDefault) {
        this.inner().withUseServerDefault(useServerDefault);
        return this;
    }

}
