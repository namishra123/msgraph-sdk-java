// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignCollectionResponse;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Assign Collection Request.
 */
public class DeviceCompliancePolicyAssignCollectionRequest extends BaseCollectionRequest<DeviceCompliancePolicyAssignment, DeviceCompliancePolicyAssignCollectionResponse, DeviceCompliancePolicyAssignCollectionPage> {


    /** The body for the method */
    protected final DeviceCompliancePolicyAssignBody body;


    /**
     * The request for this DeviceCompliancePolicyAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyAssignCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyAssignCollectionResponse.class, DeviceCompliancePolicyAssignCollectionPage.class, DeviceCompliancePolicyAssignCollectionRequestBuilder.class);
        body = new DeviceCompliancePolicyAssignBody();
    }


    /**
     * Invokes the method and calls the callback with the resulting collection of objects
     * @param callback a callback to be invoked with the resulting collection of objects
     */
    public void post(@Nonnull final ICallback<? super DeviceCompliancePolicyAssignCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    /**
     * Invokes the method and returns the resulting collection of objects
     * @return a collection of objects returned by the method
     */
    @Nullable
    public DeviceCompliancePolicyAssignCollectionPage post() throws ClientException {
        final DeviceCompliancePolicyAssignCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicyAssignCollectionRequest select(@Nonnull final String value) {
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
    public DeviceCompliancePolicyAssignCollectionRequest top(final int value) {
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
    public DeviceCompliancePolicyAssignCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicyAssignCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicyAssignCollectionRequest expand(@Nonnull final String value) {
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
    public DeviceCompliancePolicyAssignCollectionRequest filter(@Nonnull final String value) {
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
    public DeviceCompliancePolicyAssignCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

}
