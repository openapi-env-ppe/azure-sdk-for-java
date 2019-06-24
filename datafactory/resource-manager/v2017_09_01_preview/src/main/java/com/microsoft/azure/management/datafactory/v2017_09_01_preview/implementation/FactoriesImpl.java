/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.Factories;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.Factory;
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
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.FactoryRepoUpdate;

class FactoriesImpl extends GroupableResourcesCoreImpl<Factory, FactoryImpl, FactoryInner, FactoriesInner, DataFactoryManager>  implements Factories {
    protected FactoriesImpl(DataFactoryManager manager) {
        super(manager.inner().factories(), manager);
    }

    @Override
    protected Observable<FactoryInner> getInnerAsync(String resourceGroupName, String name) {
        FactoriesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        FactoriesInner client = this.inner();
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
    public PagedList<Factory> listByResourceGroup(String resourceGroupName) {
        FactoriesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Factory> listByResourceGroupAsync(String resourceGroupName) {
        FactoriesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<FactoryInner>, Iterable<FactoryInner>>() {
            @Override
            public Iterable<FactoryInner> call(Page<FactoryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FactoryInner, Factory>() {
            @Override
            public Factory call(FactoryInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Factory> list() {
        FactoriesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Factory> listAsync() {
        FactoriesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<FactoryInner>, Iterable<FactoryInner>>() {
            @Override
            public Iterable<FactoryInner> call(Page<FactoryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FactoryInner, Factory>() {
            @Override
            public Factory call(FactoryInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public FactoryImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable cancelPipelineRunAsync(String resourceGroupName, String factoryName, String runId) {
        FactoriesInner client = this.inner();
        return client.cancelPipelineRunAsync(resourceGroupName, factoryName, runId).toCompletable();
    }

    @Override
    protected FactoryImpl wrapModel(FactoryInner inner) {
        return  new FactoryImpl(inner.name(), inner, manager());
    }

    @Override
    protected FactoryImpl wrapModel(String name) {
        return new FactoryImpl(name, new FactoryInner(), this.manager());
    }

    @Override
    public Observable<Factory> configureFactoryRepoAsync(String locationId, FactoryRepoUpdate factoryRepoUpdate) {
        FactoriesInner client = this.inner();
        return client.configureFactoryRepoAsync(locationId, factoryRepoUpdate)
        .map(new Func1<FactoryInner, Factory>() {
            @Override
            public Factory call(FactoryInner inner) {
                return new FactoryImpl(inner.name(), inner, manager());
            }
        });
    }

}