package com.xudod.attendance.att_report_101.domain.entity.po;

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


@ApiModel(value = "这是报表表")
public class AttReport101 {
    @ApiModelProperty(example = "id", position = 1)
    private String id;

    @ApiModelProperty(example = "成员编码", position = 2)
    private String empMdmCode;

    @ApiModelProperty(example = "年", position = 3)
    private String attYear;

    @ApiModelProperty(example = "月", position = 4)
    private String attMonth;

    @ApiModelProperty(example = "岗位名称", position = 5)
    private String positionTitle;

    @ApiModelProperty(example = "标准职级", position = 6)
    private String standardRank;

    @ApiModelProperty(example = "出勤天数", position = 7)
    private String attDay;

    @ApiModelProperty(example = "休息天数", position = 8)
    private String restDay;

    @ApiModelProperty(example = "迟到早退次数", position = 9)
    private String tenMinTimesIn;

    @ApiModelProperty(example = "旷工次数", position = 10)
    private String tenMinTimesOut;

    @ApiModelProperty(example = "缺卡数", position = 11)
    private String lackAttTimes;

    @ApiModelProperty(example = "缺勤天数", position = 12)
    private String absence;

    @ApiModelProperty(example = "1", position = 13)
    private String att1;

    @ApiModelProperty(example = "2", position = 14)
    private String att2;

    @ApiModelProperty(example = "3", position = 15)
    private String att3;

    @ApiModelProperty(example = "4", position = 16)
    private String att4;

    @ApiModelProperty(example = "5", position = 17)
    private String att5;

    @ApiModelProperty(example = "6", position = 18)
    private String att6;

    @ApiModelProperty(example = "7", position = 19)
    private String att7;

    @ApiModelProperty(example = "8", position = 20)
    private String att8;

    @ApiModelProperty(example = "9", position = 21)
    private String att9;

    @ApiModelProperty(example = "10", position = 22)
    private String att10;

    @ApiModelProperty(example = "11", position = 23)
    private String att11;

    @ApiModelProperty(example = "12", position = 24)
    private String att12;

    @ApiModelProperty(example = "13", position = 25)
    private String att13;

    @ApiModelProperty(example = "14", position = 26)
    private String att14;

    @ApiModelProperty(example = "15", position = 27)
    private String att15;

    @ApiModelProperty(example = "16", position = 28)
    private String att16;

    @ApiModelProperty(example = "17", position = 29)
    private String att17;

    @ApiModelProperty(example = "18", position = 30)
    private String att18;

    @ApiModelProperty(example = "19", position = 31)
    private String att19;

    @ApiModelProperty(example = "20", position = 32)
    private String att20;

    @ApiModelProperty(example = "21", position = 33)
    private String att21;

    @ApiModelProperty(example = "22", position = 34)
    private String att22;

    @ApiModelProperty(example = "23", position = 35)
    private String att23;

    @ApiModelProperty(example = "24", position = 36)
    private String att24;

    @ApiModelProperty(example = "25", position = 37)
    private String att25;

    @ApiModelProperty(example = "26", position = 38)
    private String att26;

    @ApiModelProperty(example = "27", position = 39)
    private String att27;

    @ApiModelProperty(example = "28", position = 40)
    private String att28;

    @ApiModelProperty(example = "29", position = 41)
    private String att29;

    @ApiModelProperty(example = "30", position = 42)
    private String att30;

    @ApiModelProperty(example = "31", position = 43)
    private String att31;

    @ApiModelProperty(example = "员工姓名", position = 44)
    private String empName;

    @ApiModelProperty(example = "因忘打卡补卡次数", position = 45)
    private String forgateAttAddTimes;

    @ApiModelProperty(example = "婚假", position = 46)
    private String leaveTypeHun;

    @ApiModelProperty(example = "事假", position = 47)
    private String leaveTypeShi;

    @ApiModelProperty(example = "年假", position = 48)
    private String leaveTypeNian;

    @ApiModelProperty(example = "调休", position = 49)
    private String leaveTypeTiao;

    @ApiModelProperty(example = "病假", position = 50)
    private String leaveTypeBing;

    @ApiModelProperty(example = "调休假", position = 51)
    private String leaveTypeTiaoxiu;

    @ApiModelProperty(example = "产检假", position = 52)
    private String leaveTypeChanjian;

    @ApiModelProperty(example = "分娩假", position = 53)
    private String leaveTypeFenmian;

    @ApiModelProperty(example = "陪产假", position = 54)
    private String leaveTypePeichan;

    @ApiModelProperty(example = "其他", position = 55)
    private String leaveTypeQita;

    @ApiModelProperty(example = "丧假", position = 56)
    private String leaveTypeSang;

    @ApiModelProperty(example = "工伤假", position = 57)
    private String leaveTypeGongshang;

    @ApiModelProperty(example = "哺乳假", position = 58)
    private String leaveTypeBuru;

    @ApiModelProperty(example = "排序号", position = 59)
    private Integer sequence;

    @ApiModelProperty(example = "备注", position = 60)
    private String remark;

    @ApiModelProperty(example = "分享模式一", hidden = true, position = 61)
    @TableField(value = "public_able", fill = FieldFill.INSERT)
    private String publicAble;

    @ApiModelProperty(example = "分享模式二", hidden = true, position = 62)
    @TableField(value = "shared_able", fill = FieldFill.INSERT)
    private String sharedAble;

    @ApiModelProperty(example = "接口数据状态", hidden = true, position = 63)
    private String infStatus;

    @ApiModelProperty(example = "是否可用", hidden = true, position = 64)
    @TableField(value = "status", fill = FieldFill.INSERT)
    private String status;

    @ApiModelProperty(example = "乐观锁", hidden = true, position = 65)
    @Version
    @TableField(value = "version", fill = FieldFill.INSERT)
    private Integer version;

    @ApiModelProperty(example = "删除状态", hidden = true, position = 66)
    @TableLogic
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ApiModelProperty(example = "用户id", hidden = true, position = 67)
    private String userId;

    @ApiModelProperty(example = "所属组织id", hidden = true, position = 68)
    private String orgId;

    @ApiModelProperty(example = "所属应用id", hidden = true, position = 69)
    private String appId;

    @ApiModelProperty(example = "数据来源", hidden = true, position = 70)
    private String clientType;

    @ApiModelProperty(example = "创建者", hidden = true, position = 71)
    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "创建时间", hidden = true, position = 72)
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(example = "修改者", hidden = true, position = 73)
    private String modifyBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "修改时间", hidden = true, position = 74)
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
     * 成员编码
     * @return emp_mdm_code 成员编码
     */
    public String getEmpMdmCode() {
        return empMdmCode;
    }

    /**
     * 成员编码
     * @param empMdmCode 成员编码
     */
    public void setEmpMdmCode(String empMdmCode) {
        this.empMdmCode = empMdmCode;
    }

    /**
     * 年
     * @return att_year 年
     */
    public String getAttYear() {
        return attYear;
    }

    /**
     * 年
     * @param attYear 年
     */
    public void setAttYear(String attYear) {
        this.attYear = attYear;
    }

    /**
     * 月
     * @return att_month 月
     */
    public String getAttMonth() {
        return attMonth;
    }

    /**
     * 月
     * @param attMonth 月
     */
    public void setAttMonth(String attMonth) {
        this.attMonth = attMonth;
    }

    /**
     * 岗位名称
     * @return position_title 岗位名称
     */
    public String getPositionTitle() {
        return positionTitle;
    }

    /**
     * 岗位名称
     * @param positionTitle 岗位名称
     */
    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    /**
     * 标准职级
     * @return standard_rank 标准职级
     */
    public String getStandardRank() {
        return standardRank;
    }

    /**
     * 标准职级
     * @param standardRank 标准职级
     */
    public void setStandardRank(String standardRank) {
        this.standardRank = standardRank;
    }

    /**
     * 出勤天数
     * @return att_day 出勤天数
     */
    public String getAttDay() {
        return attDay;
    }

    /**
     * 出勤天数
     * @param attDay 出勤天数
     */
    public void setAttDay(String attDay) {
        this.attDay = attDay;
    }

    /**
     * 休息天数
     * @return rest_day 休息天数
     */
    public String getRestDay() {
        return restDay;
    }

    /**
     * 休息天数
     * @param restDay 休息天数
     */
    public void setRestDay(String restDay) {
        this.restDay = restDay;
    }

    /**
     * 迟到早退次数
     * @return ten_min_times_in 迟到早退次数
     */
    public String getTenMinTimesIn() {
        return tenMinTimesIn;
    }

    /**
     * 迟到早退次数
     * @param tenMinTimesIn 迟到早退次数
     */
    public void setTenMinTimesIn(String tenMinTimesIn) {
        this.tenMinTimesIn = tenMinTimesIn;
    }

    /**
     * 旷工次数
     * @return ten_min_times_out 旷工次数
     */
    public String getTenMinTimesOut() {
        return tenMinTimesOut;
    }

    /**
     * 旷工次数
     * @param tenMinTimesOut 旷工次数
     */
    public void setTenMinTimesOut(String tenMinTimesOut) {
        this.tenMinTimesOut = tenMinTimesOut;
    }

    /**
     * 缺卡数
     * @return lack_att_times 缺卡数
     */
    public String getLackAttTimes() {
        return lackAttTimes;
    }

    /**
     * 缺卡数
     * @param lackAttTimes 缺卡数
     */
    public void setLackAttTimes(String lackAttTimes) {
        this.lackAttTimes = lackAttTimes;
    }

    /**
     * 缺勤天数
     * @return absence 缺勤天数
     */
    public String getAbsence() {
        return absence;
    }

    /**
     * 缺勤天数
     * @param absence 缺勤天数
     */
    public void setAbsence(String absence) {
        this.absence = absence;
    }

    /**
     * 1
     * @return att_1 1
     */
    public String getAtt1() {
        return att1;
    }

    /**
     * 1
     * @param att1 1
     */
    public void setAtt1(String att1) {
        this.att1 = att1;
    }

    /**
     * 2
     * @return att_2 2
     */
    public String getAtt2() {
        return att2;
    }

    /**
     * 2
     * @param att2 2
     */
    public void setAtt2(String att2) {
        this.att2 = att2;
    }

    /**
     * 3
     * @return att_3 3
     */
    public String getAtt3() {
        return att3;
    }

    /**
     * 3
     * @param att3 3
     */
    public void setAtt3(String att3) {
        this.att3 = att3;
    }

    /**
     * 4
     * @return att_4 4
     */
    public String getAtt4() {
        return att4;
    }

    /**
     * 4
     * @param att4 4
     */
    public void setAtt4(String att4) {
        this.att4 = att4;
    }

    /**
     * 5
     * @return att_5 5
     */
    public String getAtt5() {
        return att5;
    }

    /**
     * 5
     * @param att5 5
     */
    public void setAtt5(String att5) {
        this.att5 = att5;
    }

    /**
     * 6
     * @return att_6 6
     */
    public String getAtt6() {
        return att6;
    }

    /**
     * 6
     * @param att6 6
     */
    public void setAtt6(String att6) {
        this.att6 = att6;
    }

    /**
     * 7
     * @return att_7 7
     */
    public String getAtt7() {
        return att7;
    }

    /**
     * 7
     * @param att7 7
     */
    public void setAtt7(String att7) {
        this.att7 = att7;
    }

    /**
     * 8
     * @return att_8 8
     */
    public String getAtt8() {
        return att8;
    }

    /**
     * 8
     * @param att8 8
     */
    public void setAtt8(String att8) {
        this.att8 = att8;
    }

    /**
     * 9
     * @return att_9 9
     */
    public String getAtt9() {
        return att9;
    }

    /**
     * 9
     * @param att9 9
     */
    public void setAtt9(String att9) {
        this.att9 = att9;
    }

    /**
     * 10
     * @return att_10 10
     */
    public String getAtt10() {
        return att10;
    }

    /**
     * 10
     * @param att10 10
     */
    public void setAtt10(String att10) {
        this.att10 = att10;
    }

    /**
     * 11
     * @return att_11 11
     */
    public String getAtt11() {
        return att11;
    }

    /**
     * 11
     * @param att11 11
     */
    public void setAtt11(String att11) {
        this.att11 = att11;
    }

    /**
     * 12
     * @return att_12 12
     */
    public String getAtt12() {
        return att12;
    }

    /**
     * 12
     * @param att12 12
     */
    public void setAtt12(String att12) {
        this.att12 = att12;
    }

    /**
     * 13
     * @return att_13 13
     */
    public String getAtt13() {
        return att13;
    }

    /**
     * 13
     * @param att13 13
     */
    public void setAtt13(String att13) {
        this.att13 = att13;
    }

    /**
     * 14
     * @return att_14 14
     */
    public String getAtt14() {
        return att14;
    }

    /**
     * 14
     * @param att14 14
     */
    public void setAtt14(String att14) {
        this.att14 = att14;
    }

    /**
     * 15
     * @return att_15 15
     */
    public String getAtt15() {
        return att15;
    }

    /**
     * 15
     * @param att15 15
     */
    public void setAtt15(String att15) {
        this.att15 = att15;
    }

    /**
     * 16
     * @return att_16 16
     */
    public String getAtt16() {
        return att16;
    }

    /**
     * 16
     * @param att16 16
     */
    public void setAtt16(String att16) {
        this.att16 = att16;
    }

    /**
     * 17
     * @return att_17 17
     */
    public String getAtt17() {
        return att17;
    }

    /**
     * 17
     * @param att17 17
     */
    public void setAtt17(String att17) {
        this.att17 = att17;
    }

    /**
     * 18
     * @return att_18 18
     */
    public String getAtt18() {
        return att18;
    }

    /**
     * 18
     * @param att18 18
     */
    public void setAtt18(String att18) {
        this.att18 = att18;
    }

    /**
     * 19
     * @return att_19 19
     */
    public String getAtt19() {
        return att19;
    }

    /**
     * 19
     * @param att19 19
     */
    public void setAtt19(String att19) {
        this.att19 = att19;
    }

    /**
     * 20
     * @return att_20 20
     */
    public String getAtt20() {
        return att20;
    }

    /**
     * 20
     * @param att20 20
     */
    public void setAtt20(String att20) {
        this.att20 = att20;
    }

    /**
     * 21
     * @return att_21 21
     */
    public String getAtt21() {
        return att21;
    }

    /**
     * 21
     * @param att21 21
     */
    public void setAtt21(String att21) {
        this.att21 = att21;
    }

    /**
     * 22
     * @return att_22 22
     */
    public String getAtt22() {
        return att22;
    }

    /**
     * 22
     * @param att22 22
     */
    public void setAtt22(String att22) {
        this.att22 = att22;
    }

    /**
     * 23
     * @return att_23 23
     */
    public String getAtt23() {
        return att23;
    }

    /**
     * 23
     * @param att23 23
     */
    public void setAtt23(String att23) {
        this.att23 = att23;
    }

    /**
     * 24
     * @return att_24 24
     */
    public String getAtt24() {
        return att24;
    }

    /**
     * 24
     * @param att24 24
     */
    public void setAtt24(String att24) {
        this.att24 = att24;
    }

    /**
     * 25
     * @return att_25 25
     */
    public String getAtt25() {
        return att25;
    }

    /**
     * 25
     * @param att25 25
     */
    public void setAtt25(String att25) {
        this.att25 = att25;
    }

    /**
     * 26
     * @return att_26 26
     */
    public String getAtt26() {
        return att26;
    }

    /**
     * 26
     * @param att26 26
     */
    public void setAtt26(String att26) {
        this.att26 = att26;
    }

    /**
     * 27
     * @return att_27 27
     */
    public String getAtt27() {
        return att27;
    }

    /**
     * 27
     * @param att27 27
     */
    public void setAtt27(String att27) {
        this.att27 = att27;
    }

    /**
     * 28
     * @return att_28 28
     */
    public String getAtt28() {
        return att28;
    }

    /**
     * 28
     * @param att28 28
     */
    public void setAtt28(String att28) {
        this.att28 = att28;
    }

    /**
     * 29
     * @return att_29 29
     */
    public String getAtt29() {
        return att29;
    }

    /**
     * 29
     * @param att29 29
     */
    public void setAtt29(String att29) {
        this.att29 = att29;
    }

    /**
     * 30
     * @return att_30 30
     */
    public String getAtt30() {
        return att30;
    }

    /**
     * 30
     * @param att30 30
     */
    public void setAtt30(String att30) {
        this.att30 = att30;
    }

    /**
     * 31
     * @return att_31 31
     */
    public String getAtt31() {
        return att31;
    }

    /**
     * 31
     * @param att31 31
     */
    public void setAtt31(String att31) {
        this.att31 = att31;
    }

    /**
     * 员工姓名
     * @return emp_name 员工姓名
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * 员工姓名
     * @param empName 员工姓名
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * 因忘打卡补卡次数
     * @return forgate_att_add_times 因忘打卡补卡次数
     */
    public String getForgateAttAddTimes() {
        return forgateAttAddTimes;
    }

    /**
     * 因忘打卡补卡次数
     * @param forgateAttAddTimes 因忘打卡补卡次数
     */
    public void setForgateAttAddTimes(String forgateAttAddTimes) {
        this.forgateAttAddTimes = forgateAttAddTimes;
    }

    /**
     * 婚假
     * @return leave_type_hun 婚假
     */
    public String getLeaveTypeHun() {
        return leaveTypeHun;
    }

    /**
     * 婚假
     * @param leaveTypeHun 婚假
     */
    public void setLeaveTypeHun(String leaveTypeHun) {
        this.leaveTypeHun = leaveTypeHun;
    }

    /**
     * 事假
     * @return leave_type_shi 事假
     */
    public String getLeaveTypeShi() {
        return leaveTypeShi;
    }

    /**
     * 事假
     * @param leaveTypeShi 事假
     */
    public void setLeaveTypeShi(String leaveTypeShi) {
        this.leaveTypeShi = leaveTypeShi;
    }

    /**
     * 年假
     * @return leave_type_nian 年假
     */
    public String getLeaveTypeNian() {
        return leaveTypeNian;
    }

    /**
     * 年假
     * @param leaveTypeNian 年假
     */
    public void setLeaveTypeNian(String leaveTypeNian) {
        this.leaveTypeNian = leaveTypeNian;
    }

    /**
     * 调休
     * @return leave_type_tiao 调休
     */
    public String getLeaveTypeTiao() {
        return leaveTypeTiao;
    }

    /**
     * 调休
     * @param leaveTypeTiao 调休
     */
    public void setLeaveTypeTiao(String leaveTypeTiao) {
        this.leaveTypeTiao = leaveTypeTiao;
    }

    /**
     * 病假
     * @return leave_type_bing 病假
     */
    public String getLeaveTypeBing() {
        return leaveTypeBing;
    }

    /**
     * 病假
     * @param leaveTypeBing 病假
     */
    public void setLeaveTypeBing(String leaveTypeBing) {
        this.leaveTypeBing = leaveTypeBing;
    }

    /**
     * 调休假
     * @return leave_type_tiaoxiu 调休假
     */
    public String getLeaveTypeTiaoxiu() {
        return leaveTypeTiaoxiu;
    }

    /**
     * 调休假
     * @param leaveTypeTiaoxiu 调休假
     */
    public void setLeaveTypeTiaoxiu(String leaveTypeTiaoxiu) {
        this.leaveTypeTiaoxiu = leaveTypeTiaoxiu;
    }

    /**
     * 产检假
     * @return leave_type_chanjian 产检假
     */
    public String getLeaveTypeChanjian() {
        return leaveTypeChanjian;
    }

    /**
     * 产检假
     * @param leaveTypeChanjian 产检假
     */
    public void setLeaveTypeChanjian(String leaveTypeChanjian) {
        this.leaveTypeChanjian = leaveTypeChanjian;
    }

    /**
     * 分娩假
     * @return leave_type_fenmian 分娩假
     */
    public String getLeaveTypeFenmian() {
        return leaveTypeFenmian;
    }

    /**
     * 分娩假
     * @param leaveTypeFenmian 分娩假
     */
    public void setLeaveTypeFenmian(String leaveTypeFenmian) {
        this.leaveTypeFenmian = leaveTypeFenmian;
    }

    /**
     * 陪产假
     * @return leave_type_peichan 陪产假
     */
    public String getLeaveTypePeichan() {
        return leaveTypePeichan;
    }

    /**
     * 陪产假
     * @param leaveTypePeichan 陪产假
     */
    public void setLeaveTypePeichan(String leaveTypePeichan) {
        this.leaveTypePeichan = leaveTypePeichan;
    }

    /**
     * 其他
     * @return leave_type_qita 其他
     */
    public String getLeaveTypeQita() {
        return leaveTypeQita;
    }

    /**
     * 其他
     * @param leaveTypeQita 其他
     */
    public void setLeaveTypeQita(String leaveTypeQita) {
        this.leaveTypeQita = leaveTypeQita;
    }

    /**
     * 丧假
     * @return leave_type_sang 丧假
     */
    public String getLeaveTypeSang() {
        return leaveTypeSang;
    }

    /**
     * 丧假
     * @param leaveTypeSang 丧假
     */
    public void setLeaveTypeSang(String leaveTypeSang) {
        this.leaveTypeSang = leaveTypeSang;
    }

    /**
     * 工伤假
     * @return leave_type_gongshang 工伤假
     */
    public String getLeaveTypeGongshang() {
        return leaveTypeGongshang;
    }

    /**
     * 工伤假
     * @param leaveTypeGongshang 工伤假
     */
    public void setLeaveTypeGongshang(String leaveTypeGongshang) {
        this.leaveTypeGongshang = leaveTypeGongshang;
    }

    /**
     * 哺乳假
     * @return leave_type_buru 哺乳假
     */
    public String getLeaveTypeBuru() {
        return leaveTypeBuru;
    }

    /**
     * 哺乳假
     * @param leaveTypeBuru 哺乳假
     */
    public void setLeaveTypeBuru(String leaveTypeBuru) {
        this.leaveTypeBuru = leaveTypeBuru;
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