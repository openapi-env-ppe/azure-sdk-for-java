/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2016_05_15.ServiceRunners;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlab.v2016_05_15.ServiceRunner;

class ServiceRunnersImpl extends WrapperImpl<ServiceRunnersInner> implements ServiceRunners {
    private final DevTestLabManager manager;

    ServiceRunnersImpl(DevTestLabManager manager) {
        super(manager.inner().serviceRunners());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public ServiceRunnerImpl define(String name) {
        return wrapModel(name);
    }

    private ServiceRunnerImpl wrapModel(ServiceRunnerInner inner) {
        return  new ServiceRunnerImpl(inner, manager());
    }

    private ServiceRunnerImpl wrapModel(String name) {
        return new ServiceRunnerImpl(name, this.manager());
    }

    @Override
    public Observable<ServiceRunner> listAsync(final String resourceGroupName, final String labName) {
        ServiceRunnersInner client = this.inner();
        return client.listAsync(resourceGroupName, labName)
        .flatMapIterable(new Func1<Page<ServiceRunnerInner>, Iterable<ServiceRunnerInner>>() {
            @Override
            public Iterable<ServiceRunnerInner> call(Page<ServiceRunnerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServiceRunnerInner, ServiceRunner>() {
            @Override
            public ServiceRunner call(ServiceRunnerInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ServiceRunner> getAsync(String resourceGroupName, String labName, String name) {
        ServiceRunnersInner client = this.inner();
        return client.getAsync(resourceGroupName, labName, name)
        .map(new Func1<ServiceRunnerInner, ServiceRunner>() {
            @Override
            public ServiceRunner call(ServiceRunnerInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String labName, String name) {
        ServiceRunnersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, labName, name).toCompletable();
    }

}
