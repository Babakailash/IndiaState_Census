package com.census;

import com.opencsv.bean.CsvBindByName;

public class CSVState {

    @CsvBindByName(column = "SrNo")
    private String srNo;

    @CsvBindByName(column = "StateName",required = true)
    private String stateName;

    @CsvBindByName(column = "TIN")
    private String tinNo;

    @CsvBindByName(column = "StateCode", required = true)
    private String stateCode;

    public CSVState() {

    }

    public String getSrNo() {
        return srNo;
    }

    public void setSrNo(String srNo) {
        this.srNo = srNo;
    }


    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getTIN() {
        return tinNo;
    }

    public void setTIN(String tinNo) {
        this.tinNo = tinNo;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Override
    public String toString() {
        return  "SrNo='" + srNo + '\'' +
                ", StateName='" + stateName + '\'' +
                ", TIN='" + tinNo + '\'' +
                ", StateCode='" + stateCode + '\''
                +"\n";
    }
}

