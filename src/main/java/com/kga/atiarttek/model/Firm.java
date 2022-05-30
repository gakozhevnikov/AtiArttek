package com.kga.atiarttek.model;

import java.util.HashMap;
import java.util.List;
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
        "ati_id",
        "firm_name",
        "brand",
        "ownership",
        "full_name",
        "firm_type",
        "firm_type_id",
        "predicted_firm_type_id",
        "location",
        "address",
        "position_in_city",
        "position_in_country",
        "firm_documents",
        "web_site",
        "info_reference",
        "passport_reference",
        "city",
        "score",
        "bad_partner_mentions_count",
        "claims_count",
        "language",
        "recommendations_count",
        "inn",
        "ogrn",
        "kpp",
        "okpo",
        "negative_points_sum",
        "tf_has_signals",
        "registration_date",
        "deletion_date",
        "verified_trucks"
})
@Generated("jsonschema2pojo")
public class Firm {

    @JsonProperty("ati_id")
    private String atiId;
    @JsonProperty("firm_name")
    private String firmName;
    @JsonProperty("brand")
    private Object brand;
    @JsonProperty("ownership")
    private String ownership;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("firm_type")
    private String firmType;
    @JsonProperty("firm_type_id")
    private String firmTypeId;
    @JsonProperty("predicted_firm_type_id")
    private Integer predictedFirmTypeId;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("address")
    private String address;
    @JsonProperty("position_in_city")
    private Integer positionInCity;
    @JsonProperty("position_in_country")
    private Integer positionInCountry;
    @JsonProperty("firm_documents")
    private List<FirmDocument> firmDocuments = null;
    @JsonProperty("web_site")
    private Object webSite;
    @JsonProperty("info_reference")
    private String infoReference;
    @JsonProperty("passport_reference")
    private String passportReference;
    @JsonProperty("city")
    private String city;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("bad_partner_mentions_count")
    private Integer badPartnerMentionsCount;
    @JsonProperty("claims_count")
    private Integer claimsCount;
    @JsonProperty("language")
    private String language;
    @JsonProperty("recommendations_count")
    private Integer recommendationsCount;
    @JsonProperty("inn")
    private String inn;
    @JsonProperty("ogrn")
    private String ogrn;
    @JsonProperty("kpp")
    private Object kpp;
    @JsonProperty("okpo")
    private String okpo;
    @JsonProperty("negative_points_sum")
    private Integer negativePointsSum;
    @JsonProperty("tf_has_signals")
    private Boolean tfHasSignals;
    @JsonProperty("registration_date")
    private String registrationDate;
    @JsonProperty("deletion_date")
    private Object deletionDate;
    @JsonProperty("verified_trucks")
    private Integer verifiedTrucks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ati_id")
    public String getAtiId() {
        return atiId;
    }

    @JsonProperty("ati_id")
    public void setAtiId(String atiId) {
        this.atiId = atiId;
    }

    @JsonProperty("firm_name")
    public String getFirmName() {
        return firmName;
    }

    @JsonProperty("firm_name")
    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    @JsonProperty("brand")
    public Object getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(Object brand) {
        this.brand = brand;
    }

    @JsonProperty("ownership")
    public String getOwnership() {
        return ownership;
    }

    @JsonProperty("ownership")
    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("firm_type")
    public String getFirmType() {
        return firmType;
    }

    @JsonProperty("firm_type")
    public void setFirmType(String firmType) {
        this.firmType = firmType;
    }

    @JsonProperty("firm_type_id")
    public String getFirmTypeId() {
        return firmTypeId;
    }

    @JsonProperty("firm_type_id")
    public void setFirmTypeId(String firmTypeId) {
        this.firmTypeId = firmTypeId;
    }

    @JsonProperty("predicted_firm_type_id")
    public Integer getPredictedFirmTypeId() {
        return predictedFirmTypeId;
    }

    @JsonProperty("predicted_firm_type_id")
    public void setPredictedFirmTypeId(Integer predictedFirmTypeId) {
        this.predictedFirmTypeId = predictedFirmTypeId;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("position_in_city")
    public Integer getPositionInCity() {
        return positionInCity;
    }

    @JsonProperty("position_in_city")
    public void setPositionInCity(Integer positionInCity) {
        this.positionInCity = positionInCity;
    }

    @JsonProperty("position_in_country")
    public Integer getPositionInCountry() {
        return positionInCountry;
    }

    @JsonProperty("position_in_country")
    public void setPositionInCountry(Integer positionInCountry) {
        this.positionInCountry = positionInCountry;
    }

    @JsonProperty("firm_documents")
    public List<FirmDocument> getFirmDocuments() {
        return firmDocuments;
    }

    @JsonProperty("firm_documents")
    public void setFirmDocuments(List<FirmDocument> firmDocuments) {
        this.firmDocuments = firmDocuments;
    }

    @JsonProperty("web_site")
    public Object getWebSite() {
        return webSite;
    }

    @JsonProperty("web_site")
    public void setWebSite(Object webSite) {
        this.webSite = webSite;
    }

    @JsonProperty("info_reference")
    public String getInfoReference() {
        return infoReference;
    }

    @JsonProperty("info_reference")
    public void setInfoReference(String infoReference) {
        this.infoReference = infoReference;
    }

    @JsonProperty("passport_reference")
    public String getPassportReference() {
        return passportReference;
    }

    @JsonProperty("passport_reference")
    public void setPassportReference(String passportReference) {
        this.passportReference = passportReference;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("bad_partner_mentions_count")
    public Integer getBadPartnerMentionsCount() {
        return badPartnerMentionsCount;
    }

    @JsonProperty("bad_partner_mentions_count")
    public void setBadPartnerMentionsCount(Integer badPartnerMentionsCount) {
        this.badPartnerMentionsCount = badPartnerMentionsCount;
    }

    @JsonProperty("claims_count")
    public Integer getClaimsCount() {
        return claimsCount;
    }

    @JsonProperty("claims_count")
    public void setClaimsCount(Integer claimsCount) {
        this.claimsCount = claimsCount;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("recommendations_count")
    public Integer getRecommendationsCount() {
        return recommendationsCount;
    }

    @JsonProperty("recommendations_count")
    public void setRecommendationsCount(Integer recommendationsCount) {
        this.recommendationsCount = recommendationsCount;
    }

    @JsonProperty("inn")
    public String getInn() {
        return inn;
    }

    @JsonProperty("inn")
    public void setInn(String inn) {
        this.inn = inn;
    }

    @JsonProperty("ogrn")
    public String getOgrn() {
        return ogrn;
    }

    @JsonProperty("ogrn")
    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    @JsonProperty("kpp")
    public Object getKpp() {
        return kpp;
    }

    @JsonProperty("kpp")
    public void setKpp(Object kpp) {
        this.kpp = kpp;
    }

    @JsonProperty("okpo")
    public String getOkpo() {
        return okpo;
    }

    @JsonProperty("okpo")
    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    @JsonProperty("negative_points_sum")
    public Integer getNegativePointsSum() {
        return negativePointsSum;
    }

    @JsonProperty("negative_points_sum")
    public void setNegativePointsSum(Integer negativePointsSum) {
        this.negativePointsSum = negativePointsSum;
    }

    @JsonProperty("tf_has_signals")
    public Boolean getTfHasSignals() {
        return tfHasSignals;
    }

    @JsonProperty("tf_has_signals")
    public void setTfHasSignals(Boolean tfHasSignals) {
        this.tfHasSignals = tfHasSignals;
    }

    @JsonProperty("registration_date")
    public String getRegistrationDate() {
        return registrationDate;
    }

    @JsonProperty("registration_date")
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    @JsonProperty("deletion_date")
    public Object getDeletionDate() {
        return deletionDate;
    }

    @JsonProperty("deletion_date")
    public void setDeletionDate(Object deletionDate) {
        this.deletionDate = deletionDate;
    }

    @JsonProperty("verified_trucks")
    public Integer getVerifiedTrucks() {
        return verifiedTrucks;
    }

    @JsonProperty("verified_trucks")
    public void setVerifiedTrucks(Integer verifiedTrucks) {
        this.verifiedTrucks = verifiedTrucks;
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