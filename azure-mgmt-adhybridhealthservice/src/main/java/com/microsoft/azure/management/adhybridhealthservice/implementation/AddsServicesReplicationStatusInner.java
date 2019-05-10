/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in AddsServicesReplicationStatus.
 */
public class AddsServicesReplicationStatusInner {
    /** The Retrofit service to perform REST calls. */
    private AddsServicesReplicationStatusService service;
    /** The service client containing this operation class. */
    private ADHybridHealthServiceImpl client;

    /**
     * Initializes an instance of AddsServicesReplicationStatusInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AddsServicesReplicationStatusInner(Retrofit retrofit, ADHybridHealthServiceImpl client) {
        this.service = retrofit.create(AddsServicesReplicationStatusService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AddsServicesReplicationStatus to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AddsServicesReplicationStatusService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.adhybridhealthservice.AddsServicesReplicationStatus get" })
        @GET("providers/Microsoft.ADHybridHealthService/addsservices/{serviceName}/replicationstatus")
        Observable<Response<ResponseBody>> get(@Path("serviceName") String serviceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets Replication status for a given Active Directory Domain Service, that is onboarded to Azure Active Directory Connect Health.
     *
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ReplicationStatusInner object if successful.
     */
    public ReplicationStatusInner get(String serviceName) {
        return getWithServiceResponseAsync(serviceName).toBlocking().single().body();
    }

    /**
     * Gets Replication status for a given Active Directory Domain Service, that is onboarded to Azure Active Directory Connect Health.
     *
     * @param serviceName The name of the service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ReplicationStatusInner> getAsync(String serviceName, final ServiceCallback<ReplicationStatusInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(serviceName), serviceCallback);
    }

    /**
     * Gets Replication status for a given Active Directory Domain Service, that is onboarded to Azure Active Directory Connect Health.
     *
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ReplicationStatusInner object
     */
    public Observable<ReplicationStatusInner> getAsync(String serviceName) {
        return getWithServiceResponseAsync(serviceName).map(new Func1<ServiceResponse<ReplicationStatusInner>, ReplicationStatusInner>() {
            @Override
            public ReplicationStatusInner call(ServiceResponse<ReplicationStatusInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets Replication status for a given Active Directory Domain Service, that is onboarded to Azure Active Directory Connect Health.
     *
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ReplicationStatusInner object
     */
    public Observable<ServiceResponse<ReplicationStatusInner>> getWithServiceResponseAsync(String serviceName) {
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(serviceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ReplicationStatusInner>>>() {
                @Override
                public Observable<ServiceResponse<ReplicationStatusInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ReplicationStatusInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ReplicationStatusInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ReplicationStatusInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ReplicationStatusInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}