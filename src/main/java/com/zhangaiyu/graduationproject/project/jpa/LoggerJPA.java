package com.zhangaiyu.graduationproject.project.jpa;

import com.zhangaiyu.graduationproject.project.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerJPA extends JpaRepository<LoggerEntity,Long> {
}
