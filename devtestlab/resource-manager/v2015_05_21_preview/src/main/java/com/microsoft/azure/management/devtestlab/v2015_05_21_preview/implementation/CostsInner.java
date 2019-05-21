/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2015_05_21_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Costs.
 */
public class CostsInner {
    /** The Retrofit service to perform REST calls. */
    private CostsService service;
    /** The service client containing this operation class. */
    private DevTestLabsClientImpl client;

    /**
     * Initializes an instance of CostsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public CostsInner(Retrofit retrofit, DevTestLabsClientImpl client) {
        this.service = retrofit.create(CostsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Costs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CostsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.devtestlab.v2015_05_21_preview.Costs list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevTestLab/labs/{labName}/costs")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("labName") String labName, @Query("$filter") String filter, @Query("$top") Integer top, @Query("$orderBy") String orderBy, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.devtestlab.v2015_05_21_preview.Costs getResource" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevTestLab/labs/{labName}/costs/{name}")
        Observable<Response<ResponseBody>> getResource(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("labName") String labName, @Path("name") String name, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.devtestlab.v2015_05_21_preview.Costs refreshData" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevTestLab/labs/{labName}/costs/{name}/refreshData")
        Observable<Response<ResponseBody>> refreshData(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("labName") String labName, @Path("name") String name, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.devtestlab.v2015_05_21_preview.Costs beginRefreshData" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevTestLab/labs/{labName}/costs/{name}/refreshData")
        Observable<Response<ResponseBody>> beginRefreshData(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("labName") String labName, @Path("name") String name, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.devtestlab.v2015_05_21_preview.Costs listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List costs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;CostInner&gt; object if successful.
     */
    public PagedList<CostInner> list(final String resourceGroupName, final String labName) {
        ServiceResponse<Page<CostInner>> response = listSinglePageAsync(resourceGroupName, labName).toBlocking().single();
        return new PagedList<CostInner>(response.body()) {
            @Override
            public Page<CostInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List costs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<CostInner>> listAsync(final String resourceGroupName, final String labName, final ListOperationCallback<CostInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, labName),
            new Func1<String, Observable<ServiceResponse<Page<CostInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CostInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List costs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;CostInner&gt; object
     */
    public Observable<Page<CostInner>> listAsync(final String resourceGroupName, final String labName) {
        return listWithServiceResponseAsync(resourceGroupName, labName)
            .map(new Func1<ServiceResponse<Page<CostInner>>, Page<CostInner>>() {
                @Override
                public Page<CostInner> call(ServiceResponse<Page<CostInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List costs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;CostInner&gt; object
     */
    public Observable<ServiceResponse<Page<CostInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String labName) {
        return listSinglePageAsync(resourceGroupName, labName)
            .concatMap(new Func1<ServiceResponse<Page<CostInner>>, Observable<ServiceResponse<Page<CostInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CostInner>>> call(ServiceResponse<Page<CostInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List costs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;CostInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<CostInner>>> listSinglePageAsync(final String resourceGroupName, final String labName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (labName == null) {
            throw new IllegalArgumentException("Parameter labName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        final Integer top = null;
        final String orderBy = null;
        return service.list(this.client.subscriptionId(), resourceGroupName, labName, filter, top, orderBy, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<CostInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CostInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<CostInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<CostInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * List costs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderBy the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;CostInner&gt; object if successful.
     */
    public PagedList<CostInner> list(final String resourceGroupName, final String labName, final String filter, final Integer top, final String orderBy) {
        ServiceResponse<Page<CostInner>> response = listSinglePageAsync(resourceGroupName, labName, filter, top, orderBy).toBlocking().single();
        return new PagedList<CostInner>(response.body()) {
            @Override
            public Page<CostInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List costs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderBy the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<CostInner>> listAsync(final String resourceGroupName, final String labName, final String filter, final Integer top, final String orderBy, final ListOperationCallback<CostInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, labName, filter, top, orderBy),
            new Func1<String, Observable<ServiceResponse<Page<CostInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CostInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List costs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderBy the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;CostInner&gt; object
     */
    public Observable<Page<CostInner>> listAsync(final String resourceGroupName, final String labName, final String filter, final Integer top, final String orderBy) {
        return listWithServiceResponseAsync(resourceGroupName, labName, filter, top, orderBy)
            .map(new Func1<ServiceResponse<Page<CostInner>>, Page<CostInner>>() {
                @Override
                public Page<CostInner> call(ServiceResponse<Page<CostInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List costs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderBy the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;CostInner&gt; object
     */
    public Observable<ServiceResponse<Page<CostInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String labName, final String filter, final Integer top, final String orderBy) {
        return listSinglePageAsync(resourceGroupName, labName, filter, top, orderBy)
            .concatMap(new Func1<ServiceResponse<Page<CostInner>>, Observable<ServiceResponse<Page<CostInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CostInner>>> call(ServiceResponse<Page<CostInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List costs.
     *
    ServiceResponse<PageImpl<CostInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<CostInner>> * @param labName The name of the lab.
    ServiceResponse<PageImpl<CostInner>> * @param filter The filter to apply on the operation.
    ServiceResponse<PageImpl<CostInner>> * @param top the Integer value
    ServiceResponse<PageImpl<CostInner>> * @param orderBy the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;CostInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<CostInner>>> listSinglePageAsync(final String resourceGroupName, final String labName, final String filter, final Integer top, final String orderBy) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (labName == null) {
            throw new IllegalArgumentException("Parameter labName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, labName, filter, top, orderBy, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<CostInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CostInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<CostInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<CostInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<CostInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<CostInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<CostInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CostInner object if successful.
     */
    public CostInner getResource(String resourceGroupName, String labName, String name) {
        return getResourceWithServiceResponseAsync(resourceGroupName, labName, name).toBlocking().single().body();
    }

    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CostInner> getResourceAsync(String resourceGroupName, String labName, String name, final ServiceCallback<CostInner> serviceCallback) {
        return ServiceFuture.fromResponse(getResourceWithServiceResponseAsync(resourceGroupName, labName, name), serviceCallback);
    }

    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CostInner object
     */
    public Observable<CostInner> getResourceAsync(String resourceGroupName, String labName, String name) {
        return getResourceWithServiceResponseAsync(resourceGroupName, labName, name).map(new Func1<ServiceResponse<CostInner>, CostInner>() {
            @Override
            public CostInner call(ServiceResponse<CostInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get cost.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CostInner object
     */
    public Observable<ServiceResponse<CostInner>> getResourceWithServiceResponseAsync(String resourceGroupName, String labName, String name) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (labName == null) {
            throw new IllegalArgumentException("Parameter labName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getResource(this.client.subscriptionId(), resourceGroupName, labName, name, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CostInner>>>() {
                @Override
                public Observable<ServiceResponse<CostInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CostInner> clientResponse = getResourceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CostInner> getResourceDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<CostInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<CostInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Refresh Lab's Cost Data. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void refreshData(String resourceGroupName, String labName, String name) {
        refreshDataWithServiceResponseAsync(resourceGroupName, labName, name).toBlocking().last().body();
    }

    /**
     * Refresh Lab's Cost Data. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> refreshDataAsync(String resourceGroupName, String labName, String name, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(refreshDataWithServiceResponseAsync(resourceGroupName, labName, name), serviceCallback);
    }

    /**
     * Refresh Lab's Cost Data. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> refreshDataAsync(String resourceGroupName, String labName, String name) {
        return refreshDataWithServiceResponseAsync(resourceGroupName, labName, name).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Refresh Lab's Cost Data. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> refreshDataWithServiceResponseAsync(String resourceGroupName, String labName, String name) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (labName == null) {
            throw new IllegalArgumentException("Parameter labName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Observable<Response<ResponseBody>> observable = service.refreshData(this.client.subscriptionId(), resourceGroupName, labName, name, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Refresh Lab's Cost Data. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginRefreshData(String resourceGroupName, String labName, String name) {
        beginRefreshDataWithServiceResponseAsync(resourceGroupName, labName, name).toBlocking().single().body();
    }

    /**
     * Refresh Lab's Cost Data. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginRefreshDataAsync(String resourceGroupName, String labName, String name, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginRefreshDataWithServiceResponseAsync(resourceGroupName, labName, name), serviceCallback);
    }

    /**
     * Refresh Lab's Cost Data. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginRefreshDataAsync(String resourceGroupName, String labName, String name) {
        return beginRefreshDataWithServiceResponseAsync(resourceGroupName, labName, name).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Refresh Lab's Cost Data. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginRefreshDataWithServiceResponseAsync(String resourceGroupName, String labName, String name) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (labName == null) {
            throw new IllegalArgumentException("Parameter labName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.beginRefreshData(this.client.subscriptionId(), resourceGroupName, labName, name, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginRefreshDataDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginRefreshDataDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List costs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;CostInner&gt; object if successful.
     */
    public PagedList<CostInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<CostInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<CostInner>(response.body()) {
            @Override
            public Page<CostInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List costs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<CostInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<CostInner>> serviceFuture, final ListOperationCallback<CostInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<CostInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CostInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List costs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;CostInner&gt; object
     */
    public Observable<Page<CostInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<CostInner>>, Page<CostInner>>() {
                @Override
                public Page<CostInner> call(ServiceResponse<Page<CostInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List costs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;CostInner&gt; object
     */
    public Observable<ServiceResponse<Page<CostInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<CostInner>>, Observable<ServiceResponse<Page<CostInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CostInner>>> call(ServiceResponse<Page<CostInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List costs.
     *
    ServiceResponse<PageImpl<CostInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;CostInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<CostInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<CostInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CostInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<CostInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<CostInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<CostInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<CostInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<CostInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
