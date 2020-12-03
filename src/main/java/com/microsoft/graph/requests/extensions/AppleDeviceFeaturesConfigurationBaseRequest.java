// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppleDeviceFeaturesConfigurationBase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Device Features Configuration Base Request.
 */
public class AppleDeviceFeaturesConfigurationBaseRequest extends BaseRequest<AppleDeviceFeaturesConfigurationBase> {
	
    /**
     * The request for the AppleDeviceFeaturesConfigurationBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AppleDeviceFeaturesConfigurationBaseRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends AppleDeviceFeaturesConfigurationBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AppleDeviceFeaturesConfigurationBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppleDeviceFeaturesConfigurationBaseRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppleDeviceFeaturesConfigurationBase.class);
    }

    /**
     * Gets the AppleDeviceFeaturesConfigurationBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super AppleDeviceFeaturesConfigurationBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AppleDeviceFeaturesConfigurationBase from the service
     *
     * @return the AppleDeviceFeaturesConfigurationBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleDeviceFeaturesConfigurationBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super AppleDeviceFeaturesConfigurationBase> callback) {
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
     * Patches this AppleDeviceFeaturesConfigurationBase with a source
     *
     * @param sourceAppleDeviceFeaturesConfigurationBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final AppleDeviceFeaturesConfigurationBase sourceAppleDeviceFeaturesConfigurationBase, @Nonnull final ICallback<? super AppleDeviceFeaturesConfigurationBase> callback) {
        send(HttpMethod.PATCH, callback, sourceAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Patches this AppleDeviceFeaturesConfigurationBase with a source
     *
     * @param sourceAppleDeviceFeaturesConfigurationBase the source object with updates
     * @return the updated AppleDeviceFeaturesConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleDeviceFeaturesConfigurationBase patch(@Nonnull final AppleDeviceFeaturesConfigurationBase sourceAppleDeviceFeaturesConfigurationBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Creates a AppleDeviceFeaturesConfigurationBase with a new object
     *
     * @param newAppleDeviceFeaturesConfigurationBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final AppleDeviceFeaturesConfigurationBase newAppleDeviceFeaturesConfigurationBase, @Nonnull final ICallback<? super AppleDeviceFeaturesConfigurationBase> callback) {
        send(HttpMethod.POST, callback, newAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Creates a AppleDeviceFeaturesConfigurationBase with a new object
     *
     * @param newAppleDeviceFeaturesConfigurationBase the new object to create
     * @return the created AppleDeviceFeaturesConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleDeviceFeaturesConfigurationBase post(@Nonnull final AppleDeviceFeaturesConfigurationBase newAppleDeviceFeaturesConfigurationBase) throws ClientException {
        return send(HttpMethod.POST, newAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Creates a AppleDeviceFeaturesConfigurationBase with a new object
     *
     * @param newAppleDeviceFeaturesConfigurationBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final AppleDeviceFeaturesConfigurationBase newAppleDeviceFeaturesConfigurationBase, @Nonnull final ICallback<? super AppleDeviceFeaturesConfigurationBase> callback) {
        send(HttpMethod.PUT, callback, newAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Creates a AppleDeviceFeaturesConfigurationBase with a new object
     *
     * @param newAppleDeviceFeaturesConfigurationBase the object to create/update
     * @return the created AppleDeviceFeaturesConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleDeviceFeaturesConfigurationBase put(@Nonnull final AppleDeviceFeaturesConfigurationBase newAppleDeviceFeaturesConfigurationBase) throws ClientException {
        return send(HttpMethod.PUT, newAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AppleDeviceFeaturesConfigurationBaseRequest select(@Nonnull final String value) {
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
     public AppleDeviceFeaturesConfigurationBaseRequest expand(@Nonnull final String value) {
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
    public AppleDeviceFeaturesConfigurationBaseRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public AppleDeviceFeaturesConfigurationBaseRequest count() {
        addCountOption(true);
        return this;
    }
}

