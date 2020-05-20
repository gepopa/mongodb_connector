
package pojos;


import com.fasterxml.jackson.annotation.JsonProperty;

public class MongodbBaseTree {

    @JsonProperty("_id")
    private MongodbId id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("processed")
    private String processed;
    @JsonProperty("processRequested")
    private String processRequested;
    @JsonProperty("lastModifiedDate")
    private String lastModifiedDate;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("blob")
    private String blob;
    @JsonProperty("code")
    private String code;
    @JsonProperty("processExecuting")
    private String processExecuting;

    public MongodbId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getProcessed() {
        return processed;
    }

    public String getProcessRequested() {
        return processRequested;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
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

    public String getProcessExecuting() {
        return processExecuting;
    }
}