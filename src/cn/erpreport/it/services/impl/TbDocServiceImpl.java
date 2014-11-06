package cn.erpreport.it.services.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import cn.erpreport.it.dao.ITbDocDao;
import cn.erpreport.it.services.ITbDocService;
import cn.erpreport.it.vo.TbDocVO;

@Named
public class TbDocServiceImpl implements ITbDocService {

	@Inject
	private ITbDocDao tbDocDao;
	
	public String delete(String docId) {
		tbDocDao.delete(docId);
		return "删除成功";
	}

	public String insert(TbDocVO record) {
		tbDocDao.insert(record);
		return "添加成功";
	}
	
	public TbDocVO selectById(String docId) {
		return tbDocDao.selectById(docId);
	}

	public List<TbDocVO> selectAllList(TbDocVO tbDocVO) {
		return tbDocDao.selectAllList(tbDocVO);
	}

	public String update(TbDocVO record) {
		tbDocDao.update(record);
		return "修改成功";
	}

}
