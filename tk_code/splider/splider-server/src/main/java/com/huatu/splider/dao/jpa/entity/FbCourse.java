package com.huatu.splider.dao.jpa.entity;
// Generated 2018-2-27 10:59:47 by Hibernate Tools 5.2.1.Final

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * FbCourse generated by hbm2java
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "fb_course")
public class FbCourse implements java.io.Serializable {

    private int id;
    private String title;
    private String courseType;
    private Integer status;
    private Integer saleStatus;
    private Integer salesStatus;
    private String brief;
    private BigDecimal price;
    private Integer studentLimit;
    private Integer studentCount;
    private Boolean hasAddress;
    private Integer classHours;
    private Date startSaleTime;
    private Date stopSaleTime;
    private Date classStartTime;
    private Date classEndTime;
    private Boolean hasExercise;
    private Boolean hasQqGroup;
    private Boolean hasImGroup;
    private Boolean hasClassPeriod;
    private Boolean hasLiveEpisodes;
    private String teachers;
    private String rawData;
    private Date updateTime;
    private Boolean state;


    @Id
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "course_type")
    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    @Column(name = "status")
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "sale_status")
    public Integer getSaleStatus() {
        return this.saleStatus;
    }

    public void setSaleStatus(Integer saleStatus) {
        this.saleStatus = saleStatus;
    }

    @Column(name = "sales_status")
    public Integer getSalesStatus() {
        return this.salesStatus;
    }

    public void setSalesStatus(Integer salesStatus) {
        this.salesStatus = salesStatus;
    }

    @Column(name = "brief")
    public String getBrief() {
        return this.brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @Column(name = "price", precision = 10)
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column(name = "student_limit")
    public Integer getStudentLimit() {
        return this.studentLimit;
    }

    public void setStudentLimit(Integer studentLimit) {
        this.studentLimit = studentLimit;
    }

    @Column(name = "student_count")
    public Integer getStudentCount() {
        return this.studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    @Column(name = "has_address")
    public Boolean getHasAddress() {
        return this.hasAddress;
    }

    public void setHasAddress(Boolean hasAddress) {
        this.hasAddress = hasAddress;
    }

    @Column(name = "class_hours")
    public Integer getClassHours() {
        return this.classHours;
    }

    public void setClassHours(Integer classHours) {
        this.classHours = classHours;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_sale_time", length = 19)
    public Date getStartSaleTime() {
        return this.startSaleTime;
    }

    public void setStartSaleTime(Date startSaleTime) {
        this.startSaleTime = startSaleTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "stop_sale_time", length = 19)
    public Date getStopSaleTime() {
        return this.stopSaleTime;
    }

    public void setStopSaleTime(Date stopSaleTime) {
        this.stopSaleTime = stopSaleTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "class_start_time", length = 19)
    public Date getClassStartTime() {
        return this.classStartTime;
    }

    public void setClassStartTime(Date classStartTime) {
        this.classStartTime = classStartTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "class_end_time", length = 19)
    public Date getClassEndTime() {
        return this.classEndTime;
    }

    public void setClassEndTime(Date classEndTime) {
        this.classEndTime = classEndTime;
    }

    @Column(name = "has_exercise")
    public Boolean getHasExercise() {
        return this.hasExercise;
    }

    public void setHasExercise(Boolean hasExercise) {
        this.hasExercise = hasExercise;
    }

    @Column(name = "has_QQ_group")
    public Boolean getHasQqGroup() {
        return this.hasQqGroup;
    }

    public void setHasQqGroup(Boolean hasQqGroup) {
        this.hasQqGroup = hasQqGroup;
    }

    @Column(name = "has_im_group")
    public Boolean getHasImGroup() {
        return this.hasImGroup;
    }

    public void setHasImGroup(Boolean hasImGroup) {
        this.hasImGroup = hasImGroup;
    }

    @Column(name = "has_class_period")
    public Boolean getHasClassPeriod() {
        return this.hasClassPeriod;
    }

    public void setHasClassPeriod(Boolean hasClassPeriod) {
        this.hasClassPeriod = hasClassPeriod;
    }

    @Column(name = "has_live_episodes")
    public Boolean getHasLiveEpisodes() {
        return this.hasLiveEpisodes;
    }

    public void setHasLiveEpisodes(Boolean hasLiveEpisodes) {
        this.hasLiveEpisodes = hasLiveEpisodes;
    }

    @Column(name = "teachers")
    public String getTeachers() {
        return this.teachers;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }

    @Column(name = "raw_data")
    public String getRawData() {
        return this.rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time", nullable = false, length = 19)
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Column(name = "state")
    public Boolean getState() {
        return this.state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

}
