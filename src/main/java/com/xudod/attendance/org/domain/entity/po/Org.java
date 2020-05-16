package com.xudod.attendance.org.domain.entity.po;

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


@ApiModel(value = "组织机构表，来源于主数据")
public class Org {
    @ApiModelProperty(example = "id", position = 1)
    private String id;

    @ApiModelProperty(example = "主数据编码", position = 2)
    private String mdmCode;

    @ApiModelProperty(example = "单位代码", position = 3)
    private String rankCode;

    @ApiModelProperty(example = "单位名称", position = 4)
    private String name;

    @ApiModelProperty(example = "单位电话号码", position = 5)
    private String telephone;

    @ApiModelProperty(example = "统一社会信用代码", position = 6)
    private String creditCode;

    @ApiModelProperty(example = "所属行业", position = 7)
    private String industry;

    @ApiModelProperty(example = "机构级别", position = 8)
    private String level;

    @ApiModelProperty(example = "单位负责人编码", position = 9)
    private String chargeCode;

    @ApiModelProperty(example = "注册资本", position = 10)
    private String registeredCapital;

    @ApiModelProperty(example = "法人代表", position = 11)
    private String legalRepresentative;

    @ApiModelProperty(example = "组织类型", position = 12)
    private String orgDimension;

	@ApiModelProperty(example = "单位类型", position = 12)
    private String type;

    @ApiModelProperty(example = "有效日期起", position = 13)
    private String effectiveDateStart;

    @ApiModelProperty(example = "有效日期止", position = 14)
    private String effectiveDateEnd;

    @ApiModelProperty(example = "组织机构ID", position = 15)
    private String fromSysHrId;

    @ApiModelProperty(example = "主数据系统id", position = 16)
    private String fromSysMdmId;

    @ApiModelProperty(example = "单位类型标识", position = 17)
    private String typeMark;

    @ApiModelProperty(example = "单位负责人", position = 18)
    private String chargeName;

    @ApiModelProperty(example = "上级单位id", position = 19)
    private String superiorId;

    @ApiModelProperty(example = "上级单位代码", position = 20)
    private String superiorRankCode;

    @ApiModelProperty(example = "上级单位编码", position = 21)
    private String superiorCode;

    @ApiModelProperty(example = "上级单位名称", position = 22)
    private String superiorName;

    @ApiModelProperty(example = "所属产业编码", position = 23)
    private String produceCode;

    @ApiModelProperty(example = "所属产业名称", position = 24)
    private String produceName;

    @ApiModelProperty(example = "所属区域", position = 25)
    private String area;

    @ApiModelProperty(example = "排序号", position = 26)
    private Integer sequence;

    @ApiModelProperty(example = "备注", position = 27)
    private String remark;

    @ApiModelProperty(example = "分享模式一", hidden = true, position = 28)
    @TableField(value = "public_able", fill = FieldFill.INSERT)
    private String publicAble;

    @ApiModelProperty(example = "分享模式二", hidden = true, position = 29)
    @TableField(value = "shared_able", fill = FieldFill.INSERT)
    private String sharedAble;

    @ApiModelProperty(example = "接口数据状态", hidden = true, position = 30)
    private String infStatus;

    @ApiModelProperty(example = "是否可用", hidden = true, position = 31)
    @TableField(value = "status", fill = FieldFill.INSERT)
    private String status;

    @ApiModelProperty(example = "乐观锁", hidden = true, position = 32)
    @Version
    @TableField(value = "version", fill = FieldFill.INSERT)
    private Integer version;

    @ApiModelProperty(example = "删除状态", hidden = true, position = 33)
    @TableLogic
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ApiModelProperty(example = "用户id", hidden = true, position = 34)
    private String userId;

    @ApiModelProperty(example = "所属组织id", hidden = true, position = 35)
    private String orgId;

    @ApiModelProperty(example = "所属应用id", hidden = true, position = 36)
    private String appId;

    @ApiModelProperty(example = "数据来源", hidden = true, position = 37)
    private String clientType;

    @ApiModelProperty(example = "创建者", hidden = true, position = 38)
    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "创建时间", hidden = true, position = 39)
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(example = "修改者", hidden = true, position = 40)
    private String modifyBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "修改时间", hidden = true, position = 41)
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
     * 主数据编码
     * @return mdm_code 主数据编码
     */
    public String getMdmCode() {
        return mdmCode;
    }

    /**
     * 主数据编码
     * @param mdmCode 主数据编码
     */
    public void setMdmCode(String mdmCode) {
        this.mdmCode = mdmCode;
    }

    /**
     * 单位代码
     * @return rank_code 单位代码
     */
    public String getRankCode() {
        return rankCode;
    }

    /**
     * 单位代码
     * @param rankCode 单位代码
     */
    public void setRankCode(String rankCode) {
        this.rankCode = rankCode;
    }

    /**
     * 单位名称
     * @return name 单位名称
     */
    public String getName() {
        return name;
    }

    /**
     * 单位名称
     * @param name 单位名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 单位电话号码
     * @return telephone 单位电话号码
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 单位电话号码
     * @param telephone 单位电话号码
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 统一社会信用代码
     * @return credit_code 统一社会信用代码
     */
    public String getCreditCode() {
        return creditCode;
    }

    /**
     * 统一社会信用代码
     * @param creditCode 统一社会信用代码
     */
    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    /**
     * 所属行业
     * @return industry 所属行业
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 所属行业
     * @param industry 所属行业
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * 机构级别
     * @return level 机构级别
     */
    public String getLevel() {
        return level;
    }

    /**
     * 机构级别
     * @param level 机构级别
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 单位负责人编码
     * @return charge_code 单位负责人编码
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * 单位负责人编码
     * @param chargeCode 单位负责人编码
     */
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    /**
     * 注册资本
     * @return registered_capital 注册资本
     */
    public String getRegisteredCapital() {
        return registeredCapital;
    }

    /**
     * 注册资本
     * @param registeredCapital 注册资本
     */
    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    /**
     * 法人代表
     * @return legal_representative 法人代表
     */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    /**
     * 法人代表
     * @param legalRepresentative 法人代表
     */
    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    /**
     * 组织维度
     * @param orgDimension 组织维度
     */
	public String getOrgDimension() {
		return orgDimension;
	}

    /**
     * 组织维度
     * @param orgDimension 组织维度
     */
	public void setOrgDimension(String orgDimension) {
		this.orgDimension = orgDimension;
	}

    /**
     * 单位类型
     * @return type 单位类型
     */
    public String getType() {
        return type;
    }

    /**
     * 单位类型
     * @param type 单位类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 有效日期起
     * @return effective_date_start 有效日期起
     */
    public String getEffectiveDateStart() {
        return effectiveDateStart;
    }

    /**
     * 有效日期起
     * @param effectiveDateStart 有效日期起
     */
    public void setEffectiveDateStart(String effectiveDateStart) {
        this.effectiveDateStart = effectiveDateStart;
    }

    /**
     * 有效日期止
     * @return effective_date_end 有效日期止
     */
    public String getEffectiveDateEnd() {
        return effectiveDateEnd;
    }

    /**
     * 有效日期止
     * @param effectiveDateEnd 有效日期止
     */
    public void setEffectiveDateEnd(String effectiveDateEnd) {
        this.effectiveDateEnd = effectiveDateEnd;
    }

    /**
     * 组织机构ID
     * @return from_sys_hr_id 组织机构ID
     */
    public String getFromSysHrId() {
        return fromSysHrId;
    }

    /**
     * 组织机构ID
     * @param fromSysHrId 组织机构ID
     */
    public void setFromSysHrId(String fromSysHrId) {
        this.fromSysHrId = fromSysHrId;
    }

    /**
     * 主数据系统id
     * @return from_sys_mdm_id 主数据系统id
     */
    public String getFromSysMdmId() {
        return fromSysMdmId;
    }

    /**
     * 主数据系统id
     * @param fromSysMdmId 主数据系统id
     */
    public void setFromSysMdmId(String fromSysMdmId) {
        this.fromSysMdmId = fromSysMdmId;
    }

    /**
     * 单位类型标识
     * @return type_mark 单位类型标识
     */
    public String getTypeMark() {
        return typeMark;
    }

    /**
     * 单位类型标识
     * @param typeMark 单位类型标识
     */
    public void setTypeMark(String typeMark) {
        this.typeMark = typeMark;
    }

    /**
     * 单位负责人
     * @return charge_name 单位负责人
     */
    public String getChargeName() {
        return chargeName;
    }

    /**
     * 单位负责人
     * @param chargeName 单位负责人
     */
    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    /**
     * 上级单位id
     * @return superior_id 上级单位id
     */
    public String getSuperiorId() {
        return superiorId;
    }

    /**
     * 上级单位id
     * @param superiorId 上级单位id
     */
    public void setSuperiorId(String superiorId) {
        this.superiorId = superiorId;
    }

    /**
     * 上级单位代码
     * @return superior_rank_code 上级单位代码
     */
    public String getSuperiorRankCode() {
        return superiorRankCode;
    }

    /**
     * 上级单位代码
     * @param superiorRankCode 上级单位代码
     */
    public void setSuperiorRankCode(String superiorRankCode) {
        this.superiorRankCode = superiorRankCode;
    }

    /**
     * 上级单位编码
     * @return superior_code 上级单位编码
     */
    public String getSuperiorCode() {
        return superiorCode;
    }

    /**
     * 上级单位编码
     * @param superiorCode 上级单位编码
     */
    public void setSuperiorCode(String superiorCode) {
        this.superiorCode = superiorCode;
    }

    /**
     * 上级单位名称
     * @return superior_name 上级单位名称
     */
    public String getSuperiorName() {
        return superiorName;
    }

    /**
     * 上级单位名称
     * @param superiorName 上级单位名称
     */
    public void setSuperiorName(String superiorName) {
        this.superiorName = superiorName;
    }

    /**
     * 所属产业编码
     * @return produce_code 所属产业编码
     */
    public String getProduceCode() {
        return produceCode;
    }

    /**
     * 所属产业编码
     * @param produceCode 所属产业编码
     */
    public void setProduceCode(String produceCode) {
        this.produceCode = produceCode;
    }

    /**
     * 所属产业名称
     * @return produce_name 所属产业名称
     */
    public String getProduceName() {
        return produceName;
    }

    /**
     * 所属产业名称
     * @param produceName 所属产业名称
     */
    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }

    /**
     * 所属区域
     * @return area 所属区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 所属区域
     * @param area 所属区域
     */
    public void setArea(String area) {
        this.area = area;
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