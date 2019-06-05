package com.example.demo.mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;


@Repository
public interface memberMapper {
    /**
     * 根据ID获取记录
     * @param id
     * @return
     */
    public  Map findObjectById(Integer id);
}
