package com.nuc.evaluate.repository

import com.nuc.evaluate.po.Student
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @author 杨晓辉 2018/2/3 15:16
 */
interface StudentRepository : JpaRepository<Student, Long> {
    fun findByStudentNumber(studentNumber: String):Student?
}