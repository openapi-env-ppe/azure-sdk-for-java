/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sftp read settings.
 */
public class HttpReadSetting extends ConnectorReadSetting {
    /**
     * The HTTP method used to call the RESTful API. The default is GET. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "requestMethod")
    private Object requestMethod;

    /**
     * The HTTP request body to the RESTful API if requestMethod is POST. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "requestBody")
    private Object requestBody;

    /**
     * The additional HTTP headers in the request to the RESTful API. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "additionalHeaders")
    private Object additionalHeaders;

    /**
     * Specifies the timeout for a HTTP client to get HTTP response from HTTP
     * server.
     */
    @JsonProperty(value = "requestTimeout")
    private Object requestTimeout;

    /**
     * Get the HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     *
     * @return the requestMethod value
     */
    public Object requestMethod() {
        return this.requestMethod;
    }

    /**
     * Set the HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     *
     * @param requestMethod the requestMethod value to set
     * @return the HttpReadSetting object itself.
     */
    public HttpReadSetting withRequestMethod(Object requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * Get the HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     *
     * @return the requestBody value
     */
    public Object requestBody() {
        return this.requestBody;
    }

    /**
     * Set the HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     *
     * @param requestBody the requestBody value to set
     * @return the HttpReadSetting object itself.
     */
    public HttpReadSetting withRequestBody(Object requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Get the additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     *
     * @return the additionalHeaders value
     */
    public Object additionalHeaders() {
        return this.additionalHeaders;
    }

    /**
     * Set the additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     *
     * @param additionalHeaders the additionalHeaders value to set
     * @return the HttpReadSetting object itself.
     */
    public HttpReadSetting withAdditionalHeaders(Object additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Get specifies the timeout for a HTTP client to get HTTP response from HTTP server.
     *
     * @return the requestTimeout value
     */
    public Object requestTimeout() {
        return this.requestTimeout;
    }

    /**
     * Set specifies the timeout for a HTTP client to get HTTP response from HTTP server.
     *
     * @param requestTimeout the requestTimeout value to set
     * @return the HttpReadSetting object itself.
     */
    public HttpReadSetting withRequestTimeout(Object requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }

}