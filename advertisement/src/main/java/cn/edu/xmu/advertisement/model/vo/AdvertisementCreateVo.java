package cn.edu.xmu.advertisement.model.vo;

import cn.edu.xmu.advertisement.model.bo.Advertisement;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@ApiModel
public class AdvertisementCreateVo {
    @ApiModelProperty(value = "广告内容")
    private String content;

    @ApiModelProperty(value = "权重")
    private Integer weight;

    @ApiModelProperty(value = "开始日期")
    private String beginDate;

    @ApiModelProperty(value = "结束日期")
    private String endDate;

    @ApiModelProperty(value = "是否重复")
    private Boolean repeat;

    @ApiModelProperty(value = "链接")
    private String link;

    public Advertisement createAdvertisement(){
        Advertisement advertisement=new Advertisement();

        advertisement.setContent(content);
        advertisement.setWeight(weight);

        DateTimeFormatter df= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate begin=LocalDate.parse(beginDate,df);
        advertisement.setBeginDate(begin);
        LocalDate end=LocalDate.parse(endDate,df);
        advertisement.setEndDate(end);

        if(repeat) {
            advertisement.setRepeats((byte)1);
        }
        else{
            advertisement.setRepeats((byte)0);
        }
        advertisement.setLink(link);

        return advertisement;
    }

}
