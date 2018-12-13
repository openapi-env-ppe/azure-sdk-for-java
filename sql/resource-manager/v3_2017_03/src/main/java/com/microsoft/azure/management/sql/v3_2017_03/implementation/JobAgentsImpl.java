/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v3_2017_03.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v3_2017_03.JobAgents;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v3_2017_03.JobAgent;

class JobAgentsImpl extends WrapperImpl<JobAgentsInner> implements JobAgents {
    private final SqlManager manager;

    JobAgentsImpl(SqlManager manager) {
        super(manager.inner().jobAgents());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public JobAgentImpl define(String name) {
        return wrapModel(name);
    }

    private JobAgentImpl wrapModel(JobAgentInner inner) {
        return  new JobAgentImpl(inner, manager());
    }

    private JobAgentImpl wrapModel(String name) {
        return new JobAgentImpl(name, this.manager());
    }

    @Override
    public Observable<JobAgent> listByServerAsync(final String resourceGroupName, final String serverName) {
        JobAgentsInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMapIterable(new Func1<Page<JobAgentInner>, Iterable<JobAgentInner>>() {
            @Override
            public Iterable<JobAgentInner> call(Page<JobAgentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobAgentInner, JobAgent>() {
            @Override
            public JobAgent call(JobAgentInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<JobAgent> getAsync(String resourceGroupName, String serverName, String jobAgentName) {
        JobAgentsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, jobAgentName)
        .map(new Func1<JobAgentInner, JobAgent>() {
            @Override
            public JobAgent call(JobAgentInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String jobAgentName) {
        JobAgentsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, jobAgentName).toCompletable();
    }

}
