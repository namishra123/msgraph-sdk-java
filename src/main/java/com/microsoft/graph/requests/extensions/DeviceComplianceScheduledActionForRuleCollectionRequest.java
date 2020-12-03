// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Scheduled Action For Rule Collection Request.
 */
public class DeviceComplianceScheduledActionForRuleCollectionRequest extends BaseCollectionRequest<DeviceComplianceScheduledActionForRule, DeviceComplianceScheduledActionForRuleCollectionResponse, DeviceComplianceScheduledActionForRuleCollectionPage> {

    /**
     * The request builder for this collection of DeviceComplianceScheduledActionForRule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceScheduledActionForRuleCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceScheduledActionForRuleCollectionResponse.class, DeviceComplianceScheduledActionForRuleCollectionPage.class, DeviceComplianceScheduledActionForRuleCollectionRequestBuilder.class);
    }

    /**
     * Creates a new DeviceComplianceScheduledActionForRule
     * @param newDeviceComplianceScheduledActionForRule the DeviceComplianceScheduledActionForRule to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule, @Nonnull final ICallback<? super DeviceComplianceScheduledActionForRule> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceComplianceScheduledActionForRuleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceComplianceScheduledActionForRule, callback);
    }

    /**
     * Creates a new DeviceComplianceScheduledActionForRule
     * @param newDeviceComplianceScheduledActionForRule the DeviceComplianceScheduledActionForRule to create
     * @return the newly created object
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRule post(@Nonnull final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceComplianceScheduledActionForRuleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceComplianceScheduledActionForRule);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

