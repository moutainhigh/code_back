package com.huatu.tiku.schedule.biz.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.huatu.tiku.schedule.biz.enums.CourseCategory;
import com.huatu.tiku.schedule.biz.enums.CourseStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.huatu.tiku.schedule.base.service.BaseService;
import com.huatu.tiku.schedule.biz.domain.Course;
import com.huatu.tiku.schedule.biz.enums.ExamType;

/**
 * 课程Service
 *
 * @author Geek-S
 */
public interface CourseService extends BaseService<Course, Long> {

	List<Course> getCourseListByStatus(CourseStatus status);
    /**
     * 条件查询课程 助教版
     *
     * @param examType    考试类型
     * @param name        名称
     * @param id          课程id
     * @param subjectId   科目id
     * @param dateBegin   范围起始日期
     * @param dateEnd     范围结束日期
     * @param teacherName 教师姓名
     * @param page        分页
     * @return 课程列表
     */
    Page<Course> getCourseListZJ(ExamType examType, String name, Long id, Long subjectId, Date dateBegin, Date dateEnd,
                               String teacherName, CourseStatus status, Pageable page);
    /**
     * @param examTypes    考试类型集合
     * @return 课程列表
     */
    Page<Course> getCourseList(CourseCategory category,List<ExamType> examTypes, String name, Long id, Long subjectId, Date dateBegin, Date dateEnd,
							   String teacherName, CourseStatus status, Pageable page);
    Page<Course> getCourseList(List<CourseCategory> categorys,List<ExamType> examTypes, String name, Long id, Long subjectId, Date dateBegin, Date dateEnd,
							   String teacherName, CourseStatus status, Pageable page);

    /**
     * 提交直播课程安排
     *
     * @param id 课程ID
     * @return 结果信息
     */
    Map<String, Object> submitCourseLive(Long id);

	/**
	 * 根据日期查询课程
	 * 
	 * @param id
	 *            课程ID
	 * @param dates
	 *            日期
	 * @return 课程
	 */
	List<Course> rollingCourse(Long id, List<Date> dates);

	/**
	 * 提交直播教师安排
	 *
	 * @param course
	 *            课程
	 * @return 结果信息
	 */
	Map<String, Object> submitCourseLiveTeacher(Course course);

	/**
	 * 提交助教安排
	 *
	 * @param id
	 *            课程ID
	 * @return 结果
	 */
	Map<String, Object> submitCourseLiveAssitant(Long id);

	/**
	 * 根据直播集合查找课程id集合
	 * @param liveIds 直播ids
	 * @return 课程集合
	 */
	List<Course> findAllByLives(List<Long> liveIds);

	/**
	 * 根据教师确认状态更改课程状态 并初始化助教数据
	 * @param courses 课程
	 */
	void updateStatus(Course courses );

	/**
	 * 发送教师确认短信
	 * @param id 课程ID
	 */
	void sendCourseLiveTeacherConfirmSms(Long id);

	/**
	 * 发送助教确认短信
	 * @param id 课程ID
	 */
	void sendCourseLiveAssitantConfirmSms(Long id);

	/**
	 * 添加面试
	 * @param courseId 面试
	 * @param teacherIds 推荐教师
	 */
	void saveInterview(Long courseId, List<Long> teacherIds);

	/**
	 * 运营取消已经提交课程
	 * @param courseId 课程id
	 */
	Boolean cancelCourse(Long courseId);

	/**
	 * 根据课程id查询状态 如果为直播安排 抛出异常
	 * @param courseId 课程id
	 */
	void findCourseStatusByCourseId(Long courseId);

	void sendCourseDeleteSms(Course course,String reason);

    Page<Course> getVideoCourse(Pageable page);
}
