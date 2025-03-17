package com.DTO_artist.dtoArtist.Service;

import com.DTO_artist.dtoArtist.Model.Artist;
import com.DTO_artist.dtoArtist.Repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {
    @Autowired
 private ArtistRepository artistRepository;

    public List<Artist> findAllArtist(){
       List<Artist> artists = artistRepository.findAll();
        return artists;
    }
    public Artist addNewArtist(Artist artist){
        if(artistRepository !=null){
            return this.artistRepository.save(artist);
        }
        return null;
    }

    public Optional<Artist> getArtist(Long id) {
        Optional<Artist> artist = Optional.of(artistRepository.findById(id).get());
        return artist;
    }
    public void deleteArtist(Long id){
        this.artistRepository.deleteById(id);
    }
    public Artist updateArtist(long id, Artist artist){
        System.out.println(artist.getId());
        System.out.println(id);

       if(artist.getId() == id){
           artist.setfName(artist.getfName());
           artist.setfName(artist.getlName());
           artist.setfName(artist.getGenre());
           artist.setfName(artist.getStageName());
           artist.setfName(artist.getLocation());
           return artistRepository.save(artist);
       }
        return null;
    }



}
