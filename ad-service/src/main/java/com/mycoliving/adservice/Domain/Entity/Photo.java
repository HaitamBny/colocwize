package com.mycoliving.adservice.Domain.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url; // stockage distant (S3) ou path local
    private String caption;
    private Integer sortOrder = 0;

    // optional small thumbnail / metadata
    @Column(length = 50)
    private String contentType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ad_id")
    private Ad ad;


    // mapped by Ad -> we used @JoinColumn in Ad.photos
    public Photo() {}

    public Photo(Long id, String url, String caption, Integer sortOrder, String contentType) {
        this.id = id;
        this.url = url;
        this.caption = caption;
        this.sortOrder = sortOrder;
        this.contentType = contentType;
    }

    //Getters
    public Long getId() {
        return id;
    }
    public String getUrl() {
        return url;
    }
    public String getCaption() {
        return caption;
    }
    public Integer getSortOrder() {
        return sortOrder;
    }
    public String getContentType() {
        return contentType;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

}
