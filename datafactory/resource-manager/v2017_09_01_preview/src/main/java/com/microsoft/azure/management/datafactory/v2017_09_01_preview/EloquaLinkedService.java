/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * Eloqua server linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Eloqua")
@JsonFlatten
public class EloquaLinkedService extends LinkedServiceInner {
    /**
     * The endpoint of the Eloqua server. (i.e. eloqua.example.com).
     */
    @JsonProperty(value = "typeProperties.endpoint", required = true)
    private Object endpoint;

    /**
     * The site name and user name of your Eloqua account in the form:
     * sitename/username. (i.e. Eloqua/Alice).
     */
    @JsonProperty(value = "typeProperties.username", required = true)
    private Object username;

    /**
     * The password corresponding to the user name.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     */
    @JsonProperty(value = "typeProperties.useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /**
     * Specifies whether to require the host name in the server's certificate
     * to match the host name of the server when connecting over SSL. The
     * default value is true.
     */
    @JsonProperty(value = "typeProperties.useHostVerification")
    private Object useHostVerification;

    /**
     * Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     */
    @JsonProperty(value = "typeProperties.usePeerVerification")
    private Object usePeerVerification;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the endpoint of the Eloqua server. (i.e. eloqua.example.com).
     *
     * @return the endpoint value
     */
    public Object endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint of the Eloqua server. (i.e. eloqua.example.com).
     *
     * @param endpoint the endpoint value to set
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService withEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the site name and user name of your Eloqua account in the form: sitename/username. (i.e. Eloqua/Alice).
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the site name and user name of your Eloqua account in the form: sitename/username. (i.e. Eloqua/Alice).
     *
     * @param username the username value to set
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password corresponding to the user name.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password corresponding to the user name.
     *
     * @param password the password value to set
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @return the useEncryptedEndpoints value
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @return the usePeerVerification value
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the EloquaLinkedService object itself.
     */
    public EloquaLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}