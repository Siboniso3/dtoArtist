package com.DTO_artist.dtoArtist.Model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
@Entity
@Table(name = "Artist")
public class Artist {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "artist_sequence",strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "fName")
    private String fName;
    @Column(name = "lName")
    private String lName;
    @Column(name = "genre")
    private String genre;
    @Column(name = "stageName")
    private String stageName;
    @Column(name = "location")
    private String location;
    @Column(name = "status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Artist() {
    }

    public Artist(String fName, String lName, String genre, String stageName, String location, String status) {
        this.fName = fName;
        this.lName = lName;
        this.genre = genre;
        this.stageName = stageName;
        this.location = location;
        this.status = status;
    }

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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
