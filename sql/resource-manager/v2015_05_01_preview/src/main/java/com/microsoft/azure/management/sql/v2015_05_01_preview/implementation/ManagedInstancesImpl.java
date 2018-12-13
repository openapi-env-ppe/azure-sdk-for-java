/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.sql.v2015_05_01_preview.ManagedInstances;
import com.microsoft.azure.management.sql.v2015_05_01_preview.ManagedInstance;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class ManagedInstancesImpl extends GroupableResourcesCoreImpl<ManagedInstance, ManagedInstanceImpl, ManagedInstanceInner, ManagedInstancesInner, SqlManager>  implements ManagedInstances {
    protected ManagedInstancesImpl(SqlManager manager) {
        super(manager.inner().managedInstances(), manager);
    }

    @Override
    protected Observable<ManagedInstanceInner> getInnerAsync(String resourceGroupName, String name) {
        ManagedInstancesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ManagedInstancesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<ManagedInstance> listByResourceGroup(String resourceGroupName) {
        ManagedInstancesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ManagedInstance> listByResourceGroupAsync(String resourceGroupName) {
        ManagedInstancesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ManagedInstanceInner>, Iterable<ManagedInstanceInner>>() {
            @Override
            public Iterable<ManagedInstanceInner> call(Page<ManagedInstanceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ManagedInstanceInner, ManagedInstance>() {
            @Override
            public ManagedInstance call(ManagedInstanceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ManagedInstance> list() {
        ManagedInstancesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ManagedInstance> listAsync() {
        ManagedInstancesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ManagedInstanceInner>, Iterable<ManagedInstanceInner>>() {
            @Override
            public Iterable<ManagedInstanceInner> call(Page<ManagedInstanceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ManagedInstanceInner, ManagedInstance>() {
            @Override
            public ManagedInstance call(ManagedInstanceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ManagedInstanceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ManagedInstanceImpl wrapModel(ManagedInstanceInner inner) {
        return  new ManagedInstanceImpl(inner.name(), inner, manager());
    }

    @Override
    protected ManagedInstanceImpl wrapModel(String name) {
        return new ManagedInstanceImpl(name, new ManagedInstanceInner(), this.manager());
    }

}
