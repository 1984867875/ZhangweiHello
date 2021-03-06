package com.crx.quanxian.dao;

import com.crx.quanxian.model.RoleResExample;
import com.crx.quanxian.model.RoleResKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleResMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_res
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    long countByExample(RoleResExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_res
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    int deleteByExample(RoleResExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_res
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    int deleteByPrimaryKey(RoleResKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_res
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    int insert(RoleResKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_res
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    int insertSelective(RoleResKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_res
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    List<RoleResKey> selectByExample(RoleResExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_res
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    int updateByExampleSelective(@Param("record") RoleResKey record, @Param("example") RoleResExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_res
     *
     * @mbg.generated Wed Dec 23 15:48:24 CST 2020
     */
    int updateByExample(@Param("record") RoleResKey record, @Param("example") RoleResExample example);
}