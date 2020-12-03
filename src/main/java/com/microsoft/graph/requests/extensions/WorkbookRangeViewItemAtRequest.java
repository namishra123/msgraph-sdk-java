// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookRangeView;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewItemAtRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range View Item At Request.
 */
public class WorkbookRangeViewItemAtRequest extends BaseRequest<WorkbookRangeView> {

    /**
     * The request for this WorkbookRangeViewItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeViewItemAtRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeView.class);
    }

    /**
     * Patches the WorkbookRangeViewItemAt
     * @param srcWorkbookRangeView the WorkbookRangeView with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull WorkbookRangeView srcWorkbookRangeView, @Nonnull final ICallback<? super WorkbookRangeView> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookRangeView);
    }

    /**
     * Patches the WorkbookRangeViewItemAt
     *
     * @param srcWorkbookRangeView the WorkbookRangeView with which to PATCH
     * @return the WorkbookRangeView
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public WorkbookRangeView patch(@Nonnull final WorkbookRangeView srcWorkbookRangeView) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookRangeView);
    }

    /**
     * Puts the WorkbookRangeViewItemAt
     *
     * @param srcWorkbookRangeView the WorkbookRangeView to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WorkbookRangeView srcWorkbookRangeView, @Nonnull final ICallback<? super WorkbookRangeView> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookRangeView);
    }

    /**
     * Puts the WorkbookRangeViewItemAt
     *
     * @param srcWorkbookRangeView the WorkbookRangeView to PUT
     * @return the WorkbookRangeView
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public WorkbookRangeView put(@Nonnull final WorkbookRangeView srcWorkbookRangeView) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookRangeView);
    }
    /**
     * Gets the WorkbookRangeView
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WorkbookRangeView> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRangeView
     *
     * @return the WorkbookRangeView
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public WorkbookRangeView get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookRangeViewItemAtRequest select(@Nonnull final String value) {
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
    public WorkbookRangeViewItemAtRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookRangeViewItemAtRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookRangeViewItemAtRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public WorkbookRangeViewItemAtRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public WorkbookRangeViewItemAtRequest count() {
        addCountOption(true);
        return this;
    }
}
