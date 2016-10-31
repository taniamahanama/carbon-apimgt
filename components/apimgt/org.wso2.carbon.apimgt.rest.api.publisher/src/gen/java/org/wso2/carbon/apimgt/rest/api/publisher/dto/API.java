package org.wso2.carbon.apimgt.rest.api.publisher.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.rest.api.publisher.dto.APIBusinessInformation;
import org.wso2.carbon.apimgt.rest.api.publisher.dto.APICorsConfiguration;
import org.wso2.carbon.apimgt.rest.api.publisher.dto.APIEndpointSecurity;
import org.wso2.carbon.apimgt.rest.api.publisher.dto.APIMaxTps;
import org.wso2.carbon.apimgt.rest.api.publisher.dto.Sequence;

/**
 * API
 */
@javax.annotation.Generated(value = "class org.wso2.maven.plugins.JavaMSF4JServerCodegen", date = "2016-10-26T15:09:45.077+05:30")
public class API   {
  private String id = null;

  private String name = null;

  private String description = null;

  private String context = null;

  private String version = null;

  private String provider = null;

  private String apiDefinition = null;

  private String wsdlUri = null;

  private String status = null;

  private String responseCaching = null;

  private Integer cacheTimeout = null;

  private String destinationStatsEnabled = null;

  private Boolean isDefaultVersion = null;

  private List<String> transport = new ArrayList<String>();

  private List<String> tags = new ArrayList<String>();

  private List<String> tiers = new ArrayList<String>();

  private APIMaxTps maxTps = null;

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE"),
    
    RESTRICTED("RESTRICTED"),
    
    CONTROLLED("CONTROLLED");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VisibilityEnum fromValue(String text) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  private VisibilityEnum visibility = null;

  private List<String> visibleRoles = new ArrayList<String>();

  private List<String> visibleTenants = new ArrayList<String>();

  private String endpointConfig = null;

  private APIEndpointSecurity endpointSecurity = null;

  private String gatewayEnvironments = null;

  private List<Sequence> sequences = new ArrayList<Sequence>();

  private APIBusinessInformation businessInformation = null;

  private APICorsConfiguration corsConfiguration = null;

  public API id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID of the api registry artifact 
   * @return id
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "UUID of the api registry artifact ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public API name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "CalculatorAPI", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public API description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "A calculator API that supports basic operations", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public API context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(example = "CalculatorAPI", required = true, value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public API version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "1.0.0", required = true, value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public API provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * If the provider value is not given user invoking the api will be used as the provider. 
   * @return provider
  **/
  @ApiModelProperty(example = "admin", value = "If the provider value is not given user invoking the api will be used as the provider. ")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public API apiDefinition(String apiDefinition) {
    this.apiDefinition = apiDefinition;
    return this;
  }

   /**
   * Swagger definition of the API which contains details about URI templates and scopes 
   * @return apiDefinition
  **/
  @ApiModelProperty(example = "", required = true, value = "Swagger definition of the API which contains details about URI templates and scopes ")
  public String getApiDefinition() {
    return apiDefinition;
  }

  public void setApiDefinition(String apiDefinition) {
    this.apiDefinition = apiDefinition;
  }

  public API wsdlUri(String wsdlUri) {
    this.wsdlUri = wsdlUri;
    return this;
  }

   /**
   * WSDL URL if the API is based on a WSDL endpoint 
   * @return wsdlUri
  **/
  @ApiModelProperty(example = "http://www.webservicex.com/globalweather.asmx?wsdl", value = "WSDL URL if the API is based on a WSDL endpoint ")
  public String getWsdlUri() {
    return wsdlUri;
  }

  public void setWsdlUri(String wsdlUri) {
    this.wsdlUri = wsdlUri;
  }

  public API status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "CREATED", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public API responseCaching(String responseCaching) {
    this.responseCaching = responseCaching;
    return this;
  }

   /**
   * Get responseCaching
   * @return responseCaching
  **/
  @ApiModelProperty(example = "Disabled", value = "")
  public String getResponseCaching() {
    return responseCaching;
  }

  public void setResponseCaching(String responseCaching) {
    this.responseCaching = responseCaching;
  }

  public API cacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

   /**
   * Get cacheTimeout
   * @return cacheTimeout
  **/
  @ApiModelProperty(example = "300", value = "")
  public Integer getCacheTimeout() {
    return cacheTimeout;
  }

  public void setCacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }

  public API destinationStatsEnabled(String destinationStatsEnabled) {
    this.destinationStatsEnabled = destinationStatsEnabled;
    return this;
  }

   /**
   * Get destinationStatsEnabled
   * @return destinationStatsEnabled
  **/
  @ApiModelProperty(example = "Disabled", value = "")
  public String getDestinationStatsEnabled() {
    return destinationStatsEnabled;
  }

  public void setDestinationStatsEnabled(String destinationStatsEnabled) {
    this.destinationStatsEnabled = destinationStatsEnabled;
  }

  public API isDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
    return this;
  }

   /**
   * Get isDefaultVersion
   * @return isDefaultVersion
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getIsDefaultVersion() {
    return isDefaultVersion;
  }

  public void setIsDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
  }

  public API transport(List<String> transport) {
    this.transport = transport;
    return this;
  }

  public API addTransportItem(String transportItem) {
    this.transport.add(transportItem);
    return this;
  }

   /**
   * Supported transports for the API (http and/or https). 
   * @return transport
  **/
  @ApiModelProperty(required = true, value = "Supported transports for the API (http and/or https). ")
  public List<String> getTransport() {
    return transport;
  }

  public void setTransport(List<String> transport) {
    this.transport = transport;
  }

  public API tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public API addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public API tiers(List<String> tiers) {
    this.tiers = tiers;
    return this;
  }

  public API addTiersItem(String tiersItem) {
    this.tiers.add(tiersItem);
    return this;
  }

   /**
   * Get tiers
   * @return tiers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getTiers() {
    return tiers;
  }

  public void setTiers(List<String> tiers) {
    this.tiers = tiers;
  }

  public API maxTps(APIMaxTps maxTps) {
    this.maxTps = maxTps;
    return this;
  }

   /**
   * Get maxTps
   * @return maxTps
  **/
  @ApiModelProperty(value = "")
  public APIMaxTps getMaxTps() {
    return maxTps;
  }

  public void setMaxTps(APIMaxTps maxTps) {
    this.maxTps = maxTps;
  }

  public API visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @ApiModelProperty(example = "PUBLIC", required = true, value = "")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public API visibleRoles(List<String> visibleRoles) {
    this.visibleRoles = visibleRoles;
    return this;
  }

  public API addVisibleRolesItem(String visibleRolesItem) {
    this.visibleRoles.add(visibleRolesItem);
    return this;
  }

   /**
   * Get visibleRoles
   * @return visibleRoles
  **/
  @ApiModelProperty(value = "")
  public List<String> getVisibleRoles() {
    return visibleRoles;
  }

  public void setVisibleRoles(List<String> visibleRoles) {
    this.visibleRoles = visibleRoles;
  }

  public API visibleTenants(List<String> visibleTenants) {
    this.visibleTenants = visibleTenants;
    return this;
  }

  public API addVisibleTenantsItem(String visibleTenantsItem) {
    this.visibleTenants.add(visibleTenantsItem);
    return this;
  }

   /**
   * Get visibleTenants
   * @return visibleTenants
  **/
  @ApiModelProperty(value = "")
  public List<String> getVisibleTenants() {
    return visibleTenants;
  }

  public void setVisibleTenants(List<String> visibleTenants) {
    this.visibleTenants = visibleTenants;
  }

  public API endpointConfig(String endpointConfig) {
    this.endpointConfig = endpointConfig;
    return this;
  }

   /**
   * Get endpointConfig
   * @return endpointConfig
  **/
  @ApiModelProperty(example = "{&quot;production_endpoints&quot;:{&quot;url&quot;:&quot;https://127.0.0.1:9443/am/sample/calculator/v1/api&quot;,&quot;config&quot;:null},&quot;implementation_status&quot;:&quot;managed&quot;,&quot;endpoint_type&quot;:&quot;http&quot;}", required = true, value = "")
  public String getEndpointConfig() {
    return endpointConfig;
  }

  public void setEndpointConfig(String endpointConfig) {
    this.endpointConfig = endpointConfig;
  }

  public API endpointSecurity(APIEndpointSecurity endpointSecurity) {
    this.endpointSecurity = endpointSecurity;
    return this;
  }

   /**
   * Get endpointSecurity
   * @return endpointSecurity
  **/
  @ApiModelProperty(value = "")
  public APIEndpointSecurity getEndpointSecurity() {
    return endpointSecurity;
  }

  public void setEndpointSecurity(APIEndpointSecurity endpointSecurity) {
    this.endpointSecurity = endpointSecurity;
  }

  public API gatewayEnvironments(String gatewayEnvironments) {
    this.gatewayEnvironments = gatewayEnvironments;
    return this;
  }

   /**
   * Comma separated list of gateway environments. 
   * @return gatewayEnvironments
  **/
  @ApiModelProperty(example = "Production and Sandbox", value = "Comma separated list of gateway environments. ")
  public String getGatewayEnvironments() {
    return gatewayEnvironments;
  }

  public void setGatewayEnvironments(String gatewayEnvironments) {
    this.gatewayEnvironments = gatewayEnvironments;
  }

  public API sequences(List<Sequence> sequences) {
    this.sequences = sequences;
    return this;
  }

  public API addSequencesItem(Sequence sequencesItem) {
    this.sequences.add(sequencesItem);
    return this;
  }

   /**
   * Get sequences
   * @return sequences
  **/
  @ApiModelProperty(value = "")
  public List<Sequence> getSequences() {
    return sequences;
  }

  public void setSequences(List<Sequence> sequences) {
    this.sequences = sequences;
  }

  public API businessInformation(APIBusinessInformation businessInformation) {
    this.businessInformation = businessInformation;
    return this;
  }

   /**
   * Get businessInformation
   * @return businessInformation
  **/
  @ApiModelProperty(value = "")
  public APIBusinessInformation getBusinessInformation() {
    return businessInformation;
  }

  public void setBusinessInformation(APIBusinessInformation businessInformation) {
    this.businessInformation = businessInformation;
  }

  public API corsConfiguration(APICorsConfiguration corsConfiguration) {
    this.corsConfiguration = corsConfiguration;
    return this;
  }

   /**
   * Get corsConfiguration
   * @return corsConfiguration
  **/
  @ApiModelProperty(value = "")
  public APICorsConfiguration getCorsConfiguration() {
    return corsConfiguration;
  }

  public void setCorsConfiguration(APICorsConfiguration corsConfiguration) {
    this.corsConfiguration = corsConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    API API = (API) o;
    return Objects.equals(this.id, API.id) &&
        Objects.equals(this.name, API.name) &&
        Objects.equals(this.description, API.description) &&
        Objects.equals(this.context, API.context) &&
        Objects.equals(this.version, API.version) &&
        Objects.equals(this.provider, API.provider) &&
        Objects.equals(this.apiDefinition, API.apiDefinition) &&
        Objects.equals(this.wsdlUri, API.wsdlUri) &&
        Objects.equals(this.status, API.status) &&
        Objects.equals(this.responseCaching, API.responseCaching) &&
        Objects.equals(this.cacheTimeout, API.cacheTimeout) &&
        Objects.equals(this.destinationStatsEnabled, API.destinationStatsEnabled) &&
        Objects.equals(this.isDefaultVersion, API.isDefaultVersion) &&
        Objects.equals(this.transport, API.transport) &&
        Objects.equals(this.tags, API.tags) &&
        Objects.equals(this.tiers, API.tiers) &&
        Objects.equals(this.maxTps, API.maxTps) &&
        Objects.equals(this.visibility, API.visibility) &&
        Objects.equals(this.visibleRoles, API.visibleRoles) &&
        Objects.equals(this.visibleTenants, API.visibleTenants) &&
        Objects.equals(this.endpointConfig, API.endpointConfig) &&
        Objects.equals(this.endpointSecurity, API.endpointSecurity) &&
        Objects.equals(this.gatewayEnvironments, API.gatewayEnvironments) &&
        Objects.equals(this.sequences, API.sequences) &&
        Objects.equals(this.businessInformation, API.businessInformation) &&
        Objects.equals(this.corsConfiguration, API.corsConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, context, version, provider, apiDefinition, wsdlUri, status, responseCaching, cacheTimeout, destinationStatsEnabled, isDefaultVersion, transport, tags, tiers, maxTps, visibility, visibleRoles, visibleTenants, endpointConfig, endpointSecurity, gatewayEnvironments, sequences, businessInformation, corsConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class API {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    apiDefinition: ").append(toIndentedString(apiDefinition)).append("\n");
    sb.append("    wsdlUri: ").append(toIndentedString(wsdlUri)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    responseCaching: ").append(toIndentedString(responseCaching)).append("\n");
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    destinationStatsEnabled: ").append(toIndentedString(destinationStatsEnabled)).append("\n");
    sb.append("    isDefaultVersion: ").append(toIndentedString(isDefaultVersion)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
    sb.append("    maxTps: ").append(toIndentedString(maxTps)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    visibleRoles: ").append(toIndentedString(visibleRoles)).append("\n");
    sb.append("    visibleTenants: ").append(toIndentedString(visibleTenants)).append("\n");
    sb.append("    endpointConfig: ").append(toIndentedString(endpointConfig)).append("\n");
    sb.append("    endpointSecurity: ").append(toIndentedString(endpointSecurity)).append("\n");
    sb.append("    gatewayEnvironments: ").append(toIndentedString(gatewayEnvironments)).append("\n");
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
    sb.append("    businessInformation: ").append(toIndentedString(businessInformation)).append("\n");
    sb.append("    corsConfiguration: ").append(toIndentedString(corsConfiguration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
