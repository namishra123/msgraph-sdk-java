// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Message Rule Actions.
 */
public class BaseMessageRuleActions implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Move To Folder.
     * The ID of the folder that a message will be moved to.
     */
    @SerializedName("moveToFolder")
    @Expose
    public String moveToFolder;

    /**
     * The Copy To Folder.
     * The ID of a folder that a message is to be copied to.
     */
    @SerializedName("copyToFolder")
    @Expose
    public String copyToFolder;

    /**
     * The Delete.
     * Indicates whether a message should be moved to the Deleted Items folder.
     */
    @SerializedName("delete")
    @Expose
    public Boolean delete;

    /**
     * The Permanent Delete.
     * Indicates whether a message should be permanently deleted and not saved to the Deleted Items folder.
     */
    @SerializedName("permanentDelete")
    @Expose
    public Boolean permanentDelete;

    /**
     * The Mark As Read.
     * Indicates whether a message should be marked as read.
     */
    @SerializedName("markAsRead")
    @Expose
    public Boolean markAsRead;

    /**
     * The Mark Importance.
     * Sets the importance of the message, which can be: low, normal, high.
     */
    @SerializedName("markImportance")
    @Expose
    public Importance markImportance;

    /**
     * The Forward To.
     * The email addresses of the recipients to which a message should be forwarded.
     */
    @SerializedName("forwardTo")
    @Expose
    public java.util.List<Recipient> forwardTo;

    /**
     * The Forward As Attachment To.
     * The email addresses of the recipients to which a message should be forwarded as an attachment.
     */
    @SerializedName("forwardAsAttachmentTo")
    @Expose
    public java.util.List<Recipient> forwardAsAttachmentTo;

    /**
     * The Redirect To.
     * The email address to which a message should be redirected.
     */
    @SerializedName("redirectTo")
    @Expose
    public java.util.List<Recipient> redirectTo;

    /**
     * The Assign Categories.
     * A list of categories to be assigned to a message.
     */
    @SerializedName("assignCategories")
    @Expose
    public java.util.List<String> assignCategories;

    /**
     * The Stop Processing Rules.
     * Indicates whether subsequent rules should be evaluated.
     */
    @SerializedName("stopProcessingRules")
    @Expose
    public Boolean stopProcessingRules;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}