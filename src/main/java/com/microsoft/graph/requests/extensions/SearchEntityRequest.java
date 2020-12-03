// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SearchEntity;
import com.microsoft.graph.models.extensions.SearchRequest;
import com.microsoft.graph.models.extensions.SearchResponse;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Entity Request.
 */
public class SearchEntityRequest extends BaseRequest<SearchEntity> {
	
    /**
     * The request for the SearchEntity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SearchEntityRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SearchEntity.class);
    }

    /**
     * Gets the SearchEntity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super SearchEntity> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SearchEntity from the service
     *
     * @return the SearchEntity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SearchEntity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super SearchEntity> callback) {
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
     * Patches this SearchEntity with a source
     *
     * @param sourceSearchEntity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final SearchEntity sourceSearchEntity, @Nonnull final ICallback<? super SearchEntity> callback) {
        send(HttpMethod.PATCH, callback, sourceSearchEntity);
    }

    /**
     * Patches this SearchEntity with a source
     *
     * @param sourceSearchEntity the source object with updates
     * @return the updated SearchEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SearchEntity patch(@Nonnull final SearchEntity sourceSearchEntity) throws ClientException {
        return send(HttpMethod.PATCH, sourceSearchEntity);
    }

    /**
     * Creates a SearchEntity with a new object
     *
     * @param newSearchEntity the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final SearchEntity newSearchEntity, @Nonnull final ICallback<? super SearchEntity> callback) {
        send(HttpMethod.POST, callback, newSearchEntity);
    }

    /**
     * Creates a SearchEntity with a new object
     *
     * @param newSearchEntity the new object to create
     * @return the created SearchEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SearchEntity post(@Nonnull final SearchEntity newSearchEntity) throws ClientException {
        return send(HttpMethod.POST, newSearchEntity);
    }

    /**
     * Creates a SearchEntity with a new object
     *
     * @param newSearchEntity the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final SearchEntity newSearchEntity, @Nonnull final ICallback<? super SearchEntity> callback) {
        send(HttpMethod.PUT, callback, newSearchEntity);
    }

    /**
     * Creates a SearchEntity with a new object
     *
     * @param newSearchEntity the object to create/update
     * @return the created SearchEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SearchEntity put(@Nonnull final SearchEntity newSearchEntity) throws ClientException {
        return send(HttpMethod.PUT, newSearchEntity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SearchEntityRequest select(@Nonnull final String value) {
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
     public SearchEntityRequest expand(@Nonnull final String value) {
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
    public SearchEntityRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public SearchEntityRequest count() {
        addCountOption(true);
        return this;
    }
}

