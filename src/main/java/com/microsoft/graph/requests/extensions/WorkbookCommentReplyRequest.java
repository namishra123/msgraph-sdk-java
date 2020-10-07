// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookCommentReply;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Comment Reply Request.
 */
public class WorkbookCommentReplyRequest extends BaseRequest {
	
    /**
     * The request for the WorkbookCommentReply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookCommentReplyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookCommentReply.class);
    }

    /**
     * Gets the WorkbookCommentReply from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookCommentReply> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookCommentReply from the service
     *
     * @return the WorkbookCommentReply from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookCommentReply get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookCommentReply> callback) {
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
     * Patches this WorkbookCommentReply with a source
     *
     * @param sourceWorkbookCommentReply the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookCommentReply sourceWorkbookCommentReply, final ICallback<? super WorkbookCommentReply> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookCommentReply);
    }

    /**
     * Patches this WorkbookCommentReply with a source
     *
     * @param sourceWorkbookCommentReply the source object with updates
     * @return the updated WorkbookCommentReply
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookCommentReply patch(final WorkbookCommentReply sourceWorkbookCommentReply) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookCommentReply);
    }

    /**
     * Creates a WorkbookCommentReply with a new object
     *
     * @param newWorkbookCommentReply the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookCommentReply newWorkbookCommentReply, final ICallback<? super WorkbookCommentReply> callback) {
        send(HttpMethod.POST, callback, newWorkbookCommentReply);
    }

    /**
     * Creates a WorkbookCommentReply with a new object
     *
     * @param newWorkbookCommentReply the new object to create
     * @return the created WorkbookCommentReply
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookCommentReply post(final WorkbookCommentReply newWorkbookCommentReply) throws ClientException {
        return send(HttpMethod.POST, newWorkbookCommentReply);
    }

    /**
     * Creates a WorkbookCommentReply with a new object
     *
     * @param newWorkbookCommentReply the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookCommentReply newWorkbookCommentReply, final ICallback<? super WorkbookCommentReply> callback) {
        send(HttpMethod.PUT, callback, newWorkbookCommentReply);
    }

    /**
     * Creates a WorkbookCommentReply with a new object
     *
     * @param newWorkbookCommentReply the object to create/update
     * @return the created WorkbookCommentReply
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookCommentReply put(final WorkbookCommentReply newWorkbookCommentReply) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookCommentReply);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public WorkbookCommentReplyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookCommentReplyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public WorkbookCommentReplyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookCommentReplyRequest)this;
     }

}

