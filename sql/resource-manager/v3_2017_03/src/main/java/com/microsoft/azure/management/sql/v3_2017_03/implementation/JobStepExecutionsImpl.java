/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.sql.v3_2017_03.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v3_2017_03.JobStepExecutions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.sql.v3_2017_03.ExecutionJobJobAgentServerJobExecution;
import com.microsoft.azure.Page;

class JobStepExecutionsImpl extends WrapperImpl<JobStepExecutionsInner> implements JobStepExecutions {
    private final SqlManager manager;

    JobStepExecutionsImpl(SqlManager manager) {
        super(manager.inner().jobStepExecutions());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    private ExecutionJobJobAgentServerJobExecutionImpl wrapExecutionJobJobAgentServerJobExecutionModel(JobExecutionInner inner) {
        return  new ExecutionJobJobAgentServerJobExecutionImpl(inner, manager());
    }

    private Observable<JobExecutionInner> getJobExecutionInnerUsingJobStepExecutionsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String serverName = IdParsingUtils.getValueFromIdByName(id, "servers");
        String jobAgentName = IdParsingUtils.getValueFromIdByName(id, "jobAgents");
        String jobName = IdParsingUtils.getValueFromIdByName(id, "jobs");
        String jobExecutionId = IdParsingUtils.getValueFromIdByName(id, "executions");
        String stepName = IdParsingUtils.getValueFromIdByName(id, "steps");
        JobStepExecutionsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, stepName);
    }

    @Override
    public Observable<ExecutionJobJobAgentServerJobExecution> getAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId, String stepName) {
        JobStepExecutionsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, stepName)
        .map(new Func1<JobExecutionInner, ExecutionJobJobAgentServerJobExecution>() {
            @Override
            public ExecutionJobJobAgentServerJobExecution call(JobExecutionInner inner) {
                return wrapExecutionJobJobAgentServerJobExecutionModel(inner);
            }
       });
    }

    @Override
    public Observable<ExecutionJobJobAgentServerJobExecution> listByJobExecutionAsync(final String resourceGroupName, final String serverName, final String jobAgentName, final String jobName, final UUID jobExecutionId) {
        JobStepExecutionsInner client = this.inner();
        return client.listByJobExecutionAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId)
        .flatMapIterable(new Func1<Page<JobExecutionInner>, Iterable<JobExecutionInner>>() {
            @Override
            public Iterable<JobExecutionInner> call(Page<JobExecutionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobExecutionInner, ExecutionJobJobAgentServerJobExecution>() {
            @Override
            public ExecutionJobJobAgentServerJobExecution call(JobExecutionInner inner) {
                return wrapExecutionJobJobAgentServerJobExecutionModel(inner);
            }
        });
    }

}
