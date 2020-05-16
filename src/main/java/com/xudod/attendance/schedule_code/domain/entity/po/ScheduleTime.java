package com.xudod.attendance.schedule_code.domain.entity.po;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;


@ApiModel(value = "排班编码对应的上班时间表，这个表和排班编码表，一旦使用，则不可编辑")
public class ScheduleTime {
    @ApiModelProperty(example = "id", position = 1)
    private String id;

    @ApiModelProperty(example = "排班编码Code", position = 2)
    private String scheduleCode;

    @ApiModelProperty(example = "序号", position = 3)
    private Integer attSeqence;

    @ApiModelProperty(example = "上班时间", position = 4)
    private String signInTime;

    @ApiModelProperty(example = "下班时间", position = 5)
    private String signOutTime;

    @ApiModelProperty(example = "开始打卡时间", position = 6)
    private String stratTime;

    @ApiModelProperty(example = "结束打卡时间", position = 7)
    private String endTime;

    @ApiModelProperty(example = "弹性上班时间", position = 8)
    private String stratTimeElastic;

    @ApiModelProperty(example = "弹性下班时间", position = 9)
    private String endTimeElastic;

    @ApiModelProperty(example = "上班是否需要刷卡", position = 10)
    private String needSignIn;

    @ApiModelProperty(example = "下班是否需要刷卡", position = 11)
    private String needSignOut;

    @ApiModelProperty(example = "是否跨天", position = 12)
    private String across;

    @ApiModelProperty(example = "排序号", position = 13)
    private Integer sequence;

    @ApiModelProperty(example = "备注", position = 14)
    private String remark;

    @ApiModelProperty(example = "分享模式一", hidden = true, position = 15)
    @TableField(value = "public_able", fill = FieldFill.INSERT)
    private String publicAble;

    @ApiModelProperty(example = "分享模式二", hidden = true, position = 16)
    @TableField(value = "shared_able", fill = FieldFill.INSERT)
    private String sharedAble;

    @ApiModelProperty(example = "接口数据状态", hidden = true, position = 17)
    private String infStatus;

    @ApiModelProperty(example = "是否可用", hidden = true, position = 18)
    @TableField(value = "status", fill = FieldFill.INSERT)
    private String status;

    @ApiModelProperty(example = "乐观锁", hidden = true, position = 19)
    @Version
    @TableField(value = "version", fill = FieldFill.INSERT)
    private Integer version;

    @ApiModelProperty(example = "删除状态", hidden = true, position = 20)
    @TableLogic
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ApiModelProperty(example = "用户id", hidden = true, position = 21)
    private String userId;

    @ApiModelProperty(example = "所属组织id", hidden = true, position = 22)
    private String orgId;

    @ApiModelProperty(example = "所属应用id", hidden = true, position = 23)
    private String appId;

    @ApiModelProperty(example = "数据来源", hidden = true, position = 24)
    private String clientType;

    @ApiModelProperty(example = "创建者", hidden = true, position = 25)
    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "创建时间", hidden = true, position = 26)
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(example = "修改者", hidden = true, position = 27)
    private String modifyBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "修改时间", hidden = true, position = 28)
    @TableField(value = "modify_time", fill = FieldFill.INSERT_UPDATE)
    private Date modifyTime;

    /**
     * id
     * @return id id
     */
    public String getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }
    
    

    public String getScheduleCode() {
		return scheduleCode;
	}

	public void setScheduleCode(String scheduleCode) {
		this.scheduleCode = scheduleCode;
	}

	/**
     * 序号
     * @return att_seqence 序号
     */
    public Integer getAttSeqence() {
        return attSeqence;
    }

    /**
     * 序号
     * @param attSeqence 序号
     */
    public void setAttSeqence(Integer attSeqence) {
        this.attSeqence = attSeqence;
    }

    /**
     * 上班时间
     * @return sign_in_time 上班时间
     */
    public String getSignInTime() {
        return signInTime;
    }

    /**
     * 上班时间
     * @param signInTime 上班时间
     */
    public void setSignInTime(String signInTime) {
        this.signInTime = signInTime;
    }

    /**
     * 下班时间
     * @return sign_out_time 下班时间
     */
    public String getSignOutTime() {
        return signOutTime;
    }

    /**
     * 下班时间
     * @param signOutTime 下班时间
     */
    public void setSignOutTime(String signOutTime) {
        this.signOutTime = signOutTime;
    }

    /**
     * 开始打卡时间
     * @return strat_time 开始打卡时间
     */
    public String getStratTime() {
        return stratTime;
    }

    /**
     * 开始打卡时间
     * @param stratTime 开始打卡时间
     */
    public void setStratTime(String stratTime) {
        this.stratTime = stratTime;
    }

    /**
     * 结束打卡时间
     * @return end_time 结束打卡时间
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 结束打卡时间
     * @param endTime 结束打卡时间
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * 弹性上班时间
     * @return strat_time_elastic 弹性上班时间
     */
    public String getStratTimeElastic() {
        return stratTimeElastic;
    }

    /**
     * 弹性上班时间
     * @param stratTimeElastic 弹性上班时间
     */
    public void setStratTimeElastic(String stratTimeElastic) {
        this.stratTimeElastic = stratTimeElastic;
    }

    /**
     * 弹性下班时间
     * @return end_time_elastic 弹性下班时间
     */
    public String getEndTimeElastic() {
        return endTimeElastic;
    }

    /**
     * 弹性下班时间
     * @param endTimeElastic 弹性下班时间
     */
    public void setEndTimeElastic(String endTimeElastic) {
        this.endTimeElastic = endTimeElastic;
    }

    /**
     * 上班是否需要刷卡
     * @return need_sign_in 上班是否需要刷卡
     */
    public String getNeedSignIn() {
        return needSignIn;
    }

    /**
     * 上班是否需要刷卡
     * @param needSignIn 上班是否需要刷卡
     */
    public void setNeedSignIn(String needSignIn) {
        this.needSignIn = needSignIn;
    }

    /**
     * 下班是否需要刷卡
     * @return need_sign_out 下班是否需要刷卡
     */
    public String getNeedSignOut() {
        return needSignOut;
    }

    /**
     * 下班是否需要刷卡
     * @param needSignOut 下班是否需要刷卡
     */
    public void setNeedSignOut(String needSignOut) {
        this.needSignOut = needSignOut;
    }

    /**
     * 是否跨天
     * @return across 是否跨天
     */
    public String getAcross() {
        return across;
    }

    /**
     * 是否跨天
     * @param across 是否跨天
     */
    public void setAcross(String across) {
        this.across = across;
    }

    /**
     * 排序号
     * @return sequence 排序号
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 排序号
     * @param sequence 排序号
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 分享模式一
     * @return public_able 分享模式一
     */
    public String getPublicAble() {
        return publicAble;
    }

    /**
     * 分享模式一
     * @param publicAble 分享模式一
     */
    public void setPublicAble(String publicAble) {
        this.publicAble = publicAble;
    }

    /**
     * 分享模式二
     * @return shared_able 分享模式二
     */
    public String getSharedAble() {
        return sharedAble;
    }

    /**
     * 分享模式二
     * @param sharedAble 分享模式二
     */
    public void setSharedAble(String sharedAble) {
        this.sharedAble = sharedAble;
    }

    /**
     * 接口数据状态
     * @return inf_status 接口数据状态
     */
    public String getInfStatus() {
        return infStatus;
    }

    /**
     * 接口数据状态
     * @param infStatus 接口数据状态
     */
    public void setInfStatus(String infStatus) {
        this.infStatus = infStatus;
    }

    /**
     * 是否可用
     * @return status 是否可用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 是否可用
     * @param status 是否可用
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 乐观锁
     * @return version 乐观锁
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 乐观锁
     * @param version 乐观锁
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 删除状态
     * @return deleted 删除状态
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 删除状态
     * @param deleted 删除状态
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    /**
     * 用户id
     * @return user_id 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 所属组织id
     * @return org_id 所属组织id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 所属组织id
     * @param orgId 所属组织id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 所属应用id
     * @return app_id 所属应用id
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 所属应用id
     * @param appId 所属应用id
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * 数据来源
     * @return client_type 数据来源
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * 数据来源
     * @param clientType 数据来源
     */
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    /**
     * 创建者
     * @return create_by 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建者
     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改者
     * @return modify_by 修改者
     */
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * 修改者
     * @param modifyBy 修改者
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}