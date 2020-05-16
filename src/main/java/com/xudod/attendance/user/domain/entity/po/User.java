package com.xudod.attendance.user.domain.entity.po;

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


@ApiModel(value = "人员信息表，数据来源于主数据")
public class User {
    @ApiModelProperty(example = "id", position = 1)
    private String id;

    @ApiModelProperty(example = "员工人事系统ID", position = 2)
    private String fromSysHrId;

    @ApiModelProperty(example = "员工主数据系统ID", position = 3)
    private String fromSysMdmId;

    @ApiModelProperty(example = "主数据编码", position = 4)
    private String mdmCode;

    @ApiModelProperty(example = "姓名", position = 5)
    private String name;

    @ApiModelProperty(example = "单位编码的值", position = 6)
    private String companyCode;

    @ApiModelProperty(example = "单位名称的值", position = 7)
    private String companyName;

    @ApiModelProperty(example = "所属产业编码", position = 8)
    private String produceCode;

    @ApiModelProperty(example = "所属产业名称", position = 9)
    private String produceName;

    @ApiModelProperty(example = "部门编码的值", position = 10)
    private String departmentCode;

    @ApiModelProperty(example = "所属部门名称", position = 11)
    private String departmentName;

    @ApiModelProperty(example = "岗位名称", position = 12)
    private String postName;

    @ApiModelProperty(example = "岗位编码", position = 13)
    private String postCode;

    @ApiModelProperty(example = "岗位级别", position = 14)
    private String postLevel;

    @ApiModelProperty(example = "性别", position = 15)
    private String gender;

    @ApiModelProperty(example = "出生日期的值", position = 16)
    private String burnDay;

    @ApiModelProperty(example = "籍贯的值", position = 17)
    private String birthPlace;

    @ApiModelProperty(example = "民族的值", position = 18)
    private String nation;

    @ApiModelProperty(example = "公民身份号码的值", position = 19)
    private String idCard;

    @ApiModelProperty(example = "进入集团时间", position = 20)
    private String joinBlocTime;

    @ApiModelProperty(example = "进入本单位时间", position = 21)
    private String joinCompanyTime;

    @ApiModelProperty(example = "产业类别的值", position = 22)
    private String industrySort;

    @ApiModelProperty(example = "区域的值", position = 23)
    private String arae;

    @ApiModelProperty(example = "岗位备注的值", position = 24)
    private String postRemark;

    @ApiModelProperty(example = "所属组织编码，可以直接从主数据获取", position = 25)
    private String orgCode;

    @ApiModelProperty(example = "所属组织id，不能直接从主数据获取到*废弃", position = 26)
    private String orgIdOth;

    @ApiModelProperty(example = "员工类别", position = 27)
    private String empSort;

    @ApiModelProperty(example = "户口性质的值", position = 28)
    private String accountNature;

    @ApiModelProperty(example = "户口所在地的值", position = 29)
    private String accountAccess;

    @ApiModelProperty(example = "移动电话", position = 30)
    private String phone;

    @ApiModelProperty(example = "办公电话的值", position = 31)
    private String officePhone;

    @ApiModelProperty(example = "家庭地址的值", position = 32)
    private String homeAccess;

    @ApiModelProperty(example = "邮政编码的值", position = 33)
    private String postalCode;

    @ApiModelProperty(example = "家庭电话的值", position = 34)
    private String homePhone;

    @ApiModelProperty(example = "毕业院校的值", position = 35)
    private String graduatedSchool;

    @ApiModelProperty(example = "所学专业的值", position = 36)
    private String specialty;

    @ApiModelProperty(example = "入学时间的值", position = 37)
    private String admissionTime;

    @ApiModelProperty(example = "毕业时间的值", position = 38)
    private String graduatedTime;

    @ApiModelProperty(example = "学历的值", position = 39)
    private String education;

    @ApiModelProperty(example = "最高学历的值", position = 40)
    private String highEducation;

    @ApiModelProperty(example = "专业职称或资格认证的值", position = 41)
    private String jobTitle;

    @ApiModelProperty(example = "专长的值", position = 42)
    private String expertise;

    @ApiModelProperty(example = "外语水平的值", position = 43)
    private String foreignLanguageLevel;

    @ApiModelProperty(example = "计算机水平的值", position = 44)
    private String computerLevel;

    @ApiModelProperty(example = "任本职务时间的值", position = 45)
    private String responsibilityPosition;

    @ApiModelProperty(example = "任现岗位级别时间的值", position = 46)
    private String currentPostTime;

    @ApiModelProperty(example = "政治面貌的值", position = 47)
    private String politicalStatus;

    @ApiModelProperty(example = "拼音简码的值", position = 48)
    private String pinyinShortCode;

    @ApiModelProperty(example = "邮箱", position = 49)
    private String elecEmail;

    @ApiModelProperty(example = "员工上级编码", position = 50)
    private String leaderCode;

    @ApiModelProperty(example = "员工上级名称", position = 51)
    private String leaderName;

    @ApiModelProperty(example = "职级", position = 52)
    private String rankLevel;

    @ApiModelProperty(example = "部门主负责人的值", position = 53)
    private String headDepartment;

    @ApiModelProperty(example = "统一账户", position = 54)
    private String unityAccount;

    @ApiModelProperty(example = "账户密码", position = 55)
    private String password;

    @ApiModelProperty(example = "是否已绑定手机的值", position = 56)
    private String bindPhone;

    @ApiModelProperty(example = "银行卡号的值", position = 57)
    private String bankCardNumber;

    @ApiModelProperty(example = "工龄（年）的值", position = 58)
    private String lengthService;

    @ApiModelProperty(example = "统一企业邮箱的值", position = 59)
    private String uniteEmail;

    @ApiModelProperty(example = "排序号", position = 60)
    private Integer sequence;

    @ApiModelProperty(example = "备注", position = 61)
    private String remark;

    @ApiModelProperty(example = "分享模式一", hidden = true, position = 62)
    @TableField(value = "public_able", fill = FieldFill.INSERT)
    private String publicAble;

    @ApiModelProperty(example = "分享模式二", hidden = true, position = 63)
    @TableField(value = "shared_able", fill = FieldFill.INSERT)
    private String sharedAble;

    @ApiModelProperty(example = "接口数据状态", hidden = true, position = 64)
    private String infStatus;

    @ApiModelProperty(example = "是否可用", hidden = true, position = 65)
    @TableField(value = "status", fill = FieldFill.INSERT)
    private String status;

    @ApiModelProperty(example = "乐观锁", hidden = true, position = 66)
    @Version
    @TableField(value = "version", fill = FieldFill.INSERT)
    private Integer version;

    @ApiModelProperty(example = "删除状态", hidden = true, position = 67)
    @TableLogic
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ApiModelProperty(example = "用户id", hidden = true, position = 68)
    private String userId;

    @ApiModelProperty(example = "所属组织id", hidden = true, position = 69)
    private String orgId;

    @ApiModelProperty(example = "所属应用id", hidden = true, position = 70)
    private String appId;

    @ApiModelProperty(example = "数据来源", hidden = true, position = 71)
    private String clientType;

    @ApiModelProperty(example = "创建者", hidden = true, position = 72)
    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "创建时间", hidden = true, position = 73)
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(example = "修改者", hidden = true, position = 74)
    private String modifyBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "修改时间", hidden = true, position = 75)
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
     * 员工人事系统ID
     * @return from_sys_hr_id 员工人事系统ID
     */
    public String getFromSysHrId() {
        return fromSysHrId;
    }

    /**
     * 员工人事系统ID
     * @param fromSysHrId 员工人事系统ID
     */
    public void setFromSysHrId(String fromSysHrId) {
        this.fromSysHrId = fromSysHrId;
    }

    /**
     * 员工主数据系统ID
     * @return from_sys_mdm_id 员工主数据系统ID
     */
    public String getFromSysMdmId() {
        return fromSysMdmId;
    }

    /**
     * 员工主数据系统ID
     * @param fromSysMdmId 员工主数据系统ID
     */
    public void setFromSysMdmId(String fromSysMdmId) {
        this.fromSysMdmId = fromSysMdmId;
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
     * 姓名
     * @return name 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 单位编码的值
     * @return company_code 单位编码的值
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 单位编码的值
     * @param companyCode 单位编码的值
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * 单位名称的值
     * @return company_name 单位名称的值
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 单位名称的值
     * @param companyName 单位名称的值
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
     * 部门编码的值
     * @return department_code 部门编码的值
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * 部门编码的值
     * @param departmentCode 部门编码的值
     */
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    /**
     * 所属部门名称
     * @return department_name 所属部门名称
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * 所属部门名称
     * @param departmentName 所属部门名称
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * 岗位名称
     * @return post_name 岗位名称
     */
    public String getPostName() {
        return postName;
    }

    /**
     * 岗位名称
     * @param postName 岗位名称
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /**
     * 岗位编码
     * @return post_code 岗位编码
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 岗位编码
     * @param postCode 岗位编码
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * 岗位级别
     * @return post_level 岗位级别
     */
    public String getPostLevel() {
        return postLevel;
    }

    /**
     * 岗位级别
     * @param postLevel 岗位级别
     */
    public void setPostLevel(String postLevel) {
        this.postLevel = postLevel;
    }

    /**
     * 性别
     * @return gender 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 性别
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 出生日期的值
     * @return burn_day 出生日期的值
     */
    public String getBurnDay() {
        return burnDay;
    }

    /**
     * 出生日期的值
     * @param burnDay 出生日期的值
     */
    public void setBurnDay(String burnDay) {
        this.burnDay = burnDay;
    }

    /**
     * 籍贯的值
     * @return birth_place 籍贯的值
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * 籍贯的值
     * @param birthPlace 籍贯的值
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /**
     * 民族的值
     * @return nation 民族的值
     */
    public String getNation() {
        return nation;
    }

    /**
     * 民族的值
     * @param nation 民族的值
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * 公民身份号码的值
     * @return id_card 公民身份号码的值
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 公民身份号码的值
     * @param idCard 公民身份号码的值
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 进入集团时间
     * @return join_bloc_time 进入集团时间
     */
    public String getJoinBlocTime() {
        return joinBlocTime;
    }

    /**
     * 进入集团时间
     * @param joinBlocTime 进入集团时间
     */
    public void setJoinBlocTime(String joinBlocTime) {
        this.joinBlocTime = joinBlocTime;
    }

    /**
     * 进入本单位时间
     * @return join_company_time 进入本单位时间
     */
    public String getJoinCompanyTime() {
        return joinCompanyTime;
    }

    /**
     * 进入本单位时间
     * @param joinCompanyTime 进入本单位时间
     */
    public void setJoinCompanyTime(String joinCompanyTime) {
        this.joinCompanyTime = joinCompanyTime;
    }

    /**
     * 产业类别的值
     * @return industry_sort 产业类别的值
     */
    public String getIndustrySort() {
        return industrySort;
    }

    /**
     * 产业类别的值
     * @param industrySort 产业类别的值
     */
    public void setIndustrySort(String industrySort) {
        this.industrySort = industrySort;
    }

    /**
     * 区域的值
     * @return arae 区域的值
     */
    public String getArae() {
        return arae;
    }

    /**
     * 区域的值
     * @param arae 区域的值
     */
    public void setArae(String arae) {
        this.arae = arae;
    }

    /**
     * 岗位备注的值
     * @return post_remark 岗位备注的值
     */
    public String getPostRemark() {
        return postRemark;
    }

    /**
     * 岗位备注的值
     * @param postRemark 岗位备注的值
     */
    public void setPostRemark(String postRemark) {
        this.postRemark = postRemark;
    }

    /**
     * 所属组织编码，可以直接从主数据获取
     * @return org_code 所属组织编码，可以直接从主数据获取
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 所属组织编码，可以直接从主数据获取
     * @param orgCode 所属组织编码，可以直接从主数据获取
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 所属组织id，不能直接从主数据获取到*废弃
     * @return org_id_oth 所属组织id，不能直接从主数据获取到*废弃
     */
    public String getOrgIdOth() {
        return orgIdOth;
    }

    /**
     * 所属组织id，不能直接从主数据获取到*废弃
     * @param orgIdOth 所属组织id，不能直接从主数据获取到*废弃
     */
    public void setOrgIdOth(String orgIdOth) {
        this.orgIdOth = orgIdOth;
    }

    /**
     * 员工类别
     * @return emp_sort 员工类别
     */
    public String getEmpSort() {
        return empSort;
    }

    /**
     * 员工类别
     * @param empSort 员工类别
     */
    public void setEmpSort(String empSort) {
        this.empSort = empSort;
    }

    /**
     * 户口性质的值
     * @return account_nature 户口性质的值
     */
    public String getAccountNature() {
        return accountNature;
    }

    /**
     * 户口性质的值
     * @param accountNature 户口性质的值
     */
    public void setAccountNature(String accountNature) {
        this.accountNature = accountNature;
    }

    /**
     * 户口所在地的值
     * @return account_access 户口所在地的值
     */
    public String getAccountAccess() {
        return accountAccess;
    }

    /**
     * 户口所在地的值
     * @param accountAccess 户口所在地的值
     */
    public void setAccountAccess(String accountAccess) {
        this.accountAccess = accountAccess;
    }

    /**
     * 移动电话
     * @return phone 移动电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 移动电话
     * @param phone 移动电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 办公电话的值
     * @return office_phone 办公电话的值
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * 办公电话的值
     * @param officePhone 办公电话的值
     */
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    /**
     * 家庭地址的值
     * @return home_access 家庭地址的值
     */
    public String getHomeAccess() {
        return homeAccess;
    }

    /**
     * 家庭地址的值
     * @param homeAccess 家庭地址的值
     */
    public void setHomeAccess(String homeAccess) {
        this.homeAccess = homeAccess;
    }

    /**
     * 邮政编码的值
     * @return postal_code 邮政编码的值
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 邮政编码的值
     * @param postalCode 邮政编码的值
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 家庭电话的值
     * @return home_phone 家庭电话的值
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * 家庭电话的值
     * @param homePhone 家庭电话的值
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * 毕业院校的值
     * @return graduated_school 毕业院校的值
     */
    public String getGraduatedSchool() {
        return graduatedSchool;
    }

    /**
     * 毕业院校的值
     * @param graduatedSchool 毕业院校的值
     */
    public void setGraduatedSchool(String graduatedSchool) {
        this.graduatedSchool = graduatedSchool;
    }

    /**
     * 所学专业的值
     * @return specialty 所学专业的值
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * 所学专业的值
     * @param specialty 所学专业的值
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * 入学时间的值
     * @return admission_time 入学时间的值
     */
    public String getAdmissionTime() {
        return admissionTime;
    }

    /**
     * 入学时间的值
     * @param admissionTime 入学时间的值
     */
    public void setAdmissionTime(String admissionTime) {
        this.admissionTime = admissionTime;
    }

    /**
     * 毕业时间的值
     * @return graduated_time 毕业时间的值
     */
    public String getGraduatedTime() {
        return graduatedTime;
    }

    /**
     * 毕业时间的值
     * @param graduatedTime 毕业时间的值
     */
    public void setGraduatedTime(String graduatedTime) {
        this.graduatedTime = graduatedTime;
    }

    /**
     * 学历的值
     * @return education 学历的值
     */
    public String getEducation() {
        return education;
    }

    /**
     * 学历的值
     * @param education 学历的值
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * 最高学历的值
     * @return high_education 最高学历的值
     */
    public String getHighEducation() {
        return highEducation;
    }

    /**
     * 最高学历的值
     * @param highEducation 最高学历的值
     */
    public void setHighEducation(String highEducation) {
        this.highEducation = highEducation;
    }

    /**
     * 专业职称或资格认证的值
     * @return job_title 专业职称或资格认证的值
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * 专业职称或资格认证的值
     * @param jobTitle 专业职称或资格认证的值
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * 专长的值
     * @return expertise 专长的值
     */
    public String getExpertise() {
        return expertise;
    }

    /**
     * 专长的值
     * @param expertise 专长的值
     */
    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    /**
     * 外语水平的值
     * @return foreign_language_level 外语水平的值
     */
    public String getForeignLanguageLevel() {
        return foreignLanguageLevel;
    }

    /**
     * 外语水平的值
     * @param foreignLanguageLevel 外语水平的值
     */
    public void setForeignLanguageLevel(String foreignLanguageLevel) {
        this.foreignLanguageLevel = foreignLanguageLevel;
    }

    /**
     * 计算机水平的值
     * @return computer_level 计算机水平的值
     */
    public String getComputerLevel() {
        return computerLevel;
    }

    /**
     * 计算机水平的值
     * @param computerLevel 计算机水平的值
     */
    public void setComputerLevel(String computerLevel) {
        this.computerLevel = computerLevel;
    }

    /**
     * 任本职务时间的值
     * @return responsibility_position 任本职务时间的值
     */
    public String getResponsibilityPosition() {
        return responsibilityPosition;
    }

    /**
     * 任本职务时间的值
     * @param responsibilityPosition 任本职务时间的值
     */
    public void setResponsibilityPosition(String responsibilityPosition) {
        this.responsibilityPosition = responsibilityPosition;
    }

    /**
     * 任现岗位级别时间的值
     * @return current_post_time 任现岗位级别时间的值
     */
    public String getCurrentPostTime() {
        return currentPostTime;
    }

    /**
     * 任现岗位级别时间的值
     * @param currentPostTime 任现岗位级别时间的值
     */
    public void setCurrentPostTime(String currentPostTime) {
        this.currentPostTime = currentPostTime;
    }

    /**
     * 政治面貌的值
     * @return political_status 政治面貌的值
     */
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    /**
     * 政治面貌的值
     * @param politicalStatus 政治面貌的值
     */
    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    /**
     * 拼音简码的值
     * @return pinyin_short_code 拼音简码的值
     */
    public String getPinyinShortCode() {
        return pinyinShortCode;
    }

    /**
     * 拼音简码的值
     * @param pinyinShortCode 拼音简码的值
     */
    public void setPinyinShortCode(String pinyinShortCode) {
        this.pinyinShortCode = pinyinShortCode;
    }

    /**
     * 邮箱
     * @return elec_email 邮箱
     */
    public String getElecEmail() {
        return elecEmail;
    }

    /**
     * 邮箱
     * @param elecEmail 邮箱
     */
    public void setElecEmail(String elecEmail) {
        this.elecEmail = elecEmail;
    }

    /**
     * 员工上级编码
     * @return leader_code 员工上级编码
     */
    public String getLeaderCode() {
        return leaderCode;
    }

    /**
     * 员工上级编码
     * @param leaderCode 员工上级编码
     */
    public void setLeaderCode(String leaderCode) {
        this.leaderCode = leaderCode;
    }

    /**
     * 员工上级名称
     * @return leader_name 员工上级名称
     */
    public String getLeaderName() {
        return leaderName;
    }

    /**
     * 员工上级名称
     * @param leaderName 员工上级名称
     */
    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    /**
     * 职级
     * @return rank_level 职级
     */
    public String getRankLevel() {
        return rankLevel;
    }

    /**
     * 职级
     * @param rankLevel 职级
     */
    public void setRankLevel(String rankLevel) {
        this.rankLevel = rankLevel;
    }

    /**
     * 部门主负责人的值
     * @return head_department 部门主负责人的值
     */
    public String getHeadDepartment() {
        return headDepartment;
    }

    /**
     * 部门主负责人的值
     * @param headDepartment 部门主负责人的值
     */
    public void setHeadDepartment(String headDepartment) {
        this.headDepartment = headDepartment;
    }

    /**
     * 统一账户
     * @return unity_account 统一账户
     */
    public String getUnityAccount() {
        return unityAccount;
    }

    /**
     * 统一账户
     * @param unityAccount 统一账户
     */
    public void setUnityAccount(String unityAccount) {
        this.unityAccount = unityAccount;
    }

    /**
     * 账户密码
     * @return password 账户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 账户密码
     * @param password 账户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 是否已绑定手机的值
     * @return bind_phone 是否已绑定手机的值
     */
    public String getBindPhone() {
        return bindPhone;
    }

    /**
     * 是否已绑定手机的值
     * @param bindPhone 是否已绑定手机的值
     */
    public void setBindPhone(String bindPhone) {
        this.bindPhone = bindPhone;
    }

    /**
     * 银行卡号的值
     * @return bank_card_number 银行卡号的值
     */
    public String getBankCardNumber() {
        return bankCardNumber;
    }

    /**
     * 银行卡号的值
     * @param bankCardNumber 银行卡号的值
     */
    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    /**
     * 工龄（年）的值
     * @return length_service 工龄（年）的值
     */
    public String getLengthService() {
        return lengthService;
    }

    /**
     * 工龄（年）的值
     * @param lengthService 工龄（年）的值
     */
    public void setLengthService(String lengthService) {
        this.lengthService = lengthService;
    }

    /**
     * 统一企业邮箱的值
     * @return unite_email 统一企业邮箱的值
     */
    public String getUniteEmail() {
        return uniteEmail;
    }

    /**
     * 统一企业邮箱的值
     * @param uniteEmail 统一企业邮箱的值
     */
    public void setUniteEmail(String uniteEmail) {
        this.uniteEmail = uniteEmail;
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