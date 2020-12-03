// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.requests.extensions.ItemActivityStatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityStatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Analytics Request.
 */
public class ItemAnalyticsRequest extends BaseRequest<ItemAnalytics> {
	
    /**
     * The request for the ItemAnalytics
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemAnalyticsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemAnalytics.class);
    }

    /**
     * Gets the ItemAnalytics from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ItemAnalytics> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ItemAnalytics from the service
     *
     * @return the ItemAnalytics from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemAnalytics get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ItemAnalytics> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ItemAnalytics with a source
     *
     * @param sourceItemAnalytics the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ItemAnalytics sourceItemAnalytics, @Nonnull final ICallback<? super ItemAnalytics> callback) {
        send(HttpMethod.PATCH, callback, sourceItemAnalytics);
    }

    /**
     * Patches this ItemAnalytics with a source
     *
     * @param sourceItemAnalytics the source object with updates
     * @return the updated ItemAnalytics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemAnalytics patch(@Nonnull final ItemAnalytics sourceItemAnalytics) throws ClientException {
        return send(HttpMethod.PATCH, sourceItemAnalytics);
    }

    /**
     * Creates a ItemAnalytics with a new object
     *
     * @param newItemAnalytics the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ItemAnalytics newItemAnalytics, @Nonnull final ICallback<? super ItemAnalytics> callback) {
        send(HttpMethod.POST, callback, newItemAnalytics);
    }

    /**
     * Creates a ItemAnalytics with a new object
     *
     * @param newItemAnalytics the new object to create
     * @return the created ItemAnalytics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemAnalytics post(@Nonnull final ItemAnalytics newItemAnalytics) throws ClientException {
        return send(HttpMethod.POST, newItemAnalytics);
    }

    /**
     * Creates a ItemAnalytics with a new object
     *
     * @param newItemAnalytics the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ItemAnalytics newItemAnalytics, @Nonnull final ICallback<? super ItemAnalytics> callback) {
        send(HttpMethod.PUT, callback, newItemAnalytics);
    }

    /**
     * Creates a ItemAnalytics with a new object
     *
     * @param newItemAnalytics the object to create/update
     * @return the created ItemAnalytics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemAnalytics put(@Nonnull final ItemAnalytics newItemAnalytics) throws ClientException {
        return send(HttpMethod.PUT, newItemAnalytics);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ItemAnalyticsRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public ItemAnalyticsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public ItemAnalyticsRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ItemAnalyticsRequest count() {
        addCountOption(true);
        return this;
    }
}

