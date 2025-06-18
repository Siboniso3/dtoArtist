package com.DTO_artist.dtoArtist.Service;
import com.DTO_artist.dtoArtist.Model.Artist;
import com.DTO_artist.dtoArtist.Model.ArtistDto;
import com.DTO_artist.dtoArtist.Repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ArtistService {
    @Autowired
 private ArtistRepository artistRepository;

    public List<ArtistDto> findAllArtist(){
       return artistRepository.findAll().stream().map(
               artist -> new ArtistDto(
                   artist.getId(),
                   artist.getfName(),
                   artist.getlName(),
                   artist.getGenre(),
                   artist.getStageName()
               )
       ).collect(Collectors.toList());

    }
    public Artist addNewArtist(Artist artist){
        if(artistRepository !=null){
            return this.artistRepository.save(artist);
        }
        return null;
    }

    public List<ArtistDto> getArtist(Long id) {
       return Optional.of(artistRepository.findById(id).get()).stream().map(
               artist -> new ArtistDto(
                       artist.getId(),
                       artist.getfName(),
                       artist.getlName(),
                       artist.getGenre(),
                       artist.getStageName()
               )
       ).collect(Collectors.toList());

    }
    public void deleteArtist(Long id){
        this.artistRepository.deleteById(id);
    }
    public Artist updateArtist(long id, Artist artist){
        System.out.println(artist.getId());
        System.out.println(id);

       if(artist.getId() == id){
           artist.setfName(artist.getfName());
           artist.setlName(artist.getlName());
           artist.setGenre(artist.getGenre());
           artist.setStageName(artist.getStageName());
           artist.setLocation(artist.getLocation());
           return artistRepository.save(artist);
       }
        return null;
    }



}
