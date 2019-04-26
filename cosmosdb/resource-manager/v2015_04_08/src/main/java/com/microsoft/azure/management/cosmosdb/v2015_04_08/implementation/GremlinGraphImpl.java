/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.management.cosmosdb.v2015_04_08.GremlinGraph;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.GremlinGraphCreateUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.ConflictResolutionPolicy;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.IndexingPolicy;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.ContainerPartitionKey;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.UniqueKeyPolicy;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.GremlinGraphResource;
import rx.functions.Func1;

class GremlinGraphImpl extends CreatableUpdatableImpl<GremlinGraph, GremlinGraphInner, GremlinGraphImpl> implements GremlinGraph, GremlinGraph.Definition, GremlinGraph.Update {
    private final DocumentDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String databaseName;
    private String graphName;
    private GremlinGraphCreateUpdateParameters createOrUpdateParameter;

    GremlinGraphImpl(String name, DocumentDBManager manager) {
        super(name, new GremlinGraphInner());
        this.manager = manager;
        // Set resource name
        this.graphName = name;
        //
        this.createOrUpdateParameter = new GremlinGraphCreateUpdateParameters();
    }

    GremlinGraphImpl(GremlinGraphInner inner, DocumentDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.graphName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        this.graphName = IdParsingUtils.getValueFromIdByName(inner.id(), "graphs");
        //
        this.createOrUpdateParameter = new GremlinGraphCreateUpdateParameters();
    }

    @Override
    public DocumentDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<GremlinGraph> createResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.createUpdateGremlinGraphAsync(this.resourceGroupName, this.accountName, this.databaseName, this.graphName, this.createOrUpdateParameter)
            .map(new Func1<GremlinGraphInner, GremlinGraphInner>() {
               @Override
               public GremlinGraphInner call(GremlinGraphInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<GremlinGraph> updateResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.createUpdateGremlinGraphAsync(this.resourceGroupName, this.accountName, this.databaseName, this.graphName, this.createOrUpdateParameter)
            .map(new Func1<GremlinGraphInner, GremlinGraphInner>() {
               @Override
               public GremlinGraphInner call(GremlinGraphInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<GremlinGraphInner> getInnerAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.getGremlinGraphAsync(this.resourceGroupName, this.accountName, this.databaseName, this.graphName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new GremlinGraphCreateUpdateParameters();
    }

    @Override
    public String _etag() {
        return this.inner()._etag();
    }

    @Override
    public String _rid() {
        return this.inner()._rid();
    }

    @Override
    public Object _ts() {
        return this.inner()._ts();
    }

    @Override
    public ConflictResolutionPolicy conflictResolutionPolicy() {
        return this.inner().conflictResolutionPolicy();
    }

    @Override
    public Integer defaultTtl() {
        return this.inner().defaultTtl();
    }

    @Override
    public String gremlinGraphId() {
        return this.inner().gremlinGraphId();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public IndexingPolicy indexingPolicy() {
        return this.inner().indexingPolicy();
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
    public ContainerPartitionKey partitionKey() {
        return this.inner().partitionKey();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public UniqueKeyPolicy uniqueKeyPolicy() {
        return this.inner().uniqueKeyPolicy();
    }

    @Override
    public GremlinGraphImpl withExistingDatabasis(String resourceGroupName, String accountName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public GremlinGraphImpl withOptions(Map<String, String> options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public GremlinGraphImpl withResource(GremlinGraphResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

}
