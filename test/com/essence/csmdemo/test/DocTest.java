package com.essence.csmdemo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.essence.csmdemo.services.ITbDocService;
import com.essence.csmdemo.vo.TbDocVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
@Transactional
public class DocTest {
	@Autowired
	private ITbDocService tbDocService;

	@Test
	public void testGetAcccountById() {
		TbDocVO tbDocVO = new TbDocVO();
		tbDocVO = tbDocService.selectById("660");
		
		System.out.println("文档名称："+tbDocVO.getTitle());
		
	}
}