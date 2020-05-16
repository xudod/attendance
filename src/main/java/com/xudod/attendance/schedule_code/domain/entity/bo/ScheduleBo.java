package com.xudod.attendance.schedule_code.domain.entity.bo;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.xudod.attendance.schedule_code.domain.entity.po.ScheduleTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;


@ApiModel(value = "员工排班编码表，这个表和排班时间表，一旦使用，则不可编辑")
public class ScheduleBo {
    @ApiModelProperty(example = "id", position = 1)
    private String id;

    @ApiModelProperty(example = "排班编码", position = 2)
    private String scheduleCode;

    @ApiModelProperty(example = "中文名称", position = 3)
    private String scheduleName;

    @ApiModelProperty(example = "时长", position = 4)
    private String workTimeMin;

    @ApiModelProperty(example = "出勤天数", position = 5)
    private String attendDays;

    @ApiModelProperty(example = "提前开始", position = 6)
    private String scheduleFrontDay;

    @ApiModelProperty(example = "打卡段", position = 7)
    private String punchTimes;

    @ApiModelProperty(example = "人性管理", position = 8)
    private String permitMin;

    @ApiModelProperty(example = "迟到早退分钟", position = 9)
    private String lateMin;

    @ApiModelProperty(example = "旷工分钟数", position = 10)
    private String wildMin;

    @ApiModelProperty(example = "休息次数", position = 11)
    private String restType;

    @ApiModelProperty(example = "休息规则", position = 12)
    private String workTime;

    @ApiModelProperty(example = "休息时长", position = 13)
    private String restTime;
    
    @ApiModelProperty(example = "班次时间列表", position = 13)
    private List<ScheduleTime> scheduleTimeList;

    @ApiModelProperty(example = "排序号", position = 14)
    private Integer sequence;

    @ApiModelProperty(example = "备注", position = 15)
    private String remark;

    @ApiModelProperty(example = "分享模式一", hidden = true, position = 16)
    @TableField(value = "public_able", fill = FieldFill.INSERT)
    private String publicAble;

    @ApiModelProperty(example = "分享模式二", hidden = true, position = 17)
    @TableField(value = "shared_able", fill = FieldFill.INSERT)
    private String sharedAble;

    @ApiModelProperty(example = "接口数据状态", hidden = true, position = 18)
    private String infStatus;

    @ApiModelProperty(example = "是否可用", hidden = true, position = 19)
    @TableField(value = "status", fill = FieldFill.INSERT)
    private String status;

    @ApiModelProperty(example = "乐观锁", hidden = true, position = 20)
    @Version
    @TableField(value = "version", fill = FieldFill.INSERT)
    private Integer version;

    @ApiModelProperty(example = "删除状态", hidden = true, position = 21)
    @TableLogic
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ApiModelProperty(example = "用户id", hidden = true, position = 22)
    private String userId;

    @ApiModelProperty(example = "所属组织id", hidden = true, position = 23)
    private String orgId;

    @ApiModelProperty(example = "所属应用id", hidden = true, position = 24)
    private String appId;

    @ApiModelProperty(example = "数据来源", hidden = true, position = 25)
    private String clientType;

    @ApiModelProperty(example = "创建者", hidden = true, position = 26)
    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "创建时间", hidden = true, position = 27)
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(example = "修改者", hidden = true, position = 28)
    private String modifyBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "修改时间", hidden = true, position = 29)
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

    /**
     * 排班编码
     * @return schedule_code 排班编码
     */
    public String getScheduleCode() {
        return scheduleCode;
    }

    /**
     * 排班编码
     * @param scheduleCode 排班编码
     */
    public void setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
    }

    /**
     * 中文名称
     * @return schedule_name 中文名称
     */
    public String getScheduleName() {
        return scheduleName;
    }

    /**
     * 中文名称
     * @param scheduleName 中文名称
     */
    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    /**
     * 时长
     * @return work_time_min 时长
     */
    public String getWorkTimeMin() {
        return workTimeMin;
    }

    /**
     * 时长
     * @param workTimeMin 时长
     */
    public void setWorkTimeMin(String workTimeMin) {
        this.workTimeMin = workTimeMin;
    }

    /**
     * 出勤天数
     * @return attend_days 出勤天数
     */
    public String getAttendDays() {
        return attendDays;
    }

    /**
     * 出勤天数
     * @param attendDays 出勤天数
     */
    public void setAttendDays(String attendDays) {
        this.attendDays = attendDays;
    }

    /**
     * 提前开始
     * @return schedule_front_day 提前开始
     */
    public String getScheduleFrontDay() {
        return scheduleFrontDay;
    }

    /**
     * 提前开始
     * @param scheduleFrontDay 提前开始
     */
    public void setScheduleFrontDay(String scheduleFrontDay) {
        this.scheduleFrontDay = scheduleFrontDay;
    }

    /**
     * 打卡段
     * @return punch_times 打卡段
     */
    public String getPunchTimes() {
        return punchTimes;
    }

    /**
     * 打卡段
     * @param punchTimes 打卡段
     */
    public void setPunchTimes(String punchTimes) {
        this.punchTimes = punchTimes;
    }

    /**
     * 人性管理
     * @return permit_min 人性管理
     */
    public String getPermitMin() {
        return permitMin;
    }

    /**
     * 人性管理
     * @param permitMin 人性管理
     */
    public void setPermitMin(String permitMin) {
        this.permitMin = permitMin;
    }

    /**
     * 迟到早退分钟
     * @return late_min 迟到早退分钟
     */
    public String getLateMin() {
        return lateMin;
    }

    /**
     * 迟到早退分钟
     * @param lateMin 迟到早退分钟
     */
    public void setLateMin(String lateMin) {
        this.lateMin = lateMin;
    }

    /**
     * 旷工分钟数
     * @return wild_min 旷工分钟数
     */
    public String getWildMin() {
        return wildMin;
    }

    /**
     * 旷工分钟数
     * @param wildMin 旷工分钟数
     */
    public void setWildMin(String wildMin) {
        this.wildMin = wildMin;
    }

    /**
     * 休息次数
     * @return rest_type 休息次数
     */
    public String getRestType() {
        return restType;
    }

    /**
     * 休息次数
     * @param restType 休息次数
     */
    public void setRestType(String restType) {
        this.restType = restType;
    }

    /**
     * 休息规则
     * @return work_time 休息规则
     */
    public String getWorkTime() {
        return workTime;
    }

    /**
     * 休息规则
     * @param workTime 休息规则
     */
    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    /**
     * 休息时长
     * @return rest_time 休息时长
     */
    public String getRestTime() {
        return restTime;
    }

    /**
     * 休息时长
     * @param restTime 休息时长
     */
    public void setRestTime(String restTime) {
        this.restTime = restTime;
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

	public List<ScheduleTime> getScheduleTimeList() {
		return scheduleTimeList;
	}

	public void setScheduleTimeList(List<ScheduleTime> scheduleTimeList) {
		this.scheduleTimeList = scheduleTimeList;
	}
    
}