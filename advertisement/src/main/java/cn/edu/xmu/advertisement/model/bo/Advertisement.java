package cn.edu.xmu.advertisement.model.bo;

import cn.edu.xmu.advertisement.model.po.AdvertisementPo;
import cn.edu.xmu.advertisement.model.vo.AdvertisementRetVo;
import cn.edu.xmu.ooad.model.VoObject;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Data
public class Advertisement implements VoObject {

    /**
     * 广告状态
     */
    public enum State{
        CHECK(0,"审核"),
        ONSHELF(4,"上架"),
        OFFSHELF(6,"下架");

        private static final Map<Integer,State> stateMap;

        static {
            stateMap=new HashMap<>();
            for(State enum1:values()){
                stateMap.put(enum1.code,enum1);
            }
        }

        private int code;
        private String description;

        State(int code,String description){
            this.code=code;
            this.description=description;
        }

        public static State getTypeByCode(Integer code){return stateMap.get(code);}

        public Integer getCode(){return code;}

        public String getDescription(){return description;}
    }

    private Long id;

    private Long segId;

    private String link;

    private String content;

    private String imageUrl;

    private Byte state;

    private Integer weight;

    private LocalDate beginDate;

    private LocalDate endDate;

    private Byte repeats;

    private String message;

    private Byte beDefault;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;


    public Advertisement(){

    }

    public Advertisement(AdvertisementPo po){
        this.id=po.getId();
        this.segId=po.getSegId();
        this.link=po.getLink();
        this.content=po.getContent();
        this.imageUrl=po.getImageUrl();
        this.state=po.getState();
        this.weight=po.getWeight();
        this.beginDate=po.getBeginDate();
        this.endDate=po.getEndDate();
        this.repeats=po.getRepeats();
        this.message=po.getMessage();
        this.beDefault=po.getBeDefault();
        this.gmtCreate=po.getGmtCreate();
        this.gmtModified=po.getGmtModified();
    }

    public AdvertisementPo createInsertAdvertisement(){
        AdvertisementPo advertisementPo=new AdvertisementPo();

        advertisementPo.setContent(content);
        advertisementPo.setWeight(weight);
        advertisementPo.setSegId(segId);
        advertisementPo.setBeginDate(beginDate);
        advertisementPo.setEndDate(endDate);
        advertisementPo.setRepeats(repeats);
        advertisementPo.setLink(link);
        advertisementPo.setState(State.CHECK.getCode().byteValue());

        advertisementPo.setGmtCreate(LocalDateTime.now());
        advertisementPo.setGmtModified(null);

        return advertisementPo;
    }

    public AdvertisementPo createInsertAdvertisement1(Long segId){
        AdvertisementPo po=new AdvertisementPo();

        po.setId(id);
        po.setSegId(segId);
        po.setGmtModified(LocalDateTime.now());

        return po;
    }


    @Override
    public AdvertisementRetVo createVo() {
        AdvertisementRetVo vo=new AdvertisementRetVo();

        vo.setId(id);
        vo.setSegId(segId);
        vo.setLink(link);
        vo.setContent(content);
        vo.setImagePath(imageUrl);
        vo.setState(state);
        vo.setState(state);
        vo.setWeight(weight);
        vo.setBeginDate(beginDate);
        vo.setEndDate(endDate);
        vo.setRepeat(repeats);
        vo.setBeDefault(beDefault);
        vo.setGmtCreate(gmtCreate);
        vo.setGmtModified(gmtModified);

        return vo;
    }

    @Override
    public Object createSimpleVo() {
        return null;
    }
}
