/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.JobTargetGroup;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobTarget;

class JobTargetGroupImpl extends CreatableUpdatableImpl<JobTargetGroup, JobTargetGroupInner, JobTargetGroupImpl> implements JobTargetGroup, JobTargetGroup.Definition, JobTargetGroup.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String jobAgentName;
    private String targetGroupName;
    private List<JobTarget> cmembers;
    private List<JobTarget> umembers;

    JobTargetGroupImpl(String name, SqlManager manager) {
        super(name, new JobTargetGroupInner());
        this.manager = manager;
        // Set resource name
        this.targetGroupName = name;
        //
    }

    JobTargetGroupImpl(JobTargetGroupInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.targetGroupName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.jobAgentName = IdParsingUtils.getValueFromIdByName(inner.id(), "jobAgents");
        this.targetGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "targetGroups");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<JobTargetGroup> createResourceAsync() {
        JobTargetGroupsInner client = this.manager().inner().jobTargetGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.jobAgentName, this.targetGroupName, this.cmembers)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<JobTargetGroup> updateResourceAsync() {
        JobTargetGroupsInner client = this.manager().inner().jobTargetGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.jobAgentName, this.targetGroupName, this.umembers)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<JobTargetGroupInner> getInnerAsync() {
        JobTargetGroupsInner client = this.manager().inner().jobTargetGroups();
        return client.getAsync(this.resourceGroupName, this.serverName, this.jobAgentName, this.targetGroupName);
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
    public List<JobTarget> members() {
        return this.inner().members();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public JobTargetGroupImpl withExistingJobAgent(String resourceGroupName, String serverName, String jobAgentName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.jobAgentName = jobAgentName;
        return this;
    }

    @Override
    public JobTargetGroupImpl withMembers(List<JobTarget> members) {
        if (isInCreateMode()) {
            this.cmembers = members;
        } else {
            this.umembers = members;
        }
        return this;
    }

}
