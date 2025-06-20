package com.DTO_artist.dtoArtist.Controller;

import com.DTO_artist.dtoArtist.Model.Artist;
import com.DTO_artist.dtoArtist.Model.ArtistDto;
import com.DTO_artist.dtoArtist.Service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/api/artist")
@CrossOrigin("http://localhost:8082/")
public class ArtistController {
    @Autowired
    private ArtistService artistService;
    @PostMapping("")
    public Artist addNewArtist(@RequestBody Artist artist){
        return artistService.addNewArtist(artist);
    }
    @GetMapping("")
    public List<ArtistDto> getALLArtist(){
        return this.artistService.findAllArtist();
    }
    @GetMapping("/{id}")
    public List<ArtistDto> getSpecific(@PathVariable Long id){
        return this.artistService.getArtist(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.artistService.deleteArtist(id);
    }
    @PutMapping("/{id}")
    public Artist update(@PathVariable Long id, @RequestBody Artist artist){
        return this.artistService.updateArtist(id,artist);
    }
//    @PostMapping("")
//    public Artist addNewArtist(@RequestBody Artist artist){
//        return artistService.addNewArtist(artist);
//    }
//    @GetMapping("")
//    public List<Artist> getALLArtist(){
//        return this.artistService.findAllArtist();
//    }
//    @GetMapping("/{id}")
//    public Optional<Artist> getSpecific(@PathVariable Long id){
//        return this.artistService.getArtist(id);
//    }
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id){
//        this.artistService.deleteArtist(id);
//    }
//    @PutMapping("/{id}")
//    public Artist update(@PathVariable Long id, @RequestBody Artist artist){
//        return this.artistService.updateArtist(id,artist);
//    }



}
