package life.majiang.community.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private long gmtCreate;
    private long gmtModified;
    private Integer creator;
    private Integer viewCount =0 ;
    private Integer commentCount =0;
    private Integer likeCount =0;
}
