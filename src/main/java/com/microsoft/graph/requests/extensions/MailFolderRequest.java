// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.requests.extensions.MailFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MailFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRuleRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Folder Request.
 */
public class MailFolderRequest extends BaseRequest<MailFolder> {
	
    /**
     * The request for the MailFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public MailFolderRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends MailFolder> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the MailFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MailFolderRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MailFolder.class);
    }

    /**
     * Gets the MailFolder from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MailFolder> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MailFolder from the service
     *
     * @return the MailFolder from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MailFolder get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MailFolder> callback) {
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
     * Patches this MailFolder with a source
     *
     * @param sourceMailFolder the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MailFolder sourceMailFolder, @Nonnull final ICallback<? super MailFolder> callback) {
        send(HttpMethod.PATCH, callback, sourceMailFolder);
    }

    /**
     * Patches this MailFolder with a source
     *
     * @param sourceMailFolder the source object with updates
     * @return the updated MailFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MailFolder patch(@Nonnull final MailFolder sourceMailFolder) throws ClientException {
        return send(HttpMethod.PATCH, sourceMailFolder);
    }

    /**
     * Creates a MailFolder with a new object
     *
     * @param newMailFolder the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MailFolder newMailFolder, @Nonnull final ICallback<? super MailFolder> callback) {
        send(HttpMethod.POST, callback, newMailFolder);
    }

    /**
     * Creates a MailFolder with a new object
     *
     * @param newMailFolder the new object to create
     * @return the created MailFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MailFolder post(@Nonnull final MailFolder newMailFolder) throws ClientException {
        return send(HttpMethod.POST, newMailFolder);
    }

    /**
     * Creates a MailFolder with a new object
     *
     * @param newMailFolder the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MailFolder newMailFolder, @Nonnull final ICallback<? super MailFolder> callback) {
        send(HttpMethod.PUT, callback, newMailFolder);
    }

    /**
     * Creates a MailFolder with a new object
     *
     * @param newMailFolder the object to create/update
     * @return the created MailFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MailFolder put(@Nonnull final MailFolder newMailFolder) throws ClientException {
        return send(HttpMethod.PUT, newMailFolder);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MailFolderRequest select(@Nonnull final String value) {
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
     public MailFolderRequest expand(@Nonnull final String value) {
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
    public MailFolderRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public MailFolderRequest count() {
        addCountOption(true);
        return this;
    }
}

