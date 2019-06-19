/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The X12 envelope override settings.
 */
public class X12EnvelopeOverride {
    /**
     * The target namespace on which this envelope settings has to be applied.
     */
    @JsonProperty(value = "targetNamespace", required = true)
    private String targetNamespace;

    /**
     * The protocol version on which this envelope settings has to be applied.
     */
    @JsonProperty(value = "protocolVersion", required = true)
    private String protocolVersion;

    /**
     * The message id on which this envelope settings has to be applied.
     */
    @JsonProperty(value = "messageId", required = true)
    private String messageId;

    /**
     * The responsible agency code.
     */
    @JsonProperty(value = "responsibleAgencyCode", required = true)
    private String responsibleAgencyCode;

    /**
     * The header version.
     */
    @JsonProperty(value = "headerVersion", required = true)
    private String headerVersion;

    /**
     * The sender application id.
     */
    @JsonProperty(value = "senderApplicationId", required = true)
    private String senderApplicationId;

    /**
     * The receiver application id.
     */
    @JsonProperty(value = "receiverApplicationId", required = true)
    private String receiverApplicationId;

    /**
     * The functional identifier code.
     */
    @JsonProperty(value = "functionalIdentifierCode")
    private String functionalIdentifierCode;

    /**
     * The date format. Possible values include: 'NotSpecified', 'CCYYMMDD',
     * 'YYMMDD'.
     */
    @JsonProperty(value = "dateFormat", required = true)
    private X12DateFormat dateFormat;

    /**
     * The time format. Possible values include: 'NotSpecified', 'HHMM',
     * 'HHMMSS', 'HHMMSSdd', 'HHMMSSd'.
     */
    @JsonProperty(value = "timeFormat", required = true)
    private X12TimeFormat timeFormat;

    /**
     * Get the target namespace on which this envelope settings has to be applied.
     *
     * @return the targetNamespace value
     */
    public String targetNamespace() {
        return this.targetNamespace;
    }

    /**
     * Set the target namespace on which this envelope settings has to be applied.
     *
     * @param targetNamespace the targetNamespace value to set
     * @return the X12EnvelopeOverride object itself.
     */
    public X12EnvelopeOverride withTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }

    /**
     * Get the protocol version on which this envelope settings has to be applied.
     *
     * @return the protocolVersion value
     */
    public String protocolVersion() {
        return this.protocolVersion;
    }

    /**
     * Set the protocol version on which this envelope settings has to be applied.
     *
     * @param protocolVersion the protocolVersion value to set
     * @return the X12EnvelopeOverride object itself.
     */
    public X12EnvelopeOverride withProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }

    /**
     * Get the message id on which this envelope settings has to be applied.
     *
     * @return the messageId value
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the message id on which this envelope settings has to be applied.
     *
     * @param messageId the messageId value to set
     * @return the X12EnvelopeOverride object itself.
     */
    public X12EnvelopeOverride withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the responsible agency code.
     *
     * @return the responsibleAgencyCode value
     */
    public String responsibleAgencyCode() {
        return this.responsibleAgencyCode;
    }

    /**
     * Set the responsible agency code.
     *
     * @param responsibleAgencyCode the responsibleAgencyCode value to set
     * @return the X12EnvelopeOverride object itself.
     */
    public X12EnvelopeOverride withResponsibleAgencyCode(String responsibleAgencyCode) {
        this.responsibleAgencyCode = responsibleAgencyCode;
        return this;
    }

    /**
     * Get the header version.
     *
     * @return the headerVersion value
     */
    public String headerVersion() {
        return this.headerVersion;
    }

    /**
     * Set the header version.
     *
     * @param headerVersion the headerVersion value to set
     * @return the X12EnvelopeOverride object itself.
     */
    public X12EnvelopeOverride withHeaderVersion(String headerVersion) {
        this.headerVersion = headerVersion;
        return this;
    }

    /**
     * Get the sender application id.
     *
     * @return the senderApplicationId value
     */
    public String senderApplicationId() {
        return this.senderApplicationId;
    }

    /**
     * Set the sender application id.
     *
     * @param senderApplicationId the senderApplicationId value to set
     * @return the X12EnvelopeOverride object itself.
     */
    public X12EnvelopeOverride withSenderApplicationId(String senderApplicationId) {
        this.senderApplicationId = senderApplicationId;
        return this;
    }

    /**
     * Get the receiver application id.
     *
     * @return the receiverApplicationId value
     */
    public String receiverApplicationId() {
        return this.receiverApplicationId;
    }

    /**
     * Set the receiver application id.
     *
     * @param receiverApplicationId the receiverApplicationId value to set
     * @return the X12EnvelopeOverride object itself.
     */
    public X12EnvelopeOverride withReceiverApplicationId(String receiverApplicationId) {
        this.receiverApplicationId = receiverApplicationId;
        return this;
    }

    /**
     * Get the functional identifier code.
     *
     * @return the functionalIdentifierCode value
     */
    public String functionalIdentifierCode() {
        return this.functionalIdentifierCode;
    }

    /**
     * Set the functional identifier code.
     *
     * @param functionalIdentifierCode the functionalIdentifierCode value to set
     * @return the X12EnvelopeOverride object itself.
     */
    public X12EnvelopeOverride withFunctionalIdentifierCode(String functionalIdentifierCode) {
        this.functionalIdentifierCode = functionalIdentifierCode;
        return this;
    }

    /**
     * Get the date format. Possible values include: 'NotSpecified', 'CCYYMMDD', 'YYMMDD'.
     *
     * @return the dateFormat value
     */
    public X12DateFormat dateFormat() {
        return this.dateFormat;
    }

    /**
     * Set the date format. Possible values include: 'NotSpecified', 'CCYYMMDD', 'YYMMDD'.
     *
     * @param dateFormat the dateFormat value to set
     * @return the X12EnvelopeOverride object itself.
     */
    public X12EnvelopeOverride withDateFormat(X12DateFormat dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Get the time format. Possible values include: 'NotSpecified', 'HHMM', 'HHMMSS', 'HHMMSSdd', 'HHMMSSd'.
     *
     * @return the timeFormat value
     */
    public X12TimeFormat timeFormat() {
        return this.timeFormat;
    }

    /**
     * Set the time format. Possible values include: 'NotSpecified', 'HHMM', 'HHMMSS', 'HHMMSSdd', 'HHMMSSd'.
     *
     * @param timeFormat the timeFormat value to set
     * @return the X12EnvelopeOverride object itself.
     */
    public X12EnvelopeOverride withTimeFormat(X12TimeFormat timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

}
