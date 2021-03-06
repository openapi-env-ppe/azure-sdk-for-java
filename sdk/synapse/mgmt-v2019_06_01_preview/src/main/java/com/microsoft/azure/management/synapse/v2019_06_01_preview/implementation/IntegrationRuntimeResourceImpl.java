/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.UpdateIntegrationRuntimeRequest;
import java.util.Map;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeAutoUpdate;
import rx.functions.Func1;

class IntegrationRuntimeResourceImpl extends CreatableUpdatableImpl<IntegrationRuntimeResource, IntegrationRuntimeResourceInner, IntegrationRuntimeResourceImpl> implements IntegrationRuntimeResource, IntegrationRuntimeResource.Definition, IntegrationRuntimeResource.Update {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String integrationRuntimeName;
    private String cifMatch;
    private IntegrationRuntimeInner cproperties;
    private UpdateIntegrationRuntimeRequest updateParameter;

    IntegrationRuntimeResourceImpl(String name, SynapseManager manager) {
        super(name, new IntegrationRuntimeResourceInner());
        this.manager = manager;
        // Set resource name
        this.integrationRuntimeName = name;
        //
        this.cproperties = new IntegrationRuntimeInner();
        this.updateParameter = new UpdateIntegrationRuntimeRequest();
    }

    IntegrationRuntimeResourceImpl(IntegrationRuntimeResourceInner inner, SynapseManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.integrationRuntimeName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.integrationRuntimeName = IdParsingUtils.getValueFromIdByName(inner.id(), "integrationRuntimes");
        //
        this.cproperties = new IntegrationRuntimeInner();
        this.updateParameter = new UpdateIntegrationRuntimeRequest();
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<IntegrationRuntimeResource> createResourceAsync() {
        IntegrationRuntimesInner client = this.manager().inner().integrationRuntimes();
        return client.createAsync(this.resourceGroupName, this.workspaceName, this.integrationRuntimeName, this.cproperties, this.cifMatch)
            .map(new Func1<IntegrationRuntimeResourceInner, IntegrationRuntimeResourceInner>() {
               @Override
               public IntegrationRuntimeResourceInner call(IntegrationRuntimeResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<IntegrationRuntimeResource> updateResourceAsync() {
        IntegrationRuntimesInner client = this.manager().inner().integrationRuntimes();
        return client.updateAsync(this.resourceGroupName, this.workspaceName, this.integrationRuntimeName, this.updateParameter)
            .map(new Func1<IntegrationRuntimeResourceInner, IntegrationRuntimeResourceInner>() {
               @Override
               public IntegrationRuntimeResourceInner call(IntegrationRuntimeResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<IntegrationRuntimeResourceInner> getInnerAsync() {
        IntegrationRuntimesInner client = this.manager().inner().integrationRuntimes();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.integrationRuntimeName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new IntegrationRuntimeInner();
        this.updateParameter = new UpdateIntegrationRuntimeRequest();
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
    public IntegrationRuntimeInner properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public IntegrationRuntimeResourceImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    @Override
    public IntegrationRuntimeResourceImpl withIfMatch(String ifMatch) {
        this.cifMatch = ifMatch;
        return this;
    }

    @Override
    public IntegrationRuntimeResourceImpl withProperties(IntegrationRuntimeInner properties) {
        this.cproperties = properties;
        return this;
    }

    @Override
    public IntegrationRuntimeResourceImpl withAutoUpdate(IntegrationRuntimeAutoUpdate autoUpdate) {
        this.updateParameter.withAutoUpdate(autoUpdate);
        return this;
    }

    @Override
    public IntegrationRuntimeResourceImpl withUpdateDelayOffset(String updateDelayOffset) {
        this.updateParameter.withUpdateDelayOffset(updateDelayOffset);
        return this;
    }

}
