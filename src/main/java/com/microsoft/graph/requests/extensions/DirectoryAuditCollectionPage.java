// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DirectoryAudit;
import com.microsoft.graph.requests.extensions.DirectoryAuditCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryAuditCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryAuditCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Audit Collection Page.
 */
public class DirectoryAuditCollectionPage extends BaseCollectionPage<DirectoryAudit, DirectoryAuditCollectionRequestBuilder> {

    /**
     * A collection page for DirectoryAudit
     *
     * @param response the serialized DirectoryAuditCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectoryAuditCollectionPage(final DirectoryAuditCollectionResponse response, final DirectoryAuditCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
