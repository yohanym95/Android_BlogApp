package com.example.yohan.blogapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WPPost {



        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("date_gmt")
        @Expose
        private String dateGmt;
        @SerializedName("guid")
        @Expose
        private Guid guid;
        @SerializedName("modified")
        @Expose
        private String modified;
        @SerializedName("modified_gmt")
        @Expose
        private String modifiedGmt;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("title")
        @Expose
        private Title title;
        @SerializedName("content")
        @Expose
        private Content content;
        @SerializedName("excerpt")
        @Expose
        private Excerpt excerpt;
        @SerializedName("author")
        @Expose
        private Integer author;
        @SerializedName("featured_media")
        @Expose
        private Integer featuredMedia;
        @SerializedName("comment_status")
        @Expose
        private String commentStatus;
        @SerializedName("ping_status")
        @Expose
        private String pingStatus;
        @SerializedName("sticky")
        @Expose
        private Boolean sticky;
        @SerializedName("template")
        @Expose
        private String template;
        @SerializedName("format")
        @Expose
        private String format;
        @SerializedName("meta")
        @Expose
        private List<Object> meta = null;
        @SerializedName("categories")
        @Expose
        private List<Integer> categories = null;
        @SerializedName("tags")
        @Expose
        private List<Integer> tags = null;
        @SerializedName("better_featured_image")
        @Expose
        private BetterFeaturedImage betterFeaturedImage;
        @SerializedName("_links")
        @Expose
        private Links links;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDateGmt() {
            return dateGmt;
        }

        public void setDateGmt(String dateGmt) {
            this.dateGmt = dateGmt;
        }

        public Guid getGuid() {
            return guid;
        }

        public void setGuid(Guid guid) {
            this.guid = guid;
        }

        public String getModified() {
            return modified;
        }

        public void setModified(String modified) {
            this.modified = modified;
        }

        public String getModifiedGmt() {
            return modifiedGmt;
        }

        public void setModifiedGmt(String modifiedGmt) {
            this.modifiedGmt = modifiedGmt;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public Title getTitle() {
            return title;
        }

        public void setTitle(Title title) {
            this.title = title;
        }

        public Content getContent() {
            return content;
        }

        public void setContent(Content content) {
            this.content = content;
        }

        public Excerpt getExcerpt() {
            return excerpt;
        }

        public void setExcerpt(Excerpt excerpt) {
            this.excerpt = excerpt;
        }

        public Integer getAuthor() {
            return author;
        }

        public void setAuthor(Integer author) {
            this.author = author;
        }

        public Integer getFeaturedMedia() {
            return featuredMedia;
        }

        public void setFeaturedMedia(Integer featuredMedia) {
            this.featuredMedia = featuredMedia;
        }

        public String getCommentStatus() {
            return commentStatus;
        }

        public void setCommentStatus(String commentStatus) {
            this.commentStatus = commentStatus;
        }

        public String getPingStatus() {
            return pingStatus;
        }

        public void setPingStatus(String pingStatus) {
            this.pingStatus = pingStatus;
        }

        public Boolean getSticky() {
            return sticky;
        }

        public void setSticky(Boolean sticky) {
            this.sticky = sticky;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public List<Object> getMeta() {
            return meta;
        }

        public void setMeta(List<Object> meta) {
            this.meta = meta;
        }

        public List<Integer> getCategories() {
            return categories;
        }

        public void setCategories(List<Integer> categories) {
            this.categories = categories;
        }

        public List<Integer> getTags() {
            return tags;
        }

        public void setTags(List<Integer> tags) {
            this.tags = tags;
        }

        public BetterFeaturedImage getBetterFeaturedImage() {
            return betterFeaturedImage;
        }

        public void setBetterFeaturedImage(BetterFeaturedImage betterFeaturedImage) {
            this.betterFeaturedImage = betterFeaturedImage;
        }

        public Links getLinks() {
            return links;
        }

        public void setLinks(Links links) {
            this.links = links;
        }



    public class About {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Author {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class BetterFeaturedImage {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("alt_text")
        @Expose
        private String altText;
        @SerializedName("caption")
        @Expose
        private String caption;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("media_type")
        @Expose
        private String mediaType;
        @SerializedName("media_details")
        @Expose
        private MediaDetails mediaDetails;
        @SerializedName("post")
        @Expose
        private Integer post;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getAltText() {
            return altText;
        }

        public void setAltText(String altText) {
            this.altText = altText;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getMediaType() {
            return mediaType;
        }

        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        public MediaDetails getMediaDetails() {
            return mediaDetails;
        }

        public void setMediaDetails(MediaDetails mediaDetails) {
            this.mediaDetails = mediaDetails;
        }

        public Integer getPost() {
            return post;
        }

        public void setPost(Integer post) {
            this.post = post;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class Collection {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Content {

        @SerializedName("rendered")
        @Expose
        private String rendered;
        @SerializedName("protected")
        @Expose
        private Boolean _protected;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        public Boolean getProtected() {
            return _protected;
        }

        public void setProtected(Boolean _protected) {
            this._protected = _protected;
        }

    }


    public class Cury {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("templated")
        @Expose
        private Boolean templated;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public Boolean getTemplated() {
            return templated;
        }

        public void setTemplated(Boolean templated) {
            this.templated = templated;
        }

    }


    public class Example {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("date_gmt")
        @Expose
        private String dateGmt;
        @SerializedName("guid")
        @Expose
        private Guid guid;
        @SerializedName("modified")
        @Expose
        private String modified;
        @SerializedName("modified_gmt")
        @Expose
        private String modifiedGmt;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("title")
        @Expose
        private Title title;
        @SerializedName("content")
        @Expose
        private Content content;
        @SerializedName("excerpt")
        @Expose
        private Excerpt excerpt;
        @SerializedName("author")
        @Expose
        private Integer author;
        @SerializedName("featured_media")
        @Expose
        private Integer featuredMedia;
        @SerializedName("comment_status")
        @Expose
        private String commentStatus;
        @SerializedName("ping_status")
        @Expose
        private String pingStatus;
        @SerializedName("sticky")
        @Expose
        private Boolean sticky;
        @SerializedName("template")
        @Expose
        private String template;
        @SerializedName("format")
        @Expose
        private String format;
        @SerializedName("meta")
        @Expose
        private List<Object> meta = null;
        @SerializedName("categories")
        @Expose
        private List<Integer> categories = null;
        @SerializedName("tags")
        @Expose
        private List<Integer> tags = null;
        @SerializedName("better_featured_image")
        @Expose
        private BetterFeaturedImage betterFeaturedImage;
        @SerializedName("_links")
        @Expose
        private Links links;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDateGmt() {
            return dateGmt;
        }

        public void setDateGmt(String dateGmt) {
            this.dateGmt = dateGmt;
        }

        public Guid getGuid() {
            return guid;
        }

        public void setGuid(Guid guid) {
            this.guid = guid;
        }

        public String getModified() {
            return modified;
        }

        public void setModified(String modified) {
            this.modified = modified;
        }

        public String getModifiedGmt() {
            return modifiedGmt;
        }

        public void setModifiedGmt(String modifiedGmt) {
            this.modifiedGmt = modifiedGmt;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public Title getTitle() {
            return title;
        }

        public void setTitle(Title title) {
            this.title = title;
        }

        public Content getContent() {
            return content;
        }

        public void setContent(Content content) {
            this.content = content;
        }

        public Excerpt getExcerpt() {
            return excerpt;
        }

        public void setExcerpt(Excerpt excerpt) {
            this.excerpt = excerpt;
        }

        public Integer getAuthor() {
            return author;
        }

        public void setAuthor(Integer author) {
            this.author = author;
        }

        public Integer getFeaturedMedia() {
            return featuredMedia;
        }

        public void setFeaturedMedia(Integer featuredMedia) {
            this.featuredMedia = featuredMedia;
        }

        public String getCommentStatus() {
            return commentStatus;
        }

        public void setCommentStatus(String commentStatus) {
            this.commentStatus = commentStatus;
        }

        public String getPingStatus() {
            return pingStatus;
        }

        public void setPingStatus(String pingStatus) {
            this.pingStatus = pingStatus;
        }

        public Boolean getSticky() {
            return sticky;
        }

        public void setSticky(Boolean sticky) {
            this.sticky = sticky;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public List<Object> getMeta() {
            return meta;
        }

        public void setMeta(List<Object> meta) {
            this.meta = meta;
        }

        public List<Integer> getCategories() {
            return categories;
        }

        public void setCategories(List<Integer> categories) {
            this.categories = categories;
        }

        public List<Integer> getTags() {
            return tags;
        }

        public void setTags(List<Integer> tags) {
            this.tags = tags;
        }

        public BetterFeaturedImage getBetterFeaturedImage() {
            return betterFeaturedImage;
        }

        public void setBetterFeaturedImage(BetterFeaturedImage betterFeaturedImage) {
            this.betterFeaturedImage = betterFeaturedImage;
        }

        public Links getLinks() {
            return links;
        }

        public void setLinks(Links links) {
            this.links = links;
        }

    }


    public class Excerpt {

        @SerializedName("rendered")
        @Expose
        private String rendered;
        @SerializedName("protected")
        @Expose
        private Boolean _protected;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        public Boolean getProtected() {
            return _protected;
        }

        public void setProtected(Boolean _protected) {
            this._protected = _protected;
        }

    }


    public class Guid {

        @SerializedName("rendered")
        @Expose
        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

    }


    public class ImageMeta {

        @SerializedName("aperture")
        @Expose
        private String aperture;
        @SerializedName("credit")
        @Expose
        private String credit;
        @SerializedName("camera")
        @Expose
        private String camera;
        @SerializedName("caption")
        @Expose
        private String caption;
        @SerializedName("created_timestamp")
        @Expose
        private String createdTimestamp;
        @SerializedName("copyright")
        @Expose
        private String copyright;
        @SerializedName("focal_length")
        @Expose
        private String focalLength;
        @SerializedName("iso")
        @Expose
        private String iso;
        @SerializedName("shutter_speed")
        @Expose
        private String shutterSpeed;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("orientation")
        @Expose
        private String orientation;
        @SerializedName("keywords")
        @Expose
        private List<Object> keywords = null;

        public String getAperture() {
            return aperture;
        }

        public void setAperture(String aperture) {
            this.aperture = aperture;
        }

        public String getCredit() {
            return credit;
        }

        public void setCredit(String credit) {
            this.credit = credit;
        }

        public String getCamera() {
            return camera;
        }

        public void setCamera(String camera) {
            this.camera = camera;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getCreatedTimestamp() {
            return createdTimestamp;
        }

        public void setCreatedTimestamp(String createdTimestamp) {
            this.createdTimestamp = createdTimestamp;
        }

        public String getCopyright() {
            return copyright;
        }

        public void setCopyright(String copyright) {
            this.copyright = copyright;
        }

        public String getFocalLength() {
            return focalLength;
        }

        public void setFocalLength(String focalLength) {
            this.focalLength = focalLength;
        }

        public String getIso() {
            return iso;
        }

        public void setIso(String iso) {
            this.iso = iso;
        }

        public String getShutterSpeed() {
            return shutterSpeed;
        }

        public void setShutterSpeed(String shutterSpeed) {
            this.shutterSpeed = shutterSpeed;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getOrientation() {
            return orientation;
        }

        public void setOrientation(String orientation) {
            this.orientation = orientation;
        }

        public List<Object> getKeywords() {
            return keywords;
        }

        public void setKeywords(List<Object> keywords) {
            this.keywords = keywords;
        }

    }


    public class Links {

        @SerializedName("self")
        @Expose
        private List<Self> self = null;
        @SerializedName("collection")
        @Expose
        private List<Collection> collection = null;
        @SerializedName("about")
        @Expose
        private List<About> about = null;
        @SerializedName("author")
        @Expose
        private List<Author> author = null;
        @SerializedName("replies")
        @Expose
        private List<Reply> replies = null;
        @SerializedName("version-history")
        @Expose
        private List<VersionHistory> versionHistory = null;
        @SerializedName("predecessor-version")
        @Expose
        private List<PredecessorVersion> predecessorVersion = null;
        @SerializedName("wp:featuredmedia")
        @Expose
        private List<WpFeaturedmedium> wpFeaturedmedia = null;
        @SerializedName("wp:attachment")
        @Expose
        private List<WpAttachment> wpAttachment = null;
        @SerializedName("wp:term")
        @Expose
        private List<WpTerm> wpTerm = null;
        @SerializedName("curies")
        @Expose
        private List<Cury> curies = null;

        public List<Self> getSelf() {
            return self;
        }

        public void setSelf(List<Self> self) {
            this.self = self;
        }

        public List<Collection> getCollection() {
            return collection;
        }

        public void setCollection(List<Collection> collection) {
            this.collection = collection;
        }

        public List<About> getAbout() {
            return about;
        }

        public void setAbout(List<About> about) {
            this.about = about;
        }

        public List<Author> getAuthor() {
            return author;
        }

        public void setAuthor(List<Author> author) {
            this.author = author;
        }

        public List<Reply> getReplies() {
            return replies;
        }

        public void setReplies(List<Reply> replies) {
            this.replies = replies;
        }

        public List<VersionHistory> getVersionHistory() {
            return versionHistory;
        }

        public void setVersionHistory(List<VersionHistory> versionHistory) {
            this.versionHistory = versionHistory;
        }

        public List<PredecessorVersion> getPredecessorVersion() {
            return predecessorVersion;
        }

        public void setPredecessorVersion(List<PredecessorVersion> predecessorVersion) {
            this.predecessorVersion = predecessorVersion;
        }

        public List<WpFeaturedmedium> getWpFeaturedmedia() {
            return wpFeaturedmedia;
        }

        public void setWpFeaturedmedia(List<WpFeaturedmedium> wpFeaturedmedia) {
            this.wpFeaturedmedia = wpFeaturedmedia;
        }

        public List<WpAttachment> getWpAttachment() {
            return wpAttachment;
        }

        public void setWpAttachment(List<WpAttachment> wpAttachment) {
            this.wpAttachment = wpAttachment;
        }

        public List<WpTerm> getWpTerm() {
            return wpTerm;
        }

        public void setWpTerm(List<WpTerm> wpTerm) {
            this.wpTerm = wpTerm;
        }

        public List<Cury> getCuries() {
            return curies;
        }

        public void setCuries(List<Cury> curies) {
            this.curies = curies;
        }

    }


    public class MediaDetails {

        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("sizes")
        @Expose
        private Sizes sizes;
        @SerializedName("image_meta")
        @Expose
        private ImageMeta imageMeta;

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Sizes getSizes() {
            return sizes;
        }

        public void setSizes(Sizes sizes) {
            this.sizes = sizes;
        }

        public ImageMeta getImageMeta() {
            return imageMeta;
        }

        public void setImageMeta(ImageMeta imageMeta) {
            this.imageMeta = imageMeta;
        }

    }

    public class Medium {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class MediumLarge {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class PredecessorVersion {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("href")
        @Expose
        private String href;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Reply {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Self {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class Sizes {

        @SerializedName("thumbnail")
        @Expose
        private Thumbnail thumbnail;
        @SerializedName("medium")
        @Expose
        private Medium medium;
        @SerializedName("medium_large")
        @Expose
        private MediumLarge mediumLarge;
        @SerializedName("tie-small")
        @Expose
        private TieSmall tieSmall;
        @SerializedName("tie-medium")
        @Expose
        private TieMedium tieMedium;
        @SerializedName("tie-large")
        @Expose
        private TieLarge tieLarge;
        @SerializedName("slider")
        @Expose
        private Slider slider;
        @SerializedName("team-thumb")
        @Expose
        private TeamThumb teamThumb;
        @SerializedName("tptn_thumbnail")
        @Expose
        private TptnThumbnail tptnThumbnail;

        public Thumbnail getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(Thumbnail thumbnail) {
            this.thumbnail = thumbnail;
        }

        public Medium getMedium() {
            return medium;
        }

        public void setMedium(Medium medium) {
            this.medium = medium;
        }

        public MediumLarge getMediumLarge() {
            return mediumLarge;
        }

        public void setMediumLarge(MediumLarge mediumLarge) {
            this.mediumLarge = mediumLarge;
        }

        public TieSmall getTieSmall() {
            return tieSmall;
        }

        public void setTieSmall(TieSmall tieSmall) {
            this.tieSmall = tieSmall;
        }

        public TieMedium getTieMedium() {
            return tieMedium;
        }

        public void setTieMedium(TieMedium tieMedium) {
            this.tieMedium = tieMedium;
        }

        public TieLarge getTieLarge() {
            return tieLarge;
        }

        public void setTieLarge(TieLarge tieLarge) {
            this.tieLarge = tieLarge;
        }

        public Slider getSlider() {
            return slider;
        }

        public void setSlider(Slider slider) {
            this.slider = slider;
        }

        public TeamThumb getTeamThumb() {
            return teamThumb;
        }

        public void setTeamThumb(TeamThumb teamThumb) {
            this.teamThumb = teamThumb;
        }

        public TptnThumbnail getTptnThumbnail() {
            return tptnThumbnail;
        }

        public void setTptnThumbnail(TptnThumbnail tptnThumbnail) {
            this.tptnThumbnail = tptnThumbnail;
        }

    }


    public class Slider {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class TeamThumb {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class Thumbnail {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class TieLarge {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class TieMedium {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class TieSmall {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class Title {

        @SerializedName("rendered")
        @Expose
        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

    }

    public class TptnThumbnail {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime-type")
        @Expose
        private String mimeType;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

    }


    public class VersionHistory {

        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("href")
        @Expose
        private String href;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class WpAttachment {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class WpFeaturedmedium {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


    public class WpTerm {

        @SerializedName("taxonomy")
        @Expose
        private String taxonomy;
        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public String getTaxonomy() {
            return taxonomy;
        }

        public void setTaxonomy(String taxonomy) {
            this.taxonomy = taxonomy;
        }

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }




}


