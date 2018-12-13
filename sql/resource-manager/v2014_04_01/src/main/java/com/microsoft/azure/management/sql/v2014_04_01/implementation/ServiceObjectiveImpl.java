/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.ServiceObjective;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class ServiceObjectiveImpl extends IndexableRefreshableWrapperImpl<ServiceObjective, ServiceObjectiveInner> implements ServiceObjective {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String serviceObjectiveName;

    ServiceObjectiveImpl(ServiceObjectiveInner inner,  SqlManager manager) {
        super(null, inner);
        this.manager = manager;
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.serviceObjectiveName = IdParsingUtils.getValueFromIdByName(inner.id(), "serviceObjectives");
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ServiceObjectiveInner> getInnerAsync() {
        ServiceObjectivesInner client = this.manager().inner().serviceObjectives();
        return client.getAsync(this.resourceGroupName, this.serverName, this.serviceObjectiveName);
    }



    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public boolean enabled() {
        return this.inner().enabled();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public boolean isDefault() {
        return this.inner().isDefault();
    }

    @Override
    public boolean isSystem() {
        return this.inner().isSystem();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String serviceObjectiveName() {
        return this.inner().serviceObjectiveName();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
