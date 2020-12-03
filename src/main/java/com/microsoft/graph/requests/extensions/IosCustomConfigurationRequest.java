// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosCustomConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Custom Configuration Request.
 */
public class IosCustomConfigurationRequest extends BaseRequest<IosCustomConfiguration> {
	
    /**
     * The request for the IosCustomConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosCustomConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosCustomConfiguration.class);
    }

    /**
     * Gets the IosCustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super IosCustomConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosCustomConfiguration from the service
     *
     * @return the IosCustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCustomConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super IosCustomConfiguration> callback) {
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
     * Patches this IosCustomConfiguration with a source
     *
     * @param sourceIosCustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final IosCustomConfiguration sourceIosCustomConfiguration, @Nonnull final ICallback<? super IosCustomConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceIosCustomConfiguration);
    }

    /**
     * Patches this IosCustomConfiguration with a source
     *
     * @param sourceIosCustomConfiguration the source object with updates
     * @return the updated IosCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCustomConfiguration patch(@Nonnull final IosCustomConfiguration sourceIosCustomConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosCustomConfiguration);
    }

    /**
     * Creates a IosCustomConfiguration with a new object
     *
     * @param newIosCustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final IosCustomConfiguration newIosCustomConfiguration, @Nonnull final ICallback<? super IosCustomConfiguration> callback) {
        send(HttpMethod.POST, callback, newIosCustomConfiguration);
    }

    /**
     * Creates a IosCustomConfiguration with a new object
     *
     * @param newIosCustomConfiguration the new object to create
     * @return the created IosCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCustomConfiguration post(@Nonnull final IosCustomConfiguration newIosCustomConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosCustomConfiguration);
    }

    /**
     * Creates a IosCustomConfiguration with a new object
     *
     * @param newIosCustomConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final IosCustomConfiguration newIosCustomConfiguration, @Nonnull final ICallback<? super IosCustomConfiguration> callback) {
        send(HttpMethod.PUT, callback, newIosCustomConfiguration);
    }

    /**
     * Creates a IosCustomConfiguration with a new object
     *
     * @param newIosCustomConfiguration the object to create/update
     * @return the created IosCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCustomConfiguration put(@Nonnull final IosCustomConfiguration newIosCustomConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosCustomConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosCustomConfigurationRequest select(@Nonnull final String value) {
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
     public IosCustomConfigurationRequest expand(@Nonnull final String value) {
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
    public IosCustomConfigurationRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public IosCustomConfigurationRequest count() {
        addCountOption(true);
        return this;
    }
}

