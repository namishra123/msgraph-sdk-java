// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.requests.extensions.EducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School Request.
 */
public class EducationSchoolRequest extends BaseRequest<EducationSchool> {
	
    /**
     * The request for the EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSchoolRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSchool.class);
    }

    /**
     * Gets the EducationSchool from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super EducationSchool> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationSchool from the service
     *
     * @return the EducationSchool from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationSchool get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super EducationSchool> callback) {
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
     * Patches this EducationSchool with a source
     *
     * @param sourceEducationSchool the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final EducationSchool sourceEducationSchool, @Nonnull final ICallback<? super EducationSchool> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationSchool);
    }

    /**
     * Patches this EducationSchool with a source
     *
     * @param sourceEducationSchool the source object with updates
     * @return the updated EducationSchool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationSchool patch(@Nonnull final EducationSchool sourceEducationSchool) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationSchool);
    }

    /**
     * Creates a EducationSchool with a new object
     *
     * @param newEducationSchool the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final EducationSchool newEducationSchool, @Nonnull final ICallback<? super EducationSchool> callback) {
        send(HttpMethod.POST, callback, newEducationSchool);
    }

    /**
     * Creates a EducationSchool with a new object
     *
     * @param newEducationSchool the new object to create
     * @return the created EducationSchool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationSchool post(@Nonnull final EducationSchool newEducationSchool) throws ClientException {
        return send(HttpMethod.POST, newEducationSchool);
    }

    /**
     * Creates a EducationSchool with a new object
     *
     * @param newEducationSchool the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final EducationSchool newEducationSchool, @Nonnull final ICallback<? super EducationSchool> callback) {
        send(HttpMethod.PUT, callback, newEducationSchool);
    }

    /**
     * Creates a EducationSchool with a new object
     *
     * @param newEducationSchool the object to create/update
     * @return the created EducationSchool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationSchool put(@Nonnull final EducationSchool newEducationSchool) throws ClientException {
        return send(HttpMethod.PUT, newEducationSchool);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EducationSchoolRequest select(@Nonnull final String value) {
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
     public EducationSchoolRequest expand(@Nonnull final String value) {
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
    public EducationSchoolRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public EducationSchoolRequest count() {
        addCountOption(true);
        return this;
    }
}

