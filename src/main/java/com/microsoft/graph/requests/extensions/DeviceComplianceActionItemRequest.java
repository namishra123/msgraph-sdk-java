// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceComplianceActionItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Action Item Request.
 */
public class DeviceComplianceActionItemRequest extends BaseRequest<DeviceComplianceActionItem> {
	
    /**
     * The request for the DeviceComplianceActionItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceActionItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceActionItem.class);
    }

    /**
     * Gets the DeviceComplianceActionItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceComplianceActionItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceComplianceActionItem from the service
     *
     * @return the DeviceComplianceActionItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceActionItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceComplianceActionItem> callback) {
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
     * Patches this DeviceComplianceActionItem with a source
     *
     * @param sourceDeviceComplianceActionItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceComplianceActionItem sourceDeviceComplianceActionItem, @Nonnull final ICallback<? super DeviceComplianceActionItem> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceComplianceActionItem);
    }

    /**
     * Patches this DeviceComplianceActionItem with a source
     *
     * @param sourceDeviceComplianceActionItem the source object with updates
     * @return the updated DeviceComplianceActionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceActionItem patch(@Nonnull final DeviceComplianceActionItem sourceDeviceComplianceActionItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComplianceActionItem);
    }

    /**
     * Creates a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceComplianceActionItem newDeviceComplianceActionItem, @Nonnull final ICallback<? super DeviceComplianceActionItem> callback) {
        send(HttpMethod.POST, callback, newDeviceComplianceActionItem);
    }

    /**
     * Creates a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the new object to create
     * @return the created DeviceComplianceActionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceActionItem post(@Nonnull final DeviceComplianceActionItem newDeviceComplianceActionItem) throws ClientException {
        return send(HttpMethod.POST, newDeviceComplianceActionItem);
    }

    /**
     * Creates a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceComplianceActionItem newDeviceComplianceActionItem, @Nonnull final ICallback<? super DeviceComplianceActionItem> callback) {
        send(HttpMethod.PUT, callback, newDeviceComplianceActionItem);
    }

    /**
     * Creates a DeviceComplianceActionItem with a new object
     *
     * @param newDeviceComplianceActionItem the object to create/update
     * @return the created DeviceComplianceActionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceActionItem put(@Nonnull final DeviceComplianceActionItem newDeviceComplianceActionItem) throws ClientException {
        return send(HttpMethod.PUT, newDeviceComplianceActionItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceComplianceActionItemRequest select(@Nonnull final String value) {
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
     public DeviceComplianceActionItemRequest expand(@Nonnull final String value) {
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
    public DeviceComplianceActionItemRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public DeviceComplianceActionItemRequest count() {
        addCountOption(true);
        return this;
    }
}

