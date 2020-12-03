// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAndroidLobApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Android Lob App Request.
 */
public class ManagedAndroidLobAppRequest extends BaseRequest<ManagedAndroidLobApp> {
	
    /**
     * The request for the ManagedAndroidLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAndroidLobAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAndroidLobApp.class);
    }

    /**
     * Gets the ManagedAndroidLobApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ManagedAndroidLobApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedAndroidLobApp from the service
     *
     * @return the ManagedAndroidLobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAndroidLobApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ManagedAndroidLobApp> callback) {
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
     * Patches this ManagedAndroidLobApp with a source
     *
     * @param sourceManagedAndroidLobApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ManagedAndroidLobApp sourceManagedAndroidLobApp, @Nonnull final ICallback<? super ManagedAndroidLobApp> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedAndroidLobApp);
    }

    /**
     * Patches this ManagedAndroidLobApp with a source
     *
     * @param sourceManagedAndroidLobApp the source object with updates
     * @return the updated ManagedAndroidLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAndroidLobApp patch(@Nonnull final ManagedAndroidLobApp sourceManagedAndroidLobApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAndroidLobApp);
    }

    /**
     * Creates a ManagedAndroidLobApp with a new object
     *
     * @param newManagedAndroidLobApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ManagedAndroidLobApp newManagedAndroidLobApp, @Nonnull final ICallback<? super ManagedAndroidLobApp> callback) {
        send(HttpMethod.POST, callback, newManagedAndroidLobApp);
    }

    /**
     * Creates a ManagedAndroidLobApp with a new object
     *
     * @param newManagedAndroidLobApp the new object to create
     * @return the created ManagedAndroidLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAndroidLobApp post(@Nonnull final ManagedAndroidLobApp newManagedAndroidLobApp) throws ClientException {
        return send(HttpMethod.POST, newManagedAndroidLobApp);
    }

    /**
     * Creates a ManagedAndroidLobApp with a new object
     *
     * @param newManagedAndroidLobApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ManagedAndroidLobApp newManagedAndroidLobApp, @Nonnull final ICallback<? super ManagedAndroidLobApp> callback) {
        send(HttpMethod.PUT, callback, newManagedAndroidLobApp);
    }

    /**
     * Creates a ManagedAndroidLobApp with a new object
     *
     * @param newManagedAndroidLobApp the object to create/update
     * @return the created ManagedAndroidLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAndroidLobApp put(@Nonnull final ManagedAndroidLobApp newManagedAndroidLobApp) throws ClientException {
        return send(HttpMethod.PUT, newManagedAndroidLobApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedAndroidLobAppRequest select(@Nonnull final String value) {
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
     public ManagedAndroidLobAppRequest expand(@Nonnull final String value) {
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
    public ManagedAndroidLobAppRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ManagedAndroidLobAppRequest count() {
        addCountOption(true);
        return this;
    }
}

