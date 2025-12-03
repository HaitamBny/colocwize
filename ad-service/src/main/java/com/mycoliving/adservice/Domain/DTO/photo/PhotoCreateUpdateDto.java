package com.mycoliving.adservice.Domain.DTO.photo;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.mycoliving.adservice.Domain.Entity.Photo}
 */
public class PhotoCreateUpdateDto implements Serializable {
    private final String url;
    private final String caption;
    private final Integer sortOrder;
    private final String contentType;

    public PhotoCreateUpdateDto(String url, String caption, Integer sortOrder, String contentType) {
        this.url = url;
        this.caption = caption;
        this.sortOrder = sortOrder;
        this.contentType = contentType;
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
        PhotoCreateUpdateDto entity = (PhotoCreateUpdateDto) o;
        return Objects.equals(this.url, entity.url) &&
                Objects.equals(this.caption, entity.caption) &&
                Objects.equals(this.sortOrder, entity.sortOrder) &&
                Objects.equals(this.contentType, entity.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, caption, sortOrder, contentType);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "url = " + url + ", " +
                "caption = " + caption + ", " +
                "sortOrder = " + sortOrder + ", " +
                "contentType = " + contentType + ")";
    }
}