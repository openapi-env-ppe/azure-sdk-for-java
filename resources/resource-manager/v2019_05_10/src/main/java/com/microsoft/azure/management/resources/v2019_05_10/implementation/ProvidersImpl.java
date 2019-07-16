/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.resources.v2019_05_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2019_05_10.Providers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.resources.v2019_05_10.Provider;

class ProvidersImpl extends WrapperImpl<ProvidersInner> implements Providers {
    private final ResourcesManager manager;

    ProvidersImpl(ResourcesManager manager) {
        super(manager.inner().providers());
        this.manager = manager;
    }

    public ResourcesManager manager() {
        return this.manager;
    }

    private ProviderImpl wrapModel(ProviderInner inner) {
        return  new ProviderImpl(inner, manager());
    }

    @Override
    public Observable<Provider> unregisterAsync(String resourceProviderNamespace) {
        ProvidersInner client = this.inner();
        return client.unregisterAsync(resourceProviderNamespace)
        .map(new Func1<ProviderInner, Provider>() {
            @Override
            public Provider call(ProviderInner inner) {
                return new ProviderImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Provider> registerAsync(String resourceProviderNamespace) {
        ProvidersInner client = this.inner();
        return client.registerAsync(resourceProviderNamespace)
        .map(new Func1<ProviderInner, Provider>() {
            @Override
            public Provider call(ProviderInner inner) {
                return new ProviderImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Provider> getAtTenantAsync(String resourceProviderNamespace) {
        ProvidersInner client = this.inner();
        return client.getAtTenantAsync(resourceProviderNamespace)
        .map(new Func1<ProviderInner, Provider>() {
            @Override
            public Provider call(ProviderInner inner) {
                return new ProviderImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Provider> listAllAsync() {
        ProvidersInner client = this.inner();
        return client.listAllAsync()
        .flatMapIterable(new Func1<Page<ProviderInner>, Iterable<ProviderInner>>() {
            @Override
            public Iterable<ProviderInner> call(Page<ProviderInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProviderInner, Provider>() {
            @Override
            public Provider call(ProviderInner inner) {
                return new ProviderImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Provider> listAsync() {
        ProvidersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ProviderInner>, Iterable<ProviderInner>>() {
            @Override
            public Iterable<ProviderInner> call(Page<ProviderInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProviderInner, Provider>() {
            @Override
            public Provider call(ProviderInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Provider> getAsync(String resourceProviderNamespace) {
        ProvidersInner client = this.inner();
        return client.getAsync(resourceProviderNamespace)
        .map(new Func1<ProviderInner, Provider>() {
            @Override
            public Provider call(ProviderInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
