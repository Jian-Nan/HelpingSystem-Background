package com.helpingSystem.mapper;

import com.zzyl.entity.RetreatBill;

/**
* <p>
* retreat_bill Mapper 接口
* </p>
*
* @author itheima
*/
@Mapper
public interface RetreatBillMapper {

    public void insert(RetreatBill retreatBill);

    @Select("select * from retreat_bill where retreat_id = #{retreatId}")
    RetreatBill selectByRetreatId(long retreatId);

    @Update("update retreat_bill set  bill_json = #{billJson} where retreat_id = #{retreatId}")
    void updateBillJsonByRetreatId(@Param("billJson") String billJson, @Param("retreatId")long retreatId);

    @Delete("delete from retreat_bill where retreat_id = #{retreatId} ")
    void deleteByByRetreatId(long id);

    public void update(RetreatBill retreatBill);

}