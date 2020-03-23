package com.example.yohan.blogapp;

//public class CoronaPost {
//}


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;






public class CoronaPost {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private Data data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Hospital {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("name_si")
        @Expose
        private String nameSi;
        @SerializedName("name_ta")
        @Expose
        private String nameTa;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("deleted_at")
        @Expose
        private Object deletedAt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNameSi() {
            return nameSi;
        }

        public void setNameSi(String nameSi) {
            this.nameSi = nameSi;
        }

        public String getNameTa() {
            return nameTa;
        }

        public void setNameTa(String nameTa) {
            this.nameTa = nameTa;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Object getDeletedAt() {
            return deletedAt;
        }

        public void setDeletedAt(Object deletedAt) {
            this.deletedAt = deletedAt;
        }

    }

    public class Data {

        @SerializedName("update_date_time")
        @Expose
        private String updateDateTime;
        @SerializedName("local_new_cases")
        @Expose
        private Integer localNewCases;
        @SerializedName("local_total_cases")
        @Expose
        private Integer localTotalCases;
        @SerializedName("local_total_number_of_individuals_in_hospitals")
        @Expose
        private Integer localTotalNumberOfIndividualsInHospitals;
        @SerializedName("local_deaths")
        @Expose
        private Integer localDeaths;
        @SerializedName("local_new_deaths")
        @Expose
        private Integer localNewDeaths;
        @SerializedName("local_recovered")
        @Expose
        private Integer localRecovered;
        @SerializedName("global_new_cases")
        @Expose
        private Integer globalNewCases;
        @SerializedName("global_total_cases")
        @Expose
        private Integer globalTotalCases;
        @SerializedName("global_deaths")
        @Expose
        private Integer globalDeaths;
        @SerializedName("global_new_deaths")
        @Expose
        private Integer globalNewDeaths;
        @SerializedName("global_recovered")
        @Expose
        private Integer globalRecovered;
        @SerializedName("hospital_data")
        @Expose
        private List<HospitalDatum> hospitalData = null;

        public String getUpdateDateTime() {
            return updateDateTime;
        }

        public void setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
        }

        public Integer getLocalNewCases() {
            return localNewCases;
        }

        public void setLocalNewCases(Integer localNewCases) {
            this.localNewCases = localNewCases;
        }

        public Integer getLocalTotalCases() {
            return localTotalCases;
        }

        public void setLocalTotalCases(Integer localTotalCases) {
            this.localTotalCases = localTotalCases;
        }

        public Integer getLocalTotalNumberOfIndividualsInHospitals() {
            return localTotalNumberOfIndividualsInHospitals;
        }

        public void setLocalTotalNumberOfIndividualsInHospitals(Integer localTotalNumberOfIndividualsInHospitals) {
            this.localTotalNumberOfIndividualsInHospitals = localTotalNumberOfIndividualsInHospitals;
        }

        public Integer getLocalDeaths() {
            return localDeaths;
        }

        public void setLocalDeaths(Integer localDeaths) {
            this.localDeaths = localDeaths;
        }

        public Integer getLocalNewDeaths() {
            return localNewDeaths;
        }

        public void setLocalNewDeaths(Integer localNewDeaths) {
            this.localNewDeaths = localNewDeaths;
        }

        public Integer getLocalRecovered() {
            return localRecovered;
        }

        public void setLocalRecovered(Integer localRecovered) {
            this.localRecovered = localRecovered;
        }

        public Integer getGlobalNewCases() {
            return globalNewCases;
        }

        public void setGlobalNewCases(Integer globalNewCases) {
            this.globalNewCases = globalNewCases;
        }

        public Integer getGlobalTotalCases() {
            return globalTotalCases;
        }

        public void setGlobalTotalCases(Integer globalTotalCases) {
            this.globalTotalCases = globalTotalCases;
        }

        public Integer getGlobalDeaths() {
            return globalDeaths;
        }

        public void setGlobalDeaths(Integer globalDeaths) {
            this.globalDeaths = globalDeaths;
        }

        public Integer getGlobalNewDeaths() {
            return globalNewDeaths;
        }

        public void setGlobalNewDeaths(Integer globalNewDeaths) {
            this.globalNewDeaths = globalNewDeaths;
        }

        public Integer getGlobalRecovered() {
            return globalRecovered;
        }

        public void setGlobalRecovered(Integer globalRecovered) {
            this.globalRecovered = globalRecovered;
        }

        public List<HospitalDatum> getHospitalData() {
            return hospitalData;
        }

        public void setHospitalData(List<HospitalDatum> hospitalData) {
            this.hospitalData = hospitalData;
        }

    }


    public class HospitalDatum {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("hospital_id")
        @Expose
        private Integer hospitalId;
        @SerializedName("cumulative_local")
        @Expose
        private Integer cumulativeLocal;
        @SerializedName("cumulative_foreign")
        @Expose
        private Integer cumulativeForeign;
        @SerializedName("treatment_local")
        @Expose
        private Integer treatmentLocal;
        @SerializedName("treatment_foreign")
        @Expose
        private Integer treatmentForeign;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private Object updatedAt;
        @SerializedName("deleted_at")
        @Expose
        private Object deletedAt;
        @SerializedName("cumulative_total")
        @Expose
        private Integer cumulativeTotal;
        @SerializedName("treatment_total")
        @Expose
        private Integer treatmentTotal;
        @SerializedName("hospital")
        @Expose
        private Hospital hospital;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getHospitalId() {
            return hospitalId;
        }

        public void setHospitalId(Integer hospitalId) {
            this.hospitalId = hospitalId;
        }

        public Integer getCumulativeLocal() {
            return cumulativeLocal;
        }

        public void setCumulativeLocal(Integer cumulativeLocal) {
            this.cumulativeLocal = cumulativeLocal;
        }

        public Integer getCumulativeForeign() {
            return cumulativeForeign;
        }

        public void setCumulativeForeign(Integer cumulativeForeign) {
            this.cumulativeForeign = cumulativeForeign;
        }

        public Integer getTreatmentLocal() {
            return treatmentLocal;
        }

        public void setTreatmentLocal(Integer treatmentLocal) {
            this.treatmentLocal = treatmentLocal;
        }

        public Integer getTreatmentForeign() {
            return treatmentForeign;
        }

        public void setTreatmentForeign(Integer treatmentForeign) {
            this.treatmentForeign = treatmentForeign;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public Object getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(Object updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Object getDeletedAt() {
            return deletedAt;
        }

        public void setDeletedAt(Object deletedAt) {
            this.deletedAt = deletedAt;
        }

        public Integer getCumulativeTotal() {
            return cumulativeTotal;
        }

        public void setCumulativeTotal(Integer cumulativeTotal) {
            this.cumulativeTotal = cumulativeTotal;
        }

        public Integer getTreatmentTotal() {
            return treatmentTotal;
        }

        public void setTreatmentTotal(Integer treatmentTotal) {
            this.treatmentTotal = treatmentTotal;
        }

        public Hospital getHospital() {
            return hospital;
        }

        public void setHospital(Hospital hospital) {
            this.hospital = hospital;
        }

    }

}




