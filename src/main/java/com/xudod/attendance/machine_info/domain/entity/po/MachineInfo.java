package com.xudod.attendance.machine_info.domain.entity.po;

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


@ApiModel(value = "考勤机设备管理模块")
public class MachineInfo {
    @ApiModelProperty(example = "id", position = 1)
    private String id;

    @ApiModelProperty(example = "考勤机编码", position = 2)
    private String machineCode;

    @ApiModelProperty(example = "考勤机型号", position = 3)
    private String model;

    @ApiModelProperty(example = "考勤机安装地址", position = 4)
    private String address;

    @ApiModelProperty(example = "ip", position = 5)
    private String ip;

    @ApiModelProperty(example = "端口号", position = 6)
    private String port;

    @ApiModelProperty(example = "所在公司", position = 7)
    private String company;

    @ApiModelProperty(example = "所在部门", position = 8)
    private String department;

    @ApiModelProperty(example = "负责人", position = 9)
    private String mperson;

    @ApiModelProperty(example = "负责人电话", position = 10)
    private String mpersonTel;

    @ApiModelProperty(example = "是否显示", position = 11)
    private String isShow;

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
     * 考勤机编码
     * @return machine_code 考勤机编码
     */
    public String getMachineCode() {
        return machineCode;
    }

    /**
     * 考勤机编码
     * @param machineCode 考勤机编码
     */
    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    /**
     * 考勤机型号
     * @return model 考勤机型号
     */
    public String getModel() {
        return model;
    }

    /**
     * 考勤机型号
     * @param model 考勤机型号
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 考勤机安装地址
     * @return address 考勤机安装地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 考勤机安装地址
     * @param address 考勤机安装地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * ip
     * @return ip ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * ip
     * @param ip ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 端口号
     * @return port 端口号
     */
    public String getPort() {
        return port;
    }

    /**
     * 端口号
     * @param port 端口号
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * 所在公司
     * @return company 所在公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 所在公司
     * @param company 所在公司
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 所在部门
     * @return department 所在部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 所在部门
     * @param department 所在部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 负责人
     * @return mperson 负责人
     */
    public String getMperson() {
        return mperson;
    }

    /**
     * 负责人
     * @param mperson 负责人
     */
    public void setMperson(String mperson) {
        this.mperson = mperson;
    }

    /**
     * 负责人电话
     * @return mperson_tel 负责人电话
     */
    public String getMpersonTel() {
        return mpersonTel;
    }

    /**
     * 负责人电话
     * @param mpersonTel 负责人电话
     */
    public void setMpersonTel(String mpersonTel) {
        this.mpersonTel = mpersonTel;
    }

    /**
     * 是否显示
     * @return is_show 是否显示
     */
    public String getIsShow() {
        return isShow;
    }

    /**
     * 是否显示
     * @param isShow 是否显示
     */
    public void setIsShow(String isShow) {
        this.isShow = isShow;
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