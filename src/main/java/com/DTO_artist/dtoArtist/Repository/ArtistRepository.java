package com.DTO_artist.dtoArtist.Repository;

import com.DTO_artist.dtoArtist.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArtistRepository extends JpaRepository<Artist,Long>{
}
