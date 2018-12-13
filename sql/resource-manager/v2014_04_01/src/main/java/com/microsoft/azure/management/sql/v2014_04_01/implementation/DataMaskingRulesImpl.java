/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.DataMaskingRules;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.DataMaskingRule;

class DataMaskingRulesImpl extends WrapperImpl<DataMaskingRulesInner> implements DataMaskingRules {
    private final SqlManager manager;

    DataMaskingRulesImpl(SqlManager manager) {
        super(manager.inner().dataMaskingRules());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public DataMaskingRuleImpl define(String name) {
        return wrapModel(name);
    }

    private DataMaskingRuleImpl wrapModel(DataMaskingRuleInner inner) {
        return  new DataMaskingRuleImpl(inner, manager());
    }

    private DataMaskingRuleImpl wrapModel(String name) {
        return new DataMaskingRuleImpl(name, this.manager());
    }

    @Override
    public Observable<DataMaskingRule> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        DataMaskingRulesInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<List<DataMaskingRuleInner>, Observable<DataMaskingRuleInner>>() {
            @Override
            public Observable<DataMaskingRuleInner> call(List<DataMaskingRuleInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<DataMaskingRuleInner, DataMaskingRule>() {
            @Override
            public DataMaskingRule call(DataMaskingRuleInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
