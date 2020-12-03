// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.ItemActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Stat Request.
 */
public class ItemActivityStatRequest extends BaseRequest<ItemActivityStat> {
	
    /**
     * The request for the ItemActivityStat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemActivityStatRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemActivityStat.class);
    }

    /**
     * Gets the ItemActivityStat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ItemActivityStat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ItemActivityStat from the service
     *
     * @return the ItemActivityStat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemActivityStat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ItemActivityStat> callback) {
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
     * Patches this ItemActivityStat with a source
     *
     * @param sourceItemActivityStat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ItemActivityStat sourceItemActivityStat, @Nonnull final ICallback<? super ItemActivityStat> callback) {
        send(HttpMethod.PATCH, callback, sourceItemActivityStat);
    }

    /**
     * Patches this ItemActivityStat with a source
     *
     * @param sourceItemActivityStat the source object with updates
     * @return the updated ItemActivityStat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemActivityStat patch(@Nonnull final ItemActivityStat sourceItemActivityStat) throws ClientException {
        return send(HttpMethod.PATCH, sourceItemActivityStat);
    }

    /**
     * Creates a ItemActivityStat with a new object
     *
     * @param newItemActivityStat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ItemActivityStat newItemActivityStat, @Nonnull final ICallback<? super ItemActivityStat> callback) {
        send(HttpMethod.POST, callback, newItemActivityStat);
    }

    /**
     * Creates a ItemActivityStat with a new object
     *
     * @param newItemActivityStat the new object to create
     * @return the created ItemActivityStat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemActivityStat post(@Nonnull final ItemActivityStat newItemActivityStat) throws ClientException {
        return send(HttpMethod.POST, newItemActivityStat);
    }

    /**
     * Creates a ItemActivityStat with a new object
     *
     * @param newItemActivityStat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ItemActivityStat newItemActivityStat, @Nonnull final ICallback<? super ItemActivityStat> callback) {
        send(HttpMethod.PUT, callback, newItemActivityStat);
    }

    /**
     * Creates a ItemActivityStat with a new object
     *
     * @param newItemActivityStat the object to create/update
     * @return the created ItemActivityStat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemActivityStat put(@Nonnull final ItemActivityStat newItemActivityStat) throws ClientException {
        return send(HttpMethod.PUT, newItemActivityStat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ItemActivityStatRequest select(@Nonnull final String value) {
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
     public ItemActivityStatRequest expand(@Nonnull final String value) {
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
    public ItemActivityStatRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ItemActivityStatRequest count() {
        addCountOption(true);
        return this;
    }
}

