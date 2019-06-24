/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.microsoft.azure.management.datafactory.v2018_06_01.FactoryTriggerResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.datafactory.v2018_06_01.TriggerRuntimeState;
import java.util.List;
import com.microsoft.azure.management.datafactory.v2018_06_01.;
import rx.functions.Func1;

class FactoryTriggerResourceImpl extends CreatableUpdatableImpl<FactoryTriggerResource, TriggerResourceInner, FactoryTriggerResourceImpl> implements FactoryTriggerResource, FactoryTriggerResource.Definition, FactoryTriggerResource.Update {
    private final DataFactoryManager manager;
    private String resourceGroupName;
    private String factoryName;
    private String triggerName;
    private String cifMatch;
    private TriggerInner cproperties;
    private String uifMatch;
    private TriggerInner uproperties;

    FactoryTriggerResourceImpl(String name, DataFactoryManager manager) {
        super(name, new TriggerResourceInner());
        this.manager = manager;
        // Set resource name
        this.triggerName = name;
        //
        this.cproperties = new TriggerInner();
        this.uproperties = new TriggerInner();
    }

    FactoryTriggerResourceImpl(TriggerResourceInner inner, DataFactoryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.triggerName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.factoryName = IdParsingUtils.getValueFromIdByName(inner.id(), "factories");
        this.triggerName = IdParsingUtils.getValueFromIdByName(inner.id(), "triggers");
        //
        this.cproperties = new TriggerInner();
        this.uproperties = new TriggerInner();
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<FactoryTriggerResource> createResourceAsync() {
        TriggersInner client = this.manager().inner().triggers();
        return client.createOrUpdateAsync(this.resourceGroupName, this.factoryName, this.triggerName, this.cproperties, this.cifMatch)
            .map(new Func1<TriggerResourceInner, TriggerResourceInner>() {
               @Override
               public TriggerResourceInner call(TriggerResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<FactoryTriggerResource> updateResourceAsync() {
        TriggersInner client = this.manager().inner().triggers();
        return client.createOrUpdateAsync(this.resourceGroupName, this.factoryName, this.triggerName, this.uproperties, this.uifMatch)
            .map(new Func1<TriggerResourceInner, TriggerResourceInner>() {
               @Override
               public TriggerResourceInner call(TriggerResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TriggerResourceInner> getInnerAsync() {
        TriggersInner client = this.manager().inner().triggers();
        return client.getAsync(this.resourceGroupName, this.factoryName, this.triggerName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new TriggerInner();
        this.uproperties = new TriggerInner();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public TriggerInner properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public FactoryTriggerResourceImpl withExistingFactory(String resourceGroupName, String factoryName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        return this;
    }

    @Override
    public FactoryTriggerResourceImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public FactoryTriggerResourceImpl withProperties(TriggerInner properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}