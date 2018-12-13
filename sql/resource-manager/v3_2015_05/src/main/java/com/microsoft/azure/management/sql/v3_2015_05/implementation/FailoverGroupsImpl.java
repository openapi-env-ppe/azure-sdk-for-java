/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v3_2015_05.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v3_2015_05.FailoverGroups;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v3_2015_05.FailoverGroup;

class FailoverGroupsImpl extends WrapperImpl<FailoverGroupsInner> implements FailoverGroups {
    private final SqlManager manager;

    FailoverGroupsImpl(SqlManager manager) {
        super(manager.inner().failoverGroups());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public FailoverGroupImpl define(String name) {
        return wrapModel(name);
    }

    private FailoverGroupImpl wrapModel(FailoverGroupInner inner) {
        return  new FailoverGroupImpl(inner, manager());
    }

    private FailoverGroupImpl wrapModel(String name) {
        return new FailoverGroupImpl(name, this.manager());
    }

    @Override
    public Observable<FailoverGroup> failoverAsync(String resourceGroupName, String serverName, String failoverGroupName) {
        FailoverGroupsInner client = this.inner();
        return client.failoverAsync(resourceGroupName, serverName, failoverGroupName)
        .map(new Func1<FailoverGroupInner, FailoverGroup>() {
            @Override
            public FailoverGroup call(FailoverGroupInner inner) {
                return new FailoverGroupImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<FailoverGroup> forceFailoverAllowDataLossAsync(String resourceGroupName, String serverName, String failoverGroupName) {
        FailoverGroupsInner client = this.inner();
        return client.forceFailoverAllowDataLossAsync(resourceGroupName, serverName, failoverGroupName)
        .map(new Func1<FailoverGroupInner, FailoverGroup>() {
            @Override
            public FailoverGroup call(FailoverGroupInner inner) {
                return new FailoverGroupImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<FailoverGroup> listByServerAsync(final String resourceGroupName, final String serverName) {
        FailoverGroupsInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMapIterable(new Func1<Page<FailoverGroupInner>, Iterable<FailoverGroupInner>>() {
            @Override
            public Iterable<FailoverGroupInner> call(Page<FailoverGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FailoverGroupInner, FailoverGroup>() {
            @Override
            public FailoverGroup call(FailoverGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<FailoverGroup> getAsync(String resourceGroupName, String serverName, String failoverGroupName) {
        FailoverGroupsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, failoverGroupName)
        .map(new Func1<FailoverGroupInner, FailoverGroup>() {
            @Override
            public FailoverGroup call(FailoverGroupInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String failoverGroupName) {
        FailoverGroupsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, failoverGroupName).toCompletable();
    }

}
