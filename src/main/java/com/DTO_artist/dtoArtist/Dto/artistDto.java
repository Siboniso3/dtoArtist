package com.DTO_artist.dtoArtist.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class artistDto {
    @JsonIgnore
    @JsonProperty(value ="id")
    private Long id =null;
    @JsonProperty(value ="fname")
    private String fName =null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @JsonProperty(value ="lname")
    private String lName=null;
}
