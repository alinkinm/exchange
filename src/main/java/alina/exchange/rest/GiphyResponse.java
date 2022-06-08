package alina.exchange.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class GiphyResponse {
    Data data;
    Meta meta;

    public Data getData() {
        return data;
    }

    public Meta getMeta() {
        return meta;
    }

    @lombok.Data
    public static class Meta {
        public String getMsg() {
            return msg;
        }

        public float getStatus() {
            return status;
        }

        public String getResponse_id() {
            return response_id;
        }

        private String msg;
    private float status;
    private String response_id;

}
@lombok.Data
public static class Data {
    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getSlug() {
        return slug;
    }

    public String getBitly_gif_url() {
        return bitly_gif_url;
    }

    public String getBitly_url() {
        return bitly_url;
    }

    public String getEmbed_url() {
        return embed_url;
    }

    public String getUsername() {
        return username;
    }

    public String getSource() {
        return source;
    }

    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }

    public String getContent_url() {
        return content_url;
    }

    public String getSource_tld() {
        return source_tld;
    }

    public String getSource_post_url() {
        return source_post_url;
    }

    public float getIs_sticker() {
        return is_sticker;
    }

    public String getImport_datetime() {
        return import_datetime;
    }

    public String getTrending_datetime() {
        return trending_datetime;
    }

    public Images getImages() {
        return images;
    }

    public User getUser() {
        return user;
    }

    private String type;
    private String id;
    private String url;
    private String slug;
    private String bitly_gif_url;
    private String bitly_url;
    private String embed_url;
    private String username;
    private String source;
    private String title;
    private String rating;
    private String content_url;
    private String source_tld;
    private String source_post_url;
    private float is_sticker;
    private String import_datetime;
    private String trending_datetime;
    Images images;
    User user;


}
    @lombok.Data
public static class User {
    private String avatar_url;
    private String banner_image;
    private String banner_url;
    private String profile_url;
    private String username;
    private String display_name;
    private String description;
    private boolean is_verified;
    private String website_url;
    private String instagram_url;



}
@lombok.Data
public static class Images {
    public Hd getHd() {
        return hd;
    }

    public Fixed_width_still getFixed_width_still() {
        return fixed_width_still;
    }

    public Fixed_height_downsampled getFixed_height_downsampled() {
        return fixed_height_downsampled;
    }

    public Preview_gif getPreview_gif() {
        return preview_gif;
    }

    public Preview getPreview() {
        return preview;
    }

    public Fixed_height_small getFixed_height_small() {
        return fixed_height_small;
    }

    public Downsized getDownsized() {
        return downsized;
    }

    public Fixed_width_downsampled getFixed_width_downsampled() {
        return fixed_width_downsampled;
    }

    public Fixed_width getFixed_width() {
        return fixed_width;
    }

    public Downsized_still getDownsized_still() {
        return downsized_still;
    }

    public Downsized_medium getDownsized_medium() {
        return downsized_medium;
    }

    public Original_mp4 getOriginal_mp4() {
        return original_mp4;
    }

    public Downsized_large getDownsized_large() {
        return downsized_large;
    }

    public Preview_webp getPreview_webp() {
        return preview_webp;
    }

    public Original getOriginal() {
        return original;
    }

    public Original_still getOriginal_still() {
        return original_still;
    }

    public Fixed_height_small_still getFixed_height_small_still() {
        return fixed_height_small_still;
    }

    public Fixed_width_small getFixed_width_small() {
        return fixed_width_small;
    }

    public Looping getLooping() {
        return looping;
    }

    public Downsized_small getDownsized_small() {
        return downsized_small;
    }

    public Fixed_width_small_still getFixed_width_small_still() {
        return fixed_width_small_still;
    }

    public Fixed_height_still getFixed_height_still() {
        return fixed_height_still;
    }

    public Fixed_height getFixed_height() {
        return fixed_height;
    }

    public GiphyResponse._480w_still get_480w_still() {
        return _480w_still;
    }

    Hd hd;
    Fixed_width_still fixed_width_still;
    Fixed_height_downsampled fixed_height_downsampled;
    Preview_gif preview_gif;
    Preview preview;
    Fixed_height_small fixed_height_small;
    Downsized downsized;
    Fixed_width_downsampled fixed_width_downsampled;
    Fixed_width fixed_width;
    Downsized_still downsized_still;
    Downsized_medium downsized_medium;
    Original_mp4 original_mp4;
    Downsized_large downsized_large;
    Preview_webp preview_webp;
    Original original;
    Original_still original_still;
    Fixed_height_small_still fixed_height_small_still;
    Fixed_width_small fixed_width_small;
    Looping looping;
    Downsized_small downsized_small;
    Fixed_width_small_still fixed_width_small_still;
    Fixed_height_still fixed_height_still;
    Fixed_height fixed_height;
    @JsonProperty("480w_still")
    _480w_still _480w_still;



}
@JsonRootName("480w_still")
@lombok.Data
public static class _480w_still {
    private String url;
    private String width;
    private String height;

}
    @lombok.Data
public static class Fixed_height {
    private String height;
    private String mp4;
    private String mp4_size;
    private String size;
    private String url;
    private String webp;
    private String webp_size;
    private String width;



}
    @lombok.Data
public static class Fixed_height_still {
    private String height;
    private String size;
    private String url;
    private String width;



}
    @lombok.Data
public static class Fixed_width_small_still {
    private String height;
    private String size;
    private String url;
    private String width;


}
    @lombok.Data
public static class Downsized_small {
    private String height;
    private String mp4;
    private String mp4_size;
    private String width;


}
    @lombok.Data
public static class Looping {
    private String mp4;
    private String mp4_size;
}
    @lombok.Data
public static class Fixed_width_small {
    private String height;
    private String mp4;
    private String mp4_size;
    private String size;
    private String url;
    private String webp;
    private String webp_size;
    private String width;
}
    @lombok.Data
public static class Fixed_height_small_still {
    private String height;
    private String size;
    private String url;
    private String width;
}
    @lombok.Data
public static class Original_still {
    private String height;
    private String size;
    private String url;
    private String width;
}
    @lombok.Data
public static class Original {
    private String frames;
    private String hash;
    private String height;
    private String mp4;
    private String mp4_size;
    private String size;
    private String url;
    private String webp;
    private String webp_size;
    private String width;
}
    @lombok.Data
public static class Preview_webp {
    private String height;
    private String size;
    private String url;
    private String width;
}
    @lombok.Data
public static class Downsized_large {
    private String height;
    private String size;
    private String url;
    private String width;
}
    @lombok.Data
public static class Original_mp4 {
    private String height;
    private String mp4;
    private String mp4_size;
    private String width;
}
    @lombok.Data
public static class Downsized_medium {
    private String height;
    private String size;
    private String url;
    private String width;
}
    @lombok.Data
public static class Downsized_still {
    private String height;
    private String size;
    private String url;
    private String width;
}
    @lombok.Data
public static class Fixed_width {
    private String height;
    private String mp4;
    private String mp4_size;
    private String size;
    private String url;
    private String webp;
    private String webp_size;
    private String width;
}
    @lombok.Data
public static class Fixed_width_downsampled {
    private String height;
    private String size;
    private String url;
    private String webp;
    private String webp_size;
    private String width;
}
    @lombok.Data
public static class Downsized {
    private String height;
    private String size;
    private String url;
    private String width;
}
    @lombok.Data
public static class Fixed_height_small {
    private String height;
    private String mp4;
    private String mp4_size;
    private String size;
    private String url;
    private String webp;
    private String webp_size;
    private String width;
}
    @lombok.Data
public static class Preview {
    private String height;
    private String mp4;
    private String mp4_size;
    private String width;

        public String getHeight() {
            return height;
        }

        public String getMp4() {
            return mp4;
        }

        public String getMp4_size() {
            return mp4_size;
        }

        public String getWidth() {
            return width;
        }
    }
    @lombok.Data
public static class Preview_gif {
    private String height;
    private String size;
    private String url;
    private String width;
}
    @lombok.Data
public static class Fixed_height_downsampled {
    private String height;
    private String size;
    private String url;
    private String webp;
    private String webp_size;
    private String width;
}
    @lombok.Data
public static class Fixed_width_still {
    private String height;
    private String size;
    private String url;
    private String width;
}
    @lombok.Data
public static class Hd {
    private String height;
    private String mp4;
    private String mp4_size;
    private String width;
}
}