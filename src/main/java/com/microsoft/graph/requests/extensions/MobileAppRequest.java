// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.MobileAppAssignment;
import com.microsoft.graph.requests.extensions.MobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Request.
 */
public class MobileAppRequest extends BaseRequest<MobileApp> {
	
    /**
     * The request for the MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public MobileAppRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends MobileApp> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileApp.class);
    }

    /**
     * Gets the MobileApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MobileApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileApp from the service
     *
     * @return the MobileApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MobileApp> callback) {
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
     * Patches this MobileApp with a source
     *
     * @param sourceMobileApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MobileApp sourceMobileApp, @Nonnull final ICallback<? super MobileApp> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileApp);
    }

    /**
     * Patches this MobileApp with a source
     *
     * @param sourceMobileApp the source object with updates
     * @return the updated MobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileApp patch(@Nonnull final MobileApp sourceMobileApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileApp);
    }

    /**
     * Creates a MobileApp with a new object
     *
     * @param newMobileApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MobileApp newMobileApp, @Nonnull final ICallback<? super MobileApp> callback) {
        send(HttpMethod.POST, callback, newMobileApp);
    }

    /**
     * Creates a MobileApp with a new object
     *
     * @param newMobileApp the new object to create
     * @return the created MobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileApp post(@Nonnull final MobileApp newMobileApp) throws ClientException {
        return send(HttpMethod.POST, newMobileApp);
    }

    /**
     * Creates a MobileApp with a new object
     *
     * @param newMobileApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MobileApp newMobileApp, @Nonnull final ICallback<? super MobileApp> callback) {
        send(HttpMethod.PUT, callback, newMobileApp);
    }

    /**
     * Creates a MobileApp with a new object
     *
     * @param newMobileApp the object to create/update
     * @return the created MobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileApp put(@Nonnull final MobileApp newMobileApp) throws ClientException {
        return send(HttpMethod.PUT, newMobileApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MobileAppRequest select(@Nonnull final String value) {
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
     public MobileAppRequest expand(@Nonnull final String value) {
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
    public MobileAppRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public MobileAppRequest count() {
        addCountOption(true);
        return this;
    }
}

