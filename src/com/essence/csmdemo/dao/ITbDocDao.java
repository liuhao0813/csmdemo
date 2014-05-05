package com.essence.csmdemo.dao;

import java.util.List;

import com.essence.csmdemo.vo.TbDocVO;

public interface ITbDocDao {
	
    public void delete(String docId);

    public void insert(TbDocVO record);

    public TbDocVO selectById(String docId);
    
    public List<TbDocVO> selectAllList(TbDocVO tbDocVO);
    
    public void update(TbDocVO record);
}