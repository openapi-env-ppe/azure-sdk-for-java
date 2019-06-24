/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetInner;

/**
 * Delimited text dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DelimitedText")
@JsonFlatten
public class DelimitedTextDataset extends DatasetInner {
    /**
     * The location of the delimited text storage.
     */
    @JsonProperty(value = "typeProperties.location", required = true)
    private DatasetLocation location;

    /**
     * The column delimiter. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.columnDelimiter")
    private Object columnDelimiter;

    /**
     * The row delimiter. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.rowDelimiter")
    private Object rowDelimiter;

    /**
     * The code page name of the preferred encoding. If miss, the default value
     * is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name
     * column of the table in the following link to set supported values:
     * https://msdn.microsoft.com/library/system.text.encoding.aspx. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encodingName")
    private Object encodingName;

    /**
     * The compressionCodec property.
     */
    @JsonProperty(value = "typeProperties.compressionCodec")
    private Object compressionCodec;

    /**
     * The data compression method used for DelimitedText.
     */
    @JsonProperty(value = "typeProperties.compressionLevel")
    private Object compressionLevel;

    /**
     * The quote character. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.quoteChar")
    private Object quoteChar;

    /**
     * The escape character. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.escapeChar")
    private Object escapeChar;

    /**
     * When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The
     * default value is false. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "typeProperties.firstRowAsHeader")
    private Object firstRowAsHeader;

    /**
     * The null value string. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.nullValue")
    private Object nullValue;

    /**
     * Get the location of the delimited text storage.
     *
     * @return the location value
     */
    public DatasetLocation location() {
        return this.location;
    }

    /**
     * Set the location of the delimited text storage.
     *
     * @param location the location value to set
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the column delimiter. Type: string (or Expression with resultType string).
     *
     * @return the columnDelimiter value
     */
    public Object columnDelimiter() {
        return this.columnDelimiter;
    }

    /**
     * Set the column delimiter. Type: string (or Expression with resultType string).
     *
     * @param columnDelimiter the columnDelimiter value to set
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withColumnDelimiter(Object columnDelimiter) {
        this.columnDelimiter = columnDelimiter;
        return this;
    }

    /**
     * Get the row delimiter. Type: string (or Expression with resultType string).
     *
     * @return the rowDelimiter value
     */
    public Object rowDelimiter() {
        return this.rowDelimiter;
    }

    /**
     * Set the row delimiter. Type: string (or Expression with resultType string).
     *
     * @param rowDelimiter the rowDelimiter value to set
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withRowDelimiter(Object rowDelimiter) {
        this.rowDelimiter = rowDelimiter;
        return this;
    }

    /**
     * Get the code page name of the preferred encoding. If miss, the default value is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     *
     * @return the encodingName value
     */
    public Object encodingName() {
        return this.encodingName;
    }

    /**
     * Set the code page name of the preferred encoding. If miss, the default value is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     *
     * @param encodingName the encodingName value to set
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withEncodingName(Object encodingName) {
        this.encodingName = encodingName;
        return this;
    }

    /**
     * Get the compressionCodec value.
     *
     * @return the compressionCodec value
     */
    public Object compressionCodec() {
        return this.compressionCodec;
    }

    /**
     * Set the compressionCodec value.
     *
     * @param compressionCodec the compressionCodec value to set
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withCompressionCodec(Object compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }

    /**
     * Get the data compression method used for DelimitedText.
     *
     * @return the compressionLevel value
     */
    public Object compressionLevel() {
        return this.compressionLevel;
    }

    /**
     * Set the data compression method used for DelimitedText.
     *
     * @param compressionLevel the compressionLevel value to set
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withCompressionLevel(Object compressionLevel) {
        this.compressionLevel = compressionLevel;
        return this;
    }

    /**
     * Get the quote character. Type: string (or Expression with resultType string).
     *
     * @return the quoteChar value
     */
    public Object quoteChar() {
        return this.quoteChar;
    }

    /**
     * Set the quote character. Type: string (or Expression with resultType string).
     *
     * @param quoteChar the quoteChar value to set
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withQuoteChar(Object quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }

    /**
     * Get the escape character. Type: string (or Expression with resultType string).
     *
     * @return the escapeChar value
     */
    public Object escapeChar() {
        return this.escapeChar;
    }

    /**
     * Set the escape character. Type: string (or Expression with resultType string).
     *
     * @param escapeChar the escapeChar value to set
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withEscapeChar(Object escapeChar) {
        this.escapeChar = escapeChar;
        return this;
    }

    /**
     * Get when used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the firstRowAsHeader value
     */
    public Object firstRowAsHeader() {
        return this.firstRowAsHeader;
    }

    /**
     * Set when used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param firstRowAsHeader the firstRowAsHeader value to set
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withFirstRowAsHeader(Object firstRowAsHeader) {
        this.firstRowAsHeader = firstRowAsHeader;
        return this;
    }

    /**
     * Get the null value string. Type: string (or Expression with resultType string).
     *
     * @return the nullValue value
     */
    public Object nullValue() {
        return this.nullValue;
    }

    /**
     * Set the null value string. Type: string (or Expression with resultType string).
     *
     * @param nullValue the nullValue value to set
     * @return the DelimitedTextDataset object itself.
     */
    public DelimitedTextDataset withNullValue(Object nullValue) {
        this.nullValue = nullValue;
        return this;
    }

}