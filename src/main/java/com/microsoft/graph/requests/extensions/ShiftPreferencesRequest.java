// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ShiftPreferences;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shift Preferences Request.
 */
public class ShiftPreferencesRequest extends BaseRequest<ShiftPreferences> {
	
    /**
     * The request for the ShiftPreferences
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ShiftPreferencesRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ShiftPreferences.class);
    }

    /**
     * Gets the ShiftPreferences from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ShiftPreferences> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ShiftPreferences from the service
     *
     * @return the ShiftPreferences from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ShiftPreferences get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ShiftPreferences> callback) {
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
     * Patches this ShiftPreferences with a source
     *
     * @param sourceShiftPreferences the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ShiftPreferences sourceShiftPreferences, @Nonnull final ICallback<? super ShiftPreferences> callback) {
        send(HttpMethod.PATCH, callback, sourceShiftPreferences);
    }

    /**
     * Patches this ShiftPreferences with a source
     *
     * @param sourceShiftPreferences the source object with updates
     * @return the updated ShiftPreferences
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ShiftPreferences patch(@Nonnull final ShiftPreferences sourceShiftPreferences) throws ClientException {
        return send(HttpMethod.PATCH, sourceShiftPreferences);
    }

    /**
     * Creates a ShiftPreferences with a new object
     *
     * @param newShiftPreferences the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ShiftPreferences newShiftPreferences, @Nonnull final ICallback<? super ShiftPreferences> callback) {
        send(HttpMethod.POST, callback, newShiftPreferences);
    }

    /**
     * Creates a ShiftPreferences with a new object
     *
     * @param newShiftPreferences the new object to create
     * @return the created ShiftPreferences
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ShiftPreferences post(@Nonnull final ShiftPreferences newShiftPreferences) throws ClientException {
        return send(HttpMethod.POST, newShiftPreferences);
    }

    /**
     * Creates a ShiftPreferences with a new object
     *
     * @param newShiftPreferences the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ShiftPreferences newShiftPreferences, @Nonnull final ICallback<? super ShiftPreferences> callback) {
        send(HttpMethod.PUT, callback, newShiftPreferences);
    }

    /**
     * Creates a ShiftPreferences with a new object
     *
     * @param newShiftPreferences the object to create/update
     * @return the created ShiftPreferences
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ShiftPreferences put(@Nonnull final ShiftPreferences newShiftPreferences) throws ClientException {
        return send(HttpMethod.PUT, newShiftPreferences);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ShiftPreferencesRequest select(@Nonnull final String value) {
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
     public ShiftPreferencesRequest expand(@Nonnull final String value) {
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
    public ShiftPreferencesRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ShiftPreferencesRequest count() {
        addCountOption(true);
        return this;
    }
}

