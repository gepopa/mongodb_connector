
package pojos;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class MongodbBaseTree {

    @JsonProperty("_id")
    private MongodbId id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("processed")
    private boolean processed;
    @JsonProperty("processRequested")
    private ProcessRequested processRequested;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("blob")
    private String blob;
    @JsonProperty("code")
    private String code;


    public MongodbId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean getProcessed() {
        return processed;
    }

    public ProcessRequested getProcessRequested() {
        return processRequested;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getBlob() {
        return blob;
    }

    public String getCode() {
        return code;
    }

}