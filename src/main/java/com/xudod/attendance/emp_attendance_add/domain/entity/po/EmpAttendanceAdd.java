package com.xudod.attendance.emp_attendance_add.domain.entity.po;

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


@ApiModel(value = "员工补考勤表，，数据从bpm来")
public class EmpAttendanceAdd {
    @ApiModelProperty(example = "id", position = 1)
    private String id;

    @ApiModelProperty(example = "补充名称", position = 2)
    private String aaddName;

    @ApiModelProperty(example = "流水号", position = 3)
    private String bpmSerialNum;

    @ApiModelProperty(example = "员工code", position = 4)
    private String empMdmCode;

    @ApiModelProperty(example = "补充日期", position = 5)
    private String aaddDate;

    @ApiModelProperty(example = "补充状态", position = 6)
    private String aaddStatus;

    @ApiModelProperty(example = "补充内容", position = 7)
    private String aaddContent;

    @ApiModelProperty(example = "是否显示", position = 8)
    private Integer isShow;

    @ApiModelProperty(example = "是否归档", position = 9)
    private Integer isArchive;

    @ApiModelProperty(example = "是否取消", position = 10)
    private Integer isCancel;

    @ApiModelProperty(example = "流水id", position = 11)
    private String instanceId;

    @ApiModelProperty(example = "排序号", position = 12)
    private Integer sequence;

    @ApiModelProperty(example = "备注", position = 13)
    private String remark;

    @ApiModelProperty(example = "分享模式一", hidden = true, position = 14)
    @TableField(value = "public_able", fill = FieldFill.INSERT)
    private String publicAble;

    @ApiModelProperty(example = "分享模式二", hidden = true, position = 15)
    @TableField(value = "shared_able", fill = FieldFill.INSERT)
    private String sharedAble;

    @ApiModelProperty(example = "接口数据状态", hidden = true, position = 16)
    private String infStatus;

    @ApiModelProperty(example = "是否可用", hidden = true, position = 17)
    @TableField(value = "status", fill = FieldFill.INSERT)
    private String status;

    @ApiModelProperty(example = "乐观锁", hidden = true, position = 18)
    @Version
    @TableField(value = "version", fill = FieldFill.INSERT)
    private Integer version;

    @ApiModelProperty(example = "删除状态", hidden = true, position = 19)
    @TableLogic
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ApiModelProperty(example = "用户id", hidden = true, position = 20)
    private String userId;

    @ApiModelProperty(example = "所属组织id", hidden = true, position = 21)
    private String orgId;

    @ApiModelProperty(example = "所属应用id", hidden = true, position = 22)
    private String appId;

    @ApiModelProperty(example = "数据来源", hidden = true, position = 23)
    private String clientType;

    @ApiModelProperty(example = "创建者", hidden = true, position = 24)
    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "创建时间", hidden = true, position = 25)
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(example = "修改者", hidden = true, position = 26)
    private String modifyBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "修改时间", hidden = true, position = 27)
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
     * 补充名称
     * @return aadd_name 补充名称
     */
    public String getAaddName() {
        return aaddName;
    }

    /**
     * 补充名称
     * @param aaddName 补充名称
     */
    public void setAaddName(String aaddName) {
        this.aaddName = aaddName;
    }

    /**
     * 流水号
     * @return bpm_serial_num 流水号
     */
    public String getBpmSerialNum() {
        return bpmSerialNum;
    }

    /**
     * 流水号
     * @param bpmSerialNum 流水号
     */
    public void setBpmSerialNum(String bpmSerialNum) {
        this.bpmSerialNum = bpmSerialNum;
    }

    /**
     * 员工code
     * @return emp_mdm_code 员工code
     */
    public String getEmpMdmCode() {
        return empMdmCode;
    }

    /**
     * 员工code
     * @param empMdmCode 员工code
     */
    public void setEmpMdmCode(String empMdmCode) {
        this.empMdmCode = empMdmCode;
    }

    /**
     * 补充日期
     * @return aadd_date 补充日期
     */
    public String getAaddDate() {
        return aaddDate;
    }

    /**
     * 补充日期
     * @param aaddDate 补充日期
     */
    public void setAaddDate(String aaddDate) {
        this.aaddDate = aaddDate;
    }

    /**
     * 补充状态
     * @return aadd_status 补充状态
     */
    public String getAaddStatus() {
        return aaddStatus;
    }

    /**
     * 补充状态
     * @param aaddStatus 补充状态
     */
    public void setAaddStatus(String aaddStatus) {
        this.aaddStatus = aaddStatus;
    }

    /**
     * 补充内容
     * @return aadd_content 补充内容
     */
    public String getAaddContent() {
        return aaddContent;
    }

    /**
     * 补充内容
     * @param aaddContent 补充内容
     */
    public void setAaddContent(String aaddContent) {
        this.aaddContent = aaddContent;
    }

    /**
     * 是否显示
     * @return is_show 是否显示
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * 是否显示
     * @param isShow 是否显示
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * 是否归档
     * @return is_archive 是否归档
     */
    public Integer getIsArchive() {
        return isArchive;
    }

    /**
     * 是否归档
     * @param isArchive 是否归档
     */
    public void setIsArchive(Integer isArchive) {
        this.isArchive = isArchive;
    }

    /**
     * 是否取消
     * @return is_cancel 是否取消
     */
    public Integer getIsCancel() {
        return isCancel;
    }

    /**
     * 是否取消
     * @param isCancel 是否取消
     */
    public void setIsCancel(Integer isCancel) {
        this.isCancel = isCancel;
    }

    /**
     * 流水id
     * @return instance_id 流水id
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 流水id
     * @param instanceId 流水id
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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