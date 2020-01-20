package life.majiang.community.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private long gmt_create;
    private long gmt_modified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
