// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedIOSStoreApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed IOSStore App Request.
 */
public class ManagedIOSStoreAppRequest extends BaseRequest<ManagedIOSStoreApp> {
	
    /**
     * The request for the ManagedIOSStoreApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedIOSStoreAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedIOSStoreApp.class);
    }

    /**
     * Gets the ManagedIOSStoreApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ManagedIOSStoreApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedIOSStoreApp from the service
     *
     * @return the ManagedIOSStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedIOSStoreApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ManagedIOSStoreApp> callback) {
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
     * Patches this ManagedIOSStoreApp with a source
     *
     * @param sourceManagedIOSStoreApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ManagedIOSStoreApp sourceManagedIOSStoreApp, @Nonnull final ICallback<? super ManagedIOSStoreApp> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedIOSStoreApp);
    }

    /**
     * Patches this ManagedIOSStoreApp with a source
     *
     * @param sourceManagedIOSStoreApp the source object with updates
     * @return the updated ManagedIOSStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedIOSStoreApp patch(@Nonnull final ManagedIOSStoreApp sourceManagedIOSStoreApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedIOSStoreApp);
    }

    /**
     * Creates a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ManagedIOSStoreApp newManagedIOSStoreApp, @Nonnull final ICallback<? super ManagedIOSStoreApp> callback) {
        send(HttpMethod.POST, callback, newManagedIOSStoreApp);
    }

    /**
     * Creates a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the new object to create
     * @return the created ManagedIOSStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedIOSStoreApp post(@Nonnull final ManagedIOSStoreApp newManagedIOSStoreApp) throws ClientException {
        return send(HttpMethod.POST, newManagedIOSStoreApp);
    }

    /**
     * Creates a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ManagedIOSStoreApp newManagedIOSStoreApp, @Nonnull final ICallback<? super ManagedIOSStoreApp> callback) {
        send(HttpMethod.PUT, callback, newManagedIOSStoreApp);
    }

    /**
     * Creates a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the object to create/update
     * @return the created ManagedIOSStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedIOSStoreApp put(@Nonnull final ManagedIOSStoreApp newManagedIOSStoreApp) throws ClientException {
        return send(HttpMethod.PUT, newManagedIOSStoreApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedIOSStoreAppRequest select(@Nonnull final String value) {
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
     public ManagedIOSStoreAppRequest expand(@Nonnull final String value) {
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
    public ManagedIOSStoreAppRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ManagedIOSStoreAppRequest count() {
        addCountOption(true);
        return this;
    }
}

