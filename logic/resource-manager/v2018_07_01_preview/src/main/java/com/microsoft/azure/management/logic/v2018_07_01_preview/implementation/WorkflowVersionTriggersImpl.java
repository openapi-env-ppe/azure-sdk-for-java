/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowVersionTriggers;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowTriggerCallbackUrl;

class WorkflowVersionTriggersImpl extends WrapperImpl<WorkflowVersionTriggersInner> implements WorkflowVersionTriggers {
    private final LogicManager manager;

    WorkflowVersionTriggersImpl(LogicManager manager) {
        super(manager.inner().workflowVersionTriggers());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listCallbackUrlAsync(String resourceGroupName, String workflowName, String versionId, String triggerName) {
        WorkflowVersionTriggersInner client = this.inner();
        return client.listCallbackUrlAsync(resourceGroupName, workflowName, versionId, triggerName)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

}
