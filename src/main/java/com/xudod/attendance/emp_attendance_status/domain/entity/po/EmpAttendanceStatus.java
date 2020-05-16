package com.xudod.attendance.emp_attendance_status.domain.entity.po;

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


@ApiModel(value = "考勤状态展示")
public class EmpAttendanceStatus {
    @ApiModelProperty(example = "id", position = 1)
    private String id;

    @ApiModelProperty(example = "员工code", position = 2)
    private String empMdmCode;

    @ApiModelProperty(example = "排班编码", position = 3)
    private String scheduleCode;

    @ApiModelProperty(example = "排班中文名称", position = 4)
    private String scheduleName;

    @ApiModelProperty(example = "班次工作时长", position = 5)
    private String workTimeMin;

    @ApiModelProperty(example = "班次所包含时间代表出勤天数", position = 6)
    private String attendTimeToDay;

    @ApiModelProperty(example = "跨天班", position = 7)
    private String scheduleFrontDay;

    @ApiModelProperty(example = "打卡段数", position = 8)
    private String punchTimes;

    @ApiModelProperty(example = "人性化管理", position = 9)
    private String permitMin;

    @ApiModelProperty(example = "迟到早退分钟数", position = 10)
    private String lateMin;

    @ApiModelProperty(example = "旷工分钟数", position = 11)
    private String wildMin;

    @ApiModelProperty(example = "休息类型", position = 12)
    private String restType;

    @ApiModelProperty(example = "工作时长多少分钟后休息", position = 13)
    private String workTime;

    @ApiModelProperty(example = "休息时长分钟数", position = 14)
    private String restTime;

    @ApiModelProperty(example = "总打卡状态", position = 15)
    private Integer attendStatus;

    @ApiModelProperty(example = "考勤日期", position = 16)
    private String attendDay;

    @ApiModelProperty(example = "假期的名称", position = 17)
    private String dayName;

    @ApiModelProperty(example = "详细打卡状态", position = 18)
    private String partAttendStatus;

    @ApiModelProperty(example = "所有打卡时间", position = 19)
    private String allAttendTime;

    @ApiModelProperty(example = "总打卡次数", position = 20)
    private String attNumTimes;

    @ApiModelProperty(example = "忘记打卡数", position = 21)
    private String forgateAttAddTimes;

    @ApiModelProperty(example = "a极限打卡时间", position = 22)
    private String aaLimitTime;

    @ApiModelProperty(example = "a点存在的打卡时间记录", position = 23)
    private String aaTime;

    @ApiModelProperty(example = "a点排班的正常打卡时间", position = 24)
    private String aaPreTime;

    @ApiModelProperty(example = "a变动时间", position = 25)
    private String aaChTime;

    @ApiModelProperty(example = "a打卡状态", position = 26)
    private String aaStatus;

    @ApiModelProperty(example = "a时间差", position = 27)
    private String aaMin;

    @ApiModelProperty(example = "a是否需要刷卡", position = 28)
    private String aaNeedSign;

    @ApiModelProperty(example = "b极限打卡时间", position = 29)
    private String bbLimitTime;

    @ApiModelProperty(example = "b点存在的打卡时间记录", position = 30)
    private String bbTime;

    @ApiModelProperty(example = "b点排班的正常打卡时间", position = 31)
    private String bbPreTime;

    @ApiModelProperty(example = "b变动时间", position = 32)
    private String bbChTime;

    @ApiModelProperty(example = "b打卡状态", position = 33)
    private String bbStatus;

    @ApiModelProperty(example = "b时间差", position = 34)
    private String bbMin;

    @ApiModelProperty(example = "b是否需要刷卡", position = 35)
    private String bbNeedSign;

    @ApiModelProperty(example = "c极限打卡时间", position = 36)
    private String ccLimitTime;

    @ApiModelProperty(example = "c点存在的打卡时间记录", position = 37)
    private String ccTime;

    @ApiModelProperty(example = "c点排班的正常打卡时间", position = 38)
    private String ccPreTime;

    @ApiModelProperty(example = "c变动时间", position = 39)
    private String ccChTime;

    @ApiModelProperty(example = "c打卡状态", position = 40)
    private String ccStatus;

    @ApiModelProperty(example = "c时间差", position = 41)
    private String ccMin;

    @ApiModelProperty(example = "c是否需要刷卡", position = 42)
    private String ccNeedSign;

    @ApiModelProperty(example = "d极限打卡时间", position = 43)
    private String ddLimitTime;

    @ApiModelProperty(example = "d点存在的打卡时间记录", position = 44)
    private String ddTime;

    @ApiModelProperty(example = "d点排班的正常打卡时间", position = 45)
    private String ddPreTime;

    @ApiModelProperty(example = "d变动时间", position = 46)
    private String ddChTime;

    @ApiModelProperty(example = "d打卡状态", position = 47)
    private String ddStatus;

    @ApiModelProperty(example = "d时间差", position = 48)
    private String ddMin;

    @ApiModelProperty(example = "d是否需要刷卡", position = 49)
    private String ddNeedSign;

    @ApiModelProperty(example = "e极限打卡时间", position = 50)
    private String eeLimitTime;

    @ApiModelProperty(example = "e点存在的打卡时间记录", position = 51)
    private String eeTime;

    @ApiModelProperty(example = "e点排班的正常打卡时间", position = 52)
    private String eePreTime;

    @ApiModelProperty(example = "e变动时间", position = 53)
    private String eeChTime;

    @ApiModelProperty(example = "e打卡状态", position = 54)
    private String eeStatus;

    @ApiModelProperty(example = "e时间差", position = 55)
    private String eeMin;

    @ApiModelProperty(example = "e是否需要刷卡", position = 56)
    private String eeNeedSign;

    @ApiModelProperty(example = "f极限打卡时间", position = 57)
    private String ffLimitTime;

    @ApiModelProperty(example = "f点存在的打卡时间记录", position = 58)
    private String ffTime;

    @ApiModelProperty(example = "f点排班的正常打卡时间", position = 59)
    private String ffPreTime;

    @ApiModelProperty(example = "f变动时间", position = 60)
    private String ffChTime;

    @ApiModelProperty(example = "f打卡状态", position = 61)
    private String ffStatus;

    @ApiModelProperty(example = "f时间差", position = 62)
    private String ffMin;

    @ApiModelProperty(example = "f是否需要刷卡", position = 63)
    private String ffNeedSign;

    @ApiModelProperty(example = "g极限打卡时间", position = 64)
    private String ggLimitTime;

    @ApiModelProperty(example = "g点存在的打卡时间记录", position = 65)
    private String ggTime;

    @ApiModelProperty(example = "g点排班的正常打卡时间", position = 66)
    private String ggPreTime;

    @ApiModelProperty(example = "g变动时间", position = 67)
    private String ggChTime;

    @ApiModelProperty(example = "g打卡状态", position = 68)
    private String ggStatus;

    @ApiModelProperty(example = "g时间差", position = 69)
    private String ggMin;

    @ApiModelProperty(example = "g是否需要刷卡", position = 70)
    private String ggNeedSign;

    @ApiModelProperty(example = "h极限打卡时间", position = 71)
    private String hhLimitTime;

    @ApiModelProperty(example = "h点存在的打卡时间记录", position = 72)
    private String hhTime;

    @ApiModelProperty(example = "h点排班的正常打卡时间", position = 73)
    private String hhPreTime;

    @ApiModelProperty(example = "h变动时间", position = 74)
    private String hhChTime;

    @ApiModelProperty(example = "h时间差", position = 75)
    private String hhStatus;

    @ApiModelProperty(example = "h时间差", position = 76)
    private String hhMin;

    @ApiModelProperty(example = "h是否需要刷卡", position = 77)
    private String hhNeedSign;

    @ApiModelProperty(example = "请假次数", position = 78)
    private String leaveTimes;

    @ApiModelProperty(example = "请假1类型", position = 79)
    private String leaveType1;

    @ApiModelProperty(example = "请假1，开始时间", position = 80)
    private String leaveStime1;

    @ApiModelProperty(example = "请假1，结束时间", position = 81)
    private String leaveEtime1;

    @ApiModelProperty(example = "请假1所占当天上班时长", position = 82)
    private String leaveLonDay1;

    @ApiModelProperty(example = "请假2类型", position = 83)
    private String leaveType2;

    @ApiModelProperty(example = "请假2，开始时间", position = 84)
    private String leaveStime2;

    @ApiModelProperty(example = "请假2，结束时间", position = 85)
    private String leaveEtime2;

    @ApiModelProperty(example = "请假2所占当天上班时长", position = 86)
    private String leaveLonDay2;

    @ApiModelProperty(example = "请假3类型", position = 87)
    private String leaveType3;

    @ApiModelProperty(example = "请假3，开始时间", position = 88)
    private String leaveStime3;

    @ApiModelProperty(example = "请假3，结束时间", position = 89)
    private String leaveEtime3;

    @ApiModelProperty(example = "请假3所占当天上班时长", position = 90)
    private String leaveLonDay3;

    @ApiModelProperty(example = "出差次数", position = 91)
    private String btripTimes;

    @ApiModelProperty(example = "出差1类型", position = 92)
    private String btripType1;

    @ApiModelProperty(example = "出差1，开始时间", position = 93)
    private String btripStime1;

    @ApiModelProperty(example = "出差1，结束时间", position = 94)
    private String btripEtime1;

    @ApiModelProperty(example = "出差1所占当天上班时长", position = 95)
    private String btripLonDay1;

    @ApiModelProperty(example = "出差2类型", position = 96)
    private String btripType2;

    @ApiModelProperty(example = "出差2，开始时间", position = 97)
    private String btripStime2;

    @ApiModelProperty(example = "出差2，结束时间", position = 98)
    private String btripEtime2;

    @ApiModelProperty(example = "出差2所占当天上班时长", position = 99)
    private String btripLonDay2;

    @ApiModelProperty(example = "出差3类型", position = 100)
    private String btripType3;

    @ApiModelProperty(example = "出差3，开始时间", position = 101)
    private String btripStime3;

    @ApiModelProperty(example = "出差3，结束时间", position = 102)
    private String btripEtime3;

    @ApiModelProperty(example = "出差3所占当天上班时长", position = 103)
    private String btripLonDay3;

    @ApiModelProperty(example = "排序号", position = 104)
    private Integer sequence;

    @ApiModelProperty(example = "备注", position = 105)
    private String remark;

    @ApiModelProperty(example = "分享模式一", hidden = true, position = 106)
    @TableField(value = "public_able", fill = FieldFill.INSERT)
    private String publicAble;

    @ApiModelProperty(example = "分享模式二", hidden = true, position = 107)
    @TableField(value = "shared_able", fill = FieldFill.INSERT)
    private String sharedAble;

    @ApiModelProperty(example = "接口数据状态", hidden = true, position = 108)
    private String infStatus;

    @ApiModelProperty(example = "是否可用", hidden = true, position = 109)
    @TableField(value = "status", fill = FieldFill.INSERT)
    private String status;

    @ApiModelProperty(example = "乐观锁", hidden = true, position = 110)
    @Version
    @TableField(value = "version", fill = FieldFill.INSERT)
    private Integer version;

    @ApiModelProperty(example = "删除状态", hidden = true, position = 111)
    @TableLogic
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ApiModelProperty(example = "用户id", hidden = true, position = 112)
    private String userId;

    @ApiModelProperty(example = "所属组织id", hidden = true, position = 113)
    private String orgId;

    @ApiModelProperty(example = "所属应用id", hidden = true, position = 114)
    private String appId;

    @ApiModelProperty(example = "数据来源", hidden = true, position = 115)
    private String clientType;

    @ApiModelProperty(example = "创建者", hidden = true, position = 116)
    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "创建时间", hidden = true, position = 117)
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(example = "修改者", hidden = true, position = 118)
    private String modifyBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(example = "修改时间", hidden = true, position = 119)
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
     * 排班中文名称
     * @return schedule_name 排班中文名称
     */
    public String getScheduleName() {
        return scheduleName;
    }

    /**
     * 排班中文名称
     * @param scheduleName 排班中文名称
     */
    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    /**
     * 班次工作时长
     * @return work_time_min 班次工作时长
     */
    public String getWorkTimeMin() {
        return workTimeMin;
    }

    /**
     * 班次工作时长
     * @param workTimeMin 班次工作时长
     */
    public void setWorkTimeMin(String workTimeMin) {
        this.workTimeMin = workTimeMin;
    }

    /**
     * 班次所包含时间代表出勤天数
     * @return attend_time_to_day 班次所包含时间代表出勤天数
     */
    public String getAttendTimeToDay() {
        return attendTimeToDay;
    }

    /**
     * 班次所包含时间代表出勤天数
     * @param attendTimeToDay 班次所包含时间代表出勤天数
     */
    public void setAttendTimeToDay(String attendTimeToDay) {
        this.attendTimeToDay = attendTimeToDay;
    }

    /**
     * 跨天班
     * @return schedule_front_day 跨天班
     */
    public String getScheduleFrontDay() {
        return scheduleFrontDay;
    }

    /**
     * 跨天班
     * @param scheduleFrontDay 跨天班
     */
    public void setScheduleFrontDay(String scheduleFrontDay) {
        this.scheduleFrontDay = scheduleFrontDay;
    }

    /**
     * 打卡段数
     * @return punch_times 打卡段数
     */
    public String getPunchTimes() {
        return punchTimes;
    }

    /**
     * 打卡段数
     * @param punchTimes 打卡段数
     */
    public void setPunchTimes(String punchTimes) {
        this.punchTimes = punchTimes;
    }

    /**
     * 人性化管理
     * @return permit_min 人性化管理
     */
    public String getPermitMin() {
        return permitMin;
    }

    /**
     * 人性化管理
     * @param permitMin 人性化管理
     */
    public void setPermitMin(String permitMin) {
        this.permitMin = permitMin;
    }

    /**
     * 迟到早退分钟数
     * @return late_min 迟到早退分钟数
     */
    public String getLateMin() {
        return lateMin;
    }

    /**
     * 迟到早退分钟数
     * @param lateMin 迟到早退分钟数
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
     * 休息类型
     * @return rest_type 休息类型
     */
    public String getRestType() {
        return restType;
    }

    /**
     * 休息类型
     * @param restType 休息类型
     */
    public void setRestType(String restType) {
        this.restType = restType;
    }

    /**
     * 工作时长多少分钟后休息
     * @return work_time 工作时长多少分钟后休息
     */
    public String getWorkTime() {
        return workTime;
    }

    /**
     * 工作时长多少分钟后休息
     * @param workTime 工作时长多少分钟后休息
     */
    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    /**
     * 休息时长分钟数
     * @return rest_time 休息时长分钟数
     */
    public String getRestTime() {
        return restTime;
    }

    /**
     * 休息时长分钟数
     * @param restTime 休息时长分钟数
     */
    public void setRestTime(String restTime) {
        this.restTime = restTime;
    }

    /**
     * 总打卡状态
     * @return attend_status 总打卡状态
     */
    public Integer getAttendStatus() {
        return attendStatus;
    }

    /**
     * 总打卡状态
     * @param attendStatus 总打卡状态
     */
    public void setAttendStatus(Integer attendStatus) {
        this.attendStatus = attendStatus;
    }

    /**
     * 考勤日期
     * @return attend_day 考勤日期
     */
    public String getAttendDay() {
        return attendDay;
    }

    /**
     * 考勤日期
     * @param attendDay 考勤日期
     */
    public void setAttendDay(String attendDay) {
        this.attendDay = attendDay;
    }

    /**
     * 假期的名称
     * @return day_name 假期的名称
     */
    public String getDayName() {
        return dayName;
    }

    /**
     * 假期的名称
     * @param dayName 假期的名称
     */
    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    /**
     * 详细打卡状态
     * @return part_attend_status 详细打卡状态
     */
    public String getPartAttendStatus() {
        return partAttendStatus;
    }

    /**
     * 详细打卡状态
     * @param partAttendStatus 详细打卡状态
     */
    public void setPartAttendStatus(String partAttendStatus) {
        this.partAttendStatus = partAttendStatus;
    }

    /**
     * 所有打卡时间
     * @return all_attend_time 所有打卡时间
     */
    public String getAllAttendTime() {
        return allAttendTime;
    }

    /**
     * 所有打卡时间
     * @param allAttendTime 所有打卡时间
     */
    public void setAllAttendTime(String allAttendTime) {
        this.allAttendTime = allAttendTime;
    }

    /**
     * 总打卡次数
     * @return att_num_times 总打卡次数
     */
    public String getAttNumTimes() {
        return attNumTimes;
    }

    /**
     * 总打卡次数
     * @param attNumTimes 总打卡次数
     */
    public void setAttNumTimes(String attNumTimes) {
        this.attNumTimes = attNumTimes;
    }

    /**
     * 忘记打卡数
     * @return forgate_att_add_times 忘记打卡数
     */
    public String getForgateAttAddTimes() {
        return forgateAttAddTimes;
    }

    /**
     * 忘记打卡数
     * @param forgateAttAddTimes 忘记打卡数
     */
    public void setForgateAttAddTimes(String forgateAttAddTimes) {
        this.forgateAttAddTimes = forgateAttAddTimes;
    }

    /**
     * a极限打卡时间
     * @return aa_limit_time a极限打卡时间
     */
    public String getAaLimitTime() {
        return aaLimitTime;
    }

    /**
     * a极限打卡时间
     * @param aaLimitTime a极限打卡时间
     */
    public void setAaLimitTime(String aaLimitTime) {
        this.aaLimitTime = aaLimitTime;
    }

    /**
     * a点存在的打卡时间记录
     * @return aa_time a点存在的打卡时间记录
     */
    public String getAaTime() {
        return aaTime;
    }

    /**
     * a点存在的打卡时间记录
     * @param aaTime a点存在的打卡时间记录
     */
    public void setAaTime(String aaTime) {
        this.aaTime = aaTime;
    }

    /**
     * a点排班的正常打卡时间
     * @return aa_pre_time a点排班的正常打卡时间
     */
    public String getAaPreTime() {
        return aaPreTime;
    }

    /**
     * a点排班的正常打卡时间
     * @param aaPreTime a点排班的正常打卡时间
     */
    public void setAaPreTime(String aaPreTime) {
        this.aaPreTime = aaPreTime;
    }

    /**
     * a变动时间
     * @return aa_ch_time a变动时间
     */
    public String getAaChTime() {
        return aaChTime;
    }

    /**
     * a变动时间
     * @param aaChTime a变动时间
     */
    public void setAaChTime(String aaChTime) {
        this.aaChTime = aaChTime;
    }

    /**
     * a打卡状态
     * @return aa_status a打卡状态
     */
    public String getAaStatus() {
        return aaStatus;
    }

    /**
     * a打卡状态
     * @param aaStatus a打卡状态
     */
    public void setAaStatus(String aaStatus) {
        this.aaStatus = aaStatus;
    }

    /**
     * a时间差
     * @return aa_min a时间差
     */
    public String getAaMin() {
        return aaMin;
    }

    /**
     * a时间差
     * @param aaMin a时间差
     */
    public void setAaMin(String aaMin) {
        this.aaMin = aaMin;
    }

    /**
     * a是否需要刷卡
     * @return aa_need_sign a是否需要刷卡
     */
    public String getAaNeedSign() {
        return aaNeedSign;
    }

    /**
     * a是否需要刷卡
     * @param aaNeedSign a是否需要刷卡
     */
    public void setAaNeedSign(String aaNeedSign) {
        this.aaNeedSign = aaNeedSign;
    }

    /**
     * b极限打卡时间
     * @return bb_limit_time b极限打卡时间
     */
    public String getBbLimitTime() {
        return bbLimitTime;
    }

    /**
     * b极限打卡时间
     * @param bbLimitTime b极限打卡时间
     */
    public void setBbLimitTime(String bbLimitTime) {
        this.bbLimitTime = bbLimitTime;
    }

    /**
     * b点存在的打卡时间记录
     * @return bb_time b点存在的打卡时间记录
     */
    public String getBbTime() {
        return bbTime;
    }

    /**
     * b点存在的打卡时间记录
     * @param bbTime b点存在的打卡时间记录
     */
    public void setBbTime(String bbTime) {
        this.bbTime = bbTime;
    }

    /**
     * b点排班的正常打卡时间
     * @return bb_pre_time b点排班的正常打卡时间
     */
    public String getBbPreTime() {
        return bbPreTime;
    }

    /**
     * b点排班的正常打卡时间
     * @param bbPreTime b点排班的正常打卡时间
     */
    public void setBbPreTime(String bbPreTime) {
        this.bbPreTime = bbPreTime;
    }

    /**
     * b变动时间
     * @return bb_ch_time b变动时间
     */
    public String getBbChTime() {
        return bbChTime;
    }

    /**
     * b变动时间
     * @param bbChTime b变动时间
     */
    public void setBbChTime(String bbChTime) {
        this.bbChTime = bbChTime;
    }

    /**
     * b打卡状态
     * @return bb_status b打卡状态
     */
    public String getBbStatus() {
        return bbStatus;
    }

    /**
     * b打卡状态
     * @param bbStatus b打卡状态
     */
    public void setBbStatus(String bbStatus) {
        this.bbStatus = bbStatus;
    }

    /**
     * b时间差
     * @return bb_min b时间差
     */
    public String getBbMin() {
        return bbMin;
    }

    /**
     * b时间差
     * @param bbMin b时间差
     */
    public void setBbMin(String bbMin) {
        this.bbMin = bbMin;
    }

    /**
     * b是否需要刷卡
     * @return bb_need_sign b是否需要刷卡
     */
    public String getBbNeedSign() {
        return bbNeedSign;
    }

    /**
     * b是否需要刷卡
     * @param bbNeedSign b是否需要刷卡
     */
    public void setBbNeedSign(String bbNeedSign) {
        this.bbNeedSign = bbNeedSign;
    }

    /**
     * c极限打卡时间
     * @return cc_limit_time c极限打卡时间
     */
    public String getCcLimitTime() {
        return ccLimitTime;
    }

    /**
     * c极限打卡时间
     * @param ccLimitTime c极限打卡时间
     */
    public void setCcLimitTime(String ccLimitTime) {
        this.ccLimitTime = ccLimitTime;
    }

    /**
     * c点存在的打卡时间记录
     * @return cc_time c点存在的打卡时间记录
     */
    public String getCcTime() {
        return ccTime;
    }

    /**
     * c点存在的打卡时间记录
     * @param ccTime c点存在的打卡时间记录
     */
    public void setCcTime(String ccTime) {
        this.ccTime = ccTime;
    }

    /**
     * c点排班的正常打卡时间
     * @return cc_pre_time c点排班的正常打卡时间
     */
    public String getCcPreTime() {
        return ccPreTime;
    }

    /**
     * c点排班的正常打卡时间
     * @param ccPreTime c点排班的正常打卡时间
     */
    public void setCcPreTime(String ccPreTime) {
        this.ccPreTime = ccPreTime;
    }

    /**
     * c变动时间
     * @return cc_ch_time c变动时间
     */
    public String getCcChTime() {
        return ccChTime;
    }

    /**
     * c变动时间
     * @param ccChTime c变动时间
     */
    public void setCcChTime(String ccChTime) {
        this.ccChTime = ccChTime;
    }

    /**
     * c打卡状态
     * @return cc_status c打卡状态
     */
    public String getCcStatus() {
        return ccStatus;
    }

    /**
     * c打卡状态
     * @param ccStatus c打卡状态
     */
    public void setCcStatus(String ccStatus) {
        this.ccStatus = ccStatus;
    }

    /**
     * c时间差
     * @return cc_min c时间差
     */
    public String getCcMin() {
        return ccMin;
    }

    /**
     * c时间差
     * @param ccMin c时间差
     */
    public void setCcMin(String ccMin) {
        this.ccMin = ccMin;
    }

    /**
     * c是否需要刷卡
     * @return cc_need_sign c是否需要刷卡
     */
    public String getCcNeedSign() {
        return ccNeedSign;
    }

    /**
     * c是否需要刷卡
     * @param ccNeedSign c是否需要刷卡
     */
    public void setCcNeedSign(String ccNeedSign) {
        this.ccNeedSign = ccNeedSign;
    }

    /**
     * d极限打卡时间
     * @return dd_limit_time d极限打卡时间
     */
    public String getDdLimitTime() {
        return ddLimitTime;
    }

    /**
     * d极限打卡时间
     * @param ddLimitTime d极限打卡时间
     */
    public void setDdLimitTime(String ddLimitTime) {
        this.ddLimitTime = ddLimitTime;
    }

    /**
     * d点存在的打卡时间记录
     * @return dd_time d点存在的打卡时间记录
     */
    public String getDdTime() {
        return ddTime;
    }

    /**
     * d点存在的打卡时间记录
     * @param ddTime d点存在的打卡时间记录
     */
    public void setDdTime(String ddTime) {
        this.ddTime = ddTime;
    }

    /**
     * d点排班的正常打卡时间
     * @return dd_pre_time d点排班的正常打卡时间
     */
    public String getDdPreTime() {
        return ddPreTime;
    }

    /**
     * d点排班的正常打卡时间
     * @param ddPreTime d点排班的正常打卡时间
     */
    public void setDdPreTime(String ddPreTime) {
        this.ddPreTime = ddPreTime;
    }

    /**
     * d变动时间
     * @return dd_ch_time d变动时间
     */
    public String getDdChTime() {
        return ddChTime;
    }

    /**
     * d变动时间
     * @param ddChTime d变动时间
     */
    public void setDdChTime(String ddChTime) {
        this.ddChTime = ddChTime;
    }

    /**
     * d打卡状态
     * @return dd_status d打卡状态
     */
    public String getDdStatus() {
        return ddStatus;
    }

    /**
     * d打卡状态
     * @param ddStatus d打卡状态
     */
    public void setDdStatus(String ddStatus) {
        this.ddStatus = ddStatus;
    }

    /**
     * d时间差
     * @return dd_min d时间差
     */
    public String getDdMin() {
        return ddMin;
    }

    /**
     * d时间差
     * @param ddMin d时间差
     */
    public void setDdMin(String ddMin) {
        this.ddMin = ddMin;
    }

    /**
     * d是否需要刷卡
     * @return dd_need_sign d是否需要刷卡
     */
    public String getDdNeedSign() {
        return ddNeedSign;
    }

    /**
     * d是否需要刷卡
     * @param ddNeedSign d是否需要刷卡
     */
    public void setDdNeedSign(String ddNeedSign) {
        this.ddNeedSign = ddNeedSign;
    }

    /**
     * e极限打卡时间
     * @return ee_limit_time e极限打卡时间
     */
    public String getEeLimitTime() {
        return eeLimitTime;
    }

    /**
     * e极限打卡时间
     * @param eeLimitTime e极限打卡时间
     */
    public void setEeLimitTime(String eeLimitTime) {
        this.eeLimitTime = eeLimitTime;
    }

    /**
     * e点存在的打卡时间记录
     * @return ee_time e点存在的打卡时间记录
     */
    public String getEeTime() {
        return eeTime;
    }

    /**
     * e点存在的打卡时间记录
     * @param eeTime e点存在的打卡时间记录
     */
    public void setEeTime(String eeTime) {
        this.eeTime = eeTime;
    }

    /**
     * e点排班的正常打卡时间
     * @return ee_pre_time e点排班的正常打卡时间
     */
    public String getEePreTime() {
        return eePreTime;
    }

    /**
     * e点排班的正常打卡时间
     * @param eePreTime e点排班的正常打卡时间
     */
    public void setEePreTime(String eePreTime) {
        this.eePreTime = eePreTime;
    }

    /**
     * e变动时间
     * @return ee_ch_time e变动时间
     */
    public String getEeChTime() {
        return eeChTime;
    }

    /**
     * e变动时间
     * @param eeChTime e变动时间
     */
    public void setEeChTime(String eeChTime) {
        this.eeChTime = eeChTime;
    }

    /**
     * e打卡状态
     * @return ee_status e打卡状态
     */
    public String getEeStatus() {
        return eeStatus;
    }

    /**
     * e打卡状态
     * @param eeStatus e打卡状态
     */
    public void setEeStatus(String eeStatus) {
        this.eeStatus = eeStatus;
    }

    /**
     * e时间差
     * @return ee_min e时间差
     */
    public String getEeMin() {
        return eeMin;
    }

    /**
     * e时间差
     * @param eeMin e时间差
     */
    public void setEeMin(String eeMin) {
        this.eeMin = eeMin;
    }

    /**
     * e是否需要刷卡
     * @return ee_need_sign e是否需要刷卡
     */
    public String getEeNeedSign() {
        return eeNeedSign;
    }

    /**
     * e是否需要刷卡
     * @param eeNeedSign e是否需要刷卡
     */
    public void setEeNeedSign(String eeNeedSign) {
        this.eeNeedSign = eeNeedSign;
    }

    /**
     * f极限打卡时间
     * @return ff_limit_time f极限打卡时间
     */
    public String getFfLimitTime() {
        return ffLimitTime;
    }

    /**
     * f极限打卡时间
     * @param ffLimitTime f极限打卡时间
     */
    public void setFfLimitTime(String ffLimitTime) {
        this.ffLimitTime = ffLimitTime;
    }

    /**
     * f点存在的打卡时间记录
     * @return ff_time f点存在的打卡时间记录
     */
    public String getFfTime() {
        return ffTime;
    }

    /**
     * f点存在的打卡时间记录
     * @param ffTime f点存在的打卡时间记录
     */
    public void setFfTime(String ffTime) {
        this.ffTime = ffTime;
    }

    /**
     * f点排班的正常打卡时间
     * @return ff_pre_time f点排班的正常打卡时间
     */
    public String getFfPreTime() {
        return ffPreTime;
    }

    /**
     * f点排班的正常打卡时间
     * @param ffPreTime f点排班的正常打卡时间
     */
    public void setFfPreTime(String ffPreTime) {
        this.ffPreTime = ffPreTime;
    }

    /**
     * f变动时间
     * @return ff_ch_time f变动时间
     */
    public String getFfChTime() {
        return ffChTime;
    }

    /**
     * f变动时间
     * @param ffChTime f变动时间
     */
    public void setFfChTime(String ffChTime) {
        this.ffChTime = ffChTime;
    }

    /**
     * f打卡状态
     * @return ff_status f打卡状态
     */
    public String getFfStatus() {
        return ffStatus;
    }

    /**
     * f打卡状态
     * @param ffStatus f打卡状态
     */
    public void setFfStatus(String ffStatus) {
        this.ffStatus = ffStatus;
    }

    /**
     * f时间差
     * @return ff_min f时间差
     */
    public String getFfMin() {
        return ffMin;
    }

    /**
     * f时间差
     * @param ffMin f时间差
     */
    public void setFfMin(String ffMin) {
        this.ffMin = ffMin;
    }

    /**
     * f是否需要刷卡
     * @return ff_need_sign f是否需要刷卡
     */
    public String getFfNeedSign() {
        return ffNeedSign;
    }

    /**
     * f是否需要刷卡
     * @param ffNeedSign f是否需要刷卡
     */
    public void setFfNeedSign(String ffNeedSign) {
        this.ffNeedSign = ffNeedSign;
    }

    /**
     * g极限打卡时间
     * @return gg_limit_time g极限打卡时间
     */
    public String getGgLimitTime() {
        return ggLimitTime;
    }

    /**
     * g极限打卡时间
     * @param ggLimitTime g极限打卡时间
     */
    public void setGgLimitTime(String ggLimitTime) {
        this.ggLimitTime = ggLimitTime;
    }

    /**
     * g点存在的打卡时间记录
     * @return gg_time g点存在的打卡时间记录
     */
    public String getGgTime() {
        return ggTime;
    }

    /**
     * g点存在的打卡时间记录
     * @param ggTime g点存在的打卡时间记录
     */
    public void setGgTime(String ggTime) {
        this.ggTime = ggTime;
    }

    /**
     * g点排班的正常打卡时间
     * @return gg_pre_time g点排班的正常打卡时间
     */
    public String getGgPreTime() {
        return ggPreTime;
    }

    /**
     * g点排班的正常打卡时间
     * @param ggPreTime g点排班的正常打卡时间
     */
    public void setGgPreTime(String ggPreTime) {
        this.ggPreTime = ggPreTime;
    }

    /**
     * g变动时间
     * @return gg_ch_time g变动时间
     */
    public String getGgChTime() {
        return ggChTime;
    }

    /**
     * g变动时间
     * @param ggChTime g变动时间
     */
    public void setGgChTime(String ggChTime) {
        this.ggChTime = ggChTime;
    }

    /**
     * g打卡状态
     * @return gg_status g打卡状态
     */
    public String getGgStatus() {
        return ggStatus;
    }

    /**
     * g打卡状态
     * @param ggStatus g打卡状态
     */
    public void setGgStatus(String ggStatus) {
        this.ggStatus = ggStatus;
    }

    /**
     * g时间差
     * @return gg_min g时间差
     */
    public String getGgMin() {
        return ggMin;
    }

    /**
     * g时间差
     * @param ggMin g时间差
     */
    public void setGgMin(String ggMin) {
        this.ggMin = ggMin;
    }

    /**
     * g是否需要刷卡
     * @return gg_need_sign g是否需要刷卡
     */
    public String getGgNeedSign() {
        return ggNeedSign;
    }

    /**
     * g是否需要刷卡
     * @param ggNeedSign g是否需要刷卡
     */
    public void setGgNeedSign(String ggNeedSign) {
        this.ggNeedSign = ggNeedSign;
    }

    /**
     * h极限打卡时间
     * @return hh_limit_time h极限打卡时间
     */
    public String getHhLimitTime() {
        return hhLimitTime;
    }

    /**
     * h极限打卡时间
     * @param hhLimitTime h极限打卡时间
     */
    public void setHhLimitTime(String hhLimitTime) {
        this.hhLimitTime = hhLimitTime;
    }

    /**
     * h点存在的打卡时间记录
     * @return hh_time h点存在的打卡时间记录
     */
    public String getHhTime() {
        return hhTime;
    }

    /**
     * h点存在的打卡时间记录
     * @param hhTime h点存在的打卡时间记录
     */
    public void setHhTime(String hhTime) {
        this.hhTime = hhTime;
    }

    /**
     * h点排班的正常打卡时间
     * @return hh_pre_time h点排班的正常打卡时间
     */
    public String getHhPreTime() {
        return hhPreTime;
    }

    /**
     * h点排班的正常打卡时间
     * @param hhPreTime h点排班的正常打卡时间
     */
    public void setHhPreTime(String hhPreTime) {
        this.hhPreTime = hhPreTime;
    }

    /**
     * h变动时间
     * @return hh_ch_time h变动时间
     */
    public String getHhChTime() {
        return hhChTime;
    }

    /**
     * h变动时间
     * @param hhChTime h变动时间
     */
    public void setHhChTime(String hhChTime) {
        this.hhChTime = hhChTime;
    }

    /**
     * h时间差
     * @return hh_status h时间差
     */
    public String getHhStatus() {
        return hhStatus;
    }

    /**
     * h时间差
     * @param hhStatus h时间差
     */
    public void setHhStatus(String hhStatus) {
        this.hhStatus = hhStatus;
    }

    /**
     * h时间差
     * @return hh_min h时间差
     */
    public String getHhMin() {
        return hhMin;
    }

    /**
     * h时间差
     * @param hhMin h时间差
     */
    public void setHhMin(String hhMin) {
        this.hhMin = hhMin;
    }

    /**
     * h是否需要刷卡
     * @return hh_need_sign h是否需要刷卡
     */
    public String getHhNeedSign() {
        return hhNeedSign;
    }

    /**
     * h是否需要刷卡
     * @param hhNeedSign h是否需要刷卡
     */
    public void setHhNeedSign(String hhNeedSign) {
        this.hhNeedSign = hhNeedSign;
    }

    /**
     * 请假次数
     * @return leave_times 请假次数
     */
    public String getLeaveTimes() {
        return leaveTimes;
    }

    /**
     * 请假次数
     * @param leaveTimes 请假次数
     */
    public void setLeaveTimes(String leaveTimes) {
        this.leaveTimes = leaveTimes;
    }

    /**
     * 请假1类型
     * @return leave_type1 请假1类型
     */
    public String getLeaveType1() {
        return leaveType1;
    }

    /**
     * 请假1类型
     * @param leaveType1 请假1类型
     */
    public void setLeaveType1(String leaveType1) {
        this.leaveType1 = leaveType1;
    }

    /**
     * 请假1，开始时间
     * @return leave_stime1 请假1，开始时间
     */
    public String getLeaveStime1() {
        return leaveStime1;
    }

    /**
     * 请假1，开始时间
     * @param leaveStime1 请假1，开始时间
     */
    public void setLeaveStime1(String leaveStime1) {
        this.leaveStime1 = leaveStime1;
    }

    /**
     * 请假1，结束时间
     * @return leave_etime1 请假1，结束时间
     */
    public String getLeaveEtime1() {
        return leaveEtime1;
    }

    /**
     * 请假1，结束时间
     * @param leaveEtime1 请假1，结束时间
     */
    public void setLeaveEtime1(String leaveEtime1) {
        this.leaveEtime1 = leaveEtime1;
    }

    /**
     * 请假1所占当天上班时长
     * @return leave_lon_day1 请假1所占当天上班时长
     */
    public String getLeaveLonDay1() {
        return leaveLonDay1;
    }

    /**
     * 请假1所占当天上班时长
     * @param leaveLonDay1 请假1所占当天上班时长
     */
    public void setLeaveLonDay1(String leaveLonDay1) {
        this.leaveLonDay1 = leaveLonDay1;
    }

    /**
     * 请假2类型
     * @return leave_type2 请假2类型
     */
    public String getLeaveType2() {
        return leaveType2;
    }

    /**
     * 请假2类型
     * @param leaveType2 请假2类型
     */
    public void setLeaveType2(String leaveType2) {
        this.leaveType2 = leaveType2;
    }

    /**
     * 请假2，开始时间
     * @return leave_stime2 请假2，开始时间
     */
    public String getLeaveStime2() {
        return leaveStime2;
    }

    /**
     * 请假2，开始时间
     * @param leaveStime2 请假2，开始时间
     */
    public void setLeaveStime2(String leaveStime2) {
        this.leaveStime2 = leaveStime2;
    }

    /**
     * 请假2，结束时间
     * @return leave_etime2 请假2，结束时间
     */
    public String getLeaveEtime2() {
        return leaveEtime2;
    }

    /**
     * 请假2，结束时间
     * @param leaveEtime2 请假2，结束时间
     */
    public void setLeaveEtime2(String leaveEtime2) {
        this.leaveEtime2 = leaveEtime2;
    }

    /**
     * 请假2所占当天上班时长
     * @return leave_lon_day2 请假2所占当天上班时长
     */
    public String getLeaveLonDay2() {
        return leaveLonDay2;
    }

    /**
     * 请假2所占当天上班时长
     * @param leaveLonDay2 请假2所占当天上班时长
     */
    public void setLeaveLonDay2(String leaveLonDay2) {
        this.leaveLonDay2 = leaveLonDay2;
    }

    /**
     * 请假3类型
     * @return leave_type3 请假3类型
     */
    public String getLeaveType3() {
        return leaveType3;
    }

    /**
     * 请假3类型
     * @param leaveType3 请假3类型
     */
    public void setLeaveType3(String leaveType3) {
        this.leaveType3 = leaveType3;
    }

    /**
     * 请假3，开始时间
     * @return leave_stime3 请假3，开始时间
     */
    public String getLeaveStime3() {
        return leaveStime3;
    }

    /**
     * 请假3，开始时间
     * @param leaveStime3 请假3，开始时间
     */
    public void setLeaveStime3(String leaveStime3) {
        this.leaveStime3 = leaveStime3;
    }

    /**
     * 请假3，结束时间
     * @return leave_etime3 请假3，结束时间
     */
    public String getLeaveEtime3() {
        return leaveEtime3;
    }

    /**
     * 请假3，结束时间
     * @param leaveEtime3 请假3，结束时间
     */
    public void setLeaveEtime3(String leaveEtime3) {
        this.leaveEtime3 = leaveEtime3;
    }

    /**
     * 请假3所占当天上班时长
     * @return leave_lon_day3 请假3所占当天上班时长
     */
    public String getLeaveLonDay3() {
        return leaveLonDay3;
    }

    /**
     * 请假3所占当天上班时长
     * @param leaveLonDay3 请假3所占当天上班时长
     */
    public void setLeaveLonDay3(String leaveLonDay3) {
        this.leaveLonDay3 = leaveLonDay3;
    }

    /**
     * 出差次数
     * @return btrip_times 出差次数
     */
    public String getBtripTimes() {
        return btripTimes;
    }

    /**
     * 出差次数
     * @param btripTimes 出差次数
     */
    public void setBtripTimes(String btripTimes) {
        this.btripTimes = btripTimes;
    }

    /**
     * 出差1类型
     * @return btrip_type1 出差1类型
     */
    public String getBtripType1() {
        return btripType1;
    }

    /**
     * 出差1类型
     * @param btripType1 出差1类型
     */
    public void setBtripType1(String btripType1) {
        this.btripType1 = btripType1;
    }

    /**
     * 出差1，开始时间
     * @return btrip_stime1 出差1，开始时间
     */
    public String getBtripStime1() {
        return btripStime1;
    }

    /**
     * 出差1，开始时间
     * @param btripStime1 出差1，开始时间
     */
    public void setBtripStime1(String btripStime1) {
        this.btripStime1 = btripStime1;
    }

    /**
     * 出差1，结束时间
     * @return btrip_etime1 出差1，结束时间
     */
    public String getBtripEtime1() {
        return btripEtime1;
    }

    /**
     * 出差1，结束时间
     * @param btripEtime1 出差1，结束时间
     */
    public void setBtripEtime1(String btripEtime1) {
        this.btripEtime1 = btripEtime1;
    }

    /**
     * 出差1所占当天上班时长
     * @return btrip_lon_day1 出差1所占当天上班时长
     */
    public String getBtripLonDay1() {
        return btripLonDay1;
    }

    /**
     * 出差1所占当天上班时长
     * @param btripLonDay1 出差1所占当天上班时长
     */
    public void setBtripLonDay1(String btripLonDay1) {
        this.btripLonDay1 = btripLonDay1;
    }

    /**
     * 出差2类型
     * @return btrip_type2 出差2类型
     */
    public String getBtripType2() {
        return btripType2;
    }

    /**
     * 出差2类型
     * @param btripType2 出差2类型
     */
    public void setBtripType2(String btripType2) {
        this.btripType2 = btripType2;
    }

    /**
     * 出差2，开始时间
     * @return btrip_stime2 出差2，开始时间
     */
    public String getBtripStime2() {
        return btripStime2;
    }

    /**
     * 出差2，开始时间
     * @param btripStime2 出差2，开始时间
     */
    public void setBtripStime2(String btripStime2) {
        this.btripStime2 = btripStime2;
    }

    /**
     * 出差2，结束时间
     * @return btrip_etime2 出差2，结束时间
     */
    public String getBtripEtime2() {
        return btripEtime2;
    }

    /**
     * 出差2，结束时间
     * @param btripEtime2 出差2，结束时间
     */
    public void setBtripEtime2(String btripEtime2) {
        this.btripEtime2 = btripEtime2;
    }

    /**
     * 出差2所占当天上班时长
     * @return btrip_lon_day2 出差2所占当天上班时长
     */
    public String getBtripLonDay2() {
        return btripLonDay2;
    }

    /**
     * 出差2所占当天上班时长
     * @param btripLonDay2 出差2所占当天上班时长
     */
    public void setBtripLonDay2(String btripLonDay2) {
        this.btripLonDay2 = btripLonDay2;
    }

    /**
     * 出差3类型
     * @return btrip_type3 出差3类型
     */
    public String getBtripType3() {
        return btripType3;
    }

    /**
     * 出差3类型
     * @param btripType3 出差3类型
     */
    public void setBtripType3(String btripType3) {
        this.btripType3 = btripType3;
    }

    /**
     * 出差3，开始时间
     * @return btrip_stime3 出差3，开始时间
     */
    public String getBtripStime3() {
        return btripStime3;
    }

    /**
     * 出差3，开始时间
     * @param btripStime3 出差3，开始时间
     */
    public void setBtripStime3(String btripStime3) {
        this.btripStime3 = btripStime3;
    }

    /**
     * 出差3，结束时间
     * @return btrip_etime3 出差3，结束时间
     */
    public String getBtripEtime3() {
        return btripEtime3;
    }

    /**
     * 出差3，结束时间
     * @param btripEtime3 出差3，结束时间
     */
    public void setBtripEtime3(String btripEtime3) {
        this.btripEtime3 = btripEtime3;
    }

    /**
     * 出差3所占当天上班时长
     * @return btrip_lon_day3 出差3所占当天上班时长
     */
    public String getBtripLonDay3() {
        return btripLonDay3;
    }

    /**
     * 出差3所占当天上班时长
     * @param btripLonDay3 出差3所占当天上班时长
     */
    public void setBtripLonDay3(String btripLonDay3) {
        this.btripLonDay3 = btripLonDay3;
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