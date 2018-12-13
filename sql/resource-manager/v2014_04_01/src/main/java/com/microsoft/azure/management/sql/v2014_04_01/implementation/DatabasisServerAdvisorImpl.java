/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.DatabasisServerAdvisor;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.AutoExecuteStatus;
import com.microsoft.azure.management.sql.v2014_04_01.AdvisorStatus;
import org.joda.time.DateTime;

class DatabasisServerAdvisorImpl extends CreatableUpdatableImpl<DatabasisServerAdvisor, AdvisorInner, DatabasisServerAdvisorImpl> implements DatabasisServerAdvisor, DatabasisServerAdvisor.Definition, DatabasisServerAdvisor.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;
    private String advisorName;
    private AutoExecuteStatus cautoExecuteValue;
    private AutoExecuteStatus uautoExecuteValue;

    DatabasisServerAdvisorImpl(String name, SqlManager manager) {
        super(name, new AdvisorInner());
        this.manager = manager;
        // Set resource name
        this.advisorName = name;
        //
    }

    DatabasisServerAdvisorImpl(AdvisorInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.advisorName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        this.advisorName = IdParsingUtils.getValueFromIdByName(inner.id(), "advisors");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DatabasisServerAdvisor> createResourceAsync() {
        DatabaseAdvisorsInner client = this.manager().inner().databaseAdvisors();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.advisorName, this.cautoExecuteValue)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DatabasisServerAdvisor> updateResourceAsync() {
        DatabaseAdvisorsInner client = this.manager().inner().databaseAdvisors();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.advisorName, this.uautoExecuteValue)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AdvisorInner> getInnerAsync() {
        DatabaseAdvisorsInner client = this.manager().inner().databaseAdvisors();
        return client.getAsync(this.resourceGroupName, this.serverName, this.databaseName, this.advisorName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public AdvisorStatus advisorStatus() {
        return this.inner().advisorStatus();
    }

    @Override
    public AutoExecuteStatus autoExecuteValue() {
        return this.inner().autoExecuteValue();
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
    public DateTime lastChecked() {
        return this.inner().lastChecked();
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
    public String recommendationsStatus() {
        return this.inner().recommendationsStatus();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DatabasisServerAdvisorImpl withExistingDatabasis(String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public DatabasisServerAdvisorImpl withAutoExecuteValue(AutoExecuteStatus autoExecuteValue) {
        if (isInCreateMode()) {
            this.cautoExecuteValue = autoExecuteValue;
        } else {
            this.uautoExecuteValue = autoExecuteValue;
        }
        return this;
    }

}
