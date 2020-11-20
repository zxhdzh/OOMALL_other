package cn.edu.xmu.other.model.po;

import java.time.LocalDateTime;

public class TimeSegmentPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column other_time_segment.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column other_time_segment.begin_time
     *
     * @mbg.generated
     */
    private LocalDateTime beginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column other_time_segment.end_time
     *
     * @mbg.generated
     */
    private LocalDateTime endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column other_time_segment.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column other_time_segment.id
     *
     * @return the value of other_time_segment.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column other_time_segment.id
     *
     * @param id the value for other_time_segment.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column other_time_segment.begin_time
     *
     * @return the value of other_time_segment.begin_time
     *
     * @mbg.generated
     */
    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column other_time_segment.begin_time
     *
     * @param beginTime the value for other_time_segment.begin_time
     *
     * @mbg.generated
     */
    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column other_time_segment.end_time
     *
     * @return the value of other_time_segment.end_time
     *
     * @mbg.generated
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column other_time_segment.end_time
     *
     * @param endTime the value for other_time_segment.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column other_time_segment.type
     *
     * @return the value of other_time_segment.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column other_time_segment.type
     *
     * @param type the value for other_time_segment.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }
}