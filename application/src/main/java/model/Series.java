package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Series {
    
    @Id
    private Long id;
    private String name;
    private String seasons;
    private String episodes;
    private String rating;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSeasons() {
        return seasons;
    }
    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }
    public String getEpisodes() {
        return episodes;
    }
    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }

    public Series(Long id, String name, String seasons, String episodes, String rating) {
        this.id = id;
        this.name = name;
        this.seasons = seasons;
        this.episodes = episodes;
        this.rating = rating;
    }

    public Series(){
        super();
    }
}
