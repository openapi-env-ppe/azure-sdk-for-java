/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccounts;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccount;
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
import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccountListKeysResult;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccountListConnectionStringsResult;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccountListReadOnlyKeysResult;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.FailoverPolicy;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.KeyKind;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccountMetric;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccountUsage;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccountMetricDefinition;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.SqlDatabase;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.MongoDBDatabase;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.GremlinDatabase;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.MongoDBDatabaseCreateUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.GremlinDatabaseCreateUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.SqlContainer;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.MongoDBCollection;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.Table;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.CassandraTable;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.CassandraTableCreateUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.CassandraKeyspace;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.GremlinGraph;

class DatabaseAccountsImpl extends GroupableResourcesCoreImpl<DatabaseAccount, DatabaseAccountImpl, DatabaseAccountInner, DatabaseAccountsInner, DocumentDBManager>  implements DatabaseAccounts {
    protected DatabaseAccountsImpl(DocumentDBManager manager) {
        super(manager.inner().databaseAccounts(), manager);
    }

    @Override
    protected Observable<DatabaseAccountInner> getInnerAsync(String resourceGroupName, String name) {
        DatabaseAccountsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        DatabaseAccountsInner client = this.inner();
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
    public PagedList<DatabaseAccount> listByResourceGroup(String resourceGroupName) {
        DatabaseAccountsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<DatabaseAccount> listByResourceGroupAsync(String resourceGroupName) {
        DatabaseAccountsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<DatabaseAccountInner>, Observable<DatabaseAccountInner>>() {
            @Override
            public Observable<DatabaseAccountInner> call(Page<DatabaseAccountInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<DatabaseAccountInner, DatabaseAccount>() {
            @Override
            public DatabaseAccount call(DatabaseAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<DatabaseAccount> list() {
        DatabaseAccountsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<DatabaseAccount> listAsync() {
        DatabaseAccountsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<DatabaseAccountInner>, Observable<DatabaseAccountInner>>() {
            @Override
            public Observable<DatabaseAccountInner> call(Page<DatabaseAccountInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<DatabaseAccountInner, DatabaseAccount>() {
            @Override
            public DatabaseAccount call(DatabaseAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public DatabaseAccountImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable failoverPriorityChangeAsync(String resourceGroupName, String accountName, List<FailoverPolicy> failoverPolicies) {
        DatabaseAccountsInner client = this.inner();
        return client.failoverPriorityChangeAsync(resourceGroupName, accountName, failoverPolicies).toCompletable();
    }

    @Override
    public Observable<DatabaseAccountListKeysResult> listKeysAsync(String resourceGroupName, String accountName) {
        DatabaseAccountsInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, accountName)
        .map(new Func1<DatabaseAccountListKeysResultInner, DatabaseAccountListKeysResult>() {
            @Override
            public DatabaseAccountListKeysResult call(DatabaseAccountListKeysResultInner inner) {
                return new DatabaseAccountListKeysResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DatabaseAccountListConnectionStringsResult> listConnectionStringsAsync(String resourceGroupName, String accountName) {
        DatabaseAccountsInner client = this.inner();
        return client.listConnectionStringsAsync(resourceGroupName, accountName)
        .map(new Func1<DatabaseAccountListConnectionStringsResultInner, DatabaseAccountListConnectionStringsResult>() {
            @Override
            public DatabaseAccountListConnectionStringsResult call(DatabaseAccountListConnectionStringsResultInner inner) {
                return new DatabaseAccountListConnectionStringsResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable offlineRegionAsync(String resourceGroupName, String accountName, String region) {
        DatabaseAccountsInner client = this.inner();
        return client.offlineRegionAsync(resourceGroupName, accountName, region).toCompletable();
    }

    @Override
    public Completable onlineRegionAsync(String resourceGroupName, String accountName, String region) {
        DatabaseAccountsInner client = this.inner();
        return client.onlineRegionAsync(resourceGroupName, accountName, region).toCompletable();
    }

    @Override
    public Observable<DatabaseAccountListReadOnlyKeysResult> listReadOnlyKeysAsync(String resourceGroupName, String accountName) {
        DatabaseAccountsInner client = this.inner();
        return client.listReadOnlyKeysAsync(resourceGroupName, accountName)
        .map(new Func1<DatabaseAccountListReadOnlyKeysResultInner, DatabaseAccountListReadOnlyKeysResult>() {
            @Override
            public DatabaseAccountListReadOnlyKeysResult call(DatabaseAccountListReadOnlyKeysResultInner inner) {
                return new DatabaseAccountListReadOnlyKeysResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable regenerateKeyAsync(String resourceGroupName, String accountName, KeyKind keyKind) {
        DatabaseAccountsInner client = this.inner();
        return client.regenerateKeyAsync(resourceGroupName, accountName, keyKind).toCompletable();
    }

    @Override
    protected DatabaseAccountImpl wrapModel(DatabaseAccountInner inner) {
        return  new DatabaseAccountImpl(inner.name(), inner, manager());
    }

    @Override
    protected DatabaseAccountImpl wrapModel(String name) {
        return new DatabaseAccountImpl(name, new DatabaseAccountInner(), this.manager());
    }

    @Override
    public SqlDatabaseImpl defineDatabasis(String name) {
        return wrapDatabasisModel(name);
    }

    @Override
    public SqlContainerImpl defineContainer(String name) {
        return wrapContainerModel(name);
    }

    @Override
    public MongoDBCollectionImpl defineCollection(String name) {
        return wrapCollectionModel(name);
    }

    @Override
    public TableImpl defineTable(String name) {
        return wrapTableModel(name);
    }

    @Override
    public CassandraKeyspaceImpl defineKeyspace(String name) {
        return wrapKeyspaceModel(name);
    }

    @Override
    public GremlinGraphImpl defineGraph(String name) {
        return wrapGraphModel(name);
    }

    private SqlDatabaseImpl wrapDatabasisModel(String name) {
        return new SqlDatabaseImpl(name, this.manager());
    }

    private SqlContainerImpl wrapContainerModel(String name) {
        return new SqlContainerImpl(name, this.manager());
    }

    private MongoDBCollectionImpl wrapCollectionModel(String name) {
        return new MongoDBCollectionImpl(name, this.manager());
    }

    private TableImpl wrapTableModel(String name) {
        return new TableImpl(name, this.manager());
    }

    private CassandraKeyspaceImpl wrapKeyspaceModel(String name) {
        return new CassandraKeyspaceImpl(name, this.manager());
    }

    private GremlinGraphImpl wrapGraphModel(String name) {
        return new GremlinGraphImpl(name, this.manager());
    }

    private DatabaseAccountMetricImpl wrapDatabaseAccountMetricModel(MetricInner inner) {
        return  new DatabaseAccountMetricImpl(inner, manager());
    }

    private DatabaseAccountUsageImpl wrapDatabaseAccountUsageModel(UsageInner inner) {
        return  new DatabaseAccountUsageImpl(inner, manager());
    }

    private DatabaseAccountMetricDefinitionImpl wrapDatabaseAccountMetricDefinitionModel(MetricDefinitionInner inner) {
        return  new DatabaseAccountMetricDefinitionImpl(inner, manager());
    }

    private SqlDatabaseImpl wrapSqlDatabaseModel(SqlDatabaseInner inner) {
        return  new SqlDatabaseImpl(inner, manager());
    }

    private SqlContainerImpl wrapSqlContainerModel(SqlContainerInner inner) {
        return  new SqlContainerImpl(inner, manager());
    }

    private MongoDBCollectionImpl wrapMongoDBCollectionModel(MongoDBCollectionInner inner) {
        return  new MongoDBCollectionImpl(inner, manager());
    }

    private TableImpl wrapTableModel(TableInner inner) {
        return  new TableImpl(inner, manager());
    }

    private CassandraKeyspaceImpl wrapCassandraKeyspaceModel(CassandraKeyspaceInner inner) {
        return  new CassandraKeyspaceImpl(inner, manager());
    }

    private GremlinGraphImpl wrapGremlinGraphModel(GremlinGraphInner inner) {
        return  new GremlinGraphImpl(inner, manager());
    }

    private Observable<SqlContainerInner> getSqlContainerInnerUsingDatabaseAccountsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "databases");
        String containerName = IdParsingUtils.getValueFromIdByName(id, "containers");
        DatabaseAccountsInner client = this.inner();
        return client.getSqlContainerAsync(resourceGroupName, accountName, databaseName, containerName);
    }

    private Observable<MongoDBCollectionInner> getMongoDBCollectionInnerUsingDatabaseAccountsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "databases");
        String collectionName = IdParsingUtils.getValueFromIdByName(id, "collections");
        DatabaseAccountsInner client = this.inner();
        return client.getMongoDBCollectionAsync(resourceGroupName, accountName, databaseName, collectionName);
    }

    private Observable<GremlinGraphInner> getGremlinGraphInnerUsingDatabaseAccountsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "databases");
        String graphName = IdParsingUtils.getValueFromIdByName(id, "graphs");
        DatabaseAccountsInner client = this.inner();
        return client.getGremlinGraphAsync(resourceGroupName, accountName, databaseName, graphName);
    }

    @Override
    public Observable<DatabaseAccountListReadOnlyKeysResult> getReadOnlyKeysAsync(String resourceGroupName, String accountName) {
        DatabaseAccountsInner client = this.inner();
        return client.getReadOnlyKeysAsync(resourceGroupName, accountName)
        .map(new Func1<DatabaseAccountListReadOnlyKeysResultInner, DatabaseAccountListReadOnlyKeysResult>() {
            @Override
            public DatabaseAccountListReadOnlyKeysResult call(DatabaseAccountListReadOnlyKeysResultInner inner) {
                return new DatabaseAccountListReadOnlyKeysResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Boolean> checkNameExistsAsync(String accountName) {
        DatabaseAccountsInner client = this.inner();
        return client.checkNameExistsAsync(accountName)
    ;}

    @Override
    public Observable<DatabaseAccountMetric> listMetricsAsync(String resourceGroupName, String accountName, String filter) {
        DatabaseAccountsInner client = this.inner();
        return client.listMetricsAsync(resourceGroupName, accountName, filter)
        .flatMap(new Func1<List<MetricInner>, Observable<MetricInner>>() {
            @Override
            public Observable<MetricInner> call(List<MetricInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MetricInner, DatabaseAccountMetric>() {
            @Override
            public DatabaseAccountMetric call(MetricInner inner) {
                return wrapDatabaseAccountMetricModel(inner);
            }
        });
    }

    @Override
    public Observable<DatabaseAccountUsage> listUsagesAsync(String resourceGroupName, String accountName) {
        DatabaseAccountsInner client = this.inner();
        return client.listUsagesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<UsageInner>, Observable<UsageInner>>() {
            @Override
            public Observable<UsageInner> call(List<UsageInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<UsageInner, DatabaseAccountUsage>() {
            @Override
            public DatabaseAccountUsage call(UsageInner inner) {
                return wrapDatabaseAccountUsageModel(inner);
            }
        });
    }

    @Override
    public Observable<DatabaseAccountMetricDefinition> listMetricDefinitionsAsync(String resourceGroupName, String accountName) {
        DatabaseAccountsInner client = this.inner();
        return client.listMetricDefinitionsAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<MetricDefinitionInner>, Observable<MetricDefinitionInner>>() {
            @Override
            public Observable<MetricDefinitionInner> call(List<MetricDefinitionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MetricDefinitionInner, DatabaseAccountMetricDefinition>() {
            @Override
            public DatabaseAccountMetricDefinition call(MetricDefinitionInner inner) {
                return wrapDatabaseAccountMetricDefinitionModel(inner);
            }
        });
    }

    @Override
    public Observable<SqlDatabase> listSqlDatabasesAsync(String resourceGroupName, String accountName) {
        DatabaseAccountsInner client = this.inner();
        return client.listSqlDatabasesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<SqlDatabaseInner>, Observable<SqlDatabaseInner>>() {
            @Override
            public Observable<SqlDatabaseInner> call(List<SqlDatabaseInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<SqlDatabaseInner, SqlDatabase>() {
            @Override
            public SqlDatabase call(SqlDatabaseInner inner) {
                return new SqlDatabaseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SqlDatabase> getSqlDatabaseAsync(String resourceGroupName, String accountName, String databaseName) {
        DatabaseAccountsInner client = this.inner();
        return client.getSqlDatabaseAsync(resourceGroupName, accountName, databaseName)
        .map(new Func1<SqlDatabaseInner, SqlDatabase>() {
            @Override
            public SqlDatabase call(SqlDatabaseInner inner) {
                return new SqlDatabaseImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteSqlDatabaseAsync(String resourceGroupName, String accountName, String databaseName) {
        DatabaseAccountsInner client = this.inner();
        return client.deleteSqlDatabaseAsync(resourceGroupName, accountName, databaseName).toCompletable();
    }

    @Override
    public Observable<MongoDBDatabase> listMongoDBDatabasesAsync(String resourceGroupName, String accountName) {
        DatabaseAccountsInner client = this.inner();
        return client.listMongoDBDatabasesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<MongoDBDatabaseInner>, Observable<MongoDBDatabaseInner>>() {
            @Override
            public Observable<MongoDBDatabaseInner> call(List<MongoDBDatabaseInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MongoDBDatabaseInner, MongoDBDatabase>() {
            @Override
            public MongoDBDatabase call(MongoDBDatabaseInner inner) {
                return new MongoDBDatabaseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<MongoDBDatabase> getMongoDBDatabaseAsync(String resourceGroupName, String accountName, String databaseName) {
        DatabaseAccountsInner client = this.inner();
        return client.getMongoDBDatabaseAsync(resourceGroupName, accountName, databaseName)
        .map(new Func1<MongoDBDatabaseInner, MongoDBDatabase>() {
            @Override
            public MongoDBDatabase call(MongoDBDatabaseInner inner) {
                return new MongoDBDatabaseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<MongoDBDatabase> createUpdateMongoDBDatabaseAsync(String resourceGroupName, String accountName, String databaseName, MongoDBDatabaseCreateUpdateParameters createUpdateMongoDBDatabaseParameters) {
        DatabaseAccountsInner client = this.inner();
        return client.createUpdateMongoDBDatabaseAsync(resourceGroupName, accountName, databaseName, createUpdateMongoDBDatabaseParameters)
        .map(new Func1<MongoDBDatabaseInner, MongoDBDatabase>() {
            @Override
            public MongoDBDatabase call(MongoDBDatabaseInner inner) {
                return new MongoDBDatabaseImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteMongoDBDatabaseAsync(String resourceGroupName, String accountName, String databaseName) {
        DatabaseAccountsInner client = this.inner();
        return client.deleteMongoDBDatabaseAsync(resourceGroupName, accountName, databaseName).toCompletable();
    }

    @Override
    public Observable<GremlinDatabase> listGremlinDatabasesAsync(String resourceGroupName, String accountName) {
        DatabaseAccountsInner client = this.inner();
        return client.listGremlinDatabasesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<GremlinDatabaseInner>, Observable<GremlinDatabaseInner>>() {
            @Override
            public Observable<GremlinDatabaseInner> call(List<GremlinDatabaseInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<GremlinDatabaseInner, GremlinDatabase>() {
            @Override
            public GremlinDatabase call(GremlinDatabaseInner inner) {
                return new GremlinDatabaseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<GremlinDatabase> getGremlinDatabaseAsync(String resourceGroupName, String accountName, String databaseName) {
        DatabaseAccountsInner client = this.inner();
        return client.getGremlinDatabaseAsync(resourceGroupName, accountName, databaseName)
        .map(new Func1<GremlinDatabaseInner, GremlinDatabase>() {
            @Override
            public GremlinDatabase call(GremlinDatabaseInner inner) {
                return new GremlinDatabaseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<GremlinDatabase> createUpdateGremlinDatabaseAsync(String resourceGroupName, String accountName, String databaseName, GremlinDatabaseCreateUpdateParameters createUpdateGremlinDatabaseParameters) {
        DatabaseAccountsInner client = this.inner();
        return client.createUpdateGremlinDatabaseAsync(resourceGroupName, accountName, databaseName, createUpdateGremlinDatabaseParameters)
        .map(new Func1<GremlinDatabaseInner, GremlinDatabase>() {
            @Override
            public GremlinDatabase call(GremlinDatabaseInner inner) {
                return new GremlinDatabaseImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteGremlinDatabaseAsync(String resourceGroupName, String accountName, String databaseName) {
        DatabaseAccountsInner client = this.inner();
        return client.deleteGremlinDatabaseAsync(resourceGroupName, accountName, databaseName).toCompletable();
    }

    @Override
    public Observable<SqlContainer> getSqlContainerAsync(String resourceGroupName, String accountName, String databaseName, String containerName) {
        DatabaseAccountsInner client = this.inner();
        return client.getSqlContainerAsync(resourceGroupName, accountName, databaseName, containerName)
        .map(new Func1<SqlContainerInner, SqlContainer>() {
            @Override
            public SqlContainer call(SqlContainerInner inner) {
                return wrapSqlContainerModel(inner);
            }
       });
    }

    @Override
    public Observable<SqlContainer> listSqlContainersAsync(String resourceGroupName, String accountName, String databaseName) {
        DatabaseAccountsInner client = this.inner();
        return client.listSqlContainersAsync(resourceGroupName, accountName, databaseName)
        .flatMap(new Func1<List<SqlContainerInner>, Observable<SqlContainerInner>>() {
            @Override
            public Observable<SqlContainerInner> call(List<SqlContainerInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<SqlContainerInner, SqlContainer>() {
            @Override
            public SqlContainer call(SqlContainerInner inner) {
                return wrapSqlContainerModel(inner);
            }
        });
    }

    @Override
    public Completable deleteSqlContainerAsync(String resourceGroupName, String accountName, String databaseName, String containerName) {
        DatabaseAccountsInner client = this.inner();
        return client.deleteSqlContainerAsync(resourceGroupName, accountName, databaseName, containerName).toCompletable();
    }

    @Override
    public Observable<MongoDBCollection> getMongoDBCollectionAsync(String resourceGroupName, String accountName, String databaseName, String collectionName) {
        DatabaseAccountsInner client = this.inner();
        return client.getMongoDBCollectionAsync(resourceGroupName, accountName, databaseName, collectionName)
        .map(new Func1<MongoDBCollectionInner, MongoDBCollection>() {
            @Override
            public MongoDBCollection call(MongoDBCollectionInner inner) {
                return wrapMongoDBCollectionModel(inner);
            }
       });
    }

    @Override
    public Observable<MongoDBCollection> listMongoDBCollectionsAsync(String resourceGroupName, String accountName, String databaseName) {
        DatabaseAccountsInner client = this.inner();
        return client.listMongoDBCollectionsAsync(resourceGroupName, accountName, databaseName)
        .flatMap(new Func1<List<MongoDBCollectionInner>, Observable<MongoDBCollectionInner>>() {
            @Override
            public Observable<MongoDBCollectionInner> call(List<MongoDBCollectionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MongoDBCollectionInner, MongoDBCollection>() {
            @Override
            public MongoDBCollection call(MongoDBCollectionInner inner) {
                return wrapMongoDBCollectionModel(inner);
            }
        });
    }

    @Override
    public Completable deleteMongoDBCollectionAsync(String resourceGroupName, String accountName, String databaseName, String collectionName) {
        DatabaseAccountsInner client = this.inner();
        return client.deleteMongoDBCollectionAsync(resourceGroupName, accountName, databaseName, collectionName).toCompletable();
    }

    @Override
    public Observable<Table> listTablesAsync(String resourceGroupName, String accountName) {
        DatabaseAccountsInner client = this.inner();
        return client.listTablesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<TableInner>, Observable<TableInner>>() {
            @Override
            public Observable<TableInner> call(List<TableInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<TableInner, Table>() {
            @Override
            public Table call(TableInner inner) {
                return new TableImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Table> getTableAsync(String resourceGroupName, String accountName, String tableName) {
        DatabaseAccountsInner client = this.inner();
        return client.getTableAsync(resourceGroupName, accountName, tableName)
        .map(new Func1<TableInner, Table>() {
            @Override
            public Table call(TableInner inner) {
                return new TableImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteTableAsync(String resourceGroupName, String accountName, String tableName) {
        DatabaseAccountsInner client = this.inner();
        return client.deleteTableAsync(resourceGroupName, accountName, tableName).toCompletable();
    }

    @Override
    public Observable<CassandraTable> listCassandraTablesAsync(String resourceGroupName, String accountName, String keyspaceName) {
        DatabaseAccountsInner client = this.inner();
        return client.listCassandraTablesAsync(resourceGroupName, accountName, keyspaceName)
        .flatMap(new Func1<List<CassandraTableInner>, Observable<CassandraTableInner>>() {
            @Override
            public Observable<CassandraTableInner> call(List<CassandraTableInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<CassandraTableInner, CassandraTable>() {
            @Override
            public CassandraTable call(CassandraTableInner inner) {
                return new CassandraTableImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CassandraTable> getCassandraTableAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName) {
        DatabaseAccountsInner client = this.inner();
        return client.getCassandraTableAsync(resourceGroupName, accountName, keyspaceName, tableName)
        .map(new Func1<CassandraTableInner, CassandraTable>() {
            @Override
            public CassandraTable call(CassandraTableInner inner) {
                return new CassandraTableImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CassandraTable> createUpdateCassandraTableAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName, CassandraTableCreateUpdateParameters createUpdateCassandraTableParameters) {
        DatabaseAccountsInner client = this.inner();
        return client.createUpdateCassandraTableAsync(resourceGroupName, accountName, keyspaceName, tableName, createUpdateCassandraTableParameters)
        .map(new Func1<CassandraTableInner, CassandraTable>() {
            @Override
            public CassandraTable call(CassandraTableInner inner) {
                return new CassandraTableImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteCassandraTableAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName) {
        DatabaseAccountsInner client = this.inner();
        return client.deleteCassandraTableAsync(resourceGroupName, accountName, keyspaceName, tableName).toCompletable();
    }

    @Override
    public Observable<CassandraKeyspace> listCassandraKeyspacesAsync(String resourceGroupName, String accountName) {
        DatabaseAccountsInner client = this.inner();
        return client.listCassandraKeyspacesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<CassandraKeyspaceInner>, Observable<CassandraKeyspaceInner>>() {
            @Override
            public Observable<CassandraKeyspaceInner> call(List<CassandraKeyspaceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<CassandraKeyspaceInner, CassandraKeyspace>() {
            @Override
            public CassandraKeyspace call(CassandraKeyspaceInner inner) {
                return new CassandraKeyspaceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CassandraKeyspace> getCassandraKeyspaceAsync(String resourceGroupName, String accountName, String keyspaceName) {
        DatabaseAccountsInner client = this.inner();
        return client.getCassandraKeyspaceAsync(resourceGroupName, accountName, keyspaceName)
        .map(new Func1<CassandraKeyspaceInner, CassandraKeyspace>() {
            @Override
            public CassandraKeyspace call(CassandraKeyspaceInner inner) {
                return new CassandraKeyspaceImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteCassandraKeyspaceAsync(String resourceGroupName, String accountName, String keyspaceName) {
        DatabaseAccountsInner client = this.inner();
        return client.deleteCassandraKeyspaceAsync(resourceGroupName, accountName, keyspaceName).toCompletable();
    }

    @Override
    public Observable<GremlinGraph> getGremlinGraphAsync(String resourceGroupName, String accountName, String databaseName, String graphName) {
        DatabaseAccountsInner client = this.inner();
        return client.getGremlinGraphAsync(resourceGroupName, accountName, databaseName, graphName)
        .map(new Func1<GremlinGraphInner, GremlinGraph>() {
            @Override
            public GremlinGraph call(GremlinGraphInner inner) {
                return wrapGremlinGraphModel(inner);
            }
       });
    }

    @Override
    public Observable<GremlinGraph> listGremlinGraphsAsync(String resourceGroupName, String accountName, String databaseName) {
        DatabaseAccountsInner client = this.inner();
        return client.listGremlinGraphsAsync(resourceGroupName, accountName, databaseName)
        .flatMap(new Func1<List<GremlinGraphInner>, Observable<GremlinGraphInner>>() {
            @Override
            public Observable<GremlinGraphInner> call(List<GremlinGraphInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<GremlinGraphInner, GremlinGraph>() {
            @Override
            public GremlinGraph call(GremlinGraphInner inner) {
                return wrapGremlinGraphModel(inner);
            }
        });
    }

    @Override
    public Completable deleteGremlinGraphAsync(String resourceGroupName, String accountName, String databaseName, String graphName) {
        DatabaseAccountsInner client = this.inner();
        return client.deleteGremlinGraphAsync(resourceGroupName, accountName, databaseName, graphName).toCompletable();
    }

}
