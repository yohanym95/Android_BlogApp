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
    @SerializedName("_embedded")
    @Expose
    private Embedded embedded;

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

    public Embedded getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
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


    public class About_ {

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

    public class About__ {

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


    public class Author_ {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("avatar_urls")
        @Expose
        private AvatarUrls avatarUrls;
        @SerializedName("_links")
        @Expose
        private Links_ links;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public AvatarUrls getAvatarUrls() {
            return avatarUrls;
        }

        public void setAvatarUrls(AvatarUrls avatarUrls) {
            this.avatarUrls = avatarUrls;
        }

        public Links_ getLinks() {
            return links;
        }

        public void setLinks(Links_ links) {
            this.links = links;
        }

    }


    public class Author__ {

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


    public class AvatarUrls {

        @SerializedName("24")
        @Expose
        private String _24;
        @SerializedName("48")
        @Expose
        private String _48;
        @SerializedName("96")
        @Expose
        private String _96;

        public String get24() {
            return _24;
        }

        public void set24(String _24) {
            this._24 = _24;
        }

        public String get48() {
            return _48;
        }

        public void set48(String _48) {
            this._48 = _48;
        }

        public String get96() {
            return _96;
        }

        public void set96(String _96) {
            this._96 = _96;
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


    public class Caption {

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


    public class Collection_ {

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


    public class Collection__ {

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


    public class Collection___ {

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


    public class Cury_ {

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


    public class Embedded {

        @SerializedName("author")
        @Expose
        private List<Author_> author = null;
        @SerializedName("wp:featuredmedia")
        @Expose
        private List<WpFeaturedmedium_> wpFeaturedmedia = null;
        @SerializedName("wp:term")
        @Expose
        private List<List<WpTerm_>> wpTerm = null;

        public List<Author_> getAuthor() {
            return author;
        }

        public void setAuthor(List<Author_> author) {
            this.author = author;
        }

        public List<WpFeaturedmedium_> getWpFeaturedmedia() {
            return wpFeaturedmedia;
        }

        public void setWpFeaturedmedia(List<WpFeaturedmedium_> wpFeaturedmedia) {
            this.wpFeaturedmedia = wpFeaturedmedia;
        }

        public List<List<WpTerm_>> getWpTerm() {
            return wpTerm;
        }

        public void setWpTerm(List<List<WpTerm_>> wpTerm) {
            this.wpTerm = wpTerm;
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


    public class Full {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class ImageMeta_ {

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


    public class Large {

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


    public class Large_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class Links_ {

        @SerializedName("self")
        @Expose
        private List<Self_> self = null;
        @SerializedName("collection")
        @Expose
        private List<Collection_> collection = null;

        public List<Self_> getSelf() {
            return self;
        }

        public void setSelf(List<Self_> self) {
            this.self = self;
        }

        public List<Collection_> getCollection() {
            return collection;
        }

        public void setCollection(List<Collection_> collection) {
            this.collection = collection;
        }

    }


    public class Links__ {

        @SerializedName("self")
        @Expose
        private List<Self__> self = null;
        @SerializedName("collection")
        @Expose
        private List<Collection__> collection = null;
        @SerializedName("about")
        @Expose
        private List<About_> about = null;
        @SerializedName("author")
        @Expose
        private List<Author__> author = null;
        @SerializedName("replies")
        @Expose
        private List<Reply_> replies = null;

        public List<Self__> getSelf() {
            return self;
        }

        public void setSelf(List<Self__> self) {
            this.self = self;
        }

        public List<Collection__> getCollection() {
            return collection;
        }

        public void setCollection(List<Collection__> collection) {
            this.collection = collection;
        }

        public List<About_> getAbout() {
            return about;
        }

        public void setAbout(List<About_> about) {
            this.about = about;
        }

        public List<Author__> getAuthor() {
            return author;
        }

        public void setAuthor(List<Author__> author) {
            this.author = author;
        }

        public List<Reply_> getReplies() {
            return replies;
        }

        public void setReplies(List<Reply_> replies) {
            this.replies = replies;
        }

    }


    public class Links___ {

        @SerializedName("self")
        @Expose
        private List<Self___> self = null;
        @SerializedName("collection")
        @Expose
        private List<Collection___> collection = null;
        @SerializedName("about")
        @Expose
        private List<About__> about = null;
        @SerializedName("wp:post_type")
        @Expose
        private List<WpPostType> wpPostType = null;
        @SerializedName("curies")
        @Expose
        private List<Cury_> curies = null;
        @SerializedName("up")
        @Expose
        private List<Up> up = null;

        public List<Self___> getSelf() {
            return self;
        }

        public void setSelf(List<Self___> self) {
            this.self = self;
        }

        public List<Collection___> getCollection() {
            return collection;
        }

        public void setCollection(List<Collection___> collection) {
            this.collection = collection;
        }

        public List<About__> getAbout() {
            return about;
        }

        public void setAbout(List<About__> about) {
            this.about = about;
        }

        public List<WpPostType> getWpPostType() {
            return wpPostType;
        }

        public void setWpPostType(List<WpPostType> wpPostType) {
            this.wpPostType = wpPostType;
        }

        public List<Cury_> getCuries() {
            return curies;
        }

        public void setCuries(List<Cury_> curies) {
            this.curies = curies;
        }

        public List<Up> getUp() {
            return up;
        }

        public void setUp(List<Up> up) {
            this.up = up;
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


    public class MediaDetails_ {

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
        private Sizes_ sizes;
        @SerializedName("image_meta")
        @Expose
        private ImageMeta_ imageMeta;

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

        public Sizes_ getSizes() {
            return sizes;
        }

        public void setSizes(Sizes_ sizes) {
            this.sizes = sizes;
        }

        public ImageMeta_ getImageMeta() {
            return imageMeta;
        }

        public void setImageMeta(ImageMeta_ imageMeta) {
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


    public class MediumLarge_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class Medium_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class Reply_ {

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


    public class Self_ {

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

    public class Self__ {

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


    public class Self___ {

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
        @SerializedName("large")
        @Expose
        private Large large;
        @SerializedName("vmagazine-rectangle-thumb")
        @Expose
        private VmagazineRectangleThumb vmagazineRectangleThumb;
        @SerializedName("vmagazine-small-thumb")
        @Expose
        private VmagazineSmallThumb vmagazineSmallThumb;
        @SerializedName("vmagazine-large-category")
        @Expose
        private VmagazineLargeCategory vmagazineLargeCategory;
        @SerializedName("vmagazine-single-third")
        @Expose
        private VmagazineSingleThird vmagazineSingleThird;
        @SerializedName("vmagazine-long-thumb")
        @Expose
        private VmagazineLongThumb vmagazineLongThumb;
        @SerializedName("vmagazine-small-square-thumb")
        @Expose
        private VmagazineSmallSquareThumb vmagazineSmallSquareThumb;
        @SerializedName("vmagazine-large-square-thumb")
        @Expose
        private VmagazineLargeSquareThumb vmagazineLargeSquareThumb;
        @SerializedName("vmagazine-large-square-middle")
        @Expose
        private VmagazineLargeSquareMiddle vmagazineLargeSquareMiddle;
        @SerializedName("vmagazine-long-post-thumb")
        @Expose
        private VmagazineLongPostThumb vmagazineLongPostThumb;
        @SerializedName("vmagazine-rect-post-thumb")
        @Expose
        private VmagazineRectPostThumb vmagazineRectPostThumb;
        @SerializedName("vmagazine-slider-thumb")
        @Expose
        private VmagazineSliderThumb vmagazineSliderThumb;
        @SerializedName("vmagazine-ftr-slider-thumb")
        @Expose
        private VmagazineFtrSliderThumb vmagazineFtrSliderThumb;
        @SerializedName("vmagazine-vertical-slider-thumb")
        @Expose
        private VmagazineVerticalSliderThumb vmagazineVerticalSliderThumb;
        @SerializedName("vmagazine-rect-post-carousel")
        @Expose
        private VmagazineRectPostCarousel vmagazineRectPostCarousel;
        @SerializedName("vmagazine-post-slider-lg")
        @Expose
        private VmagazinePostSliderLg vmagazinePostSliderLg;
        @SerializedName("vmagazine-cat-post-sm")
        @Expose
        private VmagazineCatPostSm vmagazineCatPostSm;
        @SerializedName("team-thumb")
        @Expose
        private TeamThumb teamThumb;
        @SerializedName("sow-carousel-default")
        @Expose
        private SowCarouselDefault sowCarouselDefault;

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

        public Large getLarge() {
            return large;
        }

        public void setLarge(Large large) {
            this.large = large;
        }

        public VmagazineRectangleThumb getVmagazineRectangleThumb() {
            return vmagazineRectangleThumb;
        }

        public void setVmagazineRectangleThumb(VmagazineRectangleThumb vmagazineRectangleThumb) {
            this.vmagazineRectangleThumb = vmagazineRectangleThumb;
        }

        public VmagazineSmallThumb getVmagazineSmallThumb() {
            return vmagazineSmallThumb;
        }

        public void setVmagazineSmallThumb(VmagazineSmallThumb vmagazineSmallThumb) {
            this.vmagazineSmallThumb = vmagazineSmallThumb;
        }

        public VmagazineLargeCategory getVmagazineLargeCategory() {
            return vmagazineLargeCategory;
        }

        public void setVmagazineLargeCategory(VmagazineLargeCategory vmagazineLargeCategory) {
            this.vmagazineLargeCategory = vmagazineLargeCategory;
        }

        public VmagazineSingleThird getVmagazineSingleThird() {
            return vmagazineSingleThird;
        }

        public void setVmagazineSingleThird(VmagazineSingleThird vmagazineSingleThird) {
            this.vmagazineSingleThird = vmagazineSingleThird;
        }

        public VmagazineLongThumb getVmagazineLongThumb() {
            return vmagazineLongThumb;
        }

        public void setVmagazineLongThumb(VmagazineLongThumb vmagazineLongThumb) {
            this.vmagazineLongThumb = vmagazineLongThumb;
        }

        public VmagazineSmallSquareThumb getVmagazineSmallSquareThumb() {
            return vmagazineSmallSquareThumb;
        }

        public void setVmagazineSmallSquareThumb(VmagazineSmallSquareThumb vmagazineSmallSquareThumb) {
            this.vmagazineSmallSquareThumb = vmagazineSmallSquareThumb;
        }

        public VmagazineLargeSquareThumb getVmagazineLargeSquareThumb() {
            return vmagazineLargeSquareThumb;
        }

        public void setVmagazineLargeSquareThumb(VmagazineLargeSquareThumb vmagazineLargeSquareThumb) {
            this.vmagazineLargeSquareThumb = vmagazineLargeSquareThumb;
        }

        public VmagazineLargeSquareMiddle getVmagazineLargeSquareMiddle() {
            return vmagazineLargeSquareMiddle;
        }

        public void setVmagazineLargeSquareMiddle(VmagazineLargeSquareMiddle vmagazineLargeSquareMiddle) {
            this.vmagazineLargeSquareMiddle = vmagazineLargeSquareMiddle;
        }

        public VmagazineLongPostThumb getVmagazineLongPostThumb() {
            return vmagazineLongPostThumb;
        }

        public void setVmagazineLongPostThumb(VmagazineLongPostThumb vmagazineLongPostThumb) {
            this.vmagazineLongPostThumb = vmagazineLongPostThumb;
        }

        public VmagazineRectPostThumb getVmagazineRectPostThumb() {
            return vmagazineRectPostThumb;
        }

        public void setVmagazineRectPostThumb(VmagazineRectPostThumb vmagazineRectPostThumb) {
            this.vmagazineRectPostThumb = vmagazineRectPostThumb;
        }

        public VmagazineSliderThumb getVmagazineSliderThumb() {
            return vmagazineSliderThumb;
        }

        public void setVmagazineSliderThumb(VmagazineSliderThumb vmagazineSliderThumb) {
            this.vmagazineSliderThumb = vmagazineSliderThumb;
        }

        public VmagazineFtrSliderThumb getVmagazineFtrSliderThumb() {
            return vmagazineFtrSliderThumb;
        }

        public void setVmagazineFtrSliderThumb(VmagazineFtrSliderThumb vmagazineFtrSliderThumb) {
            this.vmagazineFtrSliderThumb = vmagazineFtrSliderThumb;
        }

        public VmagazineVerticalSliderThumb getVmagazineVerticalSliderThumb() {
            return vmagazineVerticalSliderThumb;
        }

        public void setVmagazineVerticalSliderThumb(VmagazineVerticalSliderThumb vmagazineVerticalSliderThumb) {
            this.vmagazineVerticalSliderThumb = vmagazineVerticalSliderThumb;
        }

        public VmagazineRectPostCarousel getVmagazineRectPostCarousel() {
            return vmagazineRectPostCarousel;
        }

        public void setVmagazineRectPostCarousel(VmagazineRectPostCarousel vmagazineRectPostCarousel) {
            this.vmagazineRectPostCarousel = vmagazineRectPostCarousel;
        }

        public VmagazinePostSliderLg getVmagazinePostSliderLg() {
            return vmagazinePostSliderLg;
        }

        public void setVmagazinePostSliderLg(VmagazinePostSliderLg vmagazinePostSliderLg) {
            this.vmagazinePostSliderLg = vmagazinePostSliderLg;
        }

        public VmagazineCatPostSm getVmagazineCatPostSm() {
            return vmagazineCatPostSm;
        }

        public void setVmagazineCatPostSm(VmagazineCatPostSm vmagazineCatPostSm) {
            this.vmagazineCatPostSm = vmagazineCatPostSm;
        }

        public TeamThumb getTeamThumb() {
            return teamThumb;
        }

        public void setTeamThumb(TeamThumb teamThumb) {
            this.teamThumb = teamThumb;
        }

        public SowCarouselDefault getSowCarouselDefault() {
            return sowCarouselDefault;
        }

        public void setSowCarouselDefault(SowCarouselDefault sowCarouselDefault) {
            this.sowCarouselDefault = sowCarouselDefault;
        }

    }

    public class Sizes_ {

        @SerializedName("thumbnail")
        @Expose
        private Thumbnail_ thumbnail;
        @SerializedName("medium")
        @Expose
        private Medium_ medium;
        @SerializedName("medium_large")
        @Expose
        private MediumLarge_ mediumLarge;
        @SerializedName("large")
        @Expose
        private Large_ large;
        @SerializedName("vmagazine-rectangle-thumb")
        @Expose
        private VmagazineRectangleThumb_ vmagazineRectangleThumb;
        @SerializedName("vmagazine-small-thumb")
        @Expose
        private VmagazineSmallThumb_ vmagazineSmallThumb;
        @SerializedName("vmagazine-large-category")
        @Expose
        private VmagazineLargeCategory_ vmagazineLargeCategory;
        @SerializedName("vmagazine-single-third")
        @Expose
        private VmagazineSingleThird_ vmagazineSingleThird;
        @SerializedName("vmagazine-long-thumb")
        @Expose
        private VmagazineLongThumb_ vmagazineLongThumb;
        @SerializedName("vmagazine-small-square-thumb")
        @Expose
        private VmagazineSmallSquareThumb_ vmagazineSmallSquareThumb;
        @SerializedName("vmagazine-large-square-thumb")
        @Expose
        private VmagazineLargeSquareThumb_ vmagazineLargeSquareThumb;
        @SerializedName("vmagazine-large-square-middle")
        @Expose
        private VmagazineLargeSquareMiddle_ vmagazineLargeSquareMiddle;
        @SerializedName("vmagazine-long-post-thumb")
        @Expose
        private VmagazineLongPostThumb_ vmagazineLongPostThumb;
        @SerializedName("vmagazine-rect-post-thumb")
        @Expose
        private VmagazineRectPostThumb_ vmagazineRectPostThumb;
        @SerializedName("vmagazine-slider-thumb")
        @Expose
        private VmagazineSliderThumb_ vmagazineSliderThumb;
        @SerializedName("vmagazine-ftr-slider-thumb")
        @Expose
        private VmagazineFtrSliderThumb_ vmagazineFtrSliderThumb;
        @SerializedName("vmagazine-vertical-slider-thumb")
        @Expose
        private VmagazineVerticalSliderThumb_ vmagazineVerticalSliderThumb;
        @SerializedName("vmagazine-rect-post-carousel")
        @Expose
        private VmagazineRectPostCarousel_ vmagazineRectPostCarousel;
        @SerializedName("vmagazine-post-slider-lg")
        @Expose
        private VmagazinePostSliderLg_ vmagazinePostSliderLg;
        @SerializedName("vmagazine-cat-post-sm")
        @Expose
        private VmagazineCatPostSm_ vmagazineCatPostSm;
        @SerializedName("team-thumb")
        @Expose
        private TeamThumb_ teamThumb;
        @SerializedName("sow-carousel-default")
        @Expose
        private SowCarouselDefault_ sowCarouselDefault;
        @SerializedName("full")
        @Expose
        private Full full;

        public Thumbnail_ getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(Thumbnail_ thumbnail) {
            this.thumbnail = thumbnail;
        }

        public Medium_ getMedium() {
            return medium;
        }

        public void setMedium(Medium_ medium) {
            this.medium = medium;
        }

        public MediumLarge_ getMediumLarge() {
            return mediumLarge;
        }

        public void setMediumLarge(MediumLarge_ mediumLarge) {
            this.mediumLarge = mediumLarge;
        }

        public Large_ getLarge() {
            return large;
        }

        public void setLarge(Large_ large) {
            this.large = large;
        }

        public VmagazineRectangleThumb_ getVmagazineRectangleThumb() {
            return vmagazineRectangleThumb;
        }

        public void setVmagazineRectangleThumb(VmagazineRectangleThumb_ vmagazineRectangleThumb) {
            this.vmagazineRectangleThumb = vmagazineRectangleThumb;
        }

        public VmagazineSmallThumb_ getVmagazineSmallThumb() {
            return vmagazineSmallThumb;
        }

        public void setVmagazineSmallThumb(VmagazineSmallThumb_ vmagazineSmallThumb) {
            this.vmagazineSmallThumb = vmagazineSmallThumb;
        }

        public VmagazineLargeCategory_ getVmagazineLargeCategory() {
            return vmagazineLargeCategory;
        }

        public void setVmagazineLargeCategory(VmagazineLargeCategory_ vmagazineLargeCategory) {
            this.vmagazineLargeCategory = vmagazineLargeCategory;
        }

        public VmagazineSingleThird_ getVmagazineSingleThird() {
            return vmagazineSingleThird;
        }

        public void setVmagazineSingleThird(VmagazineSingleThird_ vmagazineSingleThird) {
            this.vmagazineSingleThird = vmagazineSingleThird;
        }

        public VmagazineLongThumb_ getVmagazineLongThumb() {
            return vmagazineLongThumb;
        }

        public void setVmagazineLongThumb(VmagazineLongThumb_ vmagazineLongThumb) {
            this.vmagazineLongThumb = vmagazineLongThumb;
        }

        public VmagazineSmallSquareThumb_ getVmagazineSmallSquareThumb() {
            return vmagazineSmallSquareThumb;
        }

        public void setVmagazineSmallSquareThumb(VmagazineSmallSquareThumb_ vmagazineSmallSquareThumb) {
            this.vmagazineSmallSquareThumb = vmagazineSmallSquareThumb;
        }

        public VmagazineLargeSquareThumb_ getVmagazineLargeSquareThumb() {
            return vmagazineLargeSquareThumb;
        }

        public void setVmagazineLargeSquareThumb(VmagazineLargeSquareThumb_ vmagazineLargeSquareThumb) {
            this.vmagazineLargeSquareThumb = vmagazineLargeSquareThumb;
        }

        public VmagazineLargeSquareMiddle_ getVmagazineLargeSquareMiddle() {
            return vmagazineLargeSquareMiddle;
        }

        public void setVmagazineLargeSquareMiddle(VmagazineLargeSquareMiddle_ vmagazineLargeSquareMiddle) {
            this.vmagazineLargeSquareMiddle = vmagazineLargeSquareMiddle;
        }

        public VmagazineLongPostThumb_ getVmagazineLongPostThumb() {
            return vmagazineLongPostThumb;
        }

        public void setVmagazineLongPostThumb(VmagazineLongPostThumb_ vmagazineLongPostThumb) {
            this.vmagazineLongPostThumb = vmagazineLongPostThumb;
        }

        public VmagazineRectPostThumb_ getVmagazineRectPostThumb() {
            return vmagazineRectPostThumb;
        }

        public void setVmagazineRectPostThumb(VmagazineRectPostThumb_ vmagazineRectPostThumb) {
            this.vmagazineRectPostThumb = vmagazineRectPostThumb;
        }

        public VmagazineSliderThumb_ getVmagazineSliderThumb() {
            return vmagazineSliderThumb;
        }

        public void setVmagazineSliderThumb(VmagazineSliderThumb_ vmagazineSliderThumb) {
            this.vmagazineSliderThumb = vmagazineSliderThumb;
        }

        public VmagazineFtrSliderThumb_ getVmagazineFtrSliderThumb() {
            return vmagazineFtrSliderThumb;
        }

        public void setVmagazineFtrSliderThumb(VmagazineFtrSliderThumb_ vmagazineFtrSliderThumb) {
            this.vmagazineFtrSliderThumb = vmagazineFtrSliderThumb;
        }

        public VmagazineVerticalSliderThumb_ getVmagazineVerticalSliderThumb() {
            return vmagazineVerticalSliderThumb;
        }

        public void setVmagazineVerticalSliderThumb(VmagazineVerticalSliderThumb_ vmagazineVerticalSliderThumb) {
            this.vmagazineVerticalSliderThumb = vmagazineVerticalSliderThumb;
        }

        public VmagazineRectPostCarousel_ getVmagazineRectPostCarousel() {
            return vmagazineRectPostCarousel;
        }

        public void setVmagazineRectPostCarousel(VmagazineRectPostCarousel_ vmagazineRectPostCarousel) {
            this.vmagazineRectPostCarousel = vmagazineRectPostCarousel;
        }

        public VmagazinePostSliderLg_ getVmagazinePostSliderLg() {
            return vmagazinePostSliderLg;
        }

        public void setVmagazinePostSliderLg(VmagazinePostSliderLg_ vmagazinePostSliderLg) {
            this.vmagazinePostSliderLg = vmagazinePostSliderLg;
        }

        public VmagazineCatPostSm_ getVmagazineCatPostSm() {
            return vmagazineCatPostSm;
        }

        public void setVmagazineCatPostSm(VmagazineCatPostSm_ vmagazineCatPostSm) {
            this.vmagazineCatPostSm = vmagazineCatPostSm;
        }

        public TeamThumb_ getTeamThumb() {
            return teamThumb;
        }

        public void setTeamThumb(TeamThumb_ teamThumb) {
            this.teamThumb = teamThumb;
        }

        public SowCarouselDefault_ getSowCarouselDefault() {
            return sowCarouselDefault;
        }

        public void setSowCarouselDefault(SowCarouselDefault_ sowCarouselDefault) {
            this.sowCarouselDefault = sowCarouselDefault;
        }

        public Full getFull() {
            return full;
        }

        public void setFull(Full full) {
            this.full = full;
        }

    }


    public class SowCarouselDefault {

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


    public class SowCarouselDefault_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class TeamThumb_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class Thumbnail_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class Title_ {

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


    public class Up {

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


    public class VmagazineCatPostSm {

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


    public class VmagazineCatPostSm_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazineFtrSliderThumb {

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


    public class VmagazineFtrSliderThumb_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazineLargeCategory {

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


    public class VmagazineLargeCategory_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazineLargeSquareMiddle {

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


    public class VmagazineLargeSquareMiddle_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazineLargeSquareThumb {

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

    public class VmagazineLargeSquareThumb_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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

    public class VmagazineLongPostThumb {

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


    public class VmagazineLongPostThumb_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazineLongThumb {

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


    public class VmagazineLongThumb_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazinePostSliderLg {

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


    public class VmagazinePostSliderLg_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazineRectPostCarousel {

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


    public class VmagazineRectPostCarousel_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazineRectPostThumb {

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


    public class VmagazineRectPostThumb_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazineRectangleThumb {

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


    public class VmagazineRectangleThumb_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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

    public class VmagazineSingleThird {

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


    public class VmagazineSingleThird_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazineSliderThumb {

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


    public class VmagazineSliderThumb_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazineSmallSquareThumb {

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


    public class VmagazineSmallSquareThumb_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazineSmallThumb {

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


    public class VmagazineSmallThumb_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class VmagazineVerticalSliderThumb {

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


    public class VmagazineVerticalSliderThumb_ {

        @SerializedName("file")
        @Expose
        private String file;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("mime_type")
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


    public class WpFeaturedmedium_ {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("title")
        @Expose
        private Title_ title;
        @SerializedName("author")
        @Expose
        private Integer author;
        @SerializedName("caption")
        @Expose
        private Caption caption;
        @SerializedName("alt_text")
        @Expose
        private String altText;
        @SerializedName("media_type")
        @Expose
        private String mediaType;
        @SerializedName("mime_type")
        @Expose
        private String mimeType;
        @SerializedName("media_details")
        @Expose
        private MediaDetails_ mediaDetails;
        @SerializedName("source_url")
        @Expose
        private String sourceUrl;
        @SerializedName("_links")
        @Expose
        private Links__ links;

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

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
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

        public Title_ getTitle() {
            return title;
        }

        public void setTitle(Title_ title) {
            this.title = title;
        }

        public Integer getAuthor() {
            return author;
        }

        public void setAuthor(Integer author) {
            this.author = author;
        }

        public Caption getCaption() {
            return caption;
        }

        public void setCaption(Caption caption) {
            this.caption = caption;
        }

        public String getAltText() {
            return altText;
        }

        public void setAltText(String altText) {
            this.altText = altText;
        }

        public String getMediaType() {
            return mediaType;
        }

        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        public String getMimeType() {
            return mimeType;
        }

        public void setMimeType(String mimeType) {
            this.mimeType = mimeType;
        }

        public MediaDetails_ getMediaDetails() {
            return mediaDetails;
        }

        public void setMediaDetails(MediaDetails_ mediaDetails) {
            this.mediaDetails = mediaDetails;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

        public Links__ getLinks() {
            return links;
        }

        public void setLinks(Links__ links) {
            this.links = links;
        }

    }


    public class WpPostType {

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


    public class WpTerm_ {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("taxonomy")
        @Expose
        private String taxonomy;
        @SerializedName("_links")
        @Expose
        private Links___ links;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getTaxonomy() {
            return taxonomy;
        }

        public void setTaxonomy(String taxonomy) {
            this.taxonomy = taxonomy;
        }

        public Links___ getLinks() {
            return links;
        }

        public void setLinks(Links___ links) {
            this.links = links;
        }

    }



}


