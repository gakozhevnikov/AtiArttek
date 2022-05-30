package com.kga.atiarttek.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "city_id",
        "contact_city_id",
        "region_id",
        "country_id",
        "full_name",
        "short_name",
        "is_regional_center",
        "city_size",
        "fias_id",
        "attributes",
        "city_name",
        "region_name",
        "country_name",
        "country_code_name"
})
@Generated("jsonschema2pojo")
public class Location {

    @JsonProperty("city_id")
    private Integer cityId;
    @JsonProperty("contact_city_id")
    private Integer contactCityId;
    @JsonProperty("region_id")
    private Integer regionId;
    @JsonProperty("country_id")
    private Integer countryId;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("is_regional_center")
    private Boolean isRegionalCenter;
    @JsonProperty("city_size")
    private Integer citySize;
    @JsonProperty("fias_id")
    private String fiasId;
    @JsonProperty("attributes")
    private Integer attributes;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("region_name")
    private String regionName;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("country_code_name")
    private String countryCodeName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("city_id")
    public Integer getCityId() {
        return cityId;
    }

    @JsonProperty("city_id")
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @JsonProperty("contact_city_id")
    public Integer getContactCityId() {
        return contactCityId;
    }

    @JsonProperty("contact_city_id")
    public void setContactCityId(Integer contactCityId) {
        this.contactCityId = contactCityId;
    }

    @JsonProperty("region_id")
    public Integer getRegionId() {
        return regionId;
    }

    @JsonProperty("region_id")
    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    @JsonProperty("country_id")
    public Integer getCountryId() {
        return countryId;
    }

    @JsonProperty("country_id")
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("short_name")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("is_regional_center")
    public Boolean getIsRegionalCenter() {
        return isRegionalCenter;
    }

    @JsonProperty("is_regional_center")
    public void setIsRegionalCenter(Boolean isRegionalCenter) {
        this.isRegionalCenter = isRegionalCenter;
    }

    @JsonProperty("city_size")
    public Integer getCitySize() {
        return citySize;
    }

    @JsonProperty("city_size")
    public void setCitySize(Integer citySize) {
        this.citySize = citySize;
    }

    @JsonProperty("fias_id")
    public String getFiasId() {
        return fiasId;
    }

    @JsonProperty("fias_id")
    public void setFiasId(String fiasId) {
        this.fiasId = fiasId;
    }

    @JsonProperty("attributes")
    public Integer getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(Integer attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("city_name")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("region_name")
    public String getRegionName() {
        return regionName;
    }

    @JsonProperty("region_name")
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("country_code_name")
    public String getCountryCodeName() {
        return countryCodeName;
    }

    @JsonProperty("country_code_name")
    public void setCountryCodeName(String countryCodeName) {
        this.countryCodeName = countryCodeName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
