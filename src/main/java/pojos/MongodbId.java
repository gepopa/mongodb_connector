package pojos;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "$oid"
})
public class MongodbId {

    @JsonProperty("$oid")
    private String $oid;


    public String get$oid() {
        return $oid;
    }
}