package cn.edu.xmu.other.model.po;

public class SharePo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column other_share.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column other_share.sharer_id
     *
     * @mbg.generated
     */
    private Long sharerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column other_share.goods_spu_id
     *
     * @mbg.generated
     */
    private Long goodsSpuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column other_share.quantity
     *
     * @mbg.generated
     */
    private Integer quantity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column other_share.id
     *
     * @return the value of other_share.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column other_share.id
     *
     * @param id the value for other_share.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column other_share.sharer_id
     *
     * @return the value of other_share.sharer_id
     *
     * @mbg.generated
     */
    public Long getSharerId() {
        return sharerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column other_share.sharer_id
     *
     * @param sharerId the value for other_share.sharer_id
     *
     * @mbg.generated
     */
    public void setSharerId(Long sharerId) {
        this.sharerId = sharerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column other_share.goods_spu_id
     *
     * @return the value of other_share.goods_spu_id
     *
     * @mbg.generated
     */
    public Long getGoodsSpuId() {
        return goodsSpuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column other_share.goods_spu_id
     *
     * @param goodsSpuId the value for other_share.goods_spu_id
     *
     * @mbg.generated
     */
    public void setGoodsSpuId(Long goodsSpuId) {
        this.goodsSpuId = goodsSpuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column other_share.quantity
     *
     * @return the value of other_share.quantity
     *
     * @mbg.generated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column other_share.quantity
     *
     * @param quantity the value for other_share.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}