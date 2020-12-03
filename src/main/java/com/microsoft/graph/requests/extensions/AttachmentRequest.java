// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.models.extensions.AttachmentItem;
import com.microsoft.graph.models.extensions.UploadSession;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attachment Request.
 */
public class AttachmentRequest extends BaseRequest<Attachment> {
	
    /**
     * The request for the Attachment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AttachmentRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends Attachment> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Attachment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AttachmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Attachment.class);
    }

    /**
     * Gets the Attachment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Attachment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Attachment from the service
     *
     * @return the Attachment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Attachment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super Attachment> callback) {
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
     * Patches this Attachment with a source
     *
     * @param sourceAttachment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final Attachment sourceAttachment, @Nonnull final ICallback<? super Attachment> callback) {
        send(HttpMethod.PATCH, callback, sourceAttachment);
    }

    /**
     * Patches this Attachment with a source
     *
     * @param sourceAttachment the source object with updates
     * @return the updated Attachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Attachment patch(@Nonnull final Attachment sourceAttachment) throws ClientException {
        return send(HttpMethod.PATCH, sourceAttachment);
    }

    /**
     * Creates a Attachment with a new object
     *
     * @param newAttachment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final Attachment newAttachment, @Nonnull final ICallback<? super Attachment> callback) {
        send(HttpMethod.POST, callback, newAttachment);
    }

    /**
     * Creates a Attachment with a new object
     *
     * @param newAttachment the new object to create
     * @return the created Attachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Attachment post(@Nonnull final Attachment newAttachment) throws ClientException {
        return send(HttpMethod.POST, newAttachment);
    }

    /**
     * Creates a Attachment with a new object
     *
     * @param newAttachment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Attachment newAttachment, @Nonnull final ICallback<? super Attachment> callback) {
        send(HttpMethod.PUT, callback, newAttachment);
    }

    /**
     * Creates a Attachment with a new object
     *
     * @param newAttachment the object to create/update
     * @return the created Attachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Attachment put(@Nonnull final Attachment newAttachment) throws ClientException {
        return send(HttpMethod.PUT, newAttachment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AttachmentRequest select(@Nonnull final String value) {
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
     public AttachmentRequest expand(@Nonnull final String value) {
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
    public AttachmentRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public AttachmentRequest count() {
        addCountOption(true);
        return this;
    }
}

