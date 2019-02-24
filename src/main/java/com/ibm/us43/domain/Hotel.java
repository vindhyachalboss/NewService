package com.ibm.us43.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

/*
 * a simple domain entity doubling as a DTO
 */
@Entity
@Table(name = "hotels")
/*@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)*/
public class Hotel {

	@Id
    @GeneratedValue(generator = "hotel_generator")
    @SequenceGenerator(
            name = "hotel_generator",
            sequenceName = "hotel_sequence",
            initialValue = 1000
    )
    private long id;

	@Column(columnDefinition = "text")
    private String name;

	@Column(columnDefinition = "text")
    private String description;

	@Column(columnDefinition = "text")
    String city;

    @Column()
    private int rating;

    public Hotel() {
    }

    public Hotel(String name, String description, int rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    public long getId() {
        return this.id;
    }

    // for tests ONLY
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Hotel {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", city='" + city + '\'' +
                ", rating=" + rating +
                '}';
    }
}
