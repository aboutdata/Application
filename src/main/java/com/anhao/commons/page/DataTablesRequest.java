package com.anhao.commons.page;

import java.io.Serializable;
import java.util.List;

//import org.codehaus.jackson.annotate.JsonProperty;
/**
 * @author <a href="mailto:thomas.weckert@nexum.de">Thomas Weckert</a>
 */
public class DataTablesRequest implements Serializable {

    private static final long serialVersionUID = -4961407246623307317L;

//	@JsonProperty(value = "sEcho")
    public int sEcho;

//    @JsonProperty(value = "iColumns")
    public int iColumns;

//    @JsonProperty(value = "sColumns")
    public String sColumns;

//    @JsonProperty(value = "iDisplayStart")
    public int iDisplayStart;

//    @JsonProperty(value = "iDisplayLength")
    public int iDisplayLength;

//    @JsonProperty(value = "amDataProp")
    public List<String> amDataProp;

//    @JsonProperty(value = "sSearch")
    public String sSearch;

//    @JsonProperty(value = "asSearch")
    public List<String> asSearch;

//    @JsonProperty(value = "bRegex")
    public boolean bRegex;

//    @JsonProperty (value = "abRegex")
    public List<Boolean> abRegex;

//    @JsonProperty (value = "abSearchable")
    public List<Boolean> abSearchable;

//    @JsonProperty (value = "iSortingCols")
    public int iSortingCols;

//    @JsonProperty(value = "aiSortCol")
    public List<Integer> aiSortCol;

//    @JsonProperty(value = "asSortDir")
    public List<String> asSortDir;

    @Override
    public String toString() {
        return "DataTablesRequest{" + "sEcho=" + sEcho + ", iColumns=" + iColumns + ", sColumns=" + sColumns + ", iDisplayStart=" + iDisplayStart + ", iDisplayLength=" + iDisplayLength + ", amDataProp=" + amDataProp + ", sSearch=" + sSearch + ", asSearch=" + asSearch + ", bRegex=" + bRegex + ", abRegex=" + abRegex + ", abSearchable=" + abSearchable + ", iSortingCols=" + iSortingCols + ", aiSortCol=" + aiSortCol + ", asSortDir=" + asSortDir + '}';
    }

    public int getsEcho() {
        return sEcho;
    }

    public void setsEcho(int sEcho) {
        this.sEcho = sEcho;
    }

    public int getiColumns() {
        return iColumns;
    }

    public void setiColumns(int iColumns) {
        this.iColumns = iColumns;
    }

    public String getsColumns() {
        return sColumns;
    }

    public void setsColumns(String sColumns) {
        this.sColumns = sColumns;
    }

    public int getiDisplayStart() {
        return iDisplayStart;
    }

    public void setiDisplayStart(int iDisplayStart) {
        this.iDisplayStart = iDisplayStart;
    }

    public int getiDisplayLength() {
        return iDisplayLength;
    }

    public void setiDisplayLength(int iDisplayLength) {
        this.iDisplayLength = iDisplayLength;
    }

    public List<String> getAmDataProp() {
        return amDataProp;
    }

    public void setAmDataProp(List<String> amDataProp) {
        this.amDataProp = amDataProp;
    }

    public String getsSearch() {
        return sSearch;
    }

    public void setsSearch(String sSearch) {
        this.sSearch = sSearch;
    }

    public List<String> getAsSearch() {
        return asSearch;
    }

    public void setAsSearch(List<String> asSearch) {
        this.asSearch = asSearch;
    }

    public boolean isbRegex() {
        return bRegex;
    }

    public void setbRegex(boolean bRegex) {
        this.bRegex = bRegex;
    }

    public List<Boolean> getAbRegex() {
        return abRegex;
    }

    public void setAbRegex(List<Boolean> abRegex) {
        this.abRegex = abRegex;
    }

    public List<Boolean> getAbSearchable() {
        return abSearchable;
    }

    public void setAbSearchable(List<Boolean> abSearchable) {
        this.abSearchable = abSearchable;
    }

    public int getiSortingCols() {
        return iSortingCols;
    }

    public void setiSortingCols(int iSortingCols) {
        this.iSortingCols = iSortingCols;
    }

    public List<Integer> getAiSortCol() {
        return aiSortCol;
    }

    public void setAiSortCol(List<Integer> aiSortCol) {
        this.aiSortCol = aiSortCol;
    }

    public List<String> getAsSortDir() {
        return asSortDir;
    }

    public void setAsSortDir(List<String> asSortDir) {
        this.asSortDir = asSortDir;
    }

}
