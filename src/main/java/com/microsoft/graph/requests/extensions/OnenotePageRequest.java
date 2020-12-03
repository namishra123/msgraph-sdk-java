// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnenotePage;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.models.extensions.OnenotePatchContentCommand;
import com.microsoft.graph.models.extensions.OnenotePagePreview;
import com.microsoft.graph.requests.extensions.NotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Page Request.
 */
public class OnenotePageRequest extends BaseRequest<OnenotePage> {
	
    /**
     * The request for the OnenotePage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenotePageRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenotePage.class);
    }

    /**
     * Gets the OnenotePage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super OnenotePage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OnenotePage from the service
     *
     * @return the OnenotePage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenotePage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super OnenotePage> callback) {
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
     * Patches this OnenotePage with a source
     *
     * @param sourceOnenotePage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final OnenotePage sourceOnenotePage, @Nonnull final ICallback<? super OnenotePage> callback) {
        send(HttpMethod.PATCH, callback, sourceOnenotePage);
    }

    /**
     * Patches this OnenotePage with a source
     *
     * @param sourceOnenotePage the source object with updates
     * @return the updated OnenotePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenotePage patch(@Nonnull final OnenotePage sourceOnenotePage) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     *
     * @param newOnenotePage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final byte[] newOnenotePage, @Nonnull final ICallback<? super OnenotePage> callback) {
        send(HttpMethod.POST, callback, newOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     *
     * @param newOnenotePage the new object to create
     * @return the created OnenotePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenotePage post(@Nonnull final byte[] newOnenotePage) throws ClientException {
        return send(HttpMethod.POST, newOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     *
     * @param newOnenotePage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final OnenotePage newOnenotePage, @Nonnull final ICallback<? super OnenotePage> callback) {
        send(HttpMethod.PUT, callback, newOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     *
     * @param newOnenotePage the object to create/update
     * @return the created OnenotePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenotePage put(@Nonnull final OnenotePage newOnenotePage) throws ClientException {
        return send(HttpMethod.PUT, newOnenotePage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OnenotePageRequest select(@Nonnull final String value) {
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
     public OnenotePageRequest expand(@Nonnull final String value) {
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
    public OnenotePageRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public OnenotePageRequest count() {
        addCountOption(true);
        return this;
    }
}

