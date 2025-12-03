package com.mycoliving.adservice.Domain.DTO.photo;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.mycoliving.adservice.Domain.Entity.Photo}
 */
public class PhotoReadDto implements Serializable {
    private final Long id;
    private final String url;
    private final String caption;
    private final Integer sortOrder;
    private final String contentType;

    public PhotoReadDto(Long id, String url, String caption, Integer sortOrder, String contentType) {
        this.id = id;
        this.url = url;
        this.caption = caption;
        this.sortOrder = sortOrder;
        this.contentType = contentType;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoReadDto entity = (PhotoReadDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.url, entity.url) &&
                Objects.equals(this.caption, entity.caption) &&
                Objects.equals(this.sortOrder, entity.sortOrder) &&
                Objects.equals(this.contentType, entity.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, caption, sortOrder, contentType);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "url = " + url + ", " +
                "caption = " + caption + ", " +
                "sortOrder = " + sortOrder + ", " +
                "contentType = " + contentType + ")";
    }
}